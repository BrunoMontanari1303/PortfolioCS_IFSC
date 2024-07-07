import java.util.Scanner;

/* Do While: 07 - Faça um programa para calcular a conta final de um hóspede de um hotel
                fictício, considerando que: . Devem ser lidos o nome do hóspede, o tipo do
                apartamento utilizado (A, B, C), o número de diárias utilizadas pelo hóspede
                (que deverá ser superior a zero);
                O valor da diária é determinado pela seguinte tabela:
                TIPO DO APTO – VALOR DA DIÁRIA (R$)
                A – 150.00
                B – 100.00
                C – 75.00
                Calcule o total a pagar ( total a pagar é o valor da diária multiplicado pelo
                numero de dias hospedados)
                 Escreva a conta final contendo: o nome do hóspede, o tipo do
                apartamento, valor total das diárias.
                 Para cadastrar os dados de novo hóspede pergunte Deseja continuar
                S/N.*/

public class Exercicio7 {
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        char continuar;
        int quantAPagar;
        do{           
        System.out.println("Digite seu nome: ");
        String nome = input.next();
        System.out.println("Qual o tipo de apartamento utilizado? (A/B/C)");
        char tipoApt = input.next().charAt(0);
        System.out.println("Quantos dias foram reservados?");
        int dias = input.nextInt();
        quantAPagar = 0;
        switch(tipoApt){
            case 'A': quantAPagar = dias * 150;
                      break;
            case 'B': quantAPagar = dias * 100;
                      break;
            case 'C': quantAPagar = dias * 75;
                      break;
            default:  System.out.println("Digite um tipo de apartamento valido!");
                      break;
        }
        System.out.println(nome + ", voce reservou o apt de tipo " + tipoApt + " e precisa pagar R$" + quantAPagar);
        
        System.out.println("Deseja continuar? (S/N)");
        continuar = input.next().charAt(0);
        }while(continuar == 's' || continuar == 'S');
        
        
    }
}