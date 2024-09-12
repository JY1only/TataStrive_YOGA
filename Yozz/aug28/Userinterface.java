package aug28;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class Userinterface {

	public static void main(String[] args) {
		ICICI icici=new ICICI();
		SBI sbi=new SBI();
		Gpay gpay=icici;
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("User Interface\n-----------------------------");
			System.out.println("1.Make Payment");
			System.out.println("2.Check Balance");
			System.out.println("3.See History");
			System.out.println("4.Switch Account");
			System.out.println("5.Exit");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the amount");
			double amount=sc.nextDouble();
			gpay.makePayment(amount);
			break;
		case 2:
			System.out.println("Enter the pin");
			int pin=sc.nextInt();
			gpay.checkBalance(pin);
			break;
		case 3:
			System.out.println("Transaction Details\n------------------------");
			gpay.showHistory();
			break;
		case 4:
			System.out.println("Select the account  \n1.ICICI \n2.SBI");
			int ch2=sc.nextInt();
			if(ch2==1){
				gpay=icici;
				System.out.println("Gpay is switched to ICICI bank");
			}
			else if(ch2==2){
				gpay=sbi;
				System.out.println("Gpay is switched to SBI bank");
			}
			break;
		case 5:
			System.out.println("Thankyou for using Gpay!!!!!!");
			break;
		default :
			System.out.println("Invalid option");
		
		}
		}while(ch!=5); 
	

}
}
