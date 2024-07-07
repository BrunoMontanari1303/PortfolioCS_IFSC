import java.util.Scanner;

/* 05 - Faça um programa que leia um número inteiro N e imprima “F1”, “F2” ou “F3”, conforme
        a condição:
        • “F1”, se N <= 10
        • “F2”, se N > 10 e N <= 100
        • “F3”, se n > 100*/

public class Exercicio5 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor inteiro");
        int valor = input.nextInt();
        if(valor <= 10){
            System.out.println("F1");
        }else{
            if(valor > 10 && valor <= 100){
                System.out.println("F2");
            }else{
                System.out.println("F3");
            }
        }
                
                
     
    }
}
