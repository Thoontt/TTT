import java.util.Random;
import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		Random r=new Random();
		int random=r.nextInt(7);
		System.out.println("Guess a number");
		int Guessnumber=s.nextInt();
		if (random==Guessnumber){
		System.out.println("you win");}
		else { System.out.print("you lose");}
		// TODO Auto-generated method stub

	}

}
