import java.util.Scanner;

public class RepeatedCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        findRepeatedCharacters(input);
    }
    
    public static void findRepeatedCharacters(String str) {
        int[] charCounts = new int[256]; // 
        
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                charCounts[ch]++;
            }
        }
        
        System.out.println("Repeated characters or numbers:");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 1) {
                System.out.println((char) i + " -> " + charCounts[i]);
            }
        }
    }
}
