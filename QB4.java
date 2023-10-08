import java.util.*;
class QB4
{
	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter String:");
			str=sc.nextLine();
			if(str.isEmpty())
				throw new NullPointerException();
			else
				System.out.println(str.toUpperCase());
			
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		
	}
}