import java.util.Scanner;

public class ReplaceAWithAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        
        String result = input.replaceAll("[aA]", "@").toUpperCase();
        
        
        System.out.println("Modified string:");
        System.out.println(result);
        
        scanner.close();
    }
}
							