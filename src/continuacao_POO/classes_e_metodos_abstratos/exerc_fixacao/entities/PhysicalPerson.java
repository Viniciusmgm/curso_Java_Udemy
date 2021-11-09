package continuacao_POO.classes_e_metodos_abstratos.exerc_fixacao.entities;

public class PhysicalPerson extends Person {
	private Double healthExpenses;

	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	@Override
	public double tax() {
		if(this.getAnnualIncome() >= 25000) {
			return (this.getAnnualIncome() * 0.25) - (this.getHealthExpenses() * 0.5);
		}
		else {
			return this.getAnnualIncome() * 0.15;
		}
	}
	
}
