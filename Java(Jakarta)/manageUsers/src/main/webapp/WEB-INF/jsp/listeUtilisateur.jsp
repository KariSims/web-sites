<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des Utilisateurs</title>
</head>
<body>
    <h1>Liste des Utilisateurs</h1>
    <table border="1">
        <tr>
            <th>Prénom</th>
            <th>Nom</th>
            <th>Email</th>
        </tr>
        <c:forEach var="utilisateur" items="${listeUtilisateurs}">
            <tr>
                <td>${utilisateur.prenom}</td>
                <td>${utilisateur.nom}</td>
                <td>${utilisateur.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
