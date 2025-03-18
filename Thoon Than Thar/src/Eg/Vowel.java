package Eg;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter a character");
char ch=s.next().charAt(0);
if (ch=='a' || ch=='e'|| ch=='i' ||ch=='o'|| ch=='u') {
	System.out.println("vowel");
}
else {
	System.out.println("No vowel");
}

	}

}
