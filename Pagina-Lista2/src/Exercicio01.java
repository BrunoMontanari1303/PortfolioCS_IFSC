import java.util.Scanner;

// 01 - Faça um programa que leia dois números, calcule e apresente a soma dos quadrados destes números.

public class Exercicio1 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero a ser calculado o quadrado");
        int numero1 = input.nextInt();
        int quadradoNum1 = numero1 * numero1;
        System.out.println("Digite o segundo numero a ser calculado o quadrado");
        int numero2 = input.nextInt();
        int quadradoNum2 = numero2 * numero2;
        int somaDosQuadrados = quadradoNum1 + quadradoNum2;
        System.out.println("A soma dos quadrados eh: " + somaDosQuadrados);
        
    }    
}