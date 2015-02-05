
public class methodoverloading {


	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(double a,double b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String args[])
	{
		methodoverloading obj=new methodoverloading();
		obj.sum(10,5);
		obj.sum(5.5,7.5);
		obj.sum(5,4,1);
	}
}

