import java.util.Scanner;

// 01 - Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de quilowatts em uma residência. O programa deve calcular e imprimir o valor a ser pago pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da conta. O programa não deve perguntar se a conta será paga em atraso ou não, ele deve sempre calcular e apresentar os dois valores, para que o usuário analise a diferença e decida se vai pagar a conta em dia ou não.

public class Exercicio1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o preco do Kw de energia: ");
        double precoKilowatt = input.nextDouble();
        System.out.println("Digite a quantidade gasta na residencia: ");
        double quantGasta = input.nextDouble();
        double valorAPagar = precoKilowatt * quantGasta;
  
        System.out.println("Caso pague em dia, o valor sera: " + valorAPagar + ", caso contrario sera: " + (valorAPagar*0.1 + valorAPagar));
    }
}