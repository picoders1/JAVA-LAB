package lab2;

public class staff extends person implements staff_op{
	String company,designation,empid;
	int salary;
	 
	public staff(String name,String add,String phoneno,String email,String company,String designation,String empid)
	{
		super(name,add,phoneno,email);
		this.company=company;
		this.designation=designation;
		this.empid=empid;
		this.salary=700000;
	}
	
	@Override
	public void calc_salary()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Address:"+this.add);
		System.out.println("Phone number:"+this.phoneno);
		System.out.println("Email:"+this.email);
		System.out.println("Company:"+this.company);
		System.out.println("Designation:"+this.designation);
		System.out.println("Employee ID:"+this.empid);
		System.out.println("Salary:"+this.salary);
	}

}

