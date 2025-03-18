import java.util.Scanner;
public class ValueSwap {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    {Scanner a = new Scanner (System.in);
    System.out.println("Please Enter A value.");
    int A = a.nextInt();
    System.out.println("Please Enter B value.");
    int B = a.nextInt();
    
    //AFTER SWAPPING
    int temp = 0;
    temp = A;
    A = B;
    B = temp;
    System.out.println("A value after swapping " + A);
    System.out.println("B value after swapping " + B);
    
    }
  }

}
