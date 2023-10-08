class GcdEg
{
	public static int check(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return check(n-1)+check(n-2);
	}
	public static void main(String[] args)
	{
		System.out.println(check(10));
	}
}