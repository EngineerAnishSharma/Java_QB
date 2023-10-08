import java.util.*;
class QB2
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter two number:");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println("Enter Valid number\n"+e);
		}
		catch(InputMismatchException e){
			System.out.println("only number can divide\n"+e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
}