import java.util.Scanner;

// While: 02 - Elabore um algoritmo que leia dois números inteiros. O segundo número lido deverá ser maior que o primeiro número. Mostre a soma dos dois números lidos.


public class Exercicio2 {
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 2 valores inteiros: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int soma;
        soma = num1 + num2;
        System.out.println("A soma dos numeros eh: " + soma);
        while(num1 < num2){
            System.out.println("Digite 2 valores inteiros: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            soma = num1 + num2;
            System.out.println("A soma dos numeros eh: " + soma);
        }
    }
}