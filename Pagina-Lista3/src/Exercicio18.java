import java.util.Scanner;

// 18 -  Faça um programa que leia um número inteiro entre 0 e 999 e apresente a soma dos seus dígitos. Por exemplo, se o número digitado por 284 o resultado será igual a 14 (2+8+4).

public class Exercicio19 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 999");
        int numero = input.nextInt();
        int resto = numero % 10;
        if(numero > 0 && numero <= 999) {
        	numero = numero / 10;
        	int somaAlgarismos = resto + (numero % 10);
        	numero = numero / 10;
        	somaAlgarismos = somaAlgarismos + (numero % 10);
        	System.out.println("A soma dos algarismos eh: " + somaAlgarismos);
        }else{
        	System.out.println("Esse nao eh um valor valido");
        }        
    }
}
