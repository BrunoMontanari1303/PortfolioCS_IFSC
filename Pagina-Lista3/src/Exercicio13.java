import java.util.Scanner;

/* 13 - Considere que o último concurso vestibular apresentou três provas: Português,
        Matemática e Conhecimentos Gerais. Para cada candidato tem-se um registro
        contendo o seu nome e as notas obtidas em cada uma das provas. Construa um
        programa que leia estes dados e apresente:
        a) o nome e as notas em cada prova do candidato.
        b) a média do candidato.
        c) uma informação dizendo se o candidato foi aprovado ou não. Considere que um
        candidato é aprovado se sua média for maior que 7.0 e se não apresentou
        nenhuma nota abaixo de 5.0*/

public class Exercicio13 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do candidato: ");
        String nome = input.next();
        System.out.println("Digite a nota do candidato na prova de Portugues: ");
        float notaPort = input.nextFloat();
        System.out.println("Digite a nota do candidato na prova de Matematica: ");
        float notaMat = input.nextFloat();
        System.out.println("Digite a nota do candidato na prova de Conhecimentos Gerais: ");
        float notaGerais = input.nextFloat();
        float media = (notaPort + notaMat + notaGerais)/3;
        if(notaPort >= 5 && notaMat >= 5 && notaGerais >= 5 && media >= 7) {
        	System.out.println("As notas de " + nome + " foram: " + notaPort + " em Portugues, " + notaMat + " em Matematica e " + notaGerais + " em Conhecimentos Gerais.");
        	System.out.println("Portanto, sua media foi: " + media + " e o candidato foi aprovado");
        }else {
        	System.out.println("As notas de " + nome + " foram: " + notaPort + " em Portugues, " + notaMat + " em Matematica e " + notaGerais + " em Conhecimentos Gerais. Alem disso a media foi: " + media +".");
        	System.out.println("Portanto, o candidato foi reprovado");
        }
        
    }
}