<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
    <title>Student Registration Form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName" />

    <br><br>

    Last name: <form:input path="lastName" />

    <br><br>

    Country:
    <form:select path="country">

        <%--<form:option value="India" label="India" />
        <form:option value="France" label="France" />
        <form:option value="Germany" label="Germany" />
        <form:option value="Brazil" label="Brazil" />--%>

        <%--label is display for selection
        value will displayed in output screen--%>

        <form:options items="${student.countryOptions}" />
                <%-- items refer to the collection of data --%>
                <%-- Spring will call student.getCountryOptions --%>
    </form:select>

    <br><br>

    Favorite Language:
    Java <form:radiobutton path="favouriteLanguage" value="Java" />
    C++ <form:radiobutton path="favouriteLanguage" value="C++" />
    PHP <form:radiobutton path="favouriteLanguage" value="PHP" />
    Ruby <form:radiobutton path="favouriteLanguage" value="Ruby" />       <%--On submit, Spring will call student.getFavoriteLanguage--%>

    <br><br>

    Operating Systems: 
    MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
    Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
    Linux <form:checkbox path="operatingSystems" value="Linux" />          <%--On submit, Spring will call student.getOperatingSystems--%>


    <input type="submit" value="Submit" />

</form:form>


</body>

</html>