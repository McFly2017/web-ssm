<%--
  Created by IntelliJ IDEA.
  User: Notes
  Date: 2017/5/2
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${userList}</title>
</head>
<body>
新增：<br><form action="/user/add">
    ID:<input type="text" name="id"><br>
    userName:<input type="text" name="userName"><br>
    userEmail:<input type="text" name="userEmail"><br>
    <input type="submit" value="提交">
</form><br>
删除：<br><form action="/user/delete">
    输入要删除的ID：<input type="text" name="id"><input type="submit" value="提交"><br>
</form><br>
</body>
</html>
