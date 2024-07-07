import java.util.Scanner;

// 10 - Um restaurante a quilo cobra R$39,00 por quilo de refeição. Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Obs. O prato vazio pesa 450 gramas.

public class Exercicio10 { 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o peso em quilos do prato");
        double pesoPrato = input.nextFloat();
        double preco = 39 * (pesoPrato - 0.45);
        System.out.println("O valor a ser pago eh: " + preco);
        
        


    }
}