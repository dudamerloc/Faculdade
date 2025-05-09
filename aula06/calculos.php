<?php require_once 'functions.php'; ?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 07 - Calculos</title>
</head>
<body>

<h1> Aula 07 - Calculos</h1>

<?php

// Se cheguei nesta página via GET ao invés de via POST não execute mais nada
if(form_nao_enviado()){
    echo "<h2>Por Favor, preencha o formulário</h2>";
    exit; //outro comando igual o die; 
//Exit: interrompe a execução do script a partir deste ponto

}

// Se algum dos campos do form não for um valor numérico, não execute mais nada
if(valor_nao_numerico()){
    echo "<h2>Os valores precisam ser numéricos!</h2>";
    exit;
}

$valor1 = $_POST['valor1'];
$valor2 = $_POST['valor2'];

$soma = $valor1 + $valor2;
$subi = $valor1 - $valor2;
$multi = $valor1 * $valor2;
$divi = $valor2 == 0 ? 0 : $valor1 / $valor2;

echo "Soma: $valor1 + $valor2 = $soma<br>";
echo "Subitração: $valor1 - $valor2 = $subi<br>";
echo "Multiplicação: $valor1 * $valor2 = $multi<br>";
echo "Divisão: $valor1 / $valor2 = $divi<br>";


?>
    
</body>
</html>