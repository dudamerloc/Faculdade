package Faculdade.Java.Aula06;

/*O que é Encapsulamento? 
É o conceito de esconder os detalhes internos de uma classe e permitir o acesso a eles somente  por meio de métodos controlados. */

class Pessoa{
    String nome;
    int idade;
 }
 
 public class Encapsulamento { //exemplo sem encapsulamento
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Duda";
        p.idade = 10;

        if(p.idade >= 0){
            System.out.println(p.nome + " tem " + p.idade + " anos.");
        }else{
            System.out.println("Idade inválida");
        }
        p.idade = -5;

        System.out.println(p.nome + " tem " + p.idade + " anos");
    }    
 }
