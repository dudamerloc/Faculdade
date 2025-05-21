<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 09 - Parte 2 - Excluir Cliente</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" 
          rel="stylesheet" 
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" 
          crossorigin="anonymous">

    <!-- Estilo botão rosa -->
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

        /* Alterando o alerta de erro para rosa bem claro */
        .alert-erro {
            background-color: #f9d7e0;
            color: #f06292; /* Um rosa mais forte para o texto */
        }
    </style>
</head>
<body>

<div class="container mt-5">
    <h1 class="mb-4">Aula 09 - Parte 2 - Excluir Cliente</h1>

    <p>
        <a href="index.php" class="btn btn-rosa me-2">Home</a>
        <a href="clientes.php" class="btn btn-rosa-claro">Clientes Cadastrados</a>
    </p>

    <?php
    require_once 'validacoes.php';

    id_nao_enviado(); // Verifica se o id foi enviado

    $id = (int)$_GET['id'];

    require_once 'conexao.php';

    $conn = conectar_banco();

    $sql = "DELETE FROM tb_clientes WHERE id = ?";
    $stmt = mysqli_prepare($conn, $sql);

    if (!$stmt) {
        echo '<div class="alert alert-erro mt-4">Erro na preparação do comando SQL.</div>';
        exit;
    }

    mysqli_stmt_bind_param($stmt, 'i', $id);

    if (!mysqli_stmt_execute($stmt)) {
        echo '<div class="alert alert-erro mt-4">Erro ao excluir cliente no BD: ' . mysqli_stmt_error($stmt) . '</div>';
        exit;
    }

    if (mysqli_affected_rows($conn) <= 0) {
        echo '<div class="alert alert-erro mt-4">Erro ao excluir cliente: ID inválido!</div>';
        exit;
    }

    echo '<div class="alert alert-success mt-4">Cliente excluído com sucesso!</div>';

    mysqli_stmt_close($stmt);
    mysqli_close($conn);
    ?>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-QTo92gLZlTh8rjJkNW8xyBZCDJpP4vC1GEf/0W3Ot8YAYdoFC+DxYBaK1sdF9c92"
        crossorigin="anonymous"></script>
</body>
</html>


