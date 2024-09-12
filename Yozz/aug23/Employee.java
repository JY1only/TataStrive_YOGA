package aug23;

public class Employee {
	private String name;
	private int id;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void showDetails() {
		System.out.println("Manager name :"+name);
		System.out.println("Manager id :"+id);
		System.out.println("Manager salary :"+salary);
		
		
	}
	public void showDetails1() {
		System.out.println("Developer name :"+name);
		System.out.println("Developer id :"+id);
		System.out.println("Developer salary :"+salary);
		
		
	}
}
