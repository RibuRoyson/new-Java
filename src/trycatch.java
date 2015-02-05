

import java.io.IOException;
import java.util.Scanner;

public class trycatch {
public static void main(String args[])
{
	try
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("c is"+c);
		String s=null;
		System.out.println(s);
		int d[]=new int[5];
		int f=30/d[10];
		System.out.println(f);

		
		
	}catch(ArithmeticException e)
	{
		System.out.println("Cannot divisible by zero");
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Out of bounds");
	}catch(NullPointerException e)
	{
		System.out.println("nullpointer exception");
	}
	
}
}
