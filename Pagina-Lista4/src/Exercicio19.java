import java.util.Scanner;

/* 19 - Desafio - Crie um algoritmo que leia uma data (dia, mês e ano – números inteiros
        separados) e imprima se a data é válida ou não. Para uma data ser válida, o ano deve ser
        um número entre 0 e 9999. Além disto, deve-se verificar se a quantidade de dias digitadas
        é compatível com o mês. Não esqueça de verificar se o ano é bissexto ou não.*/

public class Exercicio19 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um ano");
        int ano = input.nextInt();
        System.out.println("Digite um mes");
        int mes = input.nextInt();
        System.out.println("Digite um dia");
        int dia = input.nextInt();
        if(ano < 1 || mes > 12 || mes < 1 || dia < 1 || dia > 31){
            System.out.println("Data invalida");
        }else{
            if(ano % 100 != 0 && ano % 4 == 0 && mes == 2 && dia <= 29){
                System.out.println("Data valida");
            }else{
                if(mes == 2 && dia > 28){
                    System.out.println("Data invalida");
                }else{
                    if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                        switch(mes){
                        case 4:
                            if(dia == 31){
                                System.out.println("Data invalida");
                            }else{
                                System.out.println("Data valida");
                            }
                            break;
                        case 6:
                            if(dia == 31){
                                System.out.println("Data invalida");
                            }else{
                                System.out.println("Data valida");
                            }
                            break;                    
                        case 9:
                            if(dia == 31){
                                System.out.println("Data invalida");
                            }else{
                                System.out.println("Data valida");
                            }
                            break;               
                        case 11:
                            if(dia == 31){
                                System.out.println("Data invalida");
                            }else{
                                System.out.println("Data valida");
                            }
                            break;                                                
                        }   
                    }else{
                        System.out.println("Data valida");
                    }
                }
            }
        }
    }
}