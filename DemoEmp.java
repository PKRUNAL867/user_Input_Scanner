import java.util.*;
import java.io.*;
public class DemoEmp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name:=");
		String name=sc.next();
		System.out.println("Enter the email");
		String  email=sc.next();
		
		Employee e1=new Employee();
		e1.setName(name);
		e1.setEmail(email);
		Employee e2=new Employee("pinki pra","pinki@123");
		
	//	System.out.println(e1.getName());
		//System.out.println(e1.getEmail());
		System.out.println(e2.getName());
		System.out.println(e2.getEmail());
		

	}

}
