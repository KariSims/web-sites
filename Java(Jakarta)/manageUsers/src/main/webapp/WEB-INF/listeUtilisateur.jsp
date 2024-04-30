<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ page import="beans.Utilisateur" %>
<%@ page import="java.util.ArrayList" %>

<%   
	ArrayList<Utilisateur> utilisateurs = (ArrayList<Utilisateur>) request.getAttribute("utilisateurs");
%>

<%@ include file="inc/header.jsp" %>
  <section>
	    <h1 id= "titre-principal"> Liste des utilisateurs</h1>
	
	    <%
	        if(utilisateurs.isEmpty()) {
	    %>
	        <p class="etat-liste">Désolé, la liste des utilisateurs est vide pour le moment ! <br><br></p>
	        <p class="redirect-liste"> Pour ajouter des utilisateurs, veuillez cliquez sur : <a href="<%= APP_ROOT %>/ajout-utilisateur">Ajouter</a> </p>
	    <%
	        } else {
	    %>
	        <table border="1" cellspacing="0" cellpadding="10">
	            <tr>
	                <th>ID</th>
	                <th>Nom</th>
	                <th>Prénom</th>
	                <th>Password</th>
	                <th colspan="2">Action</th> 
	            </tr>
	            <%
	                for (Utilisateur utilisateur : utilisateurs) {
	            %>
	                <tr>
	                    <td><%= utilisateur.getId() %></td>
	                    <td><%= utilisateur.getNom() %></td>
	                    <td><%= utilisateur.getPrenom() %></td>
	                    <td><%= utilisateur.getPassword() %></td>
	                    <td><a href="modification?id=<%= utilisateur.getId() %>">Modifier</a></td>
	                    <td><a href="suppression?id=<%= utilisateur.getId() %>" onclick="return confirm('En êtes-vous sûr')">Supprimer</a></td>
	                     
	                </tr>
	            <%
	                }
	            %>
	        </table>
	    <%
	        }
	    %>
	</section>
<%@include file="inc/footer.jsp" %>
