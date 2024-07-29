package lab04;

import java.util.Scanner;

public class Repeticoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int numero = sc.nextInt();

        int contagem = 0;

        for (int i = 1; i <= numero; i++) { 
            if (numero % i == 0) {
                contagem++;
            }
        }

        System.out.println("O número pode ser dividido por " + contagem + " números");
        
        sc.close();
    }
}