<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
    <%if(request.getAttribute("msg")!=null){%>
    alert("用户名和密码错误！！！");
    <%}%>
</script>
</head>
<body>
<br><br><br><br><br>
<form id="formId" action="TestServlet1" method="post">
    <table align="center">
        <tr><td>userName:</td><td><input type="text" id="name" name="name"></td></tr>
        <tr><td>pwd:</td><td><input type="password" id="password"></td></tr>
        <tr><td><input type="submit" value="login" /></td></tr>
    </table>
</form>
</body>
</body>
</html>
