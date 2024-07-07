import java.util.Scanner;

/* 12 - Um ângulo é agudo se for menor que 90 graus, reto se for igual a 90 graus e é dito
        obtuso se for maior que 90 graus. Escreva um programa que leia o valor de um ângulo e
        imprima uma informação dizendo se o mesmo é agudo, reto ou obtuso. */

public class Exercicio12 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor de um angulo");
        double angulo = input.nextDouble();
        if(angulo < 90){
            System.out.println("O angulo eh agudo");
        }else{
            if(angulo == 90){
                System.out.println("O angulo eh reto");
            }else{
                System.out.println("O angulo e obtuso");
            }
        }
    }
}