 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new Computer</title>
</head>
<body>

<h1>Insert new computer</h1>
<form action="InsertComServlet" method="post">
	Name <input type="text" name="ComName"/><br>
	Producer <input type="text" name="Producer"/><br>
	Price <input type="text" name="Price"/><br>
	description <input type="text" name="Description"/><br>
	<button>Submit</button>
</form>
</body>
</html>