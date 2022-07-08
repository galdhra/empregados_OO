package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private Integer payDay;

	private Employee employee;
	private Address address;

	List<Employee> employees = new ArrayList<>();

	public Department() {

	}

	public Department(String name, Integer payDay, Address address) {
		super();
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(getEmployee());

	}

	public Double payroll() {
		double sum = 0.0;
		for (Employee emp : employees) {
			sum += emp.getSalary();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Departamento Vendas = R$ ");
		sb.append(String.format("%.2f%n", payroll()));
		sb.append("Pagamento realizado no dia ");
		sb.append(payDay + "\n");
		sb.append("Funcionários:" + "\n");
		for (Employee emp : employees) {
			sb.append(emp + "\n");
		}
		sb.append(address);
		return sb.toString();
	}
}
