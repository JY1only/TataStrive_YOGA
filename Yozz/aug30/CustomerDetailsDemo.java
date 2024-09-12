package aug30;

import java.util.Scanner;

public class CustomerDetailsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner d1=new Scanner(System.in);
		System.out.println("Enter the customer name : ");
		String customerName=d1.nextLine();
		System.out.println("Enter the phone number : ");
		String phoneNumber=d1.nextLine();
		System.out.println("Enter the street name : ");
		String streetName=d1.nextLine();
		System.out.println("Enter the bill amount : ");
		double billAmount=d1.nextDouble();
		System.out.println("Enter the distance : ");
		int distance=d1.nextInt();
		/*cusdet.calculateBonusPoint();
		cusdet.deliveryCharge();*/
		CustomerDetails cusdet=new CustomerDetails(customerName,phoneNumber,streetName,billAmount,distance);
		System.out.println("Customer name :"+cusdet.getCustomerName());
		System.out.println("Phone number :"+cusdet.getPhoneNumber());
		System.out.println("Street name :"+cusdet.getStreetName());
		System.out.println("Bonus point:"+cusdet.calculateBonusPoint());
		System.out.println("Delivery charge :"+cusdet.deliveryCharge());
	}
	
	


	}
	


