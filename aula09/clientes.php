<!DOCTYPE html>
<html lang="pt-br">
<head>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2; /* Cor de fundo para cabeçalho */
        }
    </style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 09 - Clientes Cadastrados</title>
</head>
<body>
<h1>Aula 09 - Cadastrar cliente</h1>
<p>
    <a href="index.php"> Voltar à home </a>
</p>

<?php
// incluir arquivo de conexão
require_once 'conexao.php';

// receber a conexão com o BD
$conn = conectar_banco();

// montar e executar a consulta
$query = "SELECT * FROM tb_clientes";
$result = mysqli_query($conn, $query);

// verificar se a consulta retornou algo
if (!$result || mysqli_num_rows($result) == 0) {
    exit("<h3>Não há cliente para exibir! </h3>");
}

// Enquanto houver registros armazenados em 'resultado', vamos criar um array associativo para cada registro retornado.
//Mostraremos na tela, o array associativo a cada interação do laço

// Exibindo os dados dos clientes em formato de tabela
echo "<h2>Clientes Cadastrados</h2>";
echo "<table>";
echo "<tr>";
echo "<th>ID #</th>";
echo "<th>NOME</th>";
echo "<th>Telefone</th>";
echo "<th>E-mail</th>";
echo "</tr>";

while ($cli = mysqli_fetch_assoc($result)) {
    echo "<tr>";
    echo "<td>" . $cli['id'] . "</td>";
    echo "<td>" . $cli['nome'] . "</td>";
    echo "<td>" . $cli['fone'] . "</td>";
    echo "<td>" . $cli['email'] . "</td>";
    echo "</tr>";
}

// Fechar a tabela 
echo "</table>";

mysqli_close($conn);
?>
</body>
</html>


