package Faculdade.Java.Aula03;

public class OperacaoVetor{
    public static void main(String[] args){
        int [] vetor1 = {1,2, 3, 4, 5};
        int [] vetor2 = {5, 6, 7, 8, 9};
        int [] soma = new int[5];

        //Soma dos dois vetores
        for(int i = 0; i < vetor1.length; i++){
            soma[i] = vetor1[1] + vetor2[i];
        }

        //Exibindo Resultado
        System.out.println("Resultado da soma dos vetores: ");
        for(int valor : soma){
            System.out.println(valor + "");
        }
        System.out.println();
    }
}