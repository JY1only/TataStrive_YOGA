package aug23;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Manager Details");
		Manager m=new Manager("Raj",2345,29000.00,"IT manager");
		m.showDetails();
		System.out.println("--------------------------------");
		System.out.println("Developer Details");
		Developer d=new Developer("Akshay",1245,18000.00,"Java");
		d.showDetails1();
	}

}
