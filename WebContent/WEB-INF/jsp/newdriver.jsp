<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form:form action="${pageContext.request.contextPath }/success.htm"
			modelAttribute="driver">
			<table border="1px">
				<tr>
					<td>Id</td>
					<td><form:input path="id" /></td>
					<td style="color: red;"><form:errors path="id" /></td>
				</tr>
				<tr>
					<td>name</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td><form:input path="mobile" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="save"></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>