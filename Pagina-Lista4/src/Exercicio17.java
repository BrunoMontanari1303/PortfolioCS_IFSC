import java.util.Scanner;

/* 17 - Faça um programa que leia um peso na Terra e o código de um planeta e imprima o
        valor do seu peso neste planeta.
        1. Mercúrio
        2. Vênus
        3. Marte
        4. Júpiter
        5. Saturno
        6. Urano
        7. Netuno*/


public class Exercicio17 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double pesoConvertido;
        System.out.println("Informe um peso e em seguida o codigo do planeta que deseja saber a conversao(1-Mercurio; 2-Venus; 3-Marte; 4-Jupiter; 5-Saturno; 6-Urano; 7-Netuno)");
        double peso = input.nextDouble();
        int planeta = input.nextInt();
        switch(planeta){
            case 1: 
                pesoConvertido = peso * 0.37;
                System.out.println("O peso convertido eh: " + pesoConvertido);
                break;
            case 2:
                pesoConvertido = peso * 0.88;
                System.out.println("O peso convertido eh: " + pesoConvertido);
                break;
            case 3:
                pesoConvertido = peso * 0.38;
                System.out.println("O peso convertido eh: " + pesoConvertido);
                break;
            case 4:
                pesoConvertido = peso * 2.64;
                System.out.println("O peso convertido eh: " + pesoConvertido);
                break;
            case 5:
                pesoConvertido = peso * 1.15;
                System.out.println("O peso convertido eh: " + pesoConvertido);
                break;
            case 6:
                pesoConvertido = peso * 1.17;
                System.out.println("O peso convertido eh: " + pesoConvertido);
                break;
            case 7:
                pesoConvertido = peso * 1.18;
                System.out.println("O peso convertido eh: " + pesoConvertido);
                break;
            default:
                System.out.println("Digite uma opcao valida");
                break;
        }
    }    
}