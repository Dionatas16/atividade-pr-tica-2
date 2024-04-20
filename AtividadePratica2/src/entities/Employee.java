package entities;

public class Employee {

	private String name;
	private Integer id;
	
	public Employee() {
		
	}

	public Employee(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + name + "\nId: " + id;
	}
	
	
	
	
	
	
	
}
