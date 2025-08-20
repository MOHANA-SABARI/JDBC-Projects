<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
 <%@ taglib uri="jakarta.tags.core" prefix="exter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<exter:out value="Welcome to Jakarta Standard Tag Library"></exter:out>

<exter:set var="answer" value="120"></exter:set>
<h1>The value in the variable is <exter:out value="${answer}"></exter:out></h1>


<exter:set var="age" value="-19"></exter:set>
<exter:if test="${age>=0}">
	<h1>This is if part</h1>
	<h1>Value is Positive</h1>	
</exter:if>

<h1><exter:out value="to Print the Values"></exter:out></h1>
<exter:forEach var="i" begin="1" end="5">
	<p><exter:out value="Value of i = ${i}" /></p>
</exter:forEach>
<exter:if test="${age<0}">
	<h1>This is next if part</h1>
	<h1>Value is Negative</h1>
</exter:if>
<exter:set var="age" value="19"></exter:set>
<exter:choose>
<exter:when test="${age>=18}">
<h1>Eligible for vote</h1>
</exter:when>
<exter:when test="${age<18}">
<h1>Not eligible for vote</h1>
</exter:when>
<exter:otherwise>
<h1>Please enter the valid input</h1>
</exter:otherwise>
</exter:choose>

<exter:url var="myurl" value="https://github.com/MOHANA-SABARI?tab=repositories">

<exter:param name="q" value="java"></exter:param>
</exter:url>

<exter:out value="${myurl}" ></exter:out>

<exter:redirect url="${myurl}"></exter:redirect>

</body>
</html>