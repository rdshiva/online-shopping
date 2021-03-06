<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shop - ${title}</title>

<script>
	window.menu = '${title}';

	window.contextRoot = '${contextRoot}'
</script>

<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Datatable  JavaScript -->
<script src="${css}/dataTables.bootstrap.css"></script>

<!-- Custom CSS -->
<link href="${css}/myapp.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div class="navbar-header">
		<a href="${contextRoot}/home">Home</a>
		
	</div>
	
	<div>
		<h1>${errorTitle }</h1>
	</div>
	<div>
		<blockquote>
			${errorDescription }
		</blockquote>
	</div>
	
	
	<!-- Footer -->
	<%@include file="./shared/footer.jsp"%>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="${js}/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="${js}/bootstrap.min.js"></script>

	<!-- datatable -->
	<script src="${js}/jquery.dataTables.js"></script>

	<!-- datatable - style change -->
	<script src="${js}/dataTables.bootstrap.js"></script>

	<!-- highlight/bold the text when clicked JavaScript -->
	<script src="${js}/highlightonclick.js"></script>

</body>

</html>
