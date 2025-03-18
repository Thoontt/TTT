import java.util.Scanner;
public class Shape2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.println("enter 2 for circle, 1 for triangle, 3 for square");
int operator=s.nextInt();
switch(operator) {
case 1: // triangle 
  System.out.println("Enter the base of the triangle");
  int base= s.nextInt();
  System.out.println ("Enter the height of the triangle");
  int height=s.nextInt();
  Tarea(base,height);break;
case 2: // circle 
  System.out.println("Enter the radius of the circle");
  int radius=s.nextInt();
  Circlearea(radius);break;
case 3: // square
  System.out.println("Enter the length of the square");
  int length=s.nextInt();
  System.out.println("Enter the wigth of the square");
  int wigth=s.nextInt();
  Squarearea(length,wigth);break;
  
}

}
  
  private static void Squarearea(int length, int width) {
    // TODO Auto-generated method stub
    System.out.println(length * width);
  }

  private static void Circlearea(int radius) {
    // TODO Auto-generated method stub
    System.out.println(3.14*  radius * radius);
  }

  public static void Tarea(int a,int b) {
    System.out.println(0.5* a* b);
  }
  
  }