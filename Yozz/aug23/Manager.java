package aug23;

public class Manager extends Employee{
	private String department;

	public Manager(String name,int id,double salary,String department) {
		super(name,id,salary);
		this.department = department;
	}

	public void showDetails() {
		super.showDetails();
		System.out.println("Manager department : "+department);
		

	}

	
}


	

