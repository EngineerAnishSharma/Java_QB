class SumNum extends Thread
{
	int n;
	int sum=0;
	public void run()
	{
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			System.out.print(sum+" ");
			try{Thread.sleep(500);}
			catch(Exception e){}
		}
	}
}
class Product extends Thread
{	
	int n;
	int pro=1;
	public void run()
	{
		for(int i=1;i<=n;i++)
		{
			pro*=i;
			System.out.print(pro+" ");
			try{Thread.sleep(500);}
			catch(Exception e){}
		}
	}
}
class SumProduct
{
	public static void main(String[] args) throws Exception
	{
		SumNum s1=new SumNum();
		s1.n=Integer.parseInt(args[0]);
		Product p1=new Product();
		p1.n=4;
		s1.start();
		p1.start();
		s1.join();
		p1.join();
		s1.setName("Thread1");
		s1.setPriority(8);
		p1.setName("Thread1");
		p1.setPriority(2);
		System.out.println(s1.getName()+" "+s1.getPriority());
		System.out.println(p1.getName()+" "+p1.getPriority());
	}
}