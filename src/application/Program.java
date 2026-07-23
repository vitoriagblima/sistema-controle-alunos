package application;

import java.util.ArrayList;
import java.util.List;
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

        List<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nDados do %dº aluno:\n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            sc.nextLine(); 

            alunos.add(new Aluno(nome, nota1, nota2));
        }

        System.out.println("\n=== RELATORIO DA TURMA ===");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        double somaMedias = 0.0;
        Aluno melhorAluno = alunos.get(0);

        for (Aluno aluno : alunos) {
            somaMedias += aluno.calcularMedia();

            if (aluno.calcularMedia() > melhorAluno.calcularMedia()) {
                melhorAluno = aluno;
            }
        }

        double mediaGeral = somaMedias / alunos.size();

        System.out.println();
        System.out.printf("Média geral da turma: %.2f\n", mediaGeral);
        System.out.printf("Aluno com a maior média: %s (%.2f)\n",
                melhorAluno.getNome(), melhorAluno.calcularMedia());

        sc.close();
    }
}