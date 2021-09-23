package introducao_POO.membros_comuns.empregado.entities;

public class Empregado {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		grossSalary += grossSalary * (percentage / 100);
	}
}
