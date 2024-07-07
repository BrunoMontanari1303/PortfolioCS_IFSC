import java.util.Scanner;

/* For: 04 - O cardápio de uma lancheria é o seguinte:
        Especificação       Código        Preço
       
        Cachorro quente     100           4,00
        X Salada            101           6,00
        Bauru com ovo       102           6,50
        Refrigerante        103           2,00

        Escrever um algoritmo que mostre o cardápio para o usuário e permita que o
        usuário informe o código do item pedido, a quantidade e calcule o valor a ser
        pago por aquele lanche. Mostre na tela o item pedido e o valor a ser pago. */

public class Exercicio4 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos lanches ira pedir?(refri conta como lanche)");
		int quantidade = input.nextInt();
		double preco = 0;
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Digite o codigo do lanche: 100 - Cachorro-quente; 101 - X-Salada; 102 - Bauru c/ ovo; 103 - Refrigerante");
			int codigo = input.nextInt();
			if(codigo == 100) {
				preco = preco + 4;
			}else {
				if(codigo == 101) {
					preco = preco + 6;
				}else {
					if(codigo == 102) {
						preco = preco + 6.5;
					}else {
						if(codigo == 103) {
							preco = preco + 2;
						}else {
							System.out.println("Digite um codigo valido!");
							break;
						}
					}
				}
			}
		}
		System.out.println("O valor a ser pago pelo pedido sera de R$" + preco);
		
	}
}