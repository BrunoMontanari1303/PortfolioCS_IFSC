import java.util.Scanner;

// 02 - Faça um programa que leia dois números, calcule e apresente o quadrado da soma destes números. 

public class Exercicio2 {
 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero a ser calculado a soma");
        int numero1 = input.nextInt();
        System.out.println("Digite o segundo numero a ser calculado a soma");
        int numero2 = input.nextInt();
        int soma = numero1 + numero2;
        int quadradoDaSoma = soma * soma;
        System.out.println("O quadrado da soma eh: " + quadradoDaSoma);
    
    }
}
