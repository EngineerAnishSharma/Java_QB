import java.util.Vector;
class VectorEg
{
	public static void main(String args[])
	{
		Vector v1=new Vector();
		Vector v2=new Vector();
		v1.add(1);v1.add(2);v1.add(3);v1.add(4);
		v2.add(3);v2.add(2);v2.add(11);v2.add(154);
		
		System.out.println(v1);
		for(int i=0;i<v1.size();i++)
		{
			for(int j=0;j<v2.size();j++)
			{
				if(v1.get(i)==v2.get(j))
				{
					v2.remove(v2.get(j));
				}
					
			}
		}
		v1.addAll(v2);
		System.out.println(v1);
	}
}