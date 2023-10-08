class Account
{
	int accountNo=220045;
	int balance=10000;
	int dep,draw;
	public void deposit(int dep)
	{
		this.dep=dep;
	}
	public void withdraw(int draw)
	{
		this.draw=draw;
	}
	public void display()
	{
		System.out.println(accountNo+" "+(balance+dep-draw));
	}
}
class SavingsAccount extends Account
{
	int rate=10;
	public void interest()
	{
		System.out.println(((balance*rate)/100));
	}
}
class CurrentAccount extends Account
{
	int draft=2000;
	public void overdraft()
	{
		System.out.println(draft);
	}
}
class QB7
{
	public static void main(String[] args)
	{
		Account a1=new SavingsAccount();
		a1.deposit(2000);
		a1.withdraw(1000);
		a1.display();
		//a1.interest();
		SavingsAccount b1=new SavingsAccount();
		b1.interest();
		Account a2=new CurrentAccount();
		a2.deposit(2000);
		a2.withdraw(1000);
		a2.display();
		//a2.overdraft();
		a1=null;
		System.gc();
		System.out.println("Objext is deleted");
	}
}