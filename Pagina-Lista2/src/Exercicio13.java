import java.util.Scanner;

/* 13 - Faça um programa que receba o peso de uma pessoa, calcule e apresente:
               a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
               b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.
*/
public class Exercicio13 { 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu peso atual");
        double pesoAtual = input.nextDouble();
        System.out.println("O seu novo peso caso engorde 15% a mais sera: " + (pesoAtual * 0.15 + pesoAtual) + " e se emagracer 20% sera: " + (pesoAtual - pesoAtual * 0.20));
        
    }
}