class Fibonacci extends Thread
{
	int n;
	public void run()
	{
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<n;i++)
		{
			int c=a+b;
			System.out.println(c);
			try{Thread.sleep(499);}
			catch(Exception e){}
			a=b;
			b=c;
		}
	}
}
class Reverse extends Thread
{
	int n;
	public void run()
	{
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
			try{Thread.sleep(499);}
			catch(Exception e){}
		}
	}
}
class FiboRev
{
	public static void main(String[] args) throws Exception
	{
		Fibonacci f1=new Fibonacci();
		f1.n=10;
		Reverse r1=new Reverse();
		r1.n=10;
		f1.start();
		f1.join();
		r1.start();
		System.out.println(f1.getName());
		System.out.println(f1.getPriority());
	}
}