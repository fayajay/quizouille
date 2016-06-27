<%-- 
    Document   : _TEMPLATES
    Created on : 24 juin 2016, 14:51:47
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>QUIZZ</title>
        <c:import url="_STYLESHEET.jsp"/>
    </head>
    <body>
        <div class="titre">
            <c:import url="_TITRE.jsp"/>
        </div>
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>
        <div class="contenu">
            <form method="post">
            
            Ennoncé Question 1 : <input type="text" name="titre"/>
            Réponse 1 : <input type="text" name="reponse1"/>
            Réponse 2 : <input type="text" name="reponse2"/>
            <br/>
            Réponse 3 : <input type="text" name="reponse3"/>
            Réponse 4 : <input type="text" name="reponse4"/>
            <br/>
            <br/>
            Ennoncé Question 2 : <input type="text" name="titre"/>           
            Réponse 1 : <input type="text" name="reponse1"/>
            Réponse 2 : <input type="text" name="reponse2"/>
            <br/>
            Réponse 3 : <input type="text" name="reponse3"/>
            Réponse 4 : <input type="text" name="reponse4"/>
            <br/>
            <br/>
            Ennoncé Question 3 : <input type="text" name="titre"/>
            Réponse 1 : <input type="text" name="reponse1"/>
            Réponse 2 : <input type="text" name="reponse2"/>
            <br/>
            Réponse 3 : <input type="text" name="reponse3"/>
            Réponse 4 : <input type="text" name="reponse4"/>
            <br/>
            <br/>
            Ennoncé Question 4 : <input type="text" name="titre"/>
            Réponse 1 : <input type="text" name="reponse1"/>
            Réponse 2 : <input type="text" name="reponse2"/>
            <br/>
            Réponse 3 : <input type="text" name="reponse3"/>
            Réponse 4 : <input type="text" name="reponse4"/>
            <br/>
            <br/>
            <input type="submit" value="continuer"/>
             </form>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
        
    </body>
</html>
