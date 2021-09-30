package listas.registro_empregado.entities;

public class Empregado {
	private int id;
	private String nome;
	private double salario;
	
	public Empregado(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	//O id será fixo
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public void aumentoSalario(double porcAumento) {
		salario += (salario * porcAumento / 100);
	}
	
	public String toString() {
		return String.format("%d: %s, R$ %.2f", id, nome, salario);
	}
	
}
