<%@page import="com.thinkitive.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Index</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<body>
	<div class="container mt-5">

		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<form action="control" method="post">
					<input type="text" placeholder="Enter name / eid / salary" class="form-control my-2" name="empparam" />
					<select name="opr" class="form-control my-2">
						<option value="1">by Employee ID</option>
						<option value="2">by Employee name</option>
						<option value="3">by Employee salary</option>
					</select>
					<input type="submit" class="btn btn-primary my-4" value="Search" />
					<a href="showall"><input type="button" class="btn btn-primary mx-3 my-4" value="Display All" /></a>
				</form>

				<%
				List<Employee> l = (List<Employee>) request.getAttribute("employeeList");
				if (l != null) {
					out.print("<table class=\"table table-bordered table-dark my-5\"><tr><th>Eid</th><th>Ename</th><th>Salary</th></tr>");
					for (Employee e : l){
						out.print("<tr class=\"\"><td>"+e.getEid()+"</td>"+"<td>"+e.getEname()+"</td>"+"<td>"+e.getSalary()+"</td></tr>");
					}
					out.print("</table>");
				}
				%>
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>

</body>

</html>