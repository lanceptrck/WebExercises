<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rooms</title>
</head>
<body>
<c:if test="${rooms[0].capacity >= 0}">
The capacity of ${rooms[0].name} is greater than twenty.	
</c:if>

<c:forEach var="room" items="${rooms }">
	<br/>Room ${room.name} has ${room.capacity } seats. 
</c:forEach>

</body>
</html>