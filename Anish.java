import java.util.*;
class Table
{
	//int n;
	public void print(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			try{
				Thread.sleep(100);
			}
			catch(Exception e){};
		}
	}
}
class Table1 extends Thread
{
	Scanner sc=new Scanner(System.in);
	Table t;
	public Table1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		//int n=sc.nextInt();
		t.print(1);
	}
}
class Table2 extends Thread
{
	Scanner sc=new Scanner(System.in);
	Table t;
	public Table2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		//int n=sc.nextInt();
		t.print(2);
	}
}
class Anish
{
	public static void main(String[] args) 
	{
		Table obj=new Table();
		//obj.n=5;
		Table1 t1=new Table1(obj);
		Table2 t2=new Table2(obj);
		
		t1.start();
		t2.start();
	}
}