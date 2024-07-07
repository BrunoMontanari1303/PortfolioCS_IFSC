import java.util.Scanner;

/* 03 - Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule e
        imprima o seu índice de massa corporal, usando a seguinte fórmula: IMC = Peso / Altura2
        .
        Além do IMC, o programa deve mostrar a situação da pessoa, de acordo com o seu IMC:
        • Abaixo de 20 – magro;
        • Entre 20 e 24,99 – normal;
        • Entre 25 e 30 – sobrepeso;
        • Acima de 30 – obeso.*/

public class Exercicio3 {
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();
        System.out.println("Digite seu peso: ");
        double peso = input.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        if(imc >= 20 && imc <= 25){
            System.out.println("Situacao: normal");
        }else {
        	if(imc < 20) {
        		System.out.println("Situacao: magro");
        	}else {
        		if(imc > 25 && imc < 30) {
        			System.out.println("Situacao: sobrepeso");
        		}else {
        			System.out.println("Situacao: obesidade");
        		}
        	}
        }
    }
}