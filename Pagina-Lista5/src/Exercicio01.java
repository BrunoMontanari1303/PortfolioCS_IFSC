import java.util.Scanner;

// While: 1 - Escreva uma algoritmo que leia dois valores. O algoritmo encerra quando o primeiro valor informado for igual ao segundo valor.


public class Exercicio1 {
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        while(num1 != num2){
            System.out.println("Digite 2 valores inteiros: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
        }   
}
}