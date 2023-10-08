import java.util.*;
abstract class Shape
{
	public abstract void calculateArea();
}
class Circle extends Shape
{
	Scanner obj=new Scanner(System.in);
	public void calculateArea()
	{
		System.out.println("Enter radius");
		float r=obj.nextFloat();
		System.out.println(3.14*r*r);
	}
}
class Rectangle extends Shape
{
	Scanner obj=new Scanner(System.in);
	public void calculateArea()
	{
		System.out.println("Enter len and wid");
		int l=obj.nextInt();
		int w=obj.nextInt();
		System.out.println(l*w);
	}
}
class QB1
{
	public static void main(String[] args)
	{
		Circle c1=new Circle();
		c1.calculateArea();
		Rectangle r1=new Rectangle();
		r1.calculateArea();
	}
}