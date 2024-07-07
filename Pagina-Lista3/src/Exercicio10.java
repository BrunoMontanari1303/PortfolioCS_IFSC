import java.util.Scanner;

/* 10 - Faça um programa que calcule os gastos com combustível em uma viagem. O
        programa deve solicitar ao usuário a distância a ser percorrida em Km, o consumo médio
        do carro (quantos quilômetros o carro percorre com um litro de combustível) em Km/litro e
        o preço do litro do combustível. O programa deve calcular e apresentar o valor em R$ a
        ser gasto com combustível na viagem.*/

public class Exercicio10 {
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a distância a ser percorrida em Km: ");
        float distancia = input.nextFloat();
        System.out.println("Digite o consumo medio do carro(quantos litros gasta em 1km): ");
        float consumoMedio = input.nextFloat();
        System.out.println("Digite o preco do litro de combustivel: ");
        float precoCombustivel = input.nextFloat();
        float gastoCombustivel = consumoMedio * distancia;
        float valorAPagar = gastoCombustivel * precoCombustivel;
        System.out.println("Serao gastos: " + valorAPagar + " reais na viagem");
	}
	
}
