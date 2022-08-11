package com.practice;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProductServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			int price=Integer.parseInt(request.getParameter("price"));
			Product pro=new Product(id,name,price);
			ArrayList<Product> list=pro.info();
			
			HttpSession session=request.getSession();
			session.setAttribute("prolist",list);
			
			response.sendRedirect("second.jsp");
			
			
			
		}catch(Exception e) {
			
		}
	}

}
