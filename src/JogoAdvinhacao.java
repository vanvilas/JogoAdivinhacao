import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        //gerar um número aleatório entre 0 e 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);

        //inicializar o Scanner para obter dados do usuário
        Scanner scanner = new Scanner(System.in);

        //inicializar a variável para contar as tentativas
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100. Você tem " + tentativas + " tentativas.");

        //loop para controlar as tentativas
        for (int i = 1; i <= tentativas ; i++) {
            System.out.println("Tentativa " + i + ": ");
            int palpite = scanner.nextInt();

            //verificar se o palpite está correto
            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + "!");
                acertou = true;
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que " + palpite + ".");
            } else {
                System.out.println("O número é menor que " + palpite + ".");
            }
        }

            //verificar se o usuário não acertou o número
            if (!acertou) {
                System.out.println("Que pena! Você não coneguiu adivinhar o número. O número era " + numeroAleatorio + ".");
            }

            //fechar o scanner
            scanner.close();
        }
    }

