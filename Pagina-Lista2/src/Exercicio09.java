import java.util.Scanner;

// 09 - (DESAFIO) Crie um programa que leia um número inteiro que representa a quantidade de segundos de um vídeo. O programa deve calcular e apresentar quantas horas, minutos e segundos dura este vídeo.

public class Exercicio9 { 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos segundos tem o video: ");
        int segundos = input.nextInt();
        int horas = segundos/3600;
        int minutos = (segundos%3600)/60;
        segundos = segundos%60;
        
        
        System.out.println("O video tem " + horas + "h " + minutos + "min " + segundos + "segundos" );

    }
}