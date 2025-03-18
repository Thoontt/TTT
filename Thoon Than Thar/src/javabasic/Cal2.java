package javabasic;

import java.util.Scanner;
public class Cal2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first numbers");
    int number1=s.nextInt();
    System.out.println("Enter an operator, 1: +,2: - ,3: * ,4: /");
    int opnumber=s.nextInt();
    System.out.println("Enter second numbers");
    int number2=s.nextInt();
    switch(opnumber)
    { 
     case 1:System.out.println(Sum(number1,number2));break;
     
     case 2:System.out.println(Sub(number1,number2));break;
     case 3:System.out.println(multi(number1,number2));break;
     case 4:System.out.println(divi(number1,number2));break;
     
      default: System.out.println("Enter correct information");
    }



  }//
  public static int Sum(int a,int b) {
    {
    	return(a+b);
    }
  }
  public static int Sub (int a,int b)
  {
    return(a-b);
    }
  public static int multi(int a,int b) {
    return(a*b);
    }
  public static int divi(int a,int b) {
    return(a/b);
  }
}