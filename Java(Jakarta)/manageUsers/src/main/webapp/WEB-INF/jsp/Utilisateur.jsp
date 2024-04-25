<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des utilisateurs</title>
</head>
<body>
    <h1>Liste des utilisateurs</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Prénom</th>
            <th>Nom</th>
            <th>Email</th>
        </tr>
        <c:forEach items="${utilisateur}" var="utilisateur">
            <tr>
                <td>${Utilisateur.id}</td>
                <td>${Utilisateur.prenom}</td>
                <td>${Utilisateur.nom}</td>
                <td>${Utilisateur.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
