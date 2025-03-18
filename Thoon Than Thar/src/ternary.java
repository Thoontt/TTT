public class ternary {
    public static void main(String[] args) {
        int value1 = 40, value2 = 70, value3 = 90;

        // Determine the maximum value using the ternary operator
        int max = (value1 > value2) ? 
        		  ((value1 > value3) ? value1 : value3) : 
        		  ((value2 > value3) ? value2 : value3);

        System.out.println("The maximum value is: " + max);
    }
}

