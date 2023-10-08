import java.util.*;
class QB3
{
	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter number:");
			a=sc.nextInt();
			if(a==0)
				System.out.println(1/a);
			else
				System.out.println("1/"+a);
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