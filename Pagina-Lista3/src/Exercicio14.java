import java.util.Scanner;

/* 14 - Faça um programa leia o salário bruto e o número de dependentes de um funcionário
        e calcule o seu salário líquido. Para calcular o salário líquido, deve-se descontar:
        - 11% de INSS;
        - 15% de Imposto de renda.
        Após os descontos, deve-se adicionar um auxílio de R$ 150,00 por dependente.*/

public class Exercicio14 {
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o salario bruto recebido e em seguida o numero de dependentes");
        float salarioBruto = input.nextFloat();
        int dependentes = input.nextInt();
        double salarioLiquido = salarioBruto - (salarioBruto * 0.11 + salarioBruto * 0.15);
        float auxilio = dependentes * 150;
        double salarioFinal = salarioLiquido + auxilio;
        System.out.println("O seu salario a ser recebido sera: R$" + salarioFinal);
	}
}
