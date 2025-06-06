using API.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);

// Configuração do banco de dados
builder.Services.AddDbContext<AppDataContext>();

// Criando o app
var app = builder.Build();

// --- ENDPOINTS ---

// GET: Lista todos os carros
app.MapGet("/api/carros", ([FromServices] AppDataContext ctx) => {
    if (ctx.Carros.Any()) {
        return Results.Ok(ctx.Carros.ToList());
    }
    return Results.NotFound();
});

// POST: Cadastrar carro
app.MapPost("/api/carros", ([FromBody] Carro carro, [FromServices] AppDataContext ctx) => {
    carro.Modelo = ctx.Modelos.Find(carro.Modelo.Id);
    if (carro.Modelo == null) {
        return Results.BadRequest("Modelo não existe!");
    }
    if (string.IsNullOrWhiteSpace(carro.Name) || carro.Name.Length < 3) {
        return Results.BadRequest("Nome do carro deve conter mais de 3 caracteres!");
    }

    ctx.Carros.Add(carro);
    ctx.SaveChanges();
    return Results.Created("", carro);
});

// GET: Buscar carro por ID
app.MapGet("/api/carros/{id}", ([FromRoute] int id, [FromServices] AppDataContext ctx) => {
    var carro = ctx.Carros.Find(id);
    return carro != null ? Results.Ok(carro) : Results.NotFound();
});

// PUT: Atualizar carro por ID
app.MapPut("/api/carros/{id}", ([FromRoute] int id, [FromBody] Carro carro, [FromServices] AppDataContext ctx) => {
    var entidade = ctx.Carros.Find(id);
    if (entidade == null) return Results.NotFound();

    var modelo = ctx.Modelos.Find(carro.Modelo.Id);
    if (modelo == null) return Results.BadRequest("Modelo não existe!");
    if (string.IsNullOrWhiteSpace(carro.Name) || carro.Name.Length < 3) {
        return Results.BadRequest("Nome do carro deve conter mais de 3 caracteres!");
    }

    entidade.Name = carro.Name;
    entidade.Modelo = modelo;

    ctx.Carros.Update(entidade);
    ctx.SaveChanges();
    return Results.Ok(entidade);
});

// DELETE: Remover carro por ID
app.MapDelete("/api/carros/{id}", ([FromRoute] int id, [FromServices] AppDataContext ctx) => {
    var carro = ctx.Carros.Find(id);
    if (carro == null) return Results.NotFound();

    ctx.Carros.Remove(carro);
    ctx.SaveChanges();
    return Results.NoContent();
});

// GET: Lista todos os modelos
app.MapGet("/api/modelos", ([FromQuery] string? name, [FromServices] AppDataContext ctx) => {
    var query = ctx.Modelos.AsQueryable();
    if (!string.IsNullOrWhiteSpace(name)) {
        query = query.Where(m => EF.Functions.Like(m.Name, $"%{name}%"));
    }

    var modelos = query.ToList();
    return modelos.Any() ? Results.Ok(modelos) : Results.NotFound();
});

// GET: Buscar modelo por ID
app.MapGet("/api/modelos/{id}", ([FromRoute] int id, [FromServices] AppDataContext ctx) => {
    var modelo = ctx.Modelos.Find(id);
    return modelo != null ? Results.Ok(modelo) : Results.NotFound();
});

// Inicia o app
app.Run();
