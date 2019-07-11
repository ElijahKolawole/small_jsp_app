import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.PrintWriter;
import java.util.ArrayList;



@WebServlet("/instance")

public class PojoInstance extends HttpServlet{
		  static MyFirstPojo pojo1 = new MyFirstPojo(1, "Adefemi Kolawole");
		   static MyFirstPojo pojo2 = new MyFirstPojo(2, "Olaitan Kolawole");
		    static MyFirstPojo pojo3 = new MyFirstPojo(3, "Faith Kolawole");
		     static MyFirstPojo pojo4 = new MyFirstPojo(4, "Faithful Kolawole");
		      static MyFirstPojo pojo5 = new MyFirstPojo(5, "Adejare Kolawole");
		       static MyFirstPojo pojo6 = new MyFirstPojo(6,"Adekunle Kolawole");
		        static MyFirstPojo pojo7 = new MyFirstPojo(7, "Adedotun Kolawole");
		         static MyFirstPojo pojo8 = new MyFirstPojo(8, "Mummy Kolawole");
		          static MyFirstPojo pojo9 = new MyFirstPojo(9, "Daddy Kolawole");
		           static MyFirstPojo pojo10 = new MyFirstPojo(10, "Adekunle Kolawole");

	@Override
	public void doGet(HttpServletRequest rq, HttpServletResponse rs)throws IOException, ServletException{
		ArrayList<MyFirstPojo> pojo = new ArrayList<>();
		pojo.add(pojo1);
		pojo.add(pojo2);
		pojo.add(pojo3);
		pojo.add(pojo4);
		pojo.add(pojo5);
		pojo.add(pojo6);
		pojo.add(pojo7);
		pojo.add(pojo8);
		pojo.add(pojo9);
		pojo.add(pojo10);
		rs.setContentType("text/html");
		PrintWriter out = rs.getWriter();
		out.println("<html>");
		out.println("<head><title>Welcome Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Instance of POJO</h1>");
		out.println("<hr>");
		out.println("<p>Name: " + pojo3.getName() + "</p>");

		out.println("<hr>");
		for(MyFirstPojo object : pojo){
			//out.println("<p>Name: " + object.getName() + "</p>");
			out.println("<p> " + object.toString() + " </p>");
		}
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

