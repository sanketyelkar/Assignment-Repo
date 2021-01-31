<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index for Dictionary</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

</head>
<body class="alert-dark">
	<div class="container">
		<div class="row my-5">
			<div class="container">
				<a href="displayer"><button class="btn btn-success w-100 py-4" style="font-size: x-large;">Display Dictionary</button></a>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<form action="dictionarycontroller" method="post">
					<input type="text" placeholder="Enter word" class="form-control my-3" name="word" />
					<input type="text" placeholder="Enter description" class="form-control my-3" name="means" />
					<select name="operation" class="form-control my-3">
						<option selected value="1">Add</option>
						<option value="2">Search</option>
						<option value="3">Delete</option>
					</select>
					<input type="submit" value="Submit" class="btn btn-primary my-2" />
				</form>
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>
</body>
</html>




