<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<link href= "webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel = "stylesheet">
		<title>Welcome</title>
	</head>
	
	<body>
		<div class = "container">
			<h1>Todo Management</h1>

			<table class = "table">
				<thead>
					<tr>
						<td><strong>ID</strong></td>
						<td><strong>Name</strong></td>
						<td><strong>Description</strong></td>
						<td><strong>Target Date</strong></td>
						<td><strong>Is Done</strong></td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items = "${todos}" var = "todo"> 
						<tr>
							<td>${todo.id}</td>
							<td>${todo.username}</td>
							<td>${todo.description}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href = "add-todo" class = "btn btn-primary">Add Todo</a>
		</div>
		
		
		
		<script src = "webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
		<script src = "webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>
</html>