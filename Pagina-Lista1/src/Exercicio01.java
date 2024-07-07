import java.util.Scanner;

// 01 - Escreva um algoritmo que imprima na tela seu nome

public class Exercicio1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = input.nextLine();
        System.out.println("O nome digitado eh: " + nome);
    }
}