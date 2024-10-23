package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
		
	}

	public double increaseSalary(double percentage) {
		percentage = grossSalary / 10.0;
		return netSalary() + percentage;
	}
	
	public String toString() {
		return "Employee: " + name + ", $ ";
	}
	
}
