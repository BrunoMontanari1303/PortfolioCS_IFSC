import java.util.Scanner;

/* 09 - (DESAFIO) Observe a seguinte regra aeronáutica (fictícia). Para que um avião possa
        decolar de um aeroporto, várias condições devem ser satisfeitas: caso a pista seja menor
        que 1,5 Km, o avião deve pesar menos que 40 toneladas, caso a pista possua entre 1,5 e
        2 Km, o avião não deve ultrapassar as 60 toneladas. Caso a pista seja superior a 2 Km,
        qualquer avião pode decolar. Caso a visibilidade seja inferior a 20 metros, apenas aviões
        com sistema de decolagem computadorizada podem decolar. Se estiver chovendo acima
        de 5 mm, nenhum avião pode decolar. Se o avião possuir mais de 100 passageiros e
        estiver chovendo (independente da intensidade), o avião não pode decolar. Escreva um
        programa que leia o tamanho da pista, o peso do avião, visibilidade, intensidade da chuva
        (o usuário deve digitar 0 caso não esteja chovendo), número de passageiros e se possui
        sistema de decolagem automatizada, e indique se o avião pode decolar ou não.*/

public class Exercicio9 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite em km o tamanho da pista que sera usada: ");
		float tamPista = input.nextFloat();
		System.out.println("Digite em toneladas o peso do aviao: ");
		float peso = input.nextFloat();
		System.out.println("Digite a distancia da visibilidade na pista: ");
		float visibilidade = input.nextFloat();
		System.out.println("Digite o volume de chuva em mm: ");
		int chuva = input.nextInt();
		System.out.println("Digite quantos passageiros estão embarcados: ");
		int passageiros = input.nextInt();
		System.out.println("Digite 0 caso o aviao nao tenha sistema de decolagem e 1 caso possua: ");
		int sistDecolagem = input.nextInt();
		if(chuva > 5 || (chuva > 0 && passageiros > 100) || (visibilidade < 20 && sistDecolagem == 0)){
			System.out.println("O aviao nao pode decolar");
		}else {
			if(tamPista < 1.5 && peso < 40){
				System.out.println("O aviao pode decolar");	
			}else {
				if(tamPista > 1.5 && tamPista < 2 && peso < 60) {
					System.out.println("O aviao pode decolar");	
				}else {
					System.out.println("O aviao pode decolar");	
				}
			}
		}					
	}
	
}
