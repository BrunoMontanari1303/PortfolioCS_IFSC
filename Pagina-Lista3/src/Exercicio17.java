import java.util.Scanner;

/* 17 - Faça um programa que leia o dia, o mês e o ano de nascimento de uma pessoa e o
        dia, mês e ano atual. Em seguida, o programa deve calcular e apresentar quantos dias a
        pessoa já viveu (considere que todos os meses têm 30 dias e, por consequência, cada
        ano tem 360 dias).*/

public class Exercicio17 {
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano, mes(1 a 12) e dia do nascimento respectivamente");
        int anoNascimento = input.nextInt();
        int mesNascimento = input.nextInt();
        int diaNascimento = input.nextInt();
        System.out.println("Digite o ano atual, mes(1 a 12) e dia respectivamente");
        int anoAtual = input.nextInt();
        int mesAtual = input.nextInt();
        int diaAtual = input.nextInt();
        int somaDias = (diaAtual + (mesAtual - 1) * 30) + ((anoAtual - anoNascimento) * 360) - (((mesNascimento - 1) * 30) + diaNascimento);
        System.out.println("A pessoa viveu " + somaDias + " dias.");
        
	}
}