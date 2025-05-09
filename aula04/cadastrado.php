<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 04 - Criando Cadastro</title>
</head>
<body>
    <p>
        <a href="index.php">Voltar á página inicial</a>
    </p>

    <?php

    //  Se a página recebeu uma requisição Post
    if($_SERVER['REQUEST_METHOD'] == 'POST'){
        /* Abaixo testaremos se cada campo do form está vazio.
Para cada campo vazio, adicionaremos uma mensagem de erro em uma nova posição do array$erros. 
O colchetes em branco [] indica que o PHP criará uma nova posição para o array conforme a necessidade.

Se, o form foi inteiramente preenchido, então, não haverá 
*/ 

        if(empty($_POST['nome'])){
            $erros[] = "<h4>Nome não pode estar em branco</h4>";

        }

        if(empty($_POST['email'])){
            $erros[] = "<h4>E-mail não pode estar em branco</h4>";

        }

        if(empty($_POST['fone'])){
            $erros[] = "<h4>Telefone não pode estar em branco</h4>";

        }}

        // Verificar se nenhum campo está em branco
        if(!isset($erros)){
        $nome = $_POST['nome'];
        $email = $_POST['email'];
        $fone = $_POST['fone'];

        echo "<h2>Cliente Cadastrado:</h2>";

        echo "Nome do cliente: ".$nome."<br>";
        echo "E-mail: ".$email."<br>";
        echo "Telefone: ".$fone."<br>";

        }else{ // Se um ou mais campos estiverem em branco
            echo "<h3>Preencha todos os campos do formulário!</h3>";

            // print _r(4erros): debugar arrays
            // Foreach: laço 'for' próprio para percorer as arrays
            foreach($erros as $erroAtual){
                echo "".$erroAtual."<br>";

            // Incluo aqui o formulario para facilitar o cadastro.
            require_once('form_cadastro.php');
        }
    }else{

        echo'<h3>ATENÇÃO: formulário não enviado</h3>';
    }

    ?>
    
</body>
</html>