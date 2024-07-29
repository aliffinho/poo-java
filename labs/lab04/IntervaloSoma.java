package lab04;

import java.util.Arrays;
import java.util.List;

import java.util.Scanner;

public class I {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Recebe os dois números inteiros
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        // Fecha o scanner
        scanner.close();
        
        // Calcula a soma dos números positivos no intervalo definido por num1 e num2
        int soma = somaPositivosIntervalo(num1, num2);
        
        // Exibe o resultado
        System.out.println("A soma dos números positivos no intervalo é: " + soma);
    }

    // Método para calcular a soma dos números positivos no intervalo
    public static int somaPositivosIntervalo(int inicio, int fim) {
        // Garante que o intervalo está em ordem crescente
        int menor = Math.min(inicio, fim);
        int maior = Math.max(inicio, fim);
        
        int soma = 0;
        for (int i = menor; i <= maior; i++) {
            if (i > 0) {
                soma += i;
            }
        }
        return soma;
    }
}