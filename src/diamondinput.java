import java.util.Scanner;


public class diamondinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the input");
int num=sc.nextInt();
for(int i=1;i<=num;i++)
{
	for(int j=num;j>=i;j--)
	{
		System.out.print("");
	}
	for(int m=1;m<=i;m++)
	{
		System.out.print("*");
	}
	System.out.print("\n");
}
for(int i=1;i<=num;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("");
	}
		for(int m=num;m>=i;m--)
		{
		System.out.print("*");
	}
	System.out.print("\n");

	
}
}

}
