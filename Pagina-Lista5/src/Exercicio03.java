import java.util.Scanner;

// While: 03 - Elabore um algoritmos que leia o nome, idade, sexo de uma pessoa. O algoritmo encerras se a idade lida for igual a zero. Mostre a quantidade de repetições do algoritmo

public class Exercicio3 {
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva seu nome");
        String nome = input.nextLine();       
        int idade = 1;
        System.out.println("Pressione F(Feminino) ou M(Masculino) de acordo com seu sexo");
        char sexo = input.next().charAt(0);
        int contador = 0;
        while(idade != 0){
            System.out.println("Digite sua idade");
            idade = input.nextInt();
            contador++;
        }
        System.out.println(nome + ", programa foi repetido " + contador + " vezes.");
        
    }
}