package lab04;

import java.util.Scanner;

public class Repeticoes5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);

        int somar = 0;
        for (int i = inicio; i <= fim; i++) {
            if (i > 0) {
                somar += i;
            }
        }

        System.out.println("A soma dos números positivos no intervalo é: " + somar);

        scanner.close();
    }
}