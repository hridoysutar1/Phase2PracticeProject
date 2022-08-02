package com.phase2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginCheckMain")
public class LoginCheckMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
     public LoginCheckMain() { super();}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname=request.getParameter("usernametxt");
		String pword=request.getParameter("userpassword");
	PrintWriter out=response.getWriter();
		if(uname.equalsIgnoreCase("java") && pword.equals("eclipse123")){
		out.println("You are Welcome");
	}
		else
			out.println("Invalid Username or Password");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("usernametxt");
		String pword=request.getParameter("userpassword");
		PrintWriter out=response.getWriter();
		
		RequestDispatcher rd;
		//username= "hridoy" password="123456"
		if(uname.equalsIgnoreCase("hridoy") && pword.equals("123456")){
			
			HttpSession session=request.getSession(true);//create a new object and store its reference in session object
			session.setAttribute("usernametxt", uname);
		
		rd=request.getRequestDispatcher("ShowWelcome");
		rd.forward(request, response);
		}
		else {
			out.println("Invalid Username or Password Try Again");
			rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}
		

}
