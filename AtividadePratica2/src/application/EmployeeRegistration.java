package application;

import java.util.ArrayList;
import java.util.List;

import entities.Employee;
import entities.KitchenAssistant;

public class EmployeeRegistration {

	private static List<Employee> employeeList = new ArrayList<>();

	public static List<Employee> getEmployeeList() {
		return employeeList;
	}

	public static void register(Employee emp) {
		employeeList.add(emp);
	}

	public static List<Employee> getKitchenAssistant() {
		List<Employee> tempEmployeeList = new ArrayList<>();

		for (Employee tempEmp : employeeList) {
			if (tempEmp instanceof KitchenAssistant) {
				tempEmployeeList.add(tempEmp);
			}
		}

		return tempEmployeeList;
	}

	public static boolean remove(Integer id) {

		for (Employee tempEmp : employeeList) {
			if (tempEmp.getId() == id) {
				employeeList.remove(tempEmp);
				return true;
			}
		}

		return false;

	}

	public static void edit(Integer id, String newName) {
		for (Employee tempEmp : employeeList) {
			if (tempEmp.getId() == id) {
				tempEmp.setName(newName);
			} else {
				System.out.println("Este id não corresponde a nenhum funcionário!");
			}
		}
	}

	public static void listAll() {
		for(Employee tempEmp : employeeList) {
			System.out.println(tempEmp);
		}
	}
	
	
	
}
