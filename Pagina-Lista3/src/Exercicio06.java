import java.util.Scanner;

/* 06 - Crie um programa para auxiliar engenheiros a calcular a quantidade de piso a ser
        utilizado em uma sala retangular, a quantidade de tinta a ser gasta nas paredes, bem
        como a potência do ar-condicionado. Para isto, o programa deve ler o comprimento, a
        largura e a altura da sala, calcular e imprimir a área de piso da sala, a área total das
        paredes e o volume da sala. O programa deve mostrar também o tamanho do aparelho de
        ar-condicionado a ser instalado. Um pequeno deve ser instalado se o volume da sala for
        inferior a 100 m3;
        um aparelho médio deve ser instalado se o volume da sala estiver entre 100 e 500 m3;
        e um aparelho grande deve ser instalado caso o volume seja superior a 500 m3.*/

public class Exercicio6 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o comprimento da sala: ");
        double comprimento = input.nextDouble();
        System.out.println("Digite a largura da sala: ");
        double largura = input.nextDouble();
        System.out.println("Digite a altura da sala: ");
        double altura = input.nextDouble();
        double areaPiso = comprimento*largura;
        double areaParedes = comprimento * altura * 2 + largura * altura * 2; 
        double volume = comprimento*altura*largura;
        System.out.println("A area do piso eh: " + areaPiso + ", o volume da sala eh: " + volume + " e a area total das paredes eh " + areaParedes);
        if(volume < 100){
            System.out.println("O ar que deve ser instalado eh o pequeno");
        }else{
            if(volume > 100 && volume < 500){
                System.out.println("O ar que deve ser instalado eh o medio");
            }else{
                System.out.println("O ar que deve ser instalado eh o grande");
            }
        }
    }
}