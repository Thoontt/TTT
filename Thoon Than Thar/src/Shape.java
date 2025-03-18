import java.util.Scanner;
public class Shape {

	//private static Scanner a;
	private static Scanner s;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("enter 1 for circle,2 for triangle ,3 for square");
		int operator=s.nextInt();
		
		switch (operator) {
		case 1:Circlearea1();
		case 2:Trianglearea();
		case 3:Squarearea();
		}

	}
	private static void Circlearea1() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.print("radius ");
		int radius=s.nextInt();
		System.out.print("Circle Area" +3.14*radius*radius);
		
		}
	private static void Trianglearea() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.print("enter base ");
		int base=s.nextInt();
		System.out.print("enter height");
		int height=s.nextInt();
		System.out.print("Triangle Area" +0.5*base*height);
		}

	private static void Squarearea() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.print("enter length ");
		int length=s.nextInt();
		System.out.print("enter width");
		int width=s.nextInt();
		System.out.print("area"+length*width);
		
		
		
	}

	
		
	}

	
		


