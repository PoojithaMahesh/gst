package gst1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TNServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	String brand=req.getParameter("brand");
	
	ServletContext context=getServletContext();
	double cgst=Double.parseDouble(context.getInitParameter("cgst"));
	
	ServletConfig config=getServletConfig();
	double sgsttn=Double.parseDouble(config.getInitParameter("sgsttn"));

	
	System.out.println("Kar"+config.getInitParameter("sgstkar"));
	System.out.println(id);
	System.out.println(name);
	System.out.println(brand);
	
	System.out.println("yes i got cgst in tn servlet also "+cgst);
	System.out.println("yes i got sgst of tn"+sgsttn);
}
}
