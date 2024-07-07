import java.util.Scanner;

/* 14 - Faça um algoritmo que, tendo como dados de entrada a altura (h) e o gênero de uma
        pessoa (M ou F), calcule seu peso ideal utilizando as seguintes fórmulas: Masculino: Peso
        ideal = 72.7 * h - 58; Feminino: Peso ideal = 62.1 * h - 44.7. Caso o usuário digite uma
        letra inválida para o gênero, o programa deve apresentar uma mensagem de erro.*/

public class Exercicio14 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a altura e apos, o genero(m ou f)");
        double altura = input.nextDouble();
        char genero = input.next().charAt(0);
        if(genero == 'm' || genero == 'M'){
            double pesoIdeal = 72.7 * altura - 58;
            System.out.println("O seu peso ideal eh: " + pesoIdeal);
        }else{
            if(genero == 'f' || genero == 'F'){
                double pesoIdeal = 61.1 * altura - 44.7;
                System.out.println("O seu peso ideal eh: " + pesoIdeal);
            }else{
                System.out.println("Genero nao identificado");
            }
        }
    }
}