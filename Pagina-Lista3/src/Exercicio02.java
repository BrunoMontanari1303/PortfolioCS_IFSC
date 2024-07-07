import java.util.Scanner;

// 02 - Crie uma nova versão do programa da questão 2 para que ele mostre uma mensagem indicando se a residência está com consumo elevado de energia. A empresa considera consumo elevado de energia, se a residência consumir mais de de 70 quilowatts.

public class Exercicio2 {
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