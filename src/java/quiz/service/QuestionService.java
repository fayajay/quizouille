/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.service;

import java.util.List;
import quiz.dao.QuestionDAO;
import quiz.entity.Question;

/**
 *
 * @author admin
 */
public class QuestionService {
    
       public List<Question> listerQuestion() {
        return new QuestionDAO().listerQuestion();
    }
    
    public Question rechercherParId(long id) {
        return new QuestionDAO().rechercherParId(id);
    }
    
    public void enregistrerQuestion(Question que) {
        new QuestionDAO().enregistrerQuestion(que);
    }
    
    public void modifierQuestion(Question que) {
        new QuestionDAO().modifierQuestion(que);
    }
    
}
