import java.util.Scanner;

// 04 - O sistema de avaliação de uma disciplina é composto de duas provas e um trabalho. Para ser aprovado, o aluno precisa ter nota igual ou superior a sete no trabalho e nota igual ou superior a seis em pelo menos uma das provas. Observe que não se deve calcular a média das notas. Faça um programa que leia as três notas do aluno e apresente se ele deve ser aprovado ou não.

public class Exercicio4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a nota do trabalho: ");
        double notaTrabalho = input.nextDouble();
        System.out.println("Digite a nota da prova 1: ");
        double notaProva1 = input.nextDouble();
        System.out.println("Digite a nota da prova 2: ");
        double notaProva2 = input.nextDouble();
        if(notaTrabalho >= 7 && (notaProva1 >=6 || notaProva2 >= 6)){
            System.out.println("O aluno foi aprovado");
        }else{
            System.out.println("O aluno foi reprovado");
        }
        
    }
}
