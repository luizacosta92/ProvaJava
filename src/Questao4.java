import java.util.Scanner;

public class Questao4 {
public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe um número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {

                System.out.println("O número " + numero + " não é primo");;
            } else {

                System.out.println("O número " + numero + " é primo");;
            }
        }
    }

