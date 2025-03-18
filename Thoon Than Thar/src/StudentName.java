
import java.util.Scanner;
public class StudentName {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    {Scanner a = new Scanner (System.in);

    System.out.println("How many students are there?");
    int Length = a.nextInt();
    String [] Students = new String[Length];

  
      for (int i = 0; i < Length; i++)
      {System.out.println("Enter the name of student " + (i + 1));
      Students[i] = a.next();}
      
        
      System.out.println("All Students");
      System.out.println("No.   Name");
      System.out.println("==    ====");
      
      for (int j = 0; j < Length; j++)
      System.out.println((j + 1) + "     " + Students[j]);
     
      
    }//END OF SCANNER
  }}
