import java.util.Scanner;

/* 18 - Um banco concederá um crédito especial aos seus clientes de acordo com o saldo
        médio no último ano. Faça um programa que leia o saldo médio de um cliente e calcule o
        valor do crédito de acordo com a tabela a seguir e imprima uma mensagem informando o
        saldo médio e o valor do crédito.*/


public class Exercicio18 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double creditoExtra;
        System.out.println("Digite o seu saldo medio");
        double saldoMedio = input.nextDouble();
        if(saldoMedio > 500 && saldoMedio <= 1000){
            creditoExtra = saldoMedio * 0.3;
            System.out.println("Voce recebera R$" + creditoExtra);
        }else{
            if(saldoMedio > 1000 && saldoMedio <= 3000 ){
                creditoExtra = saldoMedio * 0.4;
            System.out.println("Voce recebera R$" + creditoExtra);
            }else{
                if(saldoMedio > 3000){
                    creditoExtra = saldoMedio * 0.5;
                    System.out.println("Voce recebera R$" + creditoExtra);
                }else{
                    System.out.println("Voce nao recebera credito especial");
                }
            }   
        }
    }
}