package com.phase2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ShowWelcome")
public class ShowWelcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ShowWelcome() {
        super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		
		String uname=(String)session.getAttribute("usernametxt");
		out.println(" Welcome to The Dashboard  "+uname+" \n");
		out.println();
		out.println("<a href='Logout'>Logout</a>");
	}

}