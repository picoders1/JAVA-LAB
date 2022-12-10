import java.sql.*;
import java.util.Scanner;
public class lab3a {
    Connection con = null;
    static Scanner sc = new Scanner(System.in);
    public Connection getConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://172.16.34.105/1rv21mc095","1rv21mc095","1rv21mc095");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
    public int insert(){
        int i = 0;
        try{
            con = getConnect();
            Statement st = con.createStatement();
            String usn, name, address;
            System.out.println("enter usn:");
            usn = sc.nextLine();
            System.out.println("enter name:");
            name = sc.nextLine();
            System.out.println("enter address");
            address= sc.nextLine();
            String query = "insert into student values('"+usn+"','"+name+"','"+address+"')";
            i = st.executeUpdate(query);
            con.close();


        }
        catch(Exception e){
            System.out.println(e);
        }
        return i;
    }
    public void display(){
        try {
            con = getConnect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public int delete(){
        int i = 0;
        try{
            con = getConnect();
            Statement st = con.createStatement();
            System.out.println("enter usn:");
            String usn = sc.next();
            String query = "delete from student where usn = '"+usn+"'";
            i = st.executeUpdate(query);
            con.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
        return i;
    }
    public int update(){
        int i = 0;
        try{
            con = getConnect();
            Statement st = con.createStatement();
            System.out.println("1:name 2:address");
            int n = sc.nextInt();
            if(n==1){
                String usn, name;
                System.out.println("enter usn:");
                usn = sc.next();
                System.out.println("enter name:");
                name = sc.next();
                String query = "update student set name = '"+name+"'where usn = '"+usn+"'";
                i = st.executeUpdate(query);

            }
            else if(n == 2){
                System.out.println("enter usn:");
                String usn = sc.next();
                System.out.println("enter address");
                String address = sc.next();
                String query = "update student set name = '"+address+"'where usn = '"+usn+"'";
                i = st.executeUpdate(query);
            }

            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return i;

    }
    public static void main(String[] args){
        while(true){
            lab3a obj = new lab3a();
            int i = 0;
            System.out.println("1:insert 2:update 3:delete 4:display");
            int n = sc.nextInt();
            if(n == 1)
                i = obj.insert();
            else if(n == 2)
                i = obj.update();
            else if(n == 3)
                i = obj.delete();
            else if(n == 4)
                obj.display();
            if(i == 1)
                System.out.println("success");
            else if(n==4){
                System.out.println("Student Table contents");
            }
            else
                System.out.println("failed");
            System.out.println("do you want to continue? 1 for yes");
            n = sc.nextInt();
            if(n==1)
                continue;
            else
                break;
        }
    }

}
