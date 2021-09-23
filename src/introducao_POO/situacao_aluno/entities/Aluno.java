package introducao_POO.situacao_aluno.entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return (nota1  + nota2  + nota3 );
	}
	
	public String situacao() {
		double notaFinal = notaFinal();
		if(notaFinal >= 60.0) {
			return "Aprovado";
		}
		else {
			return String.format("Reprovado \n%.2f pontos abaixo da média", 60.0 - notaFinal);
		}
	}
}
