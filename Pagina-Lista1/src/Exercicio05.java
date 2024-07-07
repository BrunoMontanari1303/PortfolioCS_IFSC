import java.util.Scanner;


// 05 - Escreva um algoritmo para calcular o valor de y como função de x, segundo a função y(x) = 3x + 2, num domínio real.

public class Exercicio5{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor de x");
        int varX = input.nextInt();
        int varY = 3 * varX + 2;
        System.out.println("A resposta da funcao de y em razao a x eh: " + varY);
    }
}