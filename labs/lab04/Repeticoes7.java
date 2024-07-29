package lab04;

import java.util.Scanner;

public class Repeticoes7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de números que serao lidos: ");
        int qntd = sc.nextInt();

        int maior = 0; 
        int contagem = 0;

        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o número : ");
            int numero = sc.nextInt();
            
            if (numero > maior) {
                maior = numero;
                contagem = 1; 
            } else if (numero == maior) {
                contagem++; 
            }
        }

        System.out.println("O maior número é " + maior);
        System.out.println("Quantidade de vezes que o maior número foi lido: " + contagem);
        
        sc.close();
    }
}