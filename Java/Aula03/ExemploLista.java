package Faculdade.Java.Aula03;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        //Criando uma lista de nomes
        List<String> nomes = new ArrayList<>();
        //List<String> -> Interface que define uma lista de Strings
        //nomes ->Nome da variável que armazena a lista
        //new ArrayList<>() -> Criação de uma nova lista dinâmica que pode crescer ou diminuir de tamanho																						       
        
        //Adicionando elementos da lista
        nomes.add("Ana");
        nomes.add("Bruna");
        nomes.add("Camila");
        nomes.add("Duda");
        nomes.add("Eduarda");

        //Exibindo elementos da lista
        System.out.println("Lista de nomes: ");
        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
