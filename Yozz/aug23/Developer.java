package aug23;

public class Developer extends Employee {
	private String programmingLanguage;

	public Developer(String name,int id,double salary,String programmingLanguage) {
		super(name,id,salary); 
		this.programmingLanguage = programmingLanguage;
	}

	public void showDetails1() {
		super.showDetails1();
		System.out.println("Developing language : "+programmingLanguage);
		

	
	}
	
}
