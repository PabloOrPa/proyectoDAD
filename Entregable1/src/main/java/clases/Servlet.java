package clases;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet{
	
	private static final long serialVersionUID = 864368910;
	
	private String message;
	private long number;
	
	public void init() throws ServletException{
		message = "Hola mundo 2!";
		number = 0;
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		number++;
		out.println("<body><h1>" + message + "</h1><h2>" + number + "</h2></body>");
	}
	
	public void destroy() {
		// do nothing
	}
}
