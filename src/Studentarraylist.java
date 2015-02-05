import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Studentarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter the Student Name");
		String name=sc.next();
		al.add(name);
		}
        Iterator iterator = al.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

	}
	}
}
