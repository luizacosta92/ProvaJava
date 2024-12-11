import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas vão comer a pizza? ");
        int numeroDePessoas = scanner.nextInt();

        System.out.println("Quantos pedaços tem a pizza? ");
        int numeroDePedacos = scanner.nextInt();

        int calculadoraDePizza = numeroDePedacos / numeroDePessoas;
        double calculadoraDeSobra = numeroDePedacos % numeroDePessoas;

        System.out.println("Cada pessoa poderá comer " + calculadoraDePizza + " pedaços de pizza.");
        System.out.println("Vai sobrar " + calculadoraDeSobra + " pedaços de pizza." );



    }
}
