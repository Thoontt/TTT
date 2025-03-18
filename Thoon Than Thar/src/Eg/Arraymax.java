           
package Eg;
import java.util.Scanner;
public class Arraymax {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	Scanner s=new Scanner(System.in);
    	System.out.print("Enter a value");
    	int value=s.nextInt();
        int[] numbers = {8, 4, 11, 44, 9};
boolean flag=false;
        for (int i=0;i<numbers.length;i++) {
        	if (value==numbers[i]){
//        		System.out.print("found");
        		flag=true;
        	}
        	
        	}
        if(flag=true) {
        	System.out.print("found");
        }else {
    		System.out.print(" notfound");}
        }
        }
    





