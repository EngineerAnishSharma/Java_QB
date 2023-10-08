class A
{
	public A()
	{System.out.println("A constructor");}
	public void show()
	{
		System.out.println("A");
	}
}
class B extends A
{
	public B()
	{System.out.println("B constructor");}
	public void show()
	{
		super.show();
		System.out.println("B");
	
	}
}
class An
{
	public static void main(String[] args)
	{
		B obj=new B();
		obj.show();
	}
}