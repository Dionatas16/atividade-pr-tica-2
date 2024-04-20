package application;

import entities.Employee;
import entities.KitchenAssistant;
import utilities.Console;

public class OperatingSystem {

	private static void Menu() {

		System.out.println("\n----- Cadastro de funcionários -----");
		System.out.println("1- Cadastrar Chef de Cozinha");
		System.out.println("2- Cadastrar Garçom");
		System.out.println("3- Cadastrar Auxiliar de Cozinha");
		System.out.println("4- Listar todos os Chefs de Cozinha");
		System.out.println("5- Listar todos os Garçons");
		System.out.println("6- Listar todos os Auxiliares de Cozinha");
		System.out.println("7- Editar funcionário");
		System.out.println("8- Remover funcionário");
		System.out.println("9- Listar todos os funcionários");
		System.out.println("0- Sair");
		System.out.print("Selecione uma opção:");

	}

	private static void Options(int opt) {

		String name;
		Integer id;

		switch (opt) {

		case 1:

			System.out.println("\nCadastro de Chef de Cozinha:");
			System.out.print("Nome: ");
			name = Console.lerString();
			System.out.print("\nId: ");
			id = Console.lerInt();
			System.out.print("\n Anos de experiência: ");
			Integer experienceYears = Console.lerInt();

			Chef chef = new Chef();

			EmployeeRegistration.register(chef);

			System.out.println("Chef adicionado com sucesso!");

			break;

		case 2:

			System.out.println("\nCadastro de Garçom:");
			System.out.print("Nome: ");
			name = Console.lerString();
			System.out.print("\nId: ");
			id = Console.lerInt();
			System.out.print("\nDias Trabalhados ");
			Integer workedDays = Console.lerInt();

			Waiter waiter = new Waiter();

			EmployeeRegistration.register(waiter);

			System.out.println("Garçom adicionado com sucesso!");
			break;
		case 3:

			System.out.println("\nCadastro de Auxiliar de Cozinha:");
			System.out.print("Nome: ");
			name = Console.lerString();
			System.out.print("\nId: ");
			id = Console.lerInt();
			System.out.print("\nEspecialidade: ");
			String speciality = Console.lerString();

			KitchenAssistant kitchenAssistant = new KitchenAssistant(name, id, speciality);

			EmployeeRegistration.register(chef);

			System.out.println("Auxiliar de Cozinha adicionado com sucesso!");
			break;

		case 4:

			System.out.println("\nChefs de Cozinha cadastrados: ");

			for (Employee tempEmp : EmployeeRegistration.getChef()) {
				System.out.println(tempEmp);
			}

			break;

		case 5:

			System.out.println("\nGarçons cadastrados: ");

			for (Employee tempEmp : EmployeeRegistration.getWaiter()) {
				System.out.println(tempEmp);
			}

			break;

		case 6:

			System.out.println("\nAuxiliares de Cozinha cadastrados: ");

			for (Employee tempEmp : EmployeeRegistration.getKitchenAssistant()) {
				System.out.println(tempEmp);
			}

			break;

		case 7:
			String newName;
			System.out.println("Editar funcionário: \n");
			System.out.print("Insira o id do funcionário que deseja editar: ");
			id = Console.lerInt();
			System.out.println("Insira o novo nome do funcionário: ");
			newName = Console.lerString();
			EmployeeRegistration.edit(id, newName);

			break;

		case 8:

			System.out.println("\nRemover funcionário: ");
			System.out.print("Informe o id do funcionário: ");
			id = Console.lerInt();

			if (EmployeeRegistration.remove(id)) {
				System.out.println("\nO funcionário foi rmeovido com sucesso!");
			} else {
				System.out.println("\nFuncionário não encontrado no cadastro");
			}

		case 9:

			System.out.println("========== Lista de Funcionários ===========");
			EmployeeRegistration.listAll();

		case 0:

			System.out.println("\nEncerrando o sistema...");
			break;

		default:
			System.out.println("\nTente novamente, opção inválida!");
			break;
		}

		System.out.println();

	}

	public static void execute() {

		int opt;
		
		do {

			Menu();
			opt = Console.lerInt();
			Options(opt);

		} while (opt != 0);
	}

}
