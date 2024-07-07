import java.util.Scanner;

// 03 - Crie um programa que leia as medidas da base e altura de um retângulo, calcule e apresente a área e o perímetro deste retângulo.

public class Exercicio3 {
     public static void main(String args[]){
         Scanner input = new Scanner(System.in);
         System.out.println("Digite o tamanho da base do retangulo: ");
         int baseRetangulo = input.nextInt();
         System.out.println("Digite o tamanho da altura do retangulo: ");
         int alturaRetangulo = input.nextInt();
         int areaRetangulo = baseRetangulo * alturaRetangulo;
         int perimetroRetangulo = baseRetangulo*2 + alturaRetangulo*2;
         System.out.println("A area do retangulo eh: " + areaRetangulo + " e o perimetro eh: " + perimetroRetangulo);
       
     }
}
