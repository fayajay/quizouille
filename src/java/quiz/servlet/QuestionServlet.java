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
import quiz.entity.Question;
import quiz.service.QuestionService;

/**
 *
 * @author admin
 */
@WebServlet(name = "QuestionServlet", urlPatterns = {"/lister_question"})
public class QuestionServlet extends HttpServlet {
    
        @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        
        long idQuestion = Long.parseLong(req.getParameter("id"));
        
        Question que = new QuestionService().rechercherParId(idQuestion);
        
        req.setAttribute("question", que);
        
        req.getRequestDispatcher("quizGame.jsp").forward(req, resp);

}
}