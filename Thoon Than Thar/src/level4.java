
		import java.util.Random;
		import java.util.Scanner;

		public class level4 {

		    public static void main(String[] args) {
		        Random rand = new Random();
		        Scanner a = new Scanner(System.in);

		        String playAgain = "y";

		        do {
		            System.out.println("Please enter max possible number.");
		            int maxPossible = a.nextInt();
		            int randomNum = rand.nextInt(maxPossible + 1);

		            System.out.println("Please guess a number from 0 to " + maxPossible + ":");
		            System.out.println("Please guess my number.");

		            int number = a.nextInt();
		            int attempts = 1;

		            while (number != randomNum) {
		                if (number > maxPossible || number < 0) {
		                    System.out.println("Read the game info, guess the number between 0 and " + maxPossible + ".");
		                } else if (Math.abs(number - randomNum) <= 3) {
		                    System.out.println("No!! You got it wrong!! Your number is close to my number.");
		                } else {
		                    System.out.println("No!! You got it wrong!! Your number is too far from my number.");
		                }
		                System.out.println("Guess again.");
		                number = a.nextInt();
		                attempts++;
		            }

		            switch (attempts) {
		                case 1:
		                    System.out.println("Wow, you win at the " + attempts + "st time. CONGRATS!");
		                    break;
		                case 2:
		                    System.out.println("Wow, you win at the " + attempts + "nd time. CONGRATS!");
		                    break;
		                case 3:
		                    System.out.println("Wow, you win at the " + attempts + "rd time. CONGRATS!");
		                    break;
		                default:
		                    System.out.println("Wow, you win at the " + attempts + "th time. CONGRATS!");
		            }

		            System.out.println("Do you want to play again? (y/n)");
		            playAgain = a.next().toLowerCase();
		        } while (playAgain.equals("y"));
		        System.out.println("Game Ended");
		    }
		}
