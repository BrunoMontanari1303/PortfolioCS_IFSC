import java.util.Scanner;

// 06 - Faça um algoritmo que leia 3 números inteiros distintos e escreva o menor deles.

public class Exercicio6 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva 3 valores");
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();
        if(valor1 < valor2 && valor1 < valor3){
            System.out.println("O menor valor eh " + valor1);
        }else{
            if(valor2 < valor1 && valor2 < valor3){
                System.out.println("O menor valor eh " + valor2);
            }else{
                System.out.println("O menor valor eh " + valor3);
            }
                    
        }
        
    }
}