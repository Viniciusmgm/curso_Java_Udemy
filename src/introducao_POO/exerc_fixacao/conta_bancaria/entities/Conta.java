package introducao_POO.exerc_fixacao.conta_bancaria.entities;

public class Conta {
	private int numConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta(int numConta, String nomeTitular, double depositoInicial) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}
	
	public Conta(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}	
	
	public void deposito(double deposito) {
		saldo += deposito;
	}
	
	public void saque(double saque) {
		saldo -= (saque + 5);
	}
	
}
