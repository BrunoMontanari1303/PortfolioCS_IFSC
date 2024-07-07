import java.util.Scanner;

/* Do While: 09 - Construir um algoritmo que calcule o imposto de renda de um contribuinte,
                considerando que seus dados (CPF, renda mensal e classe de renda) são
                valores informados pelo usuário. Mostre na tela a alíquota de desconto
                aplicada e o valor a ser descontado. O algoritmo encerra quando for informado
                o CPF 00
                CLASSE  ALÍQUOTA
                A       isento
                B       5%
                C       10% 
                D       15% 
                E       20%*/

public class Exercicio9 {
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String cpf;
        do {
        	System.out.println("Informe seu CPF(0 para cancelar)");
        	cpf = input.nextLine();
        	if (cpf.equals("0")) {
                break;
            }
        	System.out.println("Informe sua renda mensal: ");
        	double renda = input.nextDouble();
        	System.out.println("Informe sua classe de renda(A, B, C, D ou E): ");
        	char classe = input.next().charAt(0);
        	switch(classe) {
        		case 'A': System.out.println("Este CPF esta isento de aliquota de desconto");
        				  break;
        		case 'B': renda = renda * 0.05;
        				  System.out.println("Este CPF tera a aliquota de desconto de 5%, e o valor a ser pago sera " + renda);
        				  break;
        		case 'C': renda = renda * 0.1;
						  System.out.println("Este CPF tera a aliquota de desconto de 10%, e o valor a ser pago sera " + renda);
						  break;
        		case 'D': renda = renda * 0.15;
						  System.out.println("Este CPF tera a aliquota de desconto de 15%, e o valor a ser pago sera " + renda);
						  break;
        		case 'E': renda = renda * 0.20;
						  System.out.println("Este CPF tera a aliquota de desconto de 20%, e o valor a ser pago sera " + renda);
						  break;
				default:  System.out.println("Digite uma classe valida!");
						  break;
        				  
        	}
        	input.nextLine();
        }while(!cpf.equals("0"));
        
        
	}
	
}