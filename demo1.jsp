<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>travel</title>
</head>
<body>
	<h1>welcome to page</h1>
	<form action="data_fetching.java" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="u_name"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="u_Pass"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td><input type="submit" value="register"></td>
			</tr>
		</table>
	</form>
</body>
</html>