<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 09 - Home</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" 
          rel="stylesheet" 
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" 
          crossorigin="anonymous">

    <style>
        .btn-rosa {
            background-color: #e83e8c;
            color: white;
        }
        .btn-rosa:hover {
            background-color: #d63384;
            color: white;
        }

        .btn-rosa-claro {
            background-color: #f8a3c4;
            color: white;
        }
        .btn-rosa-claro:hover {
            background-color: #f48bb1;
            color: white;
        }
    </style>
</head>
<body>

    <div class="container mt-5">
        <h1 class="mb-4">Aula 09 - Home</h1>


        <p>
            <a href="clientes.php" class="btn btn-rosa-claro">Ver clientes cadastrados</a>
        </p>

        <h2 class="mt-5">Cadastro de Clientes</h2>

        <form action="salvar.php" method="post" class="mt-3">

            <div class="mb-3">
                <label for="nome" class="form-label">Nome:</label>
                <input type="text" name="nome" id="nome" class="form-control" required>
            </div>

            <div class="mb-3">
                <label for="fone" class="form-label">Fone:</label>
                <input type="text" name="fone" id="fone" class="form-control" required>
            </div>

            <div class="mb-3">
                <label for="email" class="form-label">E-mail:</label>
                <input type="email" name="email" id="email" class="form-control" required>
            </div>

            <button type="submit" class="btn btn-rosa">Cadastrar</button>
        </form>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-QTo92gLZlTh8rjJkNW8xyBZCDJpP4vC1GEf/0W3Ot8YAYdoFC+DxYBaK1sdF9c92"
            crossorigin="anonymous"></script>
</body>
</html>

