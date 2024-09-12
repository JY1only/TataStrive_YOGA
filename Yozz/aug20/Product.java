package aug20;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void printProductDetails()
	{
		System.out.println("Product Name:"+name);
		System.out.println("Product Price:"+price);
		System.out.println("Product Quantity:"+quantity);
		
	}
	public static void main(String[] args) {
		Product p1=new Product();
		p1.setName("Mobile");
		p1.setPrice(10000);
		p1.setQuantity(10);
		p1.printProductDetails();
	}
  }

