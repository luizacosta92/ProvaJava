
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Coletando dados
        System.out.println("Informe a quantidade de alunos: ");
        double quantidadeDeAlunos = scanner.nextDouble();

        String[] nomeDoAluno = new String[(int) quantidadeDeAlunos];
        double[] notaDoAluno = new double[(int) quantidadeDeAlunos];


        for (int i = 0; i < quantidadeDeAlunos; i++) {
            System.out.println("Informe o nome do aluno: ");
            nomeDoAluno[i] = scanner.nextLine();

            System.out.println("Informe a nota do aluno: ");
            notaDoAluno[i] = scanner.nextDouble();

        }

        //Somando todas as notas
        double soma = 0;

        for (double nota : notaDoAluno) {
            soma += nota;
        }
        //Fazendo a média das notas
        double media = soma / quantidadeDeAlunos;
        media = (double) Math.round(media * 100.0) / 100.0;


        for (int i = 0; i < quantidadeDeAlunos; i++) {
            if (notaDoAluno[i] > media) {
                System.out.println("Média total: " + media + ". " + (i+1) + " aluno(s) foi(ram) aprovado(s).");

            }
        }
    }
}

