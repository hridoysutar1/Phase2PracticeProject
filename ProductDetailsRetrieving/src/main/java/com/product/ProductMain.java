package com.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductMain")
public class ProductMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int id=Integer.parseInt(request.getParameter("productid"));
		//String id=request.getParameter("productid");
		
		
		try {
			
			     Connection con=DbConnection.getMyConnection();
				
				
				
				
			     PrintWriter out=response.getWriter();
				
				String qrycount="select count(*) from productdetails";
				Statement  ps=con.createStatement();
				//get ResultSet
				ResultSet counti=ps.executeQuery(qrycount);
				counti.next();
				int c=counti.getInt(1);
				if(id>c||id<1) {
					out.println("Invalid product id ");
					
				}else {
				
				String qry="select * from productdetails where  productid="+id;
				ResultSet ans =ps.executeQuery(qry);
				//int count=ps.getFetchSize();
				
				//next method checks for nextrecord
				
				
				
				ans.next();
				out.println("<table border=2>");
				out.println("<tr><th>productid</th><th>name</th><th>price</th></tr>");
				//To read values from ResultSet
				
					out.println("<tr>");
					out.print("<td>"+ans.getInt("productid")+"</td>");
					out.print("<td>"+ans.getString("name")+"</td>");
					out.print("<td>"+ans.getInt("price")+"</td>");
					out.println("</tr>");
				
				out.println("</table>");}
			
				con.close();
			
		
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}