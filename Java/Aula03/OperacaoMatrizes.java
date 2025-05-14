package Faculdade.Java.Aula03;

public class OperacaoMatrizes{
    public static void main(String[] args){
        int [][] matriz1 = {
                {1, 2},
                {3, 4}
        };
        int [][] matriz2 = {
                {5, 6},
                {7, 8}
        };
        int [][] soma = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("Resultado da soma das matrizes: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println(soma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
