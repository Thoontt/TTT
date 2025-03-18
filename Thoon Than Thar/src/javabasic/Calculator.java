package javabasic;

import java.util.Scanner;
public class Calculator {

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
     case 1:Sum(number1,number2);break;
     case 2:Sub(number1,number2);break;
     case 3:multi(number1,number2);break;
     case 4:divi(number1,number2);break;
     
      default: System.out.println("Enter correct information");
    }



  }//
  public static void Sum(int a,int b) {
    System.out.println(a+b);
  }
  public static void Sub (int a,int b)
  {
    System.out.println(a-b);
    }
  public static void multi(int a,int b) {
    System.out.println(a*b);
    }
  public static void divi(int a,int b) {
    System.out.println(a/b);
  }
}