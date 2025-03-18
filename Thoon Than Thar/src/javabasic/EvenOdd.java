package javabasic;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
      System.out.println("Enter the length of the array:");
      int length = s.nextInt();
      int[] numbers = new int[length];

      System.out.println("Enter the numbers:");
      for(int i = 0; i < length; i++) {
          numbers[i] = s.nextInt();
      }

      int evenCount = 0;
      int oddCount = 0;

      for(int i = 0; i < length; i++) {
          if (numbers[i] % 2 == 0) {
              evenCount++;
          } else {
              oddCount++;
          }
      }

      System.out.println("Even Count: " + evenCount);
      System.out.println("Odd Count: " + oddCount);
    }

        
    }
}