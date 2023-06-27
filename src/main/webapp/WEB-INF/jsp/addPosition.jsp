<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>CMS</title>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/bootstrap-4.6.2-dist/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/font-awesome-4.7.0/css/font-awesome.min.css" />
</head>
<body>
	<div class="container pt-3">
		<div class="content-title pb-4 border-bottom w-100 mb-4">
			<h2>Add</h2>
		</div>
		<div class="card-header border">ADD POSITION</div>
		<div class="card-body border" style="box-sizing: border-box;">
			<form:form  action="${pageContext.request.contextPath}/home/savePosition" method="Post" modelAttribute="positionDto">
				<div class="form-group px-1">
					<label for="positionId">Position Id</label>
					<form:input type="text" min="0" class="form-control" id="positionId" name = "positionId" placeholder="Input position id" path="positionId"/>
					<p class="text-danger"><form:errors path="positionId" /></p>
				</div>
				<div class="form-group px-1">
					<label for="positionName">Position Name</label>
					<form:input type="text" min="0" class="form-control" id="positionName" name = "positionName" placeholder="Input position name" path="positionName"/>
					<p class="text-danger"><form:errors path="positionName" /></p>
				</div>
				<div class="form-group px-1">
					<label for="expYear">ExpYear</label>
					<form:input type="number" min="0" class="form-control" id="expYear" name = "expYear" placeholder="Input expYear" path="expYear"/>
					<p class="text-danger"><form:errors path="expYear" /></p>
				</div>
				<div class="form-group px-1">
					<label for="id">People Id</label> 
					<form:input type="text"
						name = "peopleId"
						class="form-control" id="id"
						placeholder="People Id"
						maxlength="30"
						path="peopleId"
						/>
					<p class="text-danger"><form:errors path="peopleId" /></p>
				</div>
				<div class="form-group p-2">
					<button type="submit" class="btn btn-success">Submit Button</button>
				</div>
			</form:form>
		</div>
	</div>
	
	<script
		src="${pageContext.request.contextPath}/resources/jquery/jquery-3.6.1.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/bootstrap-4.6.2-dist/js/bootstrap.min.js"></script>
</body>
</html>

