import java.util.Scanner;

/* 15 - Faça um programa que leia o preço de três mercadorias no dia 01/01/2022 e o no dia
        01/02/2022. Em seguida o programa deve calcular a inflação do período, considerando a
        variação de preço dos três produtos. Mostre uma mensagem se a inflação está acima da
        meta ou não (considere que a meta para o mês é de 0,55%).*/

public class Exercicio15 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os precos dos tres produtos no primeiro mes respectivamente ");
        double produto1Janeiro = input.nextDouble();
        double produto2Janeiro = input.nextDouble();
        double produto3Janeiro = input.nextDouble();
        System.out.println("Agora digite os precos dos tres produtos no segundo mes respectivamente ");
        double produto1Fevereiro = input.nextDouble();
        double produto2Fevereiro = input.nextDouble();
        double produto3Fevereiro = input.nextDouble();
        double inflacaoProd1 = (produto1Fevereiro - produto1Janeiro)/ 100;
        double inflacaoProd2 = (produto2Fevereiro - produto2Janeiro)/ 100;
        double inflacaoProd3 = (produto3Fevereiro - produto3Janeiro)/ 100;
        System.out.println("A inflacao no produto 1 foi de " + inflacaoProd1 + " no produto 2 foi de " + inflacaoProd2 + " e no produto 3 foi de " + inflacaoProd3);
        if(inflacaoProd1 > 0.55 || inflacaoProd2 > 0.55 || inflacaoProd3 > 0.55) {
        	System.out.println("A meta foi alcancada em pelo menos um produto");
        }else {
        	System.out.println("Nenhum produto alcancou a meta");
        }  	
    }
}