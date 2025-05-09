<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 05 - home</title>
</head>
<body>

<h1>Aula 05 - home</h1>

<h2>Arrays em PHP</h2>
    
<?php
###### Declaração de ARRAYS ######

$frutas = array("Laranja", " Maça", " Pera");
//      indices:   0          1       2

$cidades = ["Curitiba",          //0
            "São Paulo",         //1
            "Porto Alegre",      //2
            "Florianópolis"];    //
            
//Adicionando valores e arrays já inicializados
$frutas [] = " Melão";         //nova posição (3)
$cidades [] = " Londrina";     //nova posição (4)

// Criar dinamicamente o array 'idades':
for($i = 18; $i <= 30; $i++){
    
    //nova posição de 'idade' recebendo valor de 'i'
    $idade [] = $i; 
}

//Array associativo 'cliente'
$cliente = [
'nome' => " Duda Merlo",
'email' => " duda@gmail.com",
'fone' => " (41) 99596-3600"];

###### Exibição de Arrays ######

echo "<h3> Valor da posição 1 do array 'frutas':  </h3>";
echo $frutas[1];

echo "<h3> Mostrando todas as frutas do array (sem laço for): </h3>";
echo $frutas[0]. "," . $frutas[1]. "," .$frutas[2]. "," .$frutas[3];

// Dá para fazer assim caro nao queira usar o cont dentro do for -> $tamanho = $count($cidades);
echo "<h3> Mostrando array 'cidades' (usando o laço for)</h3>";
for($i = 0; $i < count($cidades); $i++){

    echo $cidades[$i] . "<br>";
}

echo "<h3> Mostrando Array 'idades' com laço foreach simples: </h3>";

foreach($idade as $idade_atual){
    echo $idade_atual ."<br>";
}

echo "<h3>Mostrando array associativo 'cliente' com laço foreach completo: </h3>";

foreach($cliente as $chave => $valor){

    //ucfirst: torna a inicial da string maiúscula
    echo ucfirst($chave) .":" . $valor."<br>";

}

?>

</body>
</html>