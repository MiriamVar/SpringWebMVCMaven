<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title><Student Confirmation</title>
</head>
<body>
The student is comfirmed: ${student.firstName} ${student.lastName}
<br> <br>
Country: ${student.country}
<br><br>
Favourite language: ${student.favouriteLanguage}

<br><br>
Operating system:
<ul>
    <c:forEach var="temp" items="${student.operatingSystem}">
        <li> ${temp} </li>
    </c:forEach>
</ul>

</body>
</html>