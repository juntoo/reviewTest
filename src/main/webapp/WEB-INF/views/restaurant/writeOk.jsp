<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글작성</title>
</head>
<body>
	<c:set var="root" value="${pageContext.request.contextPath}"/>
	
	<c:if test="${check > 0 }">
		<script type="text/javascript">
			alert("글 작성이 완료 되었습니다.");
			location.href="${root}/restaurant/main.do"
		</script>
	</c:if>
	
	<c:if test="${check == 0 }">
		<script type="text/javascript">
			alert("글 작성이 되지 않았습니다.");
			location.href="${root}/restaurant/write.do"
			
		</script>
	</c:if>
	
</body>
</html>