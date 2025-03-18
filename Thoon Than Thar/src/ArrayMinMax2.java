import java.util.Scanner;
public class ArrayMinMax2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int i;
        int length;
        int[] number;
        System.out.println("Enter number of values:");
        length = s.nextInt();
        number = new int[length];
        // Insert data into Array

        for (i = 0; i < length; i++) {
            System.out.print("Enter value: ");
            number[i] = s.nextInt();
        }
        System.out.print("Your entered values are: ");
        for (i = 0; i < length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
