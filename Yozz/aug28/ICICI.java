package aug28;

public class ICICI extends Gpay {
	private double balance=15000;
	private int pin=2005;
	@Override
	public void makePayment(double amount) {
		if(amount<balance) {
			balance-=amount;
			String transDetails="Payment of rs."+amount+" Made using ICICI bank";
			recordTransaction(transDetails);
			
		}
		
		
	}

	@Override
	public void checkBalance(int pin) {
		// TODO Auto-generated method stub
		if(this.pin==pin) {
			System.out.println("Your balanace is:"+balance);
		}
		else {
			System.out.println("Invalid pin");
		}
	}

}
