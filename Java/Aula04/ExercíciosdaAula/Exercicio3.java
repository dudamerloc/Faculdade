package Faculdade.Java.Aula04.ExercíciosdaAula;
import java.util.Scanner;

class Carro{
    String modelo;
    boolean ligado = false;
    int velocidade = 0;

    void ligar(){
        if(!ligado){
            ligado = true;
            System.out.println("O carro foi ligado! ");

        } else{
            System.out.println("O carro já está ligado! ");
        }
    }

    void desligar(){
        if(ligado && velocidade == 0){
            ligado = false;
            System.out.println("O carro foi desligado! ");            
        }else if(velocidade > 0){
            System.out.println("Não é possível desligar o carro em movimento! ");

        }else{
            System.out.println("O carro ja está desligado.");
        }
    }

    void acelerar(){
        if(ligado){
            velocidade += 20;
            System.out.println("Acelerando velocidade atual: " + velocidade);
        } else{
            System.out.println("Vocêprecisa ligar o carro primeiro!");
        }
    }
 
    void parar(){
        if(velocidade > 0){
            velocidade = 0;
            System.out.println("Diminuiu a velocidade... carro parado!");
        }else{
            System.out.println("O carro já está parado. ");
        }
    }
}

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        int op;
        do{

        System.out.println("\n=== MENU ===");
        System.out.println("1- Ligar carro");
        System.out.println("2- Acelerar");
        System.out.println("3- Desligar carro");
        System.out.println("4- Parar carro");
        System.out.println("5- Sair");
        System.out.println("Escolha uma opção");

        op = scanner.nextInt();

        switch (op) {
            case 1:
            System.out.println("\033[H\033]2J");
            carro.ligar();
                
                break;
                case 2:
                System.out.println("\033[H\033]2J");
                carro.acelerar();
                    
                    break; 
                    case 3:
                    System.out.println("\033[H\033]2J");
                    carro.desligar();
                        
                        break; 
                        case 4:
                        System.out.println("\033[H\033]2J");
                        carro.parar();
                            
                            break; 
                            case 5:
                            System.out.println("Saindo do programa...");
                                
                                break; 
                                case 6:
        
                                    default:
                                    System.out.println("Opção inválida. Tente novamente");
                                         break;
        }
        }while (op!= 5);
            
             scanner.close();
        }
    }
   


