package sep12;

import java.util.Scanner;

public class UserInterface
 {
	String sentence;
	int number1;
	int number2;

	public String extractString(String sentence, int number1, int number2) {
		String result = "";
		try {
			result = sentence.substring(number1, number2);
			System.out.print("The output string is_ " + result);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.print("Invalid Index Position!!");
		} finally {

		}
		return "_Thankyou for using the application";
	}

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println("Enter the FirstIndex");
		int number1 = sc.nextInt();
		System.out.println("Enter the SecondIndex");
		int number2 = sc.nextInt();
		UserInterface ui = new UserInterface();
		System.out.println(ui.extractString(sentence, number1, number2));

	}

}
