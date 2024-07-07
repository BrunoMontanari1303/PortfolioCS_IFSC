import java.util.Scanner;

// 16 - Escreva um programa que tome como entradas as coordenadas de um ponto (abscissa e ordenada) e imprima em que quadrante (1, 2, 3 ou 4) o ponto está localizado. 

public class Exercicio16 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe 2 coordenadas para um eixo x e y");
        double eixoX = input.nextDouble();
        double eixoY = input.nextDouble();
        if(eixoX > 0 && eixoY > 0){
            System.out.println("O ponto esta no quadrante 1");
        }else{
            if(eixoX < 0 && eixoY > 0){
                System.out.println("O ponto esta no quadrante 2");
            }else{
                if(eixoX < 0 && eixoY < 0 ){
                    System.out.println("O ponto esta no quadrante 3");
                }else{
                    if(eixoX > 0 && eixoY < 0){
                        System.out.println("O ponto esta no quadrante 4");
                    }else{
                        System.out.println("O ponto esta em cima de algum eixo");
                    }
                }
            }
        }
    }
}