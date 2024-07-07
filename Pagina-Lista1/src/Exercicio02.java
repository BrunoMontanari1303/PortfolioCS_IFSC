import java.util.Scanner;

// 02 - Escreva um algoritmo para ler um número inteiro e imprimi-lo na tela. 
public class Exercicio2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero");
        int numero = input.nextInt();
        System.out.println("O numero digitado eh: " + numero);
    }
}