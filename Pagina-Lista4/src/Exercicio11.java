import java.util.Scanner;

/* 11 -  Elabore um programa que tome como entrada um determinado horário, expresso por
        hora (valor inteiro de 0 a 23), minuto (valor de 0 a 59) e segundo (valor de 0 a 59) e
        imprima esse horário acrescido de 1 segundo. Cada hora tem 60 minutos e cada minuto
        sem 60 segundos. O incremento de um segundo no horário, além de alterar o valor do
        segundo, pode implicar em alterações no valor do minuto e da hora. Veja que um horário
        como 13:59:59 acrescido de 1 segundo vai para 14:00:00.*/


public class Exercicio11 {
    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Insira uma hora(0 a 23), minuto(0 a 59) e segundo(0 a 59): ");
    	int hora = input.nextInt();
    	int minuto = input.nextInt();
    	int segundo = input.nextInt();
    	if(hora > 23 || hora < 0 ||minuto > 59 || minuto < 0 || segundo > 59 || segundo < 0) {
    		System.out.println("Digite valores validos");
    	}else {
    		if(segundo == 59) {
    			minuto = minuto + 1;
    			segundo = 0;
    			if(minuto == 60) {
    				hora = hora + 1;
    				minuto = 0;
    				if(hora == 24) {
    					hora = 0;
    				}
    			}
    			System.out.println("São " + hora + " horas, " + minuto + " minutos e " + segundo + " segundos ao incrementar 1 segundo.");
    		}else {
    			segundo = segundo + 1;
    			System.out.println("São " + hora + " horas, " + minuto + " minutos e " + segundo + " segundos ao incrementar 1 segundo.");
    		}     		
    	}
    }
}