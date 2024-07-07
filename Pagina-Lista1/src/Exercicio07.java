import java.util.Scanner;

// 07 - Escreva um algoritmo para calcular o quadrado de um número, ou seja, o produto de um número por si mesmo. 

public class Exercicio7{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero a ser calculado o quadrado");
        int numero = input.nextInt();
        int quadradoNumero = numero*numero;
        System.out.println("O quadrado do numero eh: " + quadradoNumero);
    }    
}