import java.util.Random;
import java.util.Scanner;
public class Level1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		int Randomnumber=r.nextInt(21);
		System.out.println("Guess game 0 to 20 Started!!!!! ");
		System.out.println("Guess my number");
		int guessnumber=s.nextInt();
		while(Randomnumber!=guessnumber){
		System.out.println("No!! You got it wrong!!");
		System.out.println("Guess my number");
		guessnumber=s.nextInt();
		}
		System.out.println("Wow You got it right");
		System.out.println("Game Ended");
		// TODO Auto-generated method stub

	}

}
