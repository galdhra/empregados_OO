package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		String name = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		Address address = new Address(email, phone);

		Department dept = new Department(name, payDay, address);

		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados do funcionário %d: %n", i + 1);
			System.out.print("Nome: ");
			String nameEmp = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();

			Employee newEmp = new Employee(nameEmp, salary);
			dept.addEmployee(newEmp);
		}

		System.out.println();
		showReport(dept);

		sc.close();
	}

	private static void showReport(Department dept) {
		System.out.println("FOLHA DE PAGAMENTO: ");
		System.out.print(dept);
	}

}
