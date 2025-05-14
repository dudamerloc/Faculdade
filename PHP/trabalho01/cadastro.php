<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trabalho 01</title>
</head>
<body>

    <?php

    if ($_SERVER['REQUEST_METHOD'] == 'POST') {

        if (
            !empty($_POST['nome']) &&
            !empty($_POST['consumo']) &&
            !empty($_POST['horas']) &&
            !empty($_POST['dias']) &&
            !empty($_POST['valorkwh'])
        ) {

            $nome = $_POST['nome'];
            $consumo = $_POST['consumo'];
            $horas = $_POST['horas'];
            $dias = $_POST['dias'];
            $valorkwh = $_POST['valorkwh'];

            $x = $consumo / 1000;
            $consumo_diario = $x * $horas;

            $consumo_mensal = $consumo_diario * $dias;

            $custo = $consumo_mensal * $valorkwh;

            if ($custo <= 5) {
                $categoria = "Baixa";
            } elseif ($custo <= 10) {
                $categoria = "Moderada";
            } else {
                $categoria = "Elevada";
            }

            echo "<h2>Cliente Cadastrado:</h2>";
            echo "Nome do aparelho: $nome<br><br>";
            echo "Consumo máximo do aparelho em watts: $consumo<br><br>";
            echo "Número de horas que o aparelho é ligado por dia: $horas<br><br>";
            echo "Número de dias que o aparelho ficará ligado no mês: $dias<br><br>";
            echo "Valor do kilowatt-hora: R$ ".number_format($valorkwh, 2, ',', '.')."<br><br>";

            echo "<h3>Consumo e Custo:</h3>";
            echo "Consumo diário: ".number_format($consumo_diario, 2, ',', '.')." kWh<br><br>";
            echo "Consumo mensal: ".number_format($consumo_mensal, 2, ',', '.')." kWh<br><br>";
            echo "Consumo do aparelho em reais: R$ ".number_format($custo, 2, ',', '.')."<br><br>";

            echo "<strong>Categoria de consumo: $categoria</strong><br><br>";

            echo '<a href="index.php">Voltar a página inicial</a>';

        } else {
            echo "<h3>Preencha todos os campos do formulário!!</h3>";
            require_once('form_cadastro.php');
        }

    } else {
        echo '<h3>ATENÇÃO: formulário não enviado</h3>';
        require_once('form_cadastro.php');

    }

    ?>

</body>
</html>
