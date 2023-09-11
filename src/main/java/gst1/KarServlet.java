package gst1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KarServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	String brand=req.getParameter("brand");
	
	ServletContext context=getServletContext();
	
	double cgst=Double.parseDouble(context.getInitParameter("cgst"));
	
	
	ServletConfig config=getServletConfig();
//	double sgstoftn=Double.parseDouble(config.getInitParameter("sgsttn"));
	double sgstofkar=Double.parseDouble(config.getInitParameter("sgstkar"));
	
	
	System.out.println(id);
	System.out.println(name);
	System.out.println(brand);
	System.out.println("yes finally u got central gst"+cgst);
	System.out.println("yes finally i got sgst of kar"+sgstofkar);
	System.out.println("yes finally i got sgst of tn"+config.getInitParameter("sgsttn"));
	
	}
}
