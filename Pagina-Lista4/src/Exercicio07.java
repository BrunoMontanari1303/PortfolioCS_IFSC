import java.util.Scanner;

// 07 - Faça um programa que leia três valores inteiros e os imprima em ordem crescente

public class Exercicio7 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva 3 valores");
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();
        if(valor1 < valor2){
            if(valor2 < valor3){
                System.out.println(valor1 + "," + valor2 + "," + valor3);
            }else{
                System.out.println(valor1 + "," + valor3 + "," + valor2);
            }
        }else{
            if(valor2 < valor3 && valor3 < valor1){
                System.out.println(valor2 + "," + valor3 + "," + valor1);
            }else{
                if(valor2 < valor3 && valor1 < valor3){
                    System.out.println(valor2 + "," + valor1 + "," + valor3);
                }else{
                    if(valor3 < valor1 && valor3 < valor2 && valor1 < valor2){
                        System.out.println(valor3 + "," + valor1 + "," + valor2);
                    }else{
                        if(valor3 < valor1 && valor3 < valor2 && valor2 < valor1){
                            System.out.println(valor3 + "," + valor2 + "," + valor1);
                        }
                    }
                }
            }
        }
    }
}