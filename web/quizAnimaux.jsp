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
            <p class="presentation">Bienvenue sur le Quizz  !!!!!<br/>
            Thème : Les Animaux<br/>
            Une seule réponse possible<br/>
            Appuyez sur "next" pour passer à la question suivante<br/>
            <a href="quiz1Question.jsp">NEXT</a></p>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
        
    </body>
</html>
