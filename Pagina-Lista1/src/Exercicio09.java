import java.util.Scanner;

// 09 - Escreva um algoritmo que calcule a raiz quadrada de um número informado pelo usuário.

public class Exercicio9{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero a ser calculada a raiz quadrada: ");
        double numero = input.nextDouble();
        double raizQuadrada = Math.pow(numero, 0.5);
        System.out.println("A raiz quadrada do numero eh: " + raizQuadrada);
    }
}