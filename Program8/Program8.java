 import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns="/labdemo",
		initParams= {
		@WebInitParam(name = "user", value="rvce"),
		@WebInitParam(name = "pass", value="rvce")
		}
		)
public class labdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletConfig sc=getServletConfig();
		
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		
		String username = sc.getInitParameter("user");
		String password = sc.getInitParameter("pass");
		
		if(username.equalsIgnoreCase(user)&& password.equalsIgnoreCase(pass)) {
			out.println("Authentication Successfull");
		}else {
			out.println("Authentication Unsuccessfull");
		}
	}   
}
