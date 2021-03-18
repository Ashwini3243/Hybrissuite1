<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 2/11/2021
  Time: 6:01 PM
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
     .pagination {
         display: inline-block;
     }

    .pagination a {
        color: blue;
        float: left;
        padding: 8px 16px;
        text-decoration: none;
        transition: background-color .3s;
    }

    .pagination a.active {
        background-color: #4CAF50;
        color: white;
    }

    .pagination a:hover:not(.active) {background-color: #ddd;}
</style>
<body>
<h2 align="center" >Manufacture Details Data !!!</h2>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Country</th>
    </tr>
    <c:forEach items="${paginationData}" var="manufacturePagination">
        <tr>
            <td>${manufacturePagination.id}</td>
            <td>${manufacturePagination.name}</td>
            <td>${manufacturePagination.country.name}</td>
        </tr>
    </c:forEach>
</table>
<h2>Click below links for more info...</h2>
<div class="pagination">
<c:forEach var="i" begin="0" end="15">
    <a href="../allManufactureData/${i}">${i}</a>
</c:forEach>
</div>
</body>

