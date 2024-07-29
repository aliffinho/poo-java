package lab04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Repeticoes6 {

    public static void mostrarMenu() {
        System.out.println("Escolha uma operação matemática:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
    }

    public static double adicao(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN; // Retorna NaN (Not-a-Number) em caso de erro
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            mostrarMenu();
            System.out.print("Digite o número da operação desejada (1/2/3/4) ou 'sair' para encerrar: ");
            String escolha = scanner.nextLine();

            if (escolha.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa.");
                break;
            }

            int opcao;
            try {
                opcao = Integer.parseInt(escolha);
            } catch (NumberFormatException e) {
                System.out.println("Escolha inválida. Tente novamente.");
                continue;
            }

            if (opcao < 1 || opcao > 4) {
                System.out.println("Escolha inválida. Tente novamente.");
                continue;
            }

            System.out.print("Digite o primeiro valor: ");
            double valor1;
            System.out.print("Digite o segundo valor: ");
            double valor2;

            try {
                valor1 = Double.parseDouble(scanner.nextLine());
                valor2 = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira valores numéricos.");
                continue;
            }

            double resultado;
            switch (opcao) {
                case 1:
                    resultado = adicao(valor1, valor2);
                    System.out.println("Resultado da adição: " + resultado);
                    break;
                case 2:
                    resultado = subtracao(valor1, valor2);
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3:
                    resultado = multiplicacao(valor1, valor2);
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 4:
                    resultado = divisao(valor1, valor2);
                    if (!Double.isNaN(resultado)) {
                        System.out.println("Resultado da divisão: " + resultado);
                    }
                    break;
            }
        }
        scanner.close();
    }
}