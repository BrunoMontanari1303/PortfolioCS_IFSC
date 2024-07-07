import java.util.Scanner;

// 04 - Escreva um programa que leia a temperatura em graus Celsius e apresente a temperatura correspondente em graus Fahrenheit, usando a fórmula: F = (9 * C + 160) / 5. 

public class Exercicio4{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite em Celsius a temperatura a ser convertida para Fahrenheit");
        float temperaturaCelsius = input.nextFloat();
        float temperaturaFahrenheit = (9*temperaturaCelsius)/5 + 32;
        System.out.println("A temperatura convertida para Fahrenheit é: " + temperaturaFahrenheit);
    }
}
