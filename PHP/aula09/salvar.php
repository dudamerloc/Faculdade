<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 09 - Cadastrar cliente</title>
</head>
<body>

<h1>Aula 09 - Cadastrar cliente</h1>
<p>
    <a href="index.php"> voltar a home </a>
</p>

<?php
//incluir arquivo com as 
require_once 'validacoes.php';

//verificar se chegamos a pagina via GET
if(form_nao_enviado()){
    exit("<h3>Form não enviado. Favor preencher os dados na home</h3>");
}
//verificar se há campos em branco no form
if(ha_campos_em_branco($_POST)){
    exit("<h3>Por favor, preencha todos os campos do form</h3>");

}

//se nenhum erro acima foi detectado, prosseguimos:

//copiar, em variaveis locais, os dados enviados via POST
$nome = $_POST['nome'];
$fone = $_POST['fone'];
$email = $_POST["email"];

//incluir arquivo de conexão
require_once'conexao.php';

//receber  uma conexão válida com o banco de dados
$conn = conectar_banco();

//criar comando SQL para inserir dados na tabela tb_clientes
$sql = "INSERT INTO tb_clientes(nome, fone, email) VALUES (?, ?, ?)";

//criar 'declaração' (statement)de execução de comandos SQL
$stmt = mysqli_prepare($conn, $sql);

//verificar se há erros no SQL
if(!$stmt){
    exit("<h3>Erro na preparação do comando SQL</h3>");
}

//se não há erros no stmt, realizaremos o bind(associação)
//dos parâmetros no SQL
mysqli_stmt_bind_param($stmt, "sss", $nome, $fone, $email);

//verifica se ocorreu algum erro ao executar o comando SQL
if(!mysqli_stmt_execute($stmt)){
    exit("<h3>Erro ao salvar cliente no BD:".mysqli_stmt_error($stmt). "</h3>");
}

echo"<h3>Cliente cadastrado com sucesso!</h3>";

mysqli_stmt_close($stmt);// encerra ações possiveis com esse stmt
mysqli_close($conn); //encerra conexão com o banco de dados
?>
    
</body>
</html>