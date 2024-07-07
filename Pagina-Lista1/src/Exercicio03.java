import java.util.Scanner;

// 03 - Escreva um algoritmo para leu um número inteiro e imprimir na tela seu sucessor e seu antecessor.
public class Exercicio3{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero");
        int numero = input.nextInt();
        int antecessor, sucessor;
        System.out.println("O numero digitado eh: " + numero);
        antecessor = numero - 1 ;
        sucessor = numero + 1;
        System.out.println("O antecessor do numero eh: " + antecessor);
        System.out.println("O sucessor do numero eh: " + sucessor);
    }
}