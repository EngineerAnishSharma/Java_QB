import java.util.*;
class QB5
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter size:");
			n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<=n;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(ArithmeticException e){
			System.out.println("Enter Valid number\n"+e);
		}
		catch(InputMismatchException e){
			System.out.println("only number can divide\n"+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index out of bound\n"+e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
}