import java.util.Scanner;

// 11 - Escreva um programa que receba um horário (horas, minutos e segundos) e determine quantos segundos já se passaram desde que o dia começou

public class Exercicio11 { 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite apenas a hora atual");
        int horas = input.nextInt();
        System.out.println("Digite apenas os minutos atuais");
        int minutos = input.nextInt();
        int segundos = horas * 60 * 60 + minutos * 60;
        System.out.println("Ja se passaram " + segundos + " segundos desde que o dia começou");


    }
}