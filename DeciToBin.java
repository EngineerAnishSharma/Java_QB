/*import java.util.*;
class DeciToBin
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int arr[]=new int[10];
		int i=0;
		int rem;
		while(n>=0){
			rem=n%2;
			arr[i]=rem;
			i++;
			n=n/2;
		}
		System.out.println(i);
		for(int j=arr.length-1;j>=0;j--)	
		{
			System.out.print(arr[j]);
		}
	}
}*/

import java.util.*;
class DeciToBin
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rem;
		String deci="";
		while(n>0){
			rem=n%2;
			//deci=String.valueOf(rem)+deci;
			deci=Integer.toString(rem)+deci;
			n=n/2;
		}
		System.out.println(deci);
	}
}