<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Manager Here </title>
</head>
<body>

    <div align="center">
        <h1>Contact List</h1>
        <table border ="1" cellpadding ="5">
            <tr>
                <th>No</th>
                <th>Name</th>
                <th>Email</th>
                <th>Address</th>
                <th>Phone</th>
                <th>Action</th>
                    
                 
            </tr>
            <c:forEach items ="${listContact}" var = "contact" varStatus ="status">
            </c:forEach>
               
        </table>
         
    </div>




</body>
</html>