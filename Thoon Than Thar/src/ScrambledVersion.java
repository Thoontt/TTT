import java.util.Scanner;

public class ScrambledVersion {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a sentence: ");  
        String input = a.nextLine();

        String[] words = input.split(" "); 
        for (int i = 0; i < words.length; i++) {
            words[i] = scrambleWord(words[i]); 
        }

        String scrambledSentence = String.join(" ", words); 
        System.out.println("Scrambled sentence: " + scrambledSentence);

        a.close();
    }

    private static String scrambleWord(String word) {
        if (word.length() <= 3) {
            return word; 
        }
        int firstLetterIndex = 0;
        while (firstLetterIndex < word.length() && !Character.isLetter(word.charAt(firstLetterIndex))) {
            firstLetterIndex++;
        }

        int lastLetterIndex = word.length() - 1;
        while (lastLetterIndex >= 0 && !Character.isLetter(word.charAt(lastLetterIndex))) {
            lastLetterIndex--;
        }
       
        String middle = word.substring(firstLetterIndex + 1, lastLetterIndex);
        char[] middleChars = middle.toCharArray();
        reverseArray(middleChars);
        
        return word.substring(0, firstLetterIndex + 1) +
               new String(middleChars) +
               word.substring(lastLetterIndex);
    }

    private static void reverseArray(char[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swap the characters
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
    }

