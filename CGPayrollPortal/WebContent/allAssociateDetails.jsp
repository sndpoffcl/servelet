<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<div>
		<form name="registerForm" action="allAssociateDetails" method="post" >
			<button type="submit" >Click to get all the Associate Details</button>
			</form>
	</div>
	<div>
	 <s:forEach var="abc" items="${requestScope.associate}"> 
	 		${abc}<br>
		</s:forEach>	
	</div>
</body>
</html>