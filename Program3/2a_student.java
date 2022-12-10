package lab2;


public class student extends person implements student_op {
	
	String usn,branch;
	int fees;
	
	public student(String name,String add,String phoneno,String email,String usn,String branch)
	{
		super(name,add,phoneno,email);
		this.usn=usn;
		if(branch.equalsIgnoreCase("MCA"))
		{
			this.fees=600000;
			this.branch=branch;
		}
		else if(branch.equalsIgnoreCase("BTECH"))
		{
			this.fees=250000;
			this.branch=branch;
		}
	}
	
	@Override
	public void calc_fees()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Address:"+this.add);
		System.out.println("Phone no:"+this.phoneno);
		System.out.println("Email:"+this.email);
		System.out.println("USN:"+this.usn);
		System.out.println("branch:"+this.branch);
		System.out.println("fees:"+this.fees);
	}

}


