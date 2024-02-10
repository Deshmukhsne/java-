import java.util.Scanner;
class area_2
{
    int r;
area_2()
    { 
	   Scanner sc=new Scanner (System.in);
       System.out.println("Enter the value of r :=");
	   r=sc.nextInt();
    }
  
void show()
{
System.out.println("Radius of circle  is :="+r);
System.out.println("Area of Circle is :="+(3.14*r*r));
}
public static void main(String args[])
{
    area_2 c=new area_2();
    c.show();
}
}