<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>



<html>
	<head>
		<link href= "webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel = "stylesheet">
		<title>Welcome</title>
	</head>
	
	<body>
		<div class = "container">
			<h1>Add Todo</h1>
			
			<form:form method = "POST" modelAttribute="todo">
				<fieldset class = "mb-3">
					<form:label path="description">Description</form:label>
					<form:input type = "text" path = "description" required="required"/>
					<form:errors class = "text-warning" path = "description"/>
				</fieldset>
				
				<fieldset class = "mb-3">
					<form:label path="targetDate">Target Date</form:label>
					<form:input type = "text" path = "targetDate" required="required"/>
					<form:errors class = "text-warning" path = "targetDate"/>
				</fieldset>
				
				
				<form:input type = "hidden" path = "id"/>
				<form:input type = "hidden" path = "done"/>
				<input type= "submit" class = "btn btn-primary">
			</form:form>
		</div>
		
		
		
		<script src = "webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
		<script src = "webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>
</html>