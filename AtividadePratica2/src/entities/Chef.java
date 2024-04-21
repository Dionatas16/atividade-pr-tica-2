package entities;

public class Chef extends Employee{

	private Integer experienceYears;

	public Chef(String name, Integer id, Integer experienceYears) {
		super(name, id);
		this.experienceYears = experienceYears;
	}

	public Integer getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceDays(Integer experienceYears) {
		this.experienceYears = experienceYears;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nAnos de experiência: " + experienceYears;
	}
	
	
	
	
}
