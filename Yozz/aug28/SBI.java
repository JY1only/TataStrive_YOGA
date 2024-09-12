package aug28;

public class SBI extends Gpay {
	private double balance=20000;
	private int pin=6666;
	@Override
	public void makePayment(double amount) {
		
		if(amount<balance) {
			balance-=amount;
			String transDetails="Payment of rs."+amount+" Made through SBI bank";
			}
			
		}
	@Override
	public void checkBalance(int balance) {
		if(this.pin==pin) {
		System.out.println("Your balanace is:"+balance);
	    }
		else {
		System.out.println("Invalid pin");
		}
		
	}
	
	}
