import java.util.Scanner;

public class HelloEcho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your name?");
		Scanner s=new Scanner (System.in);
		String name=s.next() ;
		System.out.println("How many time you'd like to say hello?" );
		int value=s.nextInt();
		for(int i=1;i<=value; i++) {System.out.println("Hello "+name);}
		System.out.println("Well "+name+",have a good day !!!");
			}
		}
		



