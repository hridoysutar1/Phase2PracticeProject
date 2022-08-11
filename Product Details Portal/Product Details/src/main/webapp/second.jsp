<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.practice.Product"%>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Details View</title>

</head>
<body>

	<%
		
	   HttpSession sess=request.getSession();
	   ArrayList<Product> prolist=(ArrayList) sess.getAttribute("prolist");
	%>

	<div align="center">
	<h4>Product Details </h4> <br>
		<table border="1">

			<tr>
				<th>ID</th>
				<th>Name</th>
				
				<th>Price</th>
			</tr>
			<%
				if (!prolist.isEmpty()) {
					Iterator<Product> iterator = prolist.iterator();

					while (iterator.hasNext()) {
						Product pro = iterator.next();
			%>
			<tr>
				<td><%=pro.getId()%></td>
				<td><%=pro.getName()%></td>
				<td><%=pro.getPrice()%></td>
			</tr>
			<%
				}
				}
			%>
		</table>
	</div>

</body>
</html>