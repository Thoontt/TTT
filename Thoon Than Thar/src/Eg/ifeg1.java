package Eg;
import java.util.*;

public class ifeg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
//		 
//			System.out.println("Enter age");
//		
//		
//		int age=s.nextInt();
//
//		if(age<10) {
//			System.out.println("child");
//		}
//		else if(age<18) {
//			System.out.println("teenager");
//		}
//		else  {
//			System.out.println("adult");
//		}
	    MethodA();
        ifeg1 eg=new ifeg1();
        eg.MethodB();
        
        
        
        
	}
public static void MethodA() {
	System.out.println("I am method A");
	
}
public void MethodB() {
	System.out.println("I am method B");
}
static {
	System.out.println("I am static block");
}
}
