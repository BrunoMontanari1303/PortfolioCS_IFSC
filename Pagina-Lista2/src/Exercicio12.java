import java.util.Scanner;

// 12 - Escreva um programa que receba um horário (horas, minutos e segundos) e determine quantos segundos ainda faltam para terminar o dia (considere o dia com 24 horas).

public class Exercicio12 { 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite apenas a hora atual");
        int horas = input.nextInt();
        System.out.println("Digite apenas os minutos atuais");
        int minutos = input.nextInt();
        int segundos = horas * 60 * 60 + minutos * 60;
        int fimDoDia = 86400 - segundos;
        System.out.println("Faltam " + fimDoDia + " segundos ate o fim do dia");       

    }
}