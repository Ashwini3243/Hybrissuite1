<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 2/22/2021
  Time: 1:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style type="text/css">
    .error {
        color: red;
    }
    body{
        background-image: url("https://cdn5.vectorstock.com/i/1000x1000/48/19/abstract-wavy-background-blue-wave-vector-26174819.jpg");
        background-repeat: no-repeat;
        background-size: 1350px 650px;
    }
    .required{
        color: red;
    }
    .reg{

        color: deepskyblue;
        text-align: center;
    }
    a:link, a:visited {
        background-color: white;
        color: black;
        padding: 10px 22px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
    }

    a:hover, a:active {
        background-color: white;
    }
</style>

<c:url value="/manufactureDetailsSave" var="formUrl"/>
<form:form modelAttribute="manufactureDetailsForm" action="${formUrl}" method="post">
    <h2 class="reg"> Manufacture Details Form</h2>
    <table align="center">

        <tr>
            <td>Id:</td>
            <td><form:input path="id" placeholder="Enter manufacture Id"/></td>

        </tr>
        <tr>
            <td>Name:</td>
            <td><form:input path="name" placeholder="Enter name"/></td>
        </tr>

        <tr>
            <td>Country:</td>
            <td><form:input path="country" placeholder="country"/></td>
            <%--<td><form:select path="country">--%>
               <%-- <form:options items="${country}"/>
            </form:select></td>--%>
        </tr>

        <tr>
            <td><input type="submit" value="save"></td>
        </tr>
    </table>
</form:form>
