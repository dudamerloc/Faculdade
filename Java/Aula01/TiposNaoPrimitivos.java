package Faculdade.Java.Aula01;

import java.util.ArrayList;
import java.util.List;

public class TiposNaoPrimitivos {
   public static void main(String[] args) {

    //Tipo String
    String texto = "olá mundo!";

    //Tipo Array
    int[] numeros = {10, 20, 30, 40};

    //Tipo Lista
    List<String> listaNomes = new ArrayList<>();
    listaNomes.add("Ana");
    listaNomes.add("Bruno");
    listaNomes.add("Camila");

    //Exibindo os valores no console 
    System.out.println("String: " + texto);

    System.out.println("Array de numeros: ");
    for(int num: numeros){
        System.out.println(num + "");
    }
    System.out.println("Lista de nomes:" + listaNomes);  
   }
}
