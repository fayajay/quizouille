
package quiz.service;

import java.util.List;
import quiz.dao.QuizDAO;
import quiz.entity.Quiz;


public class QuizService {

    public List<Quiz> listerQuiz() {
        return new QuizDAO().listerQuiz();
    }

    public Quiz rechercherParId(long id) {
        return new QuizDAO().rechercherParId(id);
    }

    public Quiz rechercherParNom(String nom) {
        return new QuizDAO().rechercherParNom(nom);
    }

    public void enregistrerQuiz(Quiz q) {
        new QuizDAO().enregistrerQuiz(q);
    }

    public void modifierQuiz(Quiz q) {
        new QuizDAO().modifierQuiz(q);
    }

}
