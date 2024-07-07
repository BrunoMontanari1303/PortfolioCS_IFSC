import java.util.Scanner;

// 05 - Uma sorveteria vende três tipos de picolés. Sabendo-se que o picolé tipo 1 é vendido por R$ 1,50, o do tipo 2 por R$ 2,00 e o do tipo 3 por R$ 0,75, faça um programa que leia a quantidade vendida de cada tipo de picolé e apresente o valor arrecadado com as vendas de cada tipo de picolé e o valor total das vendas.

public class Exercicio5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de picoles do tipo 1 vendidos: ");
        float quantPicole1 = input.nextFloat();
        System.out.println("Digite a quantidade de picoles do tipo 2 vendidos: ");
        float quantPicole2 = input.nextFloat();
        System.out.println("Digite a quantidade de picoles do tipo 3 vendidos: ");
        float quantPicole3 = input.nextFloat();
        
        double lucroPicole1 = quantPicole1 * 1.50;
        double lucroPicole2 = quantPicole2 * 2.00;
        double lucroPicole3 = quantPicole3 * 0.75;
        double total = lucroPicole1 + lucroPicole2 + lucroPicole3; 
        
        System.out.println("Os lucros do tipo 1 foram: " + lucroPicole1 + "; os do tipo 2 foram:" + lucroPicole2 + " e os do tipo 3 foram: " + lucroPicole3 + ". Portanto o total foi: " + total);
         
    }
}
