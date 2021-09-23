package introducao_POO.situacao_aluno.application;

import java.util.Locale;
import java.util.Scanner;
import introducao_POO.situacao_aluno.entities.Aluno;

public class SituacaoAluno {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.println("Nota1: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Nota2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Nota3: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Nota Final: %.2f%n", aluno.notaFinal());
		System.out.printf("Situação: %s", aluno.situacao());
		
		sc.close();
	}
}
