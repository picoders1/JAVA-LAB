import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/lab4a")
public class Lab4a extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setIntHeader("Refresh",1);
		response.setContentType("text/html");
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		PrintWriter out=response.getWriter();
		out.println("Auto refresh");
		out.println(dateFormat.format(date));
	}
}

