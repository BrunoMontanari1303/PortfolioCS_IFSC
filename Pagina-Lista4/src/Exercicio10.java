import java.util.Scanner;

/* 10 - Faça um programa que leia três valores X, Y e Z e verifique se eles podem ser os
        comprimentos dos lados de um triângulo, e se forem, deve verificar se é um triângulo
        equilátero, isóscele ou escaleno. Se eles não formarem um triângulo, o programa deve
        escrever uma mensagem indicando.
        Propriedade – o comprimento de cada lado de um triângulo é menor do que a soma dos
        comprimentos dos outros dois lados.
        Definição 1 - chama-se de triângulo equilátero o que tem os comprimentos dos três lados
        iguais;
        Definição 2 - chama-se de triângulo isóscele o triângulo que tem os comprimentos de
        dois lados iguais;
        Definição 3 - chama-se triângulo escaleno o triângulo que tem os comprimentos dos três
        lados diferentes.*/


public class Exercicio10 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva 3 valores de lados de um triangulo");
        double valor1 = input.nextDouble();
        double valor2 = input.nextDouble();
        double valor3 = input.nextDouble();
        if(valor1 > valor2 + valor3 || valor2 > valor1 + valor3 || valor3 > valor1 + valor2){
            System.out.println("Nao e um triangulo");
        }else{
            if(valor1 == valor2 && valor2 == valor3){
                System.out.println("Eh um triangulo equilatero");
            }else{
                if((valor1 == valor2 && valor1 != valor3) || (valor2 == valor3 && valor1 != valor2) || (valor1 == valor3 && valor1 != valor2)){
                    System.out.println("Eh um triangulo isoscele");
                }else{
                    if(valor1 != valor2 && valor2 != valor3 && valor3 != valor1){
                        System.out.println("Eh um triangulo escaleno");
                    }
                }
            }
        }
        
    }
}