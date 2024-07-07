import java.util.Scanner;

// 04 - Escreva um algoritmo para ler um nome, um endereço e um telefone e imprimi-los na tela

public class Exercicio4{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = input.nextLine();
        System.out.println("Digite um endereco");
        String endereco = input.nextLine();
        System.out.println("Digite um numero");
        int numero = input.nextInt();
        System.out.println("O nome digitado foi: " + nome + ", o numero digitado foi: " + numero + " e o endereco eh: " + endereco);
    }
}