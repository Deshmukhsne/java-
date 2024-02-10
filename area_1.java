class area_1
{
    int h;
    int b;
    float a;	


area_1()
    {
        h=10;
        b=15;
    }
  
void show()
{
System.out.println("Height of Traingle is :="+h);
System.out.println("Base of Traingle is :="+b);
System.out.println("Area of Traingle is :="+(0.5*b*h));
}
public static void main(String args[])
{
    area_1 c=new area_1();
    c.show();
}
}