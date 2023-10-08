import java.util.*;
class Split
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine().trim();
		
		String str[]=sentence.split(" ");
		System.out.println(str[0]+" "+str[str.length-1]);
	}
}