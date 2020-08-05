package p1;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int x = 5;
			
		//response.setContentType("text/html");
		//response.getWriter().append("<h1>Hello This is Factorial Progam </h1>");
        
        int fact = 1;
       // System.out.println("HI");
        while( x>=1) {
        	fact=fact*x;
        	x=x-1;
        }
       request.setAttribute("factorial",fact); 
       // response.getWriter().println("the factorial is"+fact);;	
        RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
        rd.forward(request,response);
        
        
        
    
        
	}
        
      
		



	

}
