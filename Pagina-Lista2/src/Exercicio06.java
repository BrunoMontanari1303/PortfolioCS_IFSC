import java.util.Scanner;

// 06 - Uma revendedora de carros paga a seus vendedores um salário fixo equivalente a dois salários-mínimos, mais uma comissão de R$ 150,00 por carro vendido e mais uma comissão de 5% do valor das vendas. Crie um programa que leia o valor do saláriomínimo, quantos carros o vendedor vendeu ao longo do mês e o valor total das vendas. Após ler os dados, o programa deve calcular e apresentar o valor do salário do funcionário.

public class Exercicio6 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do salario minimo: ");
        double salarioMinimo = input.nextDouble();
        System.out.println("Digite o valor de carros vendidos: ");
        int carrosVendidos = input.nextInt();
        System.out.println("Digite o valor total das vendas: ");
        double valorTotal = input.nextDouble();
        double salarioFinal = (salarioMinimo * 2) + (carrosVendidos*150) + (5 * 0.01 * valorTotal);
        System.out.println("O salario final do vendedor sera: " + salarioFinal);
        
    }
}
