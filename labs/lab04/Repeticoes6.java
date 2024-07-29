package lab04;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        System.out.println("Escolha Uma Opção:");

        System.out.println("--------------------");

        System.out.println("Digite (1) Para Adição");
        System.out.println("Digite (2) Para Subtração");
        System.out.println("Digite (3) Para Multiplicação");
        System.out.println("Digite (4) Para Divisão");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua escolha: ");
        int escolha = sc.nextInt();

        System.out.print("Digite um número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = sc.nextInt();

        int soma = 0;
        int subtracao = 0;
        int multiplicacao = 0;
        int divisao = 0;

        if(escolha == 1){
            soma = numero1 + numero2;
            System.out.println(numero1 + " + " + numero2 + " = " + soma);
        }else if(escolha == 2){
            subtracao = numero1 - numero2;
            System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
        }else if(escolha == 3){
            multiplicacao = numero1 * numero2;
            System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
        }else if(escolha == 4){
            divisao = numero1 / numero2;
            System.out.println(numero1 + " / " + numero2 + " = " + divisao);
        }else{
            System.out.println("Escolha inválida!");
        }
        sc.close();
    }
}