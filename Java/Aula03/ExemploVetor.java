package Faculdade.Java.Aula03;

public class ExemploVetor{
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Elementos do vetor: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Indice " + i + ":" + numeros[i]);
        }
    }
}
