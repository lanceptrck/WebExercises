<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add to cart</title>
<%@ include file ="add_to_cart.html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>

<h2>What's in Your Cart:</h2>
<c:choose>
     <c:when test="${cart == null || cart.size() < 1 }" >
        <p>Your cart is empty.</p>
    </c:when>
    <c:otherwise>
        <table>
            <tr>
                <th>Product</th>
                <th>Quantity</th>
            </tr>            
            <c:forEach var="entry" items="${cart.entrySet() }">
                <tr>
                    <td>${entry.key }</td>
                    <td>${entry.value }</td>
                </tr>
            </c:forEach>            
        </table>
    </c:otherwise>
</c:choose>

<c:catch var ="catchException">
    <% int x = 5/0;%>
</c:catch>

<c:if test = "${catchException != null}">
    <p>The exception is : ${catchException} <br />
    There is an exception: ${catchException.message}</p>
</c:if>

</body>
</html>