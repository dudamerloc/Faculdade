<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 09 - Clientes Cadastrados</title>

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
        table, th, td {
            border: 1px solid #dee2e6;
            border-collapse: collapse;
        }
        th, td {
            padding: 12px;
        }
        th {
            background-color: #f8f9fa;
        }
    </style>
</head>
<body>

<div class="container mt-5">
    <h1 class="mb-4">Aula 09 - Cadastrar cliente</h1>

    <p>
        <a href="index.php" class="btn btn-rosa">Voltar à home</a>
    </p>

    <?php

    //incluir arquivo de validações
    require_once 'validacoes.php';

    //incluir arquivo de conexão
    require_once 'conexao.php';
    
    $conn = conectar_banco();
    $query = "SELECT * FROM tb_clientes";
    $result = mysqli_query($conn, $query);

    if (!$result || mysqli_num_rows($result) == 0) {
        exit("<h3>Não há cliente para exibir!</h3>");
    }

    echo "<h2 class='mt-4 mb-3'>Clientes Cadastrados</h2>";
    echo "<table class='table table-bordered'>";
    echo "<thead><tr>";
    echo "<th>ID #</th>";
    echo "<th>Nome</th>";
    echo "<th>Telefone</th>";
    echo "<th>E-mail</th>";
    echo "<th>Ações</th>";
    echo "</tr></thead><tbody>";

    while ($cli = mysqli_fetch_assoc($result)) {
        echo "<tr>";
        echo "<td>" . $cli['id'] . "</td>";
        echo "<td>" . $cli['nome'] . "</td>";
        echo "<td>" . $cli['fone'] . "</td>";
        echo "<td>" . $cli['email'] . "</td>";
        echo "<td>";
        echo '<a href="excluir.php?id=' . $cli['id'] . '" class="btn btn-sm btn-outline-danger me-2">Excluir</a>';
        echo '<a href="editar.php?id=' . $cli['id'] . '" class="btn btn-sm btn-outline-primary">Editar</a>';
        echo "</td>";
        echo "</tr>";
    }
    echo "</tbody></table>";

    mysqli_close($conn);
    ?>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-QTo92gLZlTh8rjJkNW8xyBZCDJpP4vC1GEf/0W3Ot8YAYdoFC+DxYBaK1sdF9c92"
        crossorigin="anonymous"></script>
</body>
</html>





