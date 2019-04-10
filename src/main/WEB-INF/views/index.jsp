<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="common/common.jsp" %>
<!DOCTYPE html>
<html>
<head>
<c:set var="basePath" value="${pageContext.request.contextPath }"/>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>WELCOME TO COFFEE KONG.</title>
</head>
<body>
	<div>
	<!-- header start-->
		<div id="header">
			<jsp:include page="./header.jsp"/>
		</div>
	<!-- header end-->
	<!-- content start -->
		<div id="content">
			<jsp:include page="${content}"/>
		</div>
	<!-- content end -->
	<!-- footer start -->
		<div id="footer">
			<jsp:include page="./footer.jsp"/>
		</div>
	<!-- footer start -->
	</div>
</body>
</html>