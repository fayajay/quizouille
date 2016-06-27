/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.service;

import java.util.List;
import quiz.dao.QuizDAO;
import quiz.entity.Quiz;

/**
 *
 * @author admin
 */
public class QuizService {
    
    public List<Quiz> listerQuiz() {
        return new QuizDAO().listerQuiz();
    }
    
    public Quiz rechercherParId(long id) {
        return new QuizDAO().rechercherParId(id);
    }
    
    public void enregistrerQuiz(Quiz q) {
        new QuizDAO().enregistrerQuiz(q);
    }
    
    public void modifierQuiz(Quiz q) {
        new QuizDAO().modifierQuiz(q);
    }
    
}
