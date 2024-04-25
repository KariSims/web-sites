<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ajouter Utilisateur</title>
</head>
<body>
    <h1>Ajouter Utilisateur</h1>
    <form action="ajouterUtilisateur" method="post">
        <label for="prenom">Prénom :</label>
        <input type="text" id="prenom" name="prenom"><br><br>
        
        <label for="nom">Nom :</label>
        <input type="text" id="nom" name="nom"><br><br>
        
        <label for="email">Email :</label>
        <input type="email" id="email" name="email"><br><br>
        
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ajouter Utilisateur</title>
</head>
<body>
    <h1>Ajouter Utilisateur</h1>
    <form action="ajouterUtilisateur" method="post">
        <label for="prenom">Prénom :</label>
        <input type="text" id="prenom" name="prenom"><br><br>
        
        <label for="nom">Nom :</label>
        <input type="text" id="nom" name="nom"><br><br>
        
        <label for="email">Email :</label>
        <input type="email" id="email" name="email"><br><br>
        
        <label for="mdp">mot de passe :</label>
        <input type="password" id="mdp" name="mdp"><br><br>
        
        <label for="mdp-conf">confirmer mot de passe :</label>
        <input type="password" id="mdp-conf" name="mdp-conf"><br><br>
        
        <input type="submit" value="Ajouter">
    </form>
</body>
</html>
        
        
        <input type="submit" value="Ajouter">
    </form>
</body>
</html>
