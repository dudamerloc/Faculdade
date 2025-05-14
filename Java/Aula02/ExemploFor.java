package Faculdade.Java.Aula02;

public class ExemploFor{
    
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.println("Número: " + i);
        }

        int[] numeros = {1, 2, 3, 4, 5};
        // Exibindo valores com for-each 
        for (int num: numeros){
            System.out.print(num + " ");
        }

        // Tentativa de modificar os valores com for-each
        for (int num : numeros){
            num *= 2;
        }
        for (int num : numeros){
            System.out.print(num + " ");
        }

        // Modificando os valores com o for tradicional
        for (int i = 0; i < numeros.length; i++){
            numeros[i] *= 2;
        }
        for (int num : numeros){
            System.out.print(num + " ");
        }
    }
}