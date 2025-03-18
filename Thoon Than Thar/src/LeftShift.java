import java.util.Scanner;
public class LeftShift{

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    {Scanner a = new Scanner (System.in);

    System.out.println("Please enter numbers of values.");
    int Length = a.nextInt();
    int [] A = new int[Length];
    
      for (int i = 0; i < Length; i++)
      {System.out.println("Enter value " + (i + 1));
      A[i] = a.nextInt();}
      
      System.out.print("Your enter values before leftshift are ");
      
      for (int j = 0; j < Length; j++)
      {System.out.print(A[j] + ",");}
      
        int temp = A[0];
      
      for (int k = 0; k < Length-1; k++)
      {
        A[k] = A[k + 1];
      }
      A[Length - 1] = temp;
      
      System.out.println();
      System.out.print("Your enter values after leftshift are ");
      
      for (int l = 0; l < Length; l++)
      {System.out.print(A[l] + ",");}
     
      
      }
    }}