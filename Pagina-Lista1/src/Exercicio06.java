import java.util.Scanner;

// 06 - Escreva um algoritmo para calcular o consumo médio de um automóvel (medido em Km/l), dado que são conhecidos a distância total percorrida e o volume de combustível consumido para percorrêla (medido em litros). Fórmula: consumo = distancia / volume


public class Exercicio6{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a distancia percorrida");
        float distancia = input.nextFloat();
        System.out.println("Digite o volume gasto de combustivel");
        float volume = input.nextFloat();
        float consumo = distancia/volume;
        System.out.println("O consumo médio gasto pelo veiculo eh: " + consumo);
    }
}