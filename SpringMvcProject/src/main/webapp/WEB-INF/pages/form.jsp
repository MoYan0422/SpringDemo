<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Form</h2>
	<form action="hello2.controller" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="userName" /></td>
				<td>${errors.name}</td>
			</tr>
			<tr>
				<td><input type="submit" value="Send" /></td>
			</tr>
		</table>
	</form>

</body>
</html>