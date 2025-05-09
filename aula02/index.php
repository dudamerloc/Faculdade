<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 02 - Página Inicial</title>
</head>
<body>
    
    <h1>Aula 02 - PHP</h1>

    <?php
        echo "Hello, World!";

        //declaração de variaveis
        $aluno = "Jaysie Oliveira"; "<br>";
        $periodo = 3;
        $disciplina = "Desenvolvimento de Sistemas";
        $media = 7.5;
        
        //echo "Aluno: " . $aluno; //concatenação
        //echo "Periodo: $periodo"; //interpolação   

        if ($media >= 6) {
            echo "Aprovado";

        } else if ($media >=1 && $media < 6) {

            echo "Pendente";
        } else {
            echo "Reprovado";
        }

        //valor de 0 a 5
        $dificuldade = 4;

        echo "<br>Dificuldade da disciplina (0 a 5): ";

        swith ($dificuldade) {

            case 0:
                echo "Muito fácil";
                break;

            case 1:
                echo "Fácil";
                break;
            
            case 2:
                echo "Intermediário";
                break;
            
            case 3:
                echo "Difícil";
                break;

            case 4:
                echo "Muito difícil";
                break;

            case 5: 
                echo "Impossível";
                break;

            default:
                echo "Valor inválido!";
                break;

        }

        //EXEMPLO DE LAÇO FOR
        for($i = 10; $i >= 0; $i--) {

            echo "$i...<br>"; //interpolação

        }

        echo "<h2>Fim da aula!</h2>";
    ?>
    
</body>
</html>