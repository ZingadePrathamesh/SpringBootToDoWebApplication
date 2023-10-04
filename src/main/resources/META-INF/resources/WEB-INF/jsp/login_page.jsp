

<html>
	<head>
		<link href= "webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel = "stylesheet">
		<title>Login</title>
	</head>
	
	<body>
		<div class = "container">
			<h2>LOGIN</h2>
			<h4>Kindly enter the credentials</h4>
			<hr>
			<h5>${error_msg}</h5>
			<form method = "POST">
				Name: <input type = "text" name = "name">
				Password: <input type = "password" name = "password"> 
				<input type = "submit">		
			</form>
		</div>
		
	</body>
</html> 