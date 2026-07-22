package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Aluno[] vect = new Aluno[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("\nDados do %dº aluno:\n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            sc.nextLine(); 

            vect[i] = new Aluno(nome, nota1, nota2);
        }

        System.out.println("\n=== RELATORIO DA TURMA ===");
        for (int i = 0; i < n; i++) {
            System.out.println(vect[i]);
        }

        double somaMedias = 0.0;
        Aluno melhorAluno = vect[0];

        for (int i = 0; i < n; i++) {
            somaMedias += vect[i].calcularMedia();

            if (vect[i].calcularMedia() > melhorAluno.calcularMedia()) {
                melhorAluno = vect[i];
            }
        }

        double mediaGeral = somaMedias / n;

        System.out.println();
        System.out.printf("Média geral da turma: %.2f\n", mediaGeral);
        System.out.printf("Aluno com a maior média: %s (%.2f)\n",
                melhorAluno.getNome(), melhorAluno.calcularMedia());

        sc.close();
    }
}