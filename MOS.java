import java.util.*;
class Student
{	
	String name;
	int roll;
	int total;
	public Student(String name,int roll,int total){
		this.name=name;
		this.roll=roll;
		this.total=total;
	}
	public void display(){
		System.out.println(name+" "+roll+" "+total);
	}
}
class MOS
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of student:");
		int num=sc.nextInt();
		String name=new String();
		int chem,phy,math,roll,total;
		Student stu[]=new Student[num];	
		for(int i=0;i<num;i++)
		{
			System.out.println("Name");
			name=sc.next();
			//sc.next();
			System.out.println("roll");
			roll=sc.nextInt();
			System.out.println("chem,phy,math");
			chem=sc.nextInt();
			phy=sc.nextInt();
			math=sc.nextInt();
			total=chem+phy+math;
			stu[i]=new Student(name,roll,total);
		}
	
		for(int i=0;i<num;i++){
			for(int j=i+1;j<num;j++){
				if(stu[i].total>stu[j].total){
					Student temp=stu[i];
					stu[i]=stu[j];
					stu[j]=temp;
				}
			}
		}
		for(int i=0;i<num;i++)
		{
			stu[i].display();
		}
		
		
	}
}