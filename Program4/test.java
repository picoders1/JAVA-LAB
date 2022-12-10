package shape2;

import shape1.*;

import java.util.Scanner;

public class test extends triangle

{
	public static void main(String[] args)
	{

	Scanner sc=new Scanner(System.in);
			
	while(true)
	{
		System.out.println(" Press 1 for Square\n Press 2 for circle\n Press 3 for triangle\n");
		System.out.println("Enter Your own choice: ");	
		
		int ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("Enter the size of Square:");
			double s=sc.nextDouble();
			square sq=new square();
			System.out.println("Area of Square is: "+sq.area(s));
			
		}
		
		else if(ch==2)
		{
			System.out.println("Enter the radius of Circle:");
			double r=sc.nextDouble();
			circle cr=new circle();
			System.out.println("Area of Circle is: "+cr.area(r));
			
		}
		
		else if(ch==3)
		{
			System.out.println("Enter the Base of Triangle:");
			double b=sc.nextDouble();
			
			System.out.println("Enter the Height of Triangle:");
			double h=sc.nextDouble();
			
			test tr=new test();
			System.out.println("Area of Triangle is: "+tr.area(b,h));
			
		}
	
	
		}
	

	}

}
