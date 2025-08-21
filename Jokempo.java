import java.util.Scanner;
import java.util.Random;

public class Jokempô{
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
                    System.out.printf("\nJokempô\n\n");

        System.out.printf("Qual o seu nome?\n\n");
        String name = scanner.nextLine();

        System.out.printf("\nOlá, " + name + ", Escolha uma opção: ");
        System.out.println("\n\n1- Pedra");
        System.out.println("2- Papel");
        System.out.println("3- Tesoura\n");
        
            System.out.print("Opção escolhida: ");

            int Jogador = scanner.nextInt();

        switch (Jogador){
            case 1:
                System.out.printf("\n" + name + ": Pedra\n");
                break;

                case 2:
                    System.out.printf("\n" + name + ": Papel\n");
                    break;

            case 3:
                System.out.printf("\n" + name + ": Tesoura\n");
                break;
                    default:
                        System.out.println("Opção inválida");
                            System.exit(0);
        }

                Random random = new Random();
                int Bot = random.nextInt(3) + 1;
                

        switch (Bot){
            case 1:
                System.out.println("Computador: Pedra");
                break;

                case 2:
                    System.out.println("Computador: Papel");
                    break;

            case 3:
                System.out.println("Computador: Tesoura");
                break;
        }

            if (Jogador == Bot){
                System.out.println("\nEmpate!\n\n");
            } else if ((Jogador == 1 /*Pedra*/) && (Bot == 3 /*Tesoura*/) ||
                        (Jogador == 2 /*Papel*/) && (Bot == 1 /*Pedra*/) ||
                         (Jogador == 3 /*Tesoura*/) && (Bot == 2 /*Papel*/)){
                            System.out.printf("\nParabéns, " + name + ", você venceu!\n\n");
                         } else{
                            System.out.printf("\nVocê perdeu!\n\n");
        }
            scanner.close();
    }
}
