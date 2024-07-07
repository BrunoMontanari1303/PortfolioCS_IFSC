import java.util.Scanner;

// 04 - Faça um programa que leia um número inteiro N e apresente uma mensagem indicando se N é par ou ímpar

public class Exercicio4 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor inteiro");
        int valor = input.nextInt();
        if(valor % 2 != 0){
            System.out.println("O numero eh impar");
        }else{
            System.out.println("O numero eh par");
        }
                
                
     
    }
}
