//João recebeu seu salário de R$ 1500,00 e precisa pagar duas contas (C1=R$ 200,00 e C2=R$120,00). Como as contas estão atrasadas, João terá de pagar multa de 2% sobre cada conta. Faça um programa que calcule e mostre quanto restará do salário do João.

public class Exercicio14 { 
    public static void main(String args[]){
       
        double salarioJoao = 1500.00;
        double contas = (200*0.02 + 200) + (120*0.02 + 120);
        double restoSalario = salarioJoao - contas;
        System.out.println("O que restou do salario foi: " + restoSalario);
    
    }
}
