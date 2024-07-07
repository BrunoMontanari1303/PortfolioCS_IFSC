import java.util.Scanner;

/* 07 - Uma pessoa foi ao supermercado e comprou:
               Q quilos de café, cujo custo unitário é X;
               L litros de leite, cujo custo unitário é Y;
               B pacotes de bolacha, cujo custo unitário é Z.
               Faça um programa que leia estes dados e imprima, para cada produto: nome do produto, total gasto com ele. Além disto, ele deve apresentar o total gasto na compra.
               */


public class Exercicio7 { 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de café comprada");
        int quantCafe = input.nextInt();
        System.out.println("Digite o preco do cafe: ");
        double precoCafe = input.nextDouble();
        System.out.println("Digite a quantidade de leite comprada");
        int quantLeite = input.nextInt();
        System.out.println("Digite o preço do leite: ");
        double precoLeite = input.nextDouble();
        System.out.println("Digite a quantidade de bolachas comprada");
        int quantBolacha = input.nextInt();
        System.out.println("Digite o preco da bolacha: ");
        double precoBolacha = input.nextDouble();
        
        double gastoCafe = quantCafe * precoCafe;
        double gastoLeite = quantLeite * precoLeite;
        double gastoBolacha = quantBolacha * precoBolacha;
        double gastoTotal = gastoBolacha + gastoCafe + gastoLeite;
        
        System.out.println("O gasto com cafe foi: " + gastoCafe + "; o gasto com leite foi: " + gastoLeite + "; o gasto com bolacha foi: " + gastoBolacha + " e o gasto total foi: " + gastoTotal);
        
    }
}