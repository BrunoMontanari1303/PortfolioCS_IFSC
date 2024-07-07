import java.util.Scanner;

/* 07 - Sabendo que a velocidade do som é de 340 m/s, crie um programa para calcular a
        distância de onde o raio caiu até a pessoa. Para isto, a pessoa deve informar o tempo que
        transcorreu entre ela ter visto o raio e ter ouvido o som do trovão. O tempo deve ser
        informado em segundos e deve ser um valor real, pois a pessoa poderá usar um
        cronômetro de precisão. Além disto, o programa deve apresentar se o raio representou
        algum perigo a pessoa. Um raio representa perigo se ele cair a menos de 200m da
        pessoa.*/

public class Exercicio7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos segundos levou para o som chegar ate voce");
        double tempo = input.nextDouble();
        double distancia = tempo*340;
        System.out.println("A distancia do raio eh de " + distancia + " metros");
        if(distancia <= 200){
            System.out.println("O raio foi considerado como perigoso por cair perto demais");
        }
    }
}
        