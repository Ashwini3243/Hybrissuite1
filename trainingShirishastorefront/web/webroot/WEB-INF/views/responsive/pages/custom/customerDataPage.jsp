<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 3/5/2021
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    table,th,td{
        border: 1px solid black;
    }
    table{
        width:50%;
        text-align: center;
        border-collapse: collapse;
        margin-left: auto;
        margin-right: auto;
    }
    th,td{
        padding: 15px;
        border-bottom: 1px solid #ddd;
    }
    tr:hover {background-color:lightgrey;}
    th{
        background-color: #2a85a0;
        color: white;
    }
    body{
        background-color:white ;
    }
</style>
<body>
<h2 align="center" >Last 10 days Customer Data !!!</h2>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Is new Customer</th>
    </tr>
    <c:forEach items="${lastCustomerDetails}" var="customerData">
        <tr>
            <td>${customerData.id}</td>
            <td>${customerData.name}</td>
            <td>${customerData.isNewCustomer}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
