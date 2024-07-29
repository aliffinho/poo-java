public class r {

    // Função para calcular a quantidade de divisores de um número
    public static int countDivisors(int number) {
        int count = 0;
        // Itera até a raiz quadrada do número
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // Se i é um divisor, então number / i também é um divisor
                if (number / i == i) {
                    count++; // Se divisores são iguais, conta apenas uma vez
                } else {
                    count += 2; // Conta ambos divisores i e number / i
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Testa a função com um exemplo
        int number = 36; // Exemplo de número
        int divisorCount = countDivisors(number);
        System.out.println("A quantidade de divisores de " + number + " é " + divisorCount);
    }
}