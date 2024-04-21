package entities;

public class Waiter extends Employee {

	private Integer workedDays;

	public Waiter(String name, Integer id, Integer workedDays) {
		super(name, id);
		this.workedDays = workedDays;

	}

	public Integer getWorkedDays() {
		return workedDays;
	}

	public void setWorkedDays(Integer workedDays) {
		this.workedDays = workedDays;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nDias trabalhados: " + workedDays;
	}
	
	
}
