<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student</title>
</head>

<body>

<table border="1">
    <thead>
    <tr>

        <th>Student Name</th>
        <th>Student Age</th>

    </tr>
    </thead>

    <tbody>
    <c:forEach var="list" items="${StudentList}">

        <tr>

            <td>${list.studentName}</td>
            <td>${list.studentAge}</td>

        </tr>

    </c:forEach>
    </tbody>
</table>

</body>

</html>