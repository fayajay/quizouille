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

                <p class="ennonce">Question n° : <input class="ordre" type="text" name="ordre"/>
                    Ennoncé Question  : <textarea class="question" type="text" name="ennonce"></textarea></p>
                <p class="reponse">
                    Réponse 1 : <textarea class="reponse" type="text" name="reponse1"></textarea>
                    Réponse 2 : <textarea class="reponse" type="text" name="reponse2"></textarea>
                    Réponse 3 : <textarea class="reponse" type="text" name="reponse3"></textarea>
                    Réponse 4 : <textarea class="reponse" type="text" name="reponse4"></textarea>
                </p>
                <p class="reponseCorrect">Réponse Correcte : <input type="text" name="numReponseCorrecte"/></p>

                <br/>
                <br/>
                <input class="inputQuestion" type="submit" value="continuer"/>
            </form>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>

    </body>
</html>
