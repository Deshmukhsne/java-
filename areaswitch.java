import java.util.Scanner;
public class areaswitch
{
public static void main(String args[])
{ 

  Scanner sc= new Scanner(System.in);
  int c,d;
  float ct;
  do
  {
  System.out.println("Area of choice :\n1.Rectangle \n2.Traingle \n3.Square \n4.Circle:=");
  int ch=sc.nextInt();
  switch(ch)
  {
	  case 1:
	  System.out.println("Enter length  :=");
      int l =sc.nextInt();
      System.out.println("Enter breadth  :=");
      int b =sc.nextInt();
	   System.out.println("Area of Rectangle:= "+(l*b));
	   break;
	   case 2:
	   System.out.println("Enter base  :=");
       int bs =sc.nextInt();
       System.out.println("Enter heigth  :=");
       int ht =sc.nextInt();
	   System.out.println("	Area of Traingle := "+(0.5*bs*ht));
	   break;
	   case 3:
	   System.out.println("Enter side  :=");
       int side =sc.nextInt();
	   System.out.println("	Area of Square := "+(side*side));
	   break;
	   case 4:
	   System.out.println("Enter radius  :=");
       int r =sc.nextInt();
	   System.out.println("Area of Circle := "+(3.14*r*r));
	   break;
	   default:
	   System.out.println("Invalid Entry");
	   break;
  }
  System.out.println("If you want to continue further(1/0) :=");
  d=sc.nextInt();
  }while(d==1);
}
} 
