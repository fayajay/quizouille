package quiz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import quiz.entity.Question;
import quiz.entity.Quiz;

import quiz.service.QuestionService;
import quiz.service.QuizService;

@WebServlet(name = "FormNewQuestionServlet", urlPatterns = {"/formNewQuestion"})
public class FormNewQuestionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Quiz>mesQuiz = new QuizService().listerQuiz();
        req.setAttribute("quiz_id", mesQuiz);
        //req.getParameter("formNewQuestion");
        req.getRequestDispatcher("formNewQuestion.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //String quizNom = req.getParameter("nom");
        Quiz quiz = new QuizService().rechercherParId((long) req.getSession().getAttribute("quiz_id"));
        
        // consruit les questions
        Question que = new Question();
        que.setOrdre(Integer.parseInt(req.getParameter("ordre")));
        que.setEnnonce(req.getParameter("ennonce"));
        que.setReponse1(req.getParameter("reponse1"));
        que.setReponse2(req.getParameter("reponse2"));
        que.setReponse3(req.getParameter("reponse3"));
        que.setReponse4(req.getParameter("reponse4"));
        que.setNumReponseCorrecte(Integer.parseInt(req.getParameter("numReponseCorrecte")));
        
        quiz.getQuestion().add(que);
        que.setQuiz(quiz);

        // persist
        QuestionService queserv = new QuestionService();
        queserv.enregistrerQuestion(que);

        resp.sendRedirect("formNewQuestion");

    }

}
