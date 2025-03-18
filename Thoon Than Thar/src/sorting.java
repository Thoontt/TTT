import java.util.Scanner;
public class sorting {

	private static int j;
	private static int temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{Scanner a = new Scanner (System.in);

	    System.out.println("Please enter numbers of values.");
	    int Length = a.nextInt();
	    int [] A = new int[Length];
	    for (int i=0;i<Length;i++)
	    {
	    	System.out.println("Enter values");
	    	A[i]=a.nextInt();
	    	
	    }
	    for(int i=0;i<A.length;i++)
	    {
	    	System.out.println("your entered values are"+A[i]);
	    }
	    	
	    for (int i = 0; i < Length-1; i++)
	    	  {
	        	 for (int j=i+1;j<Length;j++);
	    	  {
	    		  if(A[j]< A[i])
	    		  {
	    		  System.out.print("Your enter values sorting are ");
	         
	    		
	    		     temp = 0;
	    		    temp = A[i];
	    		    A [i]= A[j];
	    		    A[j] = temp;
	    		  }
	    		    System.out.println("A[i] value after swapping " + A[j]);
	    		    System.out.println("A[j] value after swapping " + A[i]);
	    		  
	    	  }
	      
	      }
	    System.out.println("After Swapping is");
	    for(int i=0;i<A.length;i++)
	    {
	    	System.out.println(A[i]);
	    }
	         
	    }

	}}

	
