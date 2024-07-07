import java.util.Scanner;

// 12 - Faça um programa que leia os valores A, B e C e informe se a soma de A com B é menor ou igual a C.

public class Exercicio12 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero a ser comparado: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo numero a ser comparado: ");
        int num2 = input.nextInt();
        System.out.println("Digite o terceiro numero a ser comparado: ");
        int num3 = input.nextInt();
        if(num1 + num2 <= num3){
            System.out.println("A soma dos dois numeros eh menor ou igual ao terceiro valor");
        }else{
            System.out.println("A soma dos dois numeros eh maior que o terceiro valor");
        }
    }
}
