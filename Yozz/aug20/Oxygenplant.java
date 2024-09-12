package aug20;


import java.util.*;
public class Oxygenplant {
 
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the length of the room :");
	 double length=sc.nextDouble();
	 if(length<=0) {
		 System.out.println("Invalid length");
	 }
	 System.out.println("Enter the breadth of the room :");
	 double breadth=sc.nextDouble();
	 if(breadth<=0) {
		 System.out.println("Invalid breadth");
	 }
	 System.out.println("Enter the plant area of a singe plant :");
	 double plantarea=sc.nextDouble();
	 if(plantarea<=0) {
		 System.out.println("Invalid plantarea");
		 
		  }
	 double totalplants=(length*breadth/plantarea)*100*100;
	 totalplants-=totalplants%10;
	 System.out.printf("Total number of plants is %.0f\n",totalplants);
	 double totaloxygen=totalplants*0.9;
	 System.out.printf("Total oxygen production is %.2f litres",totaloxygen);
	 
     }

}
