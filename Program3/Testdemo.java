package lab2;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String name=sc.next();
		System.out.println("enter Address:");
		String add=sc.next();
		System.out.println("enter Phone number");
		String phoneno=sc.next();
		System.out.println("enter Email");
		String email=sc.next();
		System.out.println("1.Student");
		System.out.println("2.Staff");
		System.out.println("enter your choice");
		 ch=sc.nextInt();
		 if(ch==1)
		 {
			 System.out.println("enter usn:");
			 String usn=sc.next();
			 System.out.println("enter branch:");
			 String branch=sc.next();
			 student_op stud=new student(name,add,phoneno,email,usn,branch);
			 stud.calc_fees();
		 }
		 else if(ch==2)
		 {
			 System.out.println("enter company name:");
			 String company=sc.next();
			 System.out.println("enter designation:");
			 String designation=sc.next();
			 System.out.println("enter employee ID:");
			 String empid=sc.next();
			 staff_op staffs=new staff(name,add,phoneno,email,company,designation,empid);
			 staffs.calc_salary();
		 }

	}

}
