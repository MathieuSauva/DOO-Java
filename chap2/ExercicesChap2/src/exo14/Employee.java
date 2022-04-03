package exo14;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String fN, String lN, int s) {
		this.id = id;
		this.firstName = fN;
		this.lastName = lN;
		this.salary = s;
		
	}
	
	public int getID() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return salary*12;
	}
	
	public int raiseSalary(int percent) {
		setSalary(this.salary + (salary*percent)/100);
		return salary;
	}
	
	public String toString() {
		return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
	}
	
}