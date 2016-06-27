
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


@WebServlet(name = "FormNewQuestionServlet", urlPatterns = {"/formNewQuestion"})
public class FormNewQuestionServlet extends HttpServlet {

        @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("formNewQuestion.jsp").forward(req, resp);
    }

        @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // consruit les questions
        Question que = new Question();
        que.setTitre(req.getParameter("titre")); 
        que.setReponse1(req.getParameter("reponse1"));
        que.setReponse1(req.getParameter("reponse2"));
        que.setReponse1(req.getParameter("reponse3"));
        que.setReponse1(req.getParameter("reponse4"));
        

        // persist
        QuestionService queserv = new QuestionService();
        queserv.enregistrerQuestion(que);
        
        
        resp.sendRedirect("formNewQuestion");
        
    }

}
