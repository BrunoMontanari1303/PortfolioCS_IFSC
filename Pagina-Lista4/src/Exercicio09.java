import java.util.Scanner;

/* 09 - Faça um programa que, para uma conta bancária, leia o seu número, o saldo atual,
        o tipo de operação a ser realizada (1 - depósito ou 2 - saque) e o valor da operação.
        Após, o programa deve calcular e apresentar o novo saldo. Se o novo saldo ficar
        negativo, deve ser mostrada, também, a mensagem “conta estourada”.*/

public class Exercicio9 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double novoSaldo;
        System.out.println("Informe o numero da conta e saldo atual");
        int numeroConta = input.nextInt();
        double saldoAtual = input.nextDouble();
        System.out.println("Digite 1 se deseja depositar e 2 caso deseje sacar e apos isso, qual sera o valor da operacao");
        int operacao = input.nextInt();
        double valorOp = input.nextDouble();
        if(operacao == 2){
            novoSaldo = saldoAtual - valorOp;
            System.out.println("O seu novo saldo eh: " + novoSaldo);
            if(novoSaldo < 0){
                System.out.println("Conta estourada");
            }
        }else{
            if(operacao == 1){
                novoSaldo = saldoAtual + valorOp;
                System.out.println("O seu novo saldo eh: " + novoSaldo);
            }else{
                System.out.println("Operacao cancelada.");
            }
        }
    }
}
