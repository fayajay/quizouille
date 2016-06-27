/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import quiz.entity.Quiz;
import quiz.service.QuizService;

/**
 *
 * @author kellyleclerc
 */
@WebServlet(name = "FormNewQuizServlet", urlPatterns = {"/formNewQuiz"})
public class FormNewQuizServlet extends HttpServlet {

        @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("formNewQuiz.jsp").forward(req, resp);
    }

        @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // consruit le quiz
        Quiz q = new Quiz();
        q.setNom(req.getParameter("nom")); 
        
        // persist
        QuizService qserv = new QuizService();
        qserv.enregistrerQuiz(q);
        
        // ouvre une session
        req.getSession().setAttribute("quiz_id", q.getId());
        
        // forward 
        resp.sendRedirect("formNewQuestion");
        
    }
}
