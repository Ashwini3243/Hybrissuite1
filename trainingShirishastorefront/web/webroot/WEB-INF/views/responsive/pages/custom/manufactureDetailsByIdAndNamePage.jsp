<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 2/11/2021
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
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
<h2 align="center" >Manufacture Details Data !!!</h2>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Country</th>
    </tr>
    <tr>
        <td>${dataByIdAndName.id}</td>
        <td>${dataByIdAndName.name}</td>
        <td>${dataByIdAndName.country.name}</td>
    </tr>
</table>
</body>
</html>

