<%--
  Created by IntelliJ IDEA.
  User: luo
  Date: 2020/4/22
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

           <table cellpadding="0" cellspacing="0" border="1"  align="center"  width=500>
             <tr width="10px" height="1px">
                 <td>编号</td >
                 <td>内容</td>
                 <td>图片内容</td>
             </tr>
           <c:forEach items="${qqq}" var="a">
               <tr >
                   <td>${a.id}</td>
                   <td>${a.title}</td>
                   <td>${a.image}</td>
               </tr>
           </c:forEach>
            </table>

</body>
</html>
