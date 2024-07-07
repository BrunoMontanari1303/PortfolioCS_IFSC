import java.util.Scanner;

/* For: 05 - Escreva um algoritmo, que leia um conjunto de 10 fichas, cada uma
             contendo, a altura e o código do sexo de uma pessoa (código = 1 se for
             masculino e 2 se for feminino), e calcule e imprima:
             -a maior altura da turma;
             -a média de altura das mulheres;
             -a média de altura da turma.

public class Exercicio5 {
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double maiorAltura = 0, somaAltura = 0, somaAlturaMulheres = 0;
        int i, quantidadeMulheres = 0;
        for( i = 0; i < 10; i++){
            System.out.println("Digite a altura");
            double altura = input.nextDouble();
            System.out.println("Digite 1 para masculino e 2 para feminino");
            int codigo = input.nextInt();
            if(codigo != 1 && codigo != 2){
                System.out.println("Digite um codigo valido!!");
                break;
            }
            somaAltura = somaAltura + altura;  
            if(altura > maiorAltura){
                maiorAltura = altura;
            }
            if(codigo == 2){
                somaAlturaMulheres = somaAlturaMulheres + altura;
                quantidadeMulheres++;
            }
        }
        double media = somaAltura/i;
        double mediaMulheres = somaAlturaMulheres/quantidadeMulheres;
        System.out.println("A media de altura total eh: " + media);
        System.out.println("A media de altura das mulheres eh: " + mediaMulheres);
        System.out.println("A maior altura eh: " + maiorAltura);
        
    }
}