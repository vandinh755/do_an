
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>register</title>
        <link href="css/cssCustomer.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Register</h1>
        <mvc:form modelAttribute="customer" action="register" method="post">
            <table>
                <tr>
                    <td>Fiest Name(*):</td>
                    <td><mvc:input path="firstname" required="true"/></td>
                </tr>
                <tr>
                    <td> Name(*):</td>
                    <td><mvc:input path="name" required="true"/></td>
                </tr>
                <tr>
                    <td>Email(*):</td>
                    <td><mvc:input path="" required="true"/></td>
                </tr>
                <tr>
                    <td>Address(*):</td>
                    <td><mvc:input path="address" required="true"/></td>
                </tr>
                <tr>
                    <td>Sex(*):</td>
                    <td><mvc:select path="sex" items="${sexed}"/></td>
                </tr>
                <tr>
                    <td>Phone(*):</td>
                    <td><mvc:input path="phone" required="true"/></td>
                </tr>
                <tr>
                    <td>User</td>
                    <td><mvc:input path="user" required="true"/></td>
                </tr>
                <tr>
                    <td>Passwork</td>
                    <td><mvc:input path="passwork" required="true"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Register"></td>
                </tr>
            </table>
        </mvc:form>
    </body>
</html>