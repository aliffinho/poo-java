package lab04;

import java.util.Random;
import java.util.Scanner;

public class Repeticoes3 {
    // java lab04/Repeticoes3.java
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int tentativas = 0;
        int palpite;
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        do {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;
            if (palpite > numeroAleatorio) {
                System.out.println("Palpite muito alto! Tente um número menor.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Palpite muito baixo! Tente um número maior.");
            }
        } while (palpite != numeroAleatorio);

        System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
        scanner.close();
    }
}


    


    

