import java.util.Scanner;

// 05 - Crie uma nova o programa da questão 4, para que ele considere a frequência do aluno. Agora, para ser aprovado o aluno precisa ter nota igual ou superior a sete no trabalho, nota igual ou superior a seis em pelo menos uma das provas e frequência igual ou superior a 75%. Além desta diferença, caso o aluno tenha nota seis no trabalho ele poderá ser aprovado, mas para isto precisa ter frequência igual ou superior a 90%.

public class Exercicio5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a nota do trabalho: ");
        double notaTrabalho = input.nextDouble();
        System.out.println("Digite a nota da prova 1: ");
        double notaProva1 = input.nextDouble();
        System.out.println("Digite a nota da prova 2: ");
        double notaProva2 = input.nextDouble();
        System.out.println("Digite a frequencia do aluno: ");
        int frequencia = input.nextInt();
        if(notaTrabalho >= 6 && (notaProva1 >=6 || notaProva2 >= 6) && frequencia >= 90){
            System.out.println("O aluno foi aprovado");
        }else{
            if(notaTrabalho >= 7 && (notaProva1 >=6 || notaProva2 >= 6) && frequencia >= 75){
                System.out.println("O aluno foi aprovado");
        }   else{
                System.out.println("O aluno foi reprovado");
            }
        }
    }
}