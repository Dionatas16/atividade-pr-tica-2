package utilities;

import java.util.Scanner;

public class Console {

	private static Scanner sc = new Scanner(System.in);

	public static String lerString() {
		return sc.nextLine();
	}

	public static int lerInt() {
		int valor = sc.nextInt();
		sc.nextLine();
		return valor;
	}

}
