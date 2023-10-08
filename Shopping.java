import java.util.*;
class Dmart
{
	int price;
	String items;
	public synchronized void website()
	{
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter your items:");
			items=sc.nextLine();
			System.out.println("Enter your total price:");
			price=sc.nextInt();
			System.out.print("Your items is listing..");
			for(int i=0;i<5;i++)
			{
				System.out.print("..");
				Thread.sleep(500);
			}
			System.out.println("You have successfully completed your shopping\nThank you!");
		}
		catch(Exception e){};
		
		
	} 
}
class Customer extends Thread
{
	Dmart material;
	public Customer(Dmart material)
	{
		this.material=material;
	}
	public void run()
	{
		material.website();
	}
}
class Shopping
{
	public static void main(String args[])
	{	
		Dmart obj=new Dmart();
		Customer c1=new Customer(obj);
		Customer c2=new Customer(obj);
		c1.start();
		c2.start();
	}
}