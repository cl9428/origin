<%@ page language="java" contentType="text/html; charset=utf-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<%
				int [] arr = {1,2,3,4};
				for(int i:arr){
					
				}
			%>
			<c:forEach items="${sessionScope.plist}" var="p">
				<tr>
					<td>姓名：${p.name }</td>
					<td>年龄：${p.age }</td>
					
				</tr>
			</c:forEach>
		</tr>
		<tr>
		<td>${sessionScope.person.name }</td>
		 ${3 == 3 }huo${3 eq 3  }
		</tr>
	</table>
</body>
</html>