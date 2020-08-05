package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/OddEven")
public class OddEven extends HttpServlet {
    
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
              
        response.setContentType("text/html");
     //  response.getWriter().append("<h4>Please input the number to check :</h4>");
        
        String str= request.getParameter("num");
        int n = Integer.parseInt(str);
        
        if(n%2 ==0) {
        	response.getWriter().println("The given number is even");
        }
        
        else{
        	response.getWriter().println("The given number is odd");
        }
        }
       
        
    
    }
    
