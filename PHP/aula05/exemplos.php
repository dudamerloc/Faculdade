<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 05 - mais exemplos de Arrays</title>
</head>
<body>

<h1>Aula 05 - mais exemplod de Arrays</h1>
<h2>Debugando arrays com print_r e var_dump</h2>

<?Php

//verificando se recebemos dados do form new letter
if($_SERVER['REQUEST_METHOD'] === "POST") {

    if(empty($_POST['nome'])) {
        echo"O Nome não pode estar em branco! <br>";
    }

    if(empty($_POST['email'])) {
        echo 'O E-mail não pode estar em branco! <br>';
    }

    echo '<pre>';
    print_r($_POST); //superglobal $_POST
    echo '</pre>';  

    echo '<pre>';
    var_dump($_POST);
    echo '</pre>';

}

$filme = [
    'titulo' => 'Titanic',
    'genero' => 'Drama',
    'diretor' => 'James Cameron',
    'ano' => '1999',
    'tomatometro' => 88.5
];

    echo "<h3>Print_R: </h3>";

    echo '<pre>';
    print_r($filme);
    echo '</pre>';

    echo '<h3> Var_Dump: </h3>';
    echo '<pre>';
    var_dump($filme);
    echo '</pre>';

?>

<h2>Array Assosiativo 'Livro' </h2>

<?php

//criando array linha a linha
$livro['titulo'] = 'Senhor dos Aneis';
$livro['genero'] = 'Fantasia';
$livro['autor'] = 'J.R.R.Tolkien';
$livro['ano'] = 1954;

foreach ($livro as $indice => $valor) {

    echo ucfirst($indice) .':'. $valor ."<br>";
}
?>

<h2>Form de simulação de news letter: </h2>

<form action="exemplos.php" method="post"> 

    <input type="text" name="nome" placeholder="Nome">
    <input type="email" name="email" placeholder="E-mail">
    <button type="submit">Cadastrar</button>
    
</form>
    
</body>
</html>