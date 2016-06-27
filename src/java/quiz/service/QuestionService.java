
package quiz.service;

import java.util.List;
import quiz.dao.QuestionDAO;
import quiz.entity.Question;


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
