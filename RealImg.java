import java.util.*;
class Complex
{
	int real,img;
	public Complex(int real,int img)
	{
		this.real=real;
		this.img=img;
	}
	public Complex(Complex obj1,Complex obj2){
		System.out.println((obj1.real+obj2.real)+" + "+(obj1.img+obj2.img)+"i");
	}
}
class RealImg
{
	public static void main(String[] args)
	{
		System.out.println("Enter complex number:");
		Complex a=new Complex(3,5);
		Complex b=new Complex(3,5);
		Complex c=new Complex(a,b);
	}
}