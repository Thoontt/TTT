package Eg;
import java.util.Scanner;
public class switchID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter ID");
		int ID=s.nextInt();
		System.out.println("Enter price");
		int price=s.nextInt();
		double discount=0;
		if (ID==01) {
			System.out.println("Alumni (10% Discount of course fee)");
			discount=price*0.1;
			System.out.println("Discount 10%"+discount);
		}
		else if(ID==02) {
			System.out.println("Staff (20% Discount of course fee)");
			discount=price*0.2;
			System.out.println("Discount 20%"+discount);
			
		}
		else {
			System.out.println("Fresher (Normal price)");
			
			System.out.println(" No Discount "+price);
			
		}
		
	}

}
