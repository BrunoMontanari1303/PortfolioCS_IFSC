import java.util.Scanner;

/* 08 - Escreva um programa que leia o valor da compra e o valor pago pelo cliente. O
        programa deve calcular e apresentar, o valor da compra, o valor pago pelo cliente, o valor
        do troco e a quantidade de notas que deve ser dada de cada tipo para formar este troco.
         O troco deve ser dado de forma a minimizar a quantidade de notas distribuídas.*/

public class Exercicio8 {
     public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        double vCompra = input.nextDouble();
        System.out.println("Digite o valor pago pelo cliente");
        double vPago = input.nextDouble();
        double troco = vPago - vCompra;
        int nota100, nota50, nota10, nota1;
        if(troco > 0){
            for(nota100 = 0; troco >= 100; nota100++){
                troco = troco - 100; 
            }
            for(nota50 = 0; troco >=50; nota50++){
                troco = troco - 50;
            }
            for(nota10 = 0; troco>= 10; nota10++){
                troco = troco - 10;
            }
            for(nota1 = 0; troco>=1; nota1++){
                troco = troco - 1;
            }
            System.out.println("Eh preciso dar o troco com " + nota100 + " notas de 100; " + nota50 + " notas de 50; " + nota10 + " notas de 10 e " + nota1 + " notas de 1.");
        }else{
            System.out.println("Nao eh necessario troco");
        }
    }
}
