
import java.util.Scanner;
public class ArrayMinMax {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{Scanner a = new Scanner (System.in);
		System.out.println("Please enter numbers of values.");
		int Length = a.nextInt();
		int [] A = new int[Length];
		int Total = 0;
		int Maximum = Integer.MIN_VALUE;
		int Minimum = Integer.MAX_VALUE;
		
	    for (int i = 0; i < Length; i++)
	    {System.out.println("Enter value " + (i + 1));
	    A[i] = a.nextInt();}
	   
	    System.out.println("Your enter values are");
	   
	    for (int j = 0; j < Length; j++)
	    {System.out.println(A[j]);
	    Total += A[j];
		
		{
		if (A[j] == 0)
				
				Maximum = A[j];
			
			else {
				if (A[j] > Maximum)
					Maximum = A[j];
			}}
		
		{	if (A[j] == 0)
				Minimum = A[j];
			
			else {
				if (A[j] < Minimum)
					Minimum = A[j];
			}
		}
	    }
		
		System.out.println("Total Value is " + Total + ".");
		System.out.println("Average Value is " + Total/Length + ".");
		System.out.println("The maximum value is: " + Maximum + ".");
		System.out.println("The minimum value is: " + Minimum + ".");
		
	   
		}//END OF SCANNER
	}}
