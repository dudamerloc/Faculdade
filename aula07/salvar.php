<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 09 - Cadastrar cliente</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" 
          rel="stylesheet" 
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" 
          crossorigin="anonymous">

    <!-- Botão rosa personalizado -->
    <style>
        .btn-rosa {
            background-color: #e83e8c;
            color: white;
        }
        .btn-rosa:hover {
            background-color: #d63384;
            color: white;
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
    require_once 'validacoes.php';

    if (form_nao_enviado()) {
        echo '<div class="alert alert-warning" role="alert">
                Formulário não enviado. Favor preencher os dados na <a href="index.php" class="alert-link">home</a>.
              </div>';
        exit;
    }

    if (ha_campos_em_branco($_POST)) {
        echo '<div class="alert alert-danger" role="alert">
                Por favor, preencha todos os campos do formulário.
              </div>';
        exit;
    }

    $nome = $_POST['nome'];
    $fone = $_POST['fone'];
    $email = $_POST['email'];

    require_once 'conexao.php';
    $conn = conectar_banco();

    $sql = "INSERT INTO tb_clientes(nome, fone, email) VALUES (?, ?, ?)";
    $stmt = mysqli_prepare($conn, $sql);

    if (!$stmt) {
        echo '<div class="alert alert-danger" role="alert">
                Erro na preparação do comando SQL.
              </div>';
        exit;
    }

    mysqli_stmt_bind_param($stmt, "sss", $nome, $fone, $email);

    if (!mysqli_stmt_execute($stmt)) {
        echo '<div class="alert alert-danger" role="alert">
                Erro ao salvar cliente no BD: ' . mysqli_stmt_error($stmt) . '
              </div>';
        exit;
    }

    echo '<div class="alert alert-success" role="alert">
            Cliente cadastrado com sucesso!
          </div>';

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
