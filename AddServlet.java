import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int sum=i+j;
		req.setAttribute("sum", sum);
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
		System.out.println(sum);
		PrintWriter out=res.getWriter();
		out.println("Sum is "+sum);
	}
}
