
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.PrintWriter;


@WebServlet("/smallwelcometwo")

public class WelcomeServletTwo extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest rq, HttpServletResponse rs)throws IOException, ServletException{
		rs.setContentType("text/html");
		PrintWriter out = rs.getWriter();
		out.println("<html>");
		out.println("<head><title>Welcome Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Welcome Servlet</h1>");
		out.println("<hr>");
		out.println("<p>Request URI: " + rq.getRequestURI() + "</p>");
		out.println("<p>Request Protocol: " + rq.getProtocol() + "</p>");
		out.println("<p>Request PathInfo: " + rq.getPathInfo() + "</p>");
		out.println("<p>Request Remote Address: " + rq.getRemoteAddr() + "</p>");
		out.println("<hr>");
		out.println("<p>Your Unique ID: <strong>" + Math.random() + "</strong></p>");
		out.println("<a href='/smallapp'>Back to homepage</a>");
		out.println("</body></html>");
		out.close();//close output writer
	}


}

