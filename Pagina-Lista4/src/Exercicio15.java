import java.util.Scanner;

/* 15 - Faça um algoritmo que, dada a idade de um nadador, classifique-o em uma das
        seguintes categorias: Infantil (5 -10 anos); Juvenil (11 - 17 anos); Adulto (18 - 60 anos);
        Senior (Acima de 60 anos). */

public class Exercicio15 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a idade do nadador");
        int idade = input.nextInt();
        if(idade >= 5 && idade <= 10){
            System.out.println("O nadador e da categoria infantil");
        }else{
            if(idade > 10 && idade <= 17){
                System.out.println("O nadador e da categoria juvenil");
            }else{
                if(idade > 17 && idade <= 60){
                    System.out.println("O nadador e da categoria adulto");
                }else{
                    if(idade > 60){
                        System.out.println("O nadador e da categoria senior");
                    }else{
                        System.out.println("Idade nao suficiente");
                    }
                } 
            }
        }
    }
}
