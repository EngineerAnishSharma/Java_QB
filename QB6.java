import java.util.*;
class QB6
{
	public static void main(String[] args)
	{
		int n=-9;
		Scanner sc=new Scanner(System.in);
		try{
			if(n<0)
				throw new ArithmeticException();
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