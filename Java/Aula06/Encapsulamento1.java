package Faculdade.Java.Aula06;

/*O que é um método GET?

Um método GET ou GETTER é um método público que serve para ler (ou acessar) o valor de um atributo é privado de uma classe.
Quando um atributo é private, ele não pode ser acessado diretamente de forma de classe. O método get é a fora controlada e segura de obter esse valor. 
O método SET ou SETTER, serve para alterar o valor do atributo. */

class Pessoa{
    private String nome;
    private int idade;

    //GETTERS
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    //SETTERS (para alterar)
    public void setNome(String NovoNome){
        nome = NovoNome;
    }
    public void setIdade(int novaIdade){
        if(novaIdade >= 0 ){
            idade = novaIdade;
        }else{
            System.out.println("Idade inválida ");
        }
    }
}

public class Encapsulamento1 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
    p.setNome("Duda");
    p.setIdade(-19); //Agora é verificado

    System.out.println(p.getNome() + " tem " + p.getIdade() + " anos.");
    }  
}