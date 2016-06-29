/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import quiz.entity.Question;
import quiz.entity.Quiz;
import quiz.service.QuestionService;

/**
 *
 * @author admin
 */
@WebServlet(name = "QuestionSuivanteServlet", urlPatterns = {"/question_suivante"})
public class QuestionSuivanteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
         Integer ordreQuestion = (Integer)req.getSession().getAttribute("ordreQuestion");
         Long quiz_id = (Long)req.getSession().getAttribute("quiz_id");
         if (ordreQuestion==null) {
             ordreQuestion=0;
                    
         }
        Question question = new QuestionService().trouverQuestionSuivante(quiz_id, ordreQuestion);
       
        if (question==null) {
            req.getRequestDispatcher("score.jsp").forward(req, resp); 
        }
        
        if (question!=null) {
            req.getSession().setAttribute("ordreQuestion", question.getOrdre());
        }
        
        req.getSession().setAttribute("score", 0);
        
        req.setAttribute("question", question);
        
       req.getRequestDispatcher("quizGame.jsp").forward(req, resp);
               
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
         Integer ordreQuestion = (Integer)req.getSession().getAttribute("ordreQuestion");
         Long quiz_id = (Long)req.getSession().getAttribute("quiz_id");
         if (ordreQuestion==null) {
             ordreQuestion=0;
                    
         }
        Question question = new QuestionService().trouverQuestionSuivante(quiz_id, ordreQuestion);
       
        if (question==null) {
            req.getRequestDispatcher("score.jsp").forward(req, resp); 
        }
        
        if (question!=null) {
            req.getSession().setAttribute("ordreQuestion", question.getOrdre());
        }
        
        /*if (Long.parseLong(req.getParameter("choix"))==question.getNumReponseCorrecte()){
            req.getSession().setAttribute("score",(int)req.getSession().setAttribute("score")+1);
        }*/
        
        req.setAttribute("question", question);
        
        
        
       req.getRequestDispatcher("quizGame.jsp").forward(req, resp);
        
    }
    
    
    
    }

