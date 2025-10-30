import java.util.Scanner;
import java.util.Random;

public class Jokempo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

            System.out.printf("\n===== Jokempô =====\n\n");

        System.out.print("Digite seu nome: ");
            String name = scanner.nextLine();

            System.out.println("\nOlá " + name + ", Escolha uma das opções abaixo\n");

    int jogador;
    
    do{
        System.out.println("\n1- Pedra");
        System.out.println("2- Papel");
        System.out.println("3- Tesoura");

        System.out.println("\n0- Sair\n\n");

        System.out.print("Opção escolhida: ");
        
        jogador = scanner.nextInt();

            switch (jogador){
                case 1:
                    System.out.println("\n" + name + " Pedra");
                        break;

                case 2:
                    System.out.println("\n" + name + " Papel");
                        break;
                
                case 3:
                    System.out.println("\n" + name + " Tesoura");
                        break;

                case 0:
                    System.out.println("\n Saindo...\n");
                        break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
                    continue;
        }

        if (jogador == 0) break;
        
            Random random = new Random();
            int Bot = random.nextInt(3) + 1;

            switch (Bot){
                case 1:
                    System.out.println("Bot: Pedra");
                        break;
                case 2:
                    System.out.println("Bot: Papel");
                        break;
                case 3:
                    System.out.println("Bot: Tesoura");
                        break;

                case 0:
                    System.out.println(" ");
                        break;

                    default:
                        System.out.println(" ");
            }       

        if (jogador == Bot){
            System.out.print("\nEmpate!\n\n");

        } else if ((jogador == 1) && (Bot == 3) ||
                        (jogador == 2) && (Bot == 1) ||
                          (jogador == 3) && (Bot == 2)){
                            System.out.print("\nParabéns " + name + ", você venceu!!\n");
                          }

         else if ((Bot == 1) && (jogador == 3) ||
                        (Bot == 2) && (jogador == 1) ||
                          (Bot == 3) && (jogador == 2)){
                            System.out.print("\nVocê perdeu!!\n");
                          }
                          
                } 
                    while (jogador != 0);

        scanner.close();
        
    }
}
