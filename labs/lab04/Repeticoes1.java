package lab04;

import java.util.Scanner;

public class Repeticoes1 {
    // java lab04/Repeticoes1.java
    public static void main(String[] args) {
        /**
         * while: Executa um bloco de código enquanto uma condição específica for
         * verdadeira.
         */
        var sc = new Scanner(System.in);
        System.out.println("Digite um número");
        var numero = sc.nextInt();
        var contador = 1;
        while (contador < 10) {
            
            System.out.println(numero * contador);
            contador += 1;
        }
    }
}
