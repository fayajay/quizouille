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
            <p class="presentation">Bienvenue dans l'ultimate Quiz, the place to Quiz, Sensations extrêmes, 
                réponses impossibles, tensions maximales, du sang, de la sueur et des larmes
                vous attendent ici !!!!
            </p>
            <div id="quiz">
            <a class="quizMenu" href="quizCuisine.jsp">
                <figure>
                    <img src="CSS/img/mega_sand.jpg" width="400" height="300"/>
                    <figcaption>CUISINE</figcaption>
                </figure>
            </a>
            <a class="quizMenu" href="quizAnimaux.jsp">
                <figure>
                    <img src="CSS/img/animaux.jpg" width="400" height="300"/>
                    <figcaption>ANIMAUX</figcaption>
                </figure>
            </a>
            <a class="quizMenu" href="quizHistoire.jsp">
                <figure>
                    <img src="CSS/img/histoire.jpg" width="400" height="300"/>
                    <figcaption>HISTOIRE</figcaption>
                </figure>
            </a>
            <a class="quizMenu" href="quizSport.jsp">
                <figure>
                    <img src="CSS/img/sport.jpg" width="400" height="300"/>
                    <figcaption>SPORT</figcaption>
                </figure>
            </a>
            </div>
            <div class="clear"></div>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
        
    </body>
</html>
