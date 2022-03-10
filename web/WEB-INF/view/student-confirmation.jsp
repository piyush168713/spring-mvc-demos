<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>
    <title>Student Registration</title>
</head>

<body>
<h2>The Student is confirmed: ${student.firstName} ${student.lastName} </h2>

<br><br>

<h3> Country: ${student.country} </h3>

<br><br>

<h3> Favourite Language: ${student.favouriteLanguage}</h3>       <%-- spring will call student.getFavouriteLanguage() --%>

<br><br>

<h3>Operating System:</h3>

<ul>
    <c:forEach var="temp" items="${student.operatingSystems}" >

        <li> ${temp} </li>

    </c:forEach>
</ul>



</body>

</html>


