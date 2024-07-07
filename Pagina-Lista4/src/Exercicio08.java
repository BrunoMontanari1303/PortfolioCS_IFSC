import java.util.Scanner;

/* 8 -  Uma empresa dará um aumento de salário aos seus funcionários de acordo com a
categoria de cada empregado. O aumento seguirá a seguinte regra:
• Funcionários das categorias A e H ganharão 10% de aumento sobre o salário;
• Funcionários das categorias B, D, e E ganharão 15% de aumento sobre o salário;
• Funcionários das categorias C e F ganharão 25% de aumento sobre o salário;
• Funcionários das demais categorias ganharão 30% de aumento sobre o salário.
Faça um programa que leia o nome do funcionário, sua categoria e salário atual e
imprima o seu nome, categoria e salário reajustado.*/

public class Exercicio8 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double salarioReajustado;
        System.out.println("Digite seu nome, categoria e salario atual");
        String nome = input.next();
        char categoria = input.next().charAt(0);
        double salarioAtual = input.nextDouble();
        if(categoria == 'a' || categoria == 'A' || categoria == 'h' || categoria == 'H'){
             salarioReajustado = salarioAtual + (salarioAtual * 0.1);
             System.out.println(nome + ", seu novo salario sera " + salarioReajustado + " por estar na categoria " + categoria);
        }else{
            if(categoria == 'b' || categoria == 'B' || categoria == 'd' || categoria == 'D' || categoria == 'e' || categoria == 'E'){
                salarioReajustado = salarioAtual + (salarioAtual * 0.15);
                System.out.println(nome + ", seu novo salario sera " + salarioReajustado + " por estar na categoria " + categoria);
                
            }else{
                if(categoria == 'c' || categoria == 'C' || categoria == 'f' || categoria == 'F'){
                    salarioReajustado = salarioAtual + (salarioAtual * 0.25);
                    System.out.println(nome + ", seu novo salario sera " + salarioReajustado + " por estar na categoria " + categoria);
                }else{
                    salarioReajustado = salarioAtual + (salarioAtual * 0.30);
                    System.out.println(nome + ", seu novo salario sera " + salarioReajustado + " por estar em uma categoria alternativa");
                }
            }
        }
    }
}
