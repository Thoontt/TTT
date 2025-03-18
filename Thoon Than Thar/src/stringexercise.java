import java.util.*;
public class stringexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1
    String s1="Hi";
    String s2=s1.concat("Mom");
    System.out.println(s2);

//2
	Scanner s = new Scanner(System.in);
    System.out.print("Enter your full name: ");
    String fullName = s.nextLine();
    String[] words = fullName.split(" ");
    StringBuilder initials = new StringBuilder();
    for (String word : words) {
    if (!word.isEmpty()) {
    initials.append(word.charAt(0));}
    }
    System.out.println("The initials of the name are: " + initials.toString().toUpperCase());
        
		
	//3
        String str="pencil" ;
		for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}}
	

	    }
	

	    


	
	   

	



