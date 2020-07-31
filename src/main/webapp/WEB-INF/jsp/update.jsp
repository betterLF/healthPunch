<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/31
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>修改员工信息</title>
</head>
<body>
<form:form action="${pageContext.servletContext.contextPath}/emp" method="post" modelAttribute="emp">
    <input type="hidden" name="_method" value="PUT"/>
    <form:hidden path="eid"/>
    <table>
        <tr>
            <th colspan="2">修改员工信息</th>
        </tr>
        <tr>
            <td>姓名</td>
            <td>
                <form:input path="ename"/>
            </td>
        </tr>
        <tr>
            <td>年龄</td>
            <td>
                <form:input path="age"/>
            </td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <form:radiobuttons path="sex" items="${sex}"/>
            </td>
        </tr>
        <tr>
            <td>部门序号</td>
            <td>
                <form:radiobuttons path="did" items="${deptList}"/>
            </td>
        </tr>
        <tr>
            <td colspan="2"></td>
            <td>
                <input type="submit" value="修改">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
