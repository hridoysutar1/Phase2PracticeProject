<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details Portal</title>
</head>
<body>
<br>
<h3>Product Details Portal</h3> <br>
 <form method="post" action="ProductServlet">
 Enter Id <input type="number" name="id" required > <br>
 Enter Name <input type="text" name="name" required> <br>
 Enter price <input type="number" name="price" required> <br>
 <input type="submit" value="Submit">
 
 </form>

</body>
</html>