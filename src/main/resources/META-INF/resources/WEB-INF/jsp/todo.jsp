<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<link href= "webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel = "stylesheet">
		<title>Welcome</title>
	</head>
	
	<body>
		<div class = "container">
			<h1>Add Todo</h1>
			
			<form method = "POST">
				Description: <input type = "text" name = "description">
				<input type= "submit" class = "btn btn-primary">
			</form>
		</div>
		
		
		
		<script src = "webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
		<script src = "webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>
</html>