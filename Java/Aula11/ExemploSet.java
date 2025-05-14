package Faculdade.Java.Aula11;

import java.util.HashSet;
import java.util.Set;
public class ExemploSet {
    public static void main(String[]args){

        //Criando um conjunto
        Set<String> cores = new HashSet<>();

        //Adcionando elementos
        cores.add("Vermelho");
        cores.add("Rosa");
        cores.add("Roxo");
        cores.add("Azul");
        cores.add("Preto");

        //Testando add uma cor ja existente
        cores.add("Preto");   //Não será add

        //Imprimindo o conjunto
        System.out.println("Cores: " );
        for (String cor : cores){
            System.out.println(cor);
        }

        //Verificando se contem uma cor
        if(cores.contains("Rosa")) {
            System.out.println("Contem a cor Rosa.");
            }

        //Removendo uma cor
        cores.remove("Roxo");

        //Tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + cores.size());
        }
    }
