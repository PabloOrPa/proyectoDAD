package paqueteNoPorDefecto;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletSimple extends HttpServlet{
	// Un Servlet es un servicio que se despliega en un servidor web
	
	private static final long serialVersionUID = 864368909;
	
	private String message;
	private long number;
	
	// Esto se ejecuta cuando se inicia el Servlet
	public void init() throws ServletException{
		message = "Hola mundo";
		number = 0;
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		number++;
		out.println("<body><h1>" + message + "</h1><h2>" + number + "</h2></body>");
	}
	
	public void destroy() {
		// do nothing
	}	
}
