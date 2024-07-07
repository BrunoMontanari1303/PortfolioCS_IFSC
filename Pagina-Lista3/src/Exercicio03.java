import java.util.Scanner;

// 03 - Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule e imprima o seu índice de massa corporal, usando a seguinte fórmula: IMC = Peso / Altura2. Além do IMC, o programa deve mostrar se a pessoa está acima do peso ideal (IMC > 25).

public class Exercicio3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();
        System.out.println("Digite seu peso: ");
        double peso = input.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        if(imc > 25){
            System.out.println("O seu IMC esta acima do ideal");
        }
    }
}