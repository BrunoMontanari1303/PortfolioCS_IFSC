import java.util.Scanner;

// 08 - Escreva um algoritmo para ler quatro números, calcular o quadrado de cada um deles, somar tudo e mostrar o resultado.

public class Exercicio8{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero a ser calculado o quadrado");
        int numero1 = input.nextInt();
        System.out.println("Digite o segundo numero a ser calculado o quadrado");
        int numero2 = input.nextInt();
        System.out.println("Digite o terceiro numero a ser calculado o quadrado");
        int numero3 = input.nextInt();
        System.out.println("Digite o quarto numero a ser calculado o quadrado");
        int numero4 = input.nextInt();
        int resultado = numero1*numero1 + numero2*numero2 + numero3*numero3 + numero4*numero4;
        System.out.println("A soma dos quadrados dos numeros eh: " + resultado);
    }    
}