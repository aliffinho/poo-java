package lab04;

import java.util.Arrays;
import java.util.List;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a quantidade de números a serem lidos
        System.out.print("Digite a quantidade de números a serem lidos: ");
        int quantidade;
        try {
            quantidade = Integer.parseInt(scanner.nextLine());
            if (quantidade <= 0) {
                System.out.println("A quantidade deve ser um número positivo.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            return;
        }

        // Inicializa variáveis para armazenar o maior número e a contagem
        double maiorNumero = Double.NEGATIVE_INFINITY;
        int contagemMaior = 0;

        // Lê os números e processa
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero;
            try {
                numero = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                i--; // Decrementa o índice para garantir que o usuário insira um número válido
                continue;
            }

            if (numero > maiorNumero) {
                maiorNumero = numero;
                contagemMaior = 1; // Reinicia a contagem para o novo maior número
            } else if (numero == maiorNumero) {
                contagemMaior++;
            }
        }

        // Exibe o resultado
        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O maior número foi lido " + contagemMaior + " vezes.");

        scanner.close();
    }
}