import java.util.Scanner;

/* 16 - Faça um programa que leia a quantidade total de parcelas de um consórcio, a
        quantidade de parcelas já pagas e o valor de cada parcela (considere que todas as
        parcelas tem o mesmo valor). O programa deve calcular e apresentar o total já pago pelo
        cliente e qual é o seu saldo devedor.*/

public class Exercicio16 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o total de parcelas e em seguida o numero de parcelas que ja foi pago");
        int totalParcelas = input.nextInt();
        int parcelasPagas = input.nextInt();
        System.out.println("Digite o preco das parcelas: ");
        float precoParcelas = input.nextFloat();
        float valorAPagar = precoParcelas * (totalParcelas - parcelasPagas);
        System.out.println("Ainda faltam " +(totalParcelas - parcelasPagas)+" parcelas a ser pagas e o valor a ser pago eh de R$" + valorAPagar);
       		
    }
}
        		