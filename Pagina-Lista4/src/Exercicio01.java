import java.util.Scanner;

/* 01 - Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de
        quilowatts em uma residência. O programa deve calcular e imprimir o valor a ser pago
        pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
        em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
        conta. Além disto, o programa deve mostrar uma mensagem indicando se a residência
        está com consumo elevado de energia. A empresa considera consumo elevado de
        energia, se a residência consumir mais de de 70 quilowatts.
        O programa deve apresentar a mensagem “Consumo elevado de energia”, caso o
        consumo seja elevado, ou “Você é um consumidor consciente”, caso o consumo não seja
        elevado.*/


public class Exercicio1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o preco do Kw de energia: ");
        double precoKilowatt = input.nextDouble();
        System.out.println("Digite a quantidade gasta na residencia: ");
        double quantGasta = input.nextDouble();
        double valorAPagar = precoKilowatt * quantGasta;
  
        System.out.println("Caso pague em dia, o valor sera: " + valorAPagar + ", caso contrario sera: " + (valorAPagar*0.1 + valorAPagar));
        if(quantGasta > 70){
            System.out.println("Consumo elevado de energia");
        }else {
        	System.out.println("Você é um consumidor consciente");
        }
    }
}