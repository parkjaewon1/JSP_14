<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title></head><body>
<%
	Cookie cook = new Cookie("id", "kildong");
	response.addCookie(cook);
%>
<h2>쿠키 생성되었습니다</h2>
<a href="cookUse.jsp">쿠키 보기</a>
</body>
</html>