<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 04 - Resultado da Pesquisa</title>
</head>
<body>

<h1>Resultado da Pesquisa</h1>

<?php
if($_SERVER['REQUEST_METHOD'] == 'GET'){
    $cliente = $_GET['cliente'];

    //array de clientes
    $cliente[] = "Duda Merlo"; //0
    $cliente[] = "Julia Cazeri"; //1
    $cliente[] = "Victor Cruz"; //2

    $encontrou = false; //nesse momento nao encontramos nada

    //outra maneira de criar o mesmo array
 //$cliente[
   // "Duda Merlo",
   // "Julia Cazeri",
   // "Victor Cruz"];

   //criar foreach para percorrer o array
   foreach($clientes as $clienteAtual){
    /*verificar se o nome que digitamos no form, está contido dentro do nome do 
    'clienteatual' */

    if(str_contains($clienteAtual, $cliente)){
        echo"Cliente encontrado: " . $clienteAtual."<br>";
        $encontrou = true; // encontrou um cliente ao menos
    }
}

if($encontrou){ // se não encontrou nenhum cliente

    echo"<h4> Nenhum cliente encontrado com o nome</h4>";
}

}else{
    echo "<h3>Nenhum dado foi enviado para pesquisa</h3>"
}

?>
    <p href="index.php">Voltar á Página inicial</p>
</body>
</html>