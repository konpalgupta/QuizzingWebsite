<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<meta http-equiv="X-UA-Compatible" content="ie=edge">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	<title>Online Quiz</title>
</head>
<body class = "bg-dark">

	<nav class = "navbar navbar-dark navbar-expand-sm bg-dark">
		<div class = "container">
			<span class = "navbar-brand">Online Quiz</span>
			<ul class = "navbar-nav">
				<li class = "nav-item">
					<a href="index.html" class = "nav-link">Home</a>
				</li>
				<li class = "nav-item">
					<a href="quizes.html" class = "nav-link">Take Quiz</a>
				</li>
				<li class = "nav-item">
					<a href="index.html" class = "nav-link">Register</a>
				</li>
			</ul>
		</div>
	</nav>
	
	<div class = "container my-5 bg-light py-5" style = "width: 400px;">
		<h2 align = "center">Login</h2>
		<form class = "mt-5" action = "Login" method = "post">
            <div class="form-group">
                <label for="name">Email</label>
                <input type="email" name="email" class="form-control form-control-sm" placeholder="Enter email">
            </div>
            <div class="form-group">
                <label for="name">Password</label>
                <input type="password" name="pass" class="form-control form-control-sm" placeholder="Enter password">
            </div>
            <button class="btn btn-dark" type="submit">Submit</button>
		</form>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</body>
</html>