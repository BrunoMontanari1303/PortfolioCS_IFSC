import java.util.Scanner;

/* Do While: 08 -  Escreva um programa para determinar o tipo de bilhete que cada visitante de
                   um parque de diversão deve comprar. O tipo de bilhete é determinado em
                   função da idade do visitante, de acordo com a tabela abaixo. O programa
                   deverá solicitar a leitura de um novo bilhete. A execução do programa deverá
                   encerrar quando o usuário informa “não”. Mostre no final a quantidade de
                   bilhetes infantis e adultos vendidos. 

                   Inferior a 6 - Isento de pagamento
                   Entre 6 e 12 - Bilhete de criança
                   Entre 12 e 65 - Bilhete normal
                   Acima de 65 - Bilhete de 3 idade*/

public class Exercicio8 {
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int bilheteAdultoInfantil = 0;
        char continuar;
        do{
            System.out.println("Informe sua idade");
            int idade = input.nextInt();
            if(idade < 6){
                System.out.println("Esta isento de pagamento");
            }else{
                if(idade >= 6 && idade < 12){
                    System.out.println("Compre o bilhete infantil");
                    bilheteAdultoInfantil++;
                }else{
                    if(idade >= 12 && idade < 65){
                        System.out.println("Compre o bilhete normal");
                        bilheteAdultoInfantil++;
                    }else{
                        System.out.println("Compre o bilhete de terceira idade");                     
                    }
                }
            }
            System.out.println("Deseja continuar? (S/N)");
            continuar = input.next().charAt(0);
        }while(continuar == 'S' || continuar == 's');
        System.out.println("Foram comprados " + bilheteAdultoInfantil + " bilhetes adultos ou infantis");

    }
}