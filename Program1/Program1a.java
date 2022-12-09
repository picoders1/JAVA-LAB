package lab1;
import java.util.Scanner;
public class prog1a {
	 String  name,add,ph_no,emailid,branch;
	 double tution_fees,ad_fee,fee,fee_cal;
	 
	
	 public void fee(){
		 double tfees;
		 this.ad_fee=25000;
		 this.tution_fees=10000;
		 this.fee=15000;
		 tfees=ad_fee+tution_fees+fee;
		 System.out.println("Total fees ="+tfees);
		 }
	 
	 void display(String name,String add,String ph_no,String emailid,String branch) {
		 System.out.println("Name="+name+"\nAddress="+add+"\nPhonenum="+ph_no+"\nemailid="+emailid+"\nBranch="+branch);
	 }


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
       prog1a a = new prog1a();
       System.out.println("Enter Student details");
		System.out.println("Enter Student Name:");
		String name = s.next();
		System.out.println("Enter Student Address");
		String add = s.next();
		System.out.println("Enter Student Branch");
		String branch = s.next();
		System.out.println("Enter phone number");
		String ph_no= s.next();
		System.out.println("Enter emailid");
		String emailid = s.next();
		a.display(name,add,ph_no,emailid,branch);
		a.fee();
		
			 

	}

}
