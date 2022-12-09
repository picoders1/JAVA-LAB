package lab1;

import java.util.Scanner;

public class Student {
	 String  name,add,ph_no,emailid,branch;
	 double tfees,tution_fees,ad_fee,fee,fee_cal;
	 static String College,Address,phonenum;
	 
	 static {
		 College="RVCE";
		 Address="Bengaluru";
		 phonenum="1234567890";
	 }
	 Student(String name,String add,String ph_no,String emailid,String branch){
		 this.name=name;
		 this.add=add;
		 this.ph_no=ph_no;
		 this.emailid=emailid;
		 this.branch=branch;
	 }
	 
	 Student(String name,String add,String branch){
		 this.name=name;
		 this.add=add;
		 this.emailid=""+name+"@rvce.edu.in";
		 this.branch=branch;
	 }

	 public double fee(String branch){
		 this.ad_fee=25000;
		 this.tution_fees=10000;
		 this.fee=15000;
		 this.tfees=ad_fee+tution_fees+fee;
		 if(branch.equalsIgnoreCase("BE")) {
			 tfees+=25000;
		 }
		 else {
			 tfees+=30000;
		 }
		 return tfees;
	}
	 
	 void display() {
		 System.out.println("Name="+name+"\nAddress="+add+"\nPhonenum="+ph_no+"\nemailid="+emailid+"\nBranch="+branch);
	 }
	 
	 void display(String branch) {
		 fee_cal=this.fee(branch);
		 System.out.println("Total fees for "+branch+" is "+fee_cal);
		 
		 
	 }
	 
	 void display(int no_of_fields) {
		 if(no_of_fields==3) {
			 System.out.println("Name="+name+"\nAddress="+add+"\nBranch="+branch);
			 }
		 else {
			 System.out.println("Name="+name+"\nAddress="+add+"\nBranch="+branch+"\nphonenum="+ph_no+"\nemailid"+emailid);
		 }
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student si;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Student details");
			System.out.println("Enter Student Name:");
			String name = s.next();
			System.out.println("Enter Student Address");
			String add = s.next();
			System.out.println("Enter Student Branch");
			String branch = s.next();
			System.out.println("Would you like to enter phonenum and emailid");
			int ch = s.nextInt();
			if(ch==1) {
				System.out.println("Enter phone number");
				String ph_no= s.next();
				System.out.println("Enter emailid");
				String emailid = s.next();
                si=new Student(name,add,ph_no,emailid,branch);
				}
			else {
			 si=new Student(name,add,branch);
			}
			
			System.out.println("What would you like to display:");
			System.out.println("1.Student Details \n2.Total branch fees\n3.no.of feilds");
			int a = s.nextInt();
			if(a==1) {
				si.display();
			}
			else if(a==2) {
				System.out.println("Enter Branch");
				String branch1 = s.next();
				si.display(branch1);
			}
			else {
				System.out.println("Enter No of feilds you want to display:");
				int no_of_feilds = s.nextInt();
				si.display(no_of_feilds);
				}
			
			System.out.println("1.Continue\n2.Exit");
			int c= s.nextInt();
	
			if(c==2) {
				break;
			}
				
		}
		
	}

}

