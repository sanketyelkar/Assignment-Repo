<%@page import="com.thinkitive.Dictionary"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dictionary Display</title>
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
	<%!
	List<Dictionary> dictList = null;
	%>
	<div class="container">
        <div class="row" style="margin-top:10%">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <table class="table table-bordered table-hover">
                    <tr class="btn-success text-white">
                        <th>Word</th>
                        <th>Meaning</th>
                    </tr>
					<%
					dictList = (List<Dictionary>) request.getAttribute("dictList");
					if (dictList != null) {
						for(Dictionary d: dictList)
							out.println("<tr class='table-success text-dark'><td>"+d.getWord()+"</td><td>"+d.getMeans()+"</td></tr>");
					}
					
					%>
                </table>
            </div>
            <div class="col-md-3"></div>
        </div>
    </div>

</body>
</html>