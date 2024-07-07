import java.util.Scanner;

/* For: 06 - Um cinema possui capacidade de 20 lugares e está sempre com ocupação
            total. Certo dia, cada espectador respondeu a um questionário, no qual
            constava:
            - sua idade;
            -sua opinião em relação ao filme, segundo as seguintes notas:
            Nota Significado
            A Ótimo
            B Bom
            C Regular
            D Ruim
            Elabore um algoritmo que, lendo estes dados, calcule e imprima:
            -a quantidade de respostas ótimo;
            -a média de idade das pessoas que responderam ruim;
            -a diferença de idade entre a pessoa de maior idade com a pessoa de menor
            de idade que responderam o questionário. */

public class Exercicio6 {
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int i, maiorIdade = 0, menorIdade = 120, quantidadeOtimos = 0, quantidadeRuins = 0, somaIdades = 0;
        for(i = 0; i < 20; i++){
            System.out.println("Digite sua idade: ");
            int idade = input.nextInt();
            System.out.println("Pressione A se o filme foi otimo, B se foi bom, C se foi regular e D se foi ruim: ");
            char classificacao = input.next().charAt(0);
            if(classificacao == 'd' || classificacao == 'D'){
                somaIdades = somaIdades + idade;
                quantidadeRuins++;
            }else{
                if(classificacao == 'a' || classificacao == 'A'){
                    quantidadeOtimos++;
                }else{          
                    if(classificacao != 'b' & classificacao != 'B' && classificacao != 'c' && classificacao != 'C'){
                        System.out.println("Digite uma classificacao valida!");
                        break;
                    }
                }
            }
            if(idade > maiorIdade){
                maiorIdade = idade;
            }
            if(idade < menorIdade){
                menorIdade = idade;
            }       
        }
        double mediaIdades = somaIdades/quantidadeRuins;
        int diferencaIdades = maiorIdade - menorIdade;
        System.out.println("O filme teve " + quantidadeOtimos + " notas otimas");
        System.out.println("A media de idade de quem votou ruim foi: " + mediaIdades);
        System.out.println("A diferença da maior idade pra menor eh: " + diferencaIdades);

    }
}