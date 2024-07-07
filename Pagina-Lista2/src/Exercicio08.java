import java.util.Scanner;

// 08 - Faça um programa que leia um número inteiro e apresente o quociente e o resto da divisão deste número por 2.

public class Exercicio8 { 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = input.nextInt();
        int quociente = numero/2;
        int resto = numero % 2;
        System.out.println("O quociente da divisao por 2 eh: " + quociente + " e o resto da divisao eh: " + resto);

    }
}