import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class Student {
	
    


	public static void main(String[] args)throws NumberFormatException, IOException {
		
        Student maintain = new Student();     
        InputStreamReader insr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(insr);
        Scanner input = new Scanner( System.in ); 
    
        int choice; 
        String name,ID,course;
        
                System.out.println("New Record: ");
                System.out.println("Enter Student ID: ");
                ID = br.readLine();
                System.out.println("Enter Student Name: ");
                name = br.readLine();
                
                System.out.println("Enter course: ");
                course = br.readLine();
                
                System.out.println("Student ID:"+ID);            
                System.out.println("Name:"+name);
                System.out.println("Course:"+course);
		
		   }
}
