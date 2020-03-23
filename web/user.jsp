<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 23.03.2020
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User</title>
</head>
    <body>
        <c:forEach var="user" items="${users}">
            <p>${user.login} ${user.password}</p>
        </c:forEach>
    </body>
</html>
