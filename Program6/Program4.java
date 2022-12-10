import java.sql.*;
import java.util.Scanner;
class myException extends Exception
{
	myException(String myException)
	{
		 System.out.println(myException);
	}
}
public class lab3b 
{
 Connection con=null;
 public Connection getConnect() throws SQLException,Exception
 {
	 try
	 {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://172.16.34.105:3306/1rv21mc095","1rv21mc095","1rv21mc095");
	 }
	 catch(ClassNotFoundException e)
	 {
		 System.out.println("Excetipon:"+e.getMessage());
	 }
	 catch(SQLException e)
	 {
		 System.out.println("Excetipon:"+e.getMessage());
	 }
	 return con;
 }
 public int insert(String n,String u,String a)
 {
	 int i=0;
	 String name,usn,add;
	 name=n;
	 usn=u;
	 add=a;
	 try
	 {
		 con=getConnect();
		 String qry="insert into student1 values(?,?,?)";
		 PreparedStatement ps=con.prepareStatement(qry);
		 ps.setString(1, n);
		 ps.setString(2, u);
		 ps.setString(3, a);
		 i=ps.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 finally
	 {
		 try
		 {
			 con.close();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 return i;
 }
 public void display(String usn)
 {
	 try
	 {
		 con=getConnect();
		 Statement st=con.createStatement();
		 ResultSet s=st.executeQuery("show tables");
		 String qry="select * from student1 where usn=?";
		 PreparedStatement ps=con.prepareStatement(qry);
		 ps.setString(1, usn);
		 ResultSet rs=ps.executeQuery();
		 while(rs.next())
		 {
			 System.out.println();
			 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		 }
	 }
	 catch(SQLException e)
	 {
		 System.out.println("Excetipon:"+e.getMessage());
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 finally
	 {
		 try
		 {
			 con.close();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
 }
 public int delete(String usn)
 {
	 int i=0;
	 try
	 {
		 con=getConnect();
		 String qry="delete from student1 where usn=?";
		 PreparedStatement ps=con.prepareStatement(qry);
		 ps.setString(1, usn);
		 i=ps.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 finally
	 {
		 try
		 {
			 con.close();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 return i;
 }
 public int update(String n,String u)
 {
	 int i=0;
	 String name,usn,add;
	 name=n;
	 usn=u;
	 try
	 {
		 con=getConnect();
		 String qry="update student1 set name=? where usn=?";
		 PreparedStatement ps=con.prepareStatement(qry);
		 ps.setString(1, name);
		 ps.setString(2, usn);
		 i=ps.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 finally
	 {
		 try
		 {
			 con.close();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 return i;
 }
 public static void main(String[] args)
 {
	while(true)
	{
	Scanner sc=new Scanner(System.in);
	int i=0,ch=0;
	String name,usn,add;
	lab3b s=new lab3b();
	System.out.println("\n1:INSERT\n2:DISPLAY\n3:DELETE\n4:UPDATE\n5:EXIT\nENTER YOUR CHOICE:");
	try
	{
	 ch=sc.nextInt();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	if(ch==1)
	{
		System.out.println("ENTER NAME:");
		name=sc.next();
		System.out.println("ENTER USN:");
		usn=sc.next();
		System.out.println("ENTER ADD:");
		add=sc.next();
		i=s.insert(name,usn,add);
		if(i==1)
			System.out.println("Query Exeuted Succesfully");
		else
		{
			System.out.println("Query Not Executed Succesfully");
		}
	}
	else if(ch==2)
	{
		System.out.println("STUDENT TABLE:\n");
		System.out.println("ENTER USN:\n");
	    usn=sc.next();
		s.display(usn);
	}
	else if(ch==3)
	{
	System.out.println("STUDENT TABLE:\n");
	System.out.println("ENTER USN:\n");
    usn=sc.next();
	i=s.delete(usn);
	if(i==1)
		System.out.println("Query Exicuted Succesfully");
	else
	{
		System.out.println("Query Not Exicuted Succesfully");
	}
	}
	else if(ch==4)
	{
	System.out.println("STUDENT TABLE:\n");
	System.out.println("ENTER USN:\n");
    usn=sc.next();
    System.out.println("ENTER NAME:\n");
    name=sc.next();
	i=s.update(name,usn);
	if(i==1)
		System.out.println("Query Exicuted Succesfully");
	else
	{
		System.out.println("Query Not Exicuted Succesfully");
	}
	}
	else if(ch==5)
	{
		System.out.println("THANKS FOR USING");
		break;
	}
 }
}
}

