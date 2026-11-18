package entities;

public class Employee {
	public String name;
	public double GrossSalary;
	public double Tax;
	
	public double netSalary(){
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		GrossSalary += GrossSalary * (percentage/100);
	}
}
