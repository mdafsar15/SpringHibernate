<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ntech - ${title }</title>
</head>
<body>

	<%@include file="header.jsp"%>

	<c:if test="${userClickSignUpForm == true }">
		<%@include file="signUpForm.jsp"%>
	</c:if>


	<c:if test="${userClickLogin== true }">
		<%@include file="login.jsp"%>
	</c:if>

	<c:if test="${getContactUsPage== true }">
		<%@include file="contactUs.jsp"%>
	</c:if>

	<c:if test="${getAboutPage== true }">
		<%@include file="about.jsp"%>
	</c:if>
	<c:if test="${userClickOnLogoutPage== true }">
		<%@include file="logoutpage.jsp"%>
	</c:if>

</body>
</html>