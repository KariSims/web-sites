<%@ page language="java" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Table de Multiplication</title>
</head>
<body>
	<h1>Table de Multiplication</h1>
	<% 
		String nombre = request.getParameter("nombre");
	
		if (nombre!=null) {
	    	int table = Integer.parseInt(nombre);
	
	    	out.print("<h1> Table de " + nombre + "</h1>");
	    	
	    	
		    for(int i = 1; i <= 10; i++)
		    {
		    	for(int j = 1; j <= table; j++){
		    		out.print(" | " + j + " x " + i + " = " + (j * i) );
		    	}
		    	out.print("<br>");
	    	}
		}
		else
		{
			out.print("Veuillez saisir un nombre en parametre");
		}
	%>
</body>
</html>