
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class SquareServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int sum=(int) req.getAttribute("sum");
		int squar=sum*sum;
		PrintWriter out=res.getWriter();
		out.println("Square of number is"+squar);
	}
}