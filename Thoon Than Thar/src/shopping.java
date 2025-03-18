import java.util.Scanner;
public class shopping {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int item=s.nextInt();
		int total=0;
		int max=0;
		int min=0;
		for (int i=1;i<=item;i++)
		{System.out.println("Enter item"+ i +"Amount");
		int Amount=s.nextInt();
		total+=Amount;
		if(i==1)
			max=Amount;
		else {if(Amount>max)
			max=Amount;
		else {if(Amount<min)
			min=Amount;
		}
		}
		}
		System.out.println(max);
		System.out.println(min);
		
		System.out.println("total amount"+total);
		System.out.println("Average"+total/item);
		// TODO Auto-generated method stub

	}

}
