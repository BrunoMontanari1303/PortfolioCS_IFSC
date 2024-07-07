import java.util.Scanner;

// 10 - Escreva um algoritmo que dada uma temperatura em Celsius ele faz a conversão paraFahreheit. A fórmula para tal conversão é: F = (9 * C + 160) / 5.

public class Exercicio10{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite em Celsius a temperatura a ser convertida para Fahrenheit");
        float temperaturaCelsius = input.nextFloat();
        float temperaturaFahrenheit = (9*temperaturaCelsius)/5 + 32;
        System.out.println("A temperatura convertida para Fahrenheit é: " + temperaturaFahrenheit);
    }
}
