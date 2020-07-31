<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/30
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
<script>
    $(function () {
$("#selectAll").click(function () {
          $("[name='eid']").prop("checked",$(this).prop("checked"));
         });
$("#deleteMore").click(function () {
$("form").attr("action",$(this).attr("href")).submit();
return false;
});
    });

</script>
<head>
    <title>展示员工信息</title>
</head>
<body>
<form method="post">
    <input type="hidden" name="_method" value="DELETE"/>
  <table>
      <tr>
          <th>
              <input type="checkbox" id="selectAll"/>
          </th>
          <th>EID</th>
          <th>ENAME</th>
          <th>AGE</th>
          <th>SEX</th>
          <th>DEPARTMENT</th>
          <th>OPTIONS</th>
      </tr>
      <c:forEach items="${allEmp}" var="emp">
          <tr>
              <td>
                  <input type="checkbox" name="eid" value="${emp.eid}"/>
              </td>
              <td>${emp.eid}</td>
              <td>${emp.ename}</td>
              <td>${emp.age}</td>
              <td>${emp.sex}</td>
              <td>${emp.did}</td>
              <td>
                  <a href="${pageContext.servletContext.contextPath}/emp">删除</a>
                  <a href="${pageContext.servletContext.contextPath}/emp/${emp.eid}">修改</a>
              </td>
          </tr>
      </c:forEach>
  </table>
    <tr>
    <td colspan="10"></td>
        <a id="deleteMore" href="${pageContext.servletContext.contextPath}/emps">批量删除</a>&nbsp
   ${page}
    </tr>
</form>
</body>
</html>
