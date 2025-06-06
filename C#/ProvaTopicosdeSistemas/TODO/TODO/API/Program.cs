using API.Modelos;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddDbContext<AppDataContext>();

var app = builder.Build();

//Cadastrar Tarefas
app.MapPost("/api/tarefas", ([FromBody] Tarefa tarefa, [FromServices] AppDataContext ctx)=>{
    tarefa.Status = ctx.Status.Find(tarefa.Status.Id);
    if(tarefa.Status == null){
        return Results.BadRequest("Status não existente");
    }

    if(string.IsNullOrWhiteSpace(tarefa.Titulo) || tarefa.Titulo.Length < 3){
        return Results.BadRequest("O Título deve ter mais do que 3 caracteres!");
    }

    ctx.Tarefas.Add(tarefa);
    ctx.SaveChanges();

    return Results.Created("", tarefa);
});

//Listar Tarefas
app.MapGet("/api/tarefas", ([FromServices] AppDataContext ctx) => {
    if(ctx.Tarefas.Any()){
        return Results.Ok(ctx.Tarefas.ToList());
    }

        return Results.NotFound();
});

//Busca por ID
app.MapGet("/api/tarefas/{id}", ([FromRoute] int id, [FromServices] AppDataContext ctx) => {
    var tarefa = ctx.Tarefas.Find(id);
    return tarefa != null ? Results.Ok(tarefa) : Results.NotFound(); 

});

//Atualiza Tarefa por Id
app.MapPut("/api/tarefas/{id}", ([FromRoute] int id, [FromBody] Tarefa tarefa, [FromServices] AppDataContext ctx) => {
    var entidade = ctx.Tarefas.Find(id);
    if(entidade == null) return Results.NotFound();
    
    var status = ctx.Status.Find(tarefa.Status.Id);
    if(status == null) return Results.BadRequest("Status não encontrado");

    if(string.IsNullOrWhiteSpace(tarefa.Titulo) || tarefa.Titulo.Length < 3){
        return Results.BadRequest("O Título deve ter mais do que 3 caracteres!");
    }

    entidade.Titulo = tarefa.Titulo;
    entidade.Status = status;

    ctx.Tarefas.Update(entidade);
    ctx.SaveChanges();
    return Results.Ok(entidade);  
});

//Deleta Tarefa por Id
app.MapDelete("/api/tarefas/{id}", ([FromRoute] int id, [FromServices] AppDataContext ctx) => {
    var tarefa = ctx.Tarefas.Find(id);
    if(tarefa == null) return Results.NotFound();

    ctx.Tarefas.Remove(tarefa);
    ctx.SaveChanges();

    return Results.NotFound();
});


app.Run();
