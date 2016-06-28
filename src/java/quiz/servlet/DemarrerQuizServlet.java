package quiz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DemarrerQuizServlet", urlPatterns = {"/demarrer_quiz"})
public class DemarrerQuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Place quiz_id en session
        req.getSession().setAttribute("quiz_id", Long.parseLong(req.getParameter("id")));
        req.getSession().setAttribute("ordreQuestion", null);
        // met le score à zéro en session

        req.getSession().setAttribute("score", 0);

        // redirige vers QuestionSuivanteServlet
        resp.sendRedirect("question_suivante");
    }
}
