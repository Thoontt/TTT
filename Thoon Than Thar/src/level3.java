import java.util.Random;
import java.util.Scanner;
public class level3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random rand = new Random();
		 Scanner a = new Scanner (System.in);
		 
		 String playAgain;
		 
		    do{
		    	int Random = rand.nextInt(21);
	      

	    System.out.println("Please guess a number from 0 to 20.");
	    System.out.println("Please guess my number.");

	    int Number = a.nextInt();
	    int attempts = 1;
	    
	    
	    while (Number != Random)
	    {
	      if (Number > 20 || Number < 0)
	      {System.out.println("Read the game info, guess the number between 0 and 20.");
	      System.out.println("Guess again.");
	      Number = a.nextInt();
	      }
	    
	      
	      else {
	        if (Number - Random <= 3 && Number - Random >= -3)
	        {System.out.println("No!! You got it wrong!! Your number is close to my number.");
	        System.out.println("Guess again.");
	        Number = a.nextInt();}
	        
	        else 
	      
	        {System.out.println("No!! You got it wrong!! Your number is too far to my number.");
	        System.out.println("Guess again.");
	        Number = a.nextInt();}
	        }
	      
	        }
	      attempts++;
	  
	   
	    if(Random==Number) {
	    	
	      switch (attempts) {
	    
	    case 1: {System.out.println("Wow, you win at " + attempts + "st time. CONGRATS!");}
	    
	    case 2: {System.out.println("Wow, you win at " + attempts + "nd time. CONGRATS!");}
	    
	    case 3: {System.out.println("Wow, you win at " + attempts + "rd time. CONGRATS!");}
	    
	    default: {System.out.println("Wow, you win at " + attempts + "th time. CONGRATS!");}
	    
	    
	    break;
	    
	       }}
	    System.out.println("Do you want to play again? (y/n)");
	    playAgain=a.next().toLowerCase();
	    
	    }while(playAgain.equals("y"));
	    {System.out.println("Game Ended");}


		    }}
