<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% String messageRecu = (String) request.getAttribute("message"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css"></style>
<title>Insert title here</title>
</head>
<body>
	<h1>Conjugaison au premier groupe</h1>
	<h2>Message reçu : </h2>
	<p><%= messageRecu %></p>
	<form method="post">
		<fieldset>
			<legend>Conjugaison</legend>
			<label>Verbe</label>
			<input type="text" name="verbe">
			<input type="submit" value="Conjuguer">
		</fieldset>
	</form>
</body>
</html>