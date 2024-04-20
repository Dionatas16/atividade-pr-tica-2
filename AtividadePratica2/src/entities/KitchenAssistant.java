package entities;

public class KitchenAssistant extends Employee{

	private String speciality;

	public KitchenAssistant(String name, Integer id, String speciality) {
		super(name, id);
		this.speciality = speciality;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nSpeciality: " + speciality;
	}

	
	
	
	
	
}
