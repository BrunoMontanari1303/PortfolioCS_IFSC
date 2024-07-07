import java.util.Scanner;

// 13 - Construa um programa que leia o nome e a quantidade em estoque de três produtos e mostre quais produtos estão abaixo do estoque mínimo (30 unidades).

public class Exercicio13 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome de tres produtos");
        String produto1 = input.next();
        String produto2 = input.next();
        String produto3 = input.next();
        System.out.println("Digite a quantia de estoque dos 3 produtos respectivamente");
        int estoqueProd1 = input.nextInt();
        int estoqueProd2 = input.nextInt();
        int estoqueProd3 = input.nextInt();
        if(estoqueProd1 < 30){
            System.out.println("O estoque de  " + produto1 + " esta abaixo do minimo");
        }
        if(estoqueProd2 < 30){
            System.out.println("O estoque de " + produto2 + " esta abaixo do minimo");
        }
        if(estoqueProd3 < 30){
            System.out.println("O estoque de " + produto3 + " esta abaixo do minimo");
        }
    }
}
