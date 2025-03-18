import java.util.Scanner;

public class SteelGrading {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the hardness value: ");
        int hardness = s.nextInt();

        System.out.print("Enter the carbon value: ");
        double carbon = s.nextDouble();

        System.out.print("Enter the tensile value: ");
        int tensile = s.nextInt();

        

        int grade;

        if (hardness>50 && carbon < 0.7&& tensile > 5600) {
            grade = 10;
        } else if (hardness > 50 && carbon < 0.7) {
            grade = 9;
        } else if ( carbon < 0.7 && tensile > 5600) {
            grade = 8;
        } else if (hardness > 50 && tensile > 5600) {
            grade = 7;
        } else if (hardness > 50 || carbon < 0.7 ||tensile > 5600 ) {
            grade = 6;
        } else {
            grade = 5;
        }

        System.out.println("The grade of the steel product is: " + grade);
    }
}
