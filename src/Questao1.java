import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        double consumoPorLitro = 12;
        double distancia = 360;
        double combustivelConsumido = 360 / 12;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o preço do combustível: ");
        double precoCombustivel = scanner.nextDouble();

        double precoFinal = precoCombustivel * combustivelConsumido;
        precoFinal = (double) Math.round(precoFinal * 100.0) / 100;

        System.out.println("Você vai consumir " + combustivelConsumido + " litros de combustível");
        System.out.println("Totalizando um gasto de R$" + precoFinal + " em combustível");

    }
}
