import java.util.Scanner;

/* 11 - Faça um programa que leia dois números A e B e mostre se eles são iguais.*/

public class Exercicio11 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero a ser comparado: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo numero a ser comparado: ");
        int num2 = input.nextInt();
        if(num1 == num2){
            System.out.println("Os dois valores sao iguais");
        }else{
            System.out.println("Os dois valores sao diferentes");
        }
    }
}