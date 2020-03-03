<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>NTech</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>

	<%@ include file="alienHeader.jsp"%>

	<div class="container">

		<div class="panel panel-info">
			<div class="panel-heading">Alien Details.........</div>
			<div class="panel-body">
	
				<ul>
					<li>Register Id: <b>${all.alienId }</b></li>
					<li>Fullname : <b>${all.fullname }</b></li>
					<li>EMail: <b>${all.email }</b></li>
					<li>Gender : <b>${all.gender }</b></li>
					<li>Specialization: <b>${all.specialization }</b></li>
					<li>Hobbies: <b>${all.hobbies }</b></li>
				</ul>
			</div>
		</div>

	</div>
</body>
</html>