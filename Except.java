import java.util.*;
class NumException extends Exception
{
	public NumException(String s)
	{
		System.out.println(s);
	}
}
class Except
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		try{
		if(n<=0)
			throw new NumException("Number cant be negative");
		else 
			System.out.println("Number is postive");
		}
		catch(Exception e){
			System.out.println(e);
		}
			
	}
}