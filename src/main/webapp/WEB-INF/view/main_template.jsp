<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<link href="resources/css/bootstrap.css" rel="stylesheet" media="screen">
<link href="resources/css/new_main.css" rel="stylesheet" media="screen">
<script src="resources/js/bootstrap.min.js"></script>
</head>
<body>
	<br />

	<div class="center span12 content-shadow">
		<div class="main-template">
			<!-- change it!!!!!!!!!!!!!!!1 -->
			<input type="button" onclick="location.href='create?new'"
				class="pull-right" value="Register new user">
			<!-- change it!!!!!!!!!!!!!!!1 -->
		</div>

		<div class="main-body">
			<tiles:insertAttribute name="body" />
		</div>
	</div>


</body>
</html>
