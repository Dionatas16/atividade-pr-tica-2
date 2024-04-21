package application;

import java.util.ArrayList;
import java.util.List;

import entities.Chef;
import entities.Employee;
import entities.KitchenAssistant;
import entities.Waiter;

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

	public static List<Employee> getWaiter() {
		List<Employee> tempEmployeeList = new ArrayList<>();

		for (Employee tempEmp : employeeList) {
			if (tempEmp instanceof Waiter) {
				tempEmployeeList.add(tempEmp);
			}
		}

		return tempEmployeeList;
	}

	public static List<Employee> getChef() {
		List<Employee> tempEmployeeList = new ArrayList<>();

		for (Employee tempEmp : employeeList) {
			if (tempEmp instanceof Chef) {
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

	public static void editEmp(Integer id, String newName) {
		for (Employee tempEmp : employeeList) {
			if (tempEmp.getId().equals(id)) {
				tempEmp.setName(newName);
			}
		}
	}
	
	public static boolean verify(Integer id) {
		for (Employee tempEmp : employeeList) {
			if (tempEmp.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	public static void search(Integer id) {
		for (Employee tempEmp : employeeList) {
			if (tempEmp.getId().equals(id)) {
				System.out.println(tempEmp);
			}
		}
	}

	public static void listAll() {
		for(Employee tempEmp : employeeList) {
			System.out.println(tempEmp);
		}
	}
	
	public static void removeAll() {
		employeeList.clear();
	}
	
	
	
}
