package aug28;

import java.util.ArrayList;

public abstract class Gpay {
	
	private ArrayList<String> transaction = new ArrayList<String>();
	
	public abstract  void makePayment(double amount);
	public abstract void checkBalance(int balance);
	
	public void commanFeature() {
		System.out.println("Payment through Gpay...");
	}
	public void recordTransaction(String transactionDetails) {
		transaction.add(transactionDetails);
	}
	public void showHistory() {
		transaction.forEach(s->System.out.println(s));
	}
}
