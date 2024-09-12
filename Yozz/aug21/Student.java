package aug21;
public class Student {
    private int id;
    private int nextid=0;
	private String name;
	private static String centre;
	private static String country;
	//No argument constructor
	{
		nextid++;
	}
	public Student() {
		
		
	}
	@Override
	public String toString() {
		return"Id=" + nextid + "\nName=" + name + "\nCentre="+centre+"\nCountry="+country;
	}
	//static block
	static {
		centre="TATA Strive";
		country="India";
	}
	//instance class
	public Student( String name) {
		
		this.id = nextid;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCentre() {
		return centre;
	}
	public static void setCentre(String centre) {
		Student.centre = centre;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Student.country = country;
	}
	
}



