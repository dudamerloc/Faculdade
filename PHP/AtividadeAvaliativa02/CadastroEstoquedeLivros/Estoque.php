<?php
require_once 'validacao.php';

    // Verifica se o formulário foi enviado via POST
if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    // Recebe os dados do formulário e cria o array associativo $livro
    $livro = [
        'titulo' => trim($_POST['titulo'] ?? ''),
        'autor' => trim($_POST['autor'] ?? ''),
        'preco' => floatval($_POST['preco'] ?? 0),
        'quantidade' => intval($_POST['quantidade'] ?? 0),
    ];

    if (!validar_livro($livro)) {

    // Exibe uma mensagem de erro e link para voltar ao formulário se os dados forem inválidos
        echo "<p style='color:red;'>Erro: Dados inválidos. Verifique os campos informados.</p>";
        echo "<p><a href='index.php'>Voltar ao formulário</a></p>";
        exit;
    }

    $valorTotal = calcularValorTotalEstoque($livro);
    ?>

    <!DOCTYPE html>
    <html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Livro Cadastrado</title>
    </head>
    <body>
        <h1>Livro Cadastrado com Sucesso!</h1>
        <p><strong>Título:</strong> <?= htmlspecialchars($livro['titulo']) ?></p>
        <p><strong>Autor:</strong> <?= htmlspecialchars($livro['autor']) ?></p>
        <p><strong>Preço Unitário:</strong> R$ <?= number_format($livro['preco'], 2, ',', '.') ?></p>
        <p><strong>Quantidade em Estoque:</strong> <?= $livro['quantidade'] ?></p>
        <p><strong>Valor Total em Estoque:</strong> R$ <?= number_format($valorTotal, 2, ',', '.') ?></p>
        <p><a href="index.php">Cadastrar outro livro</a></p>
    </body>
    </html>

    <?php
}else{

// Exibe uma mensagem de erro se o formulário não for enviado corretamente
    echo "<p>Acesso inválido. Por favor, envie os dados pelo formulário.</p>";
    echo "<p><a href='index.php'>Voltar</a></p>";
}
?>