package continuacao_POO.classes_e_metodos_abstratos.exerc_fixacao.entities;

public class LegalPerson extends Person{
	private Integer numEmployee;

	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, Integer numEmployee) {
		super(name, annualIncome);
		this.numEmployee = numEmployee;
	}

	public Integer getNumEmployee() {
		return numEmployee;
	}

	public void setNumEmployee(Integer numEmployee) {
		this.numEmployee = numEmployee;
	}
	
	public double tax() {
		if(this.getNumEmployee() >= 10) {
			return this.getAnnualIncome() * 0.14;
		}
		else {
			return this.getAnnualIncome() * 0.16;
		}
	}
}
