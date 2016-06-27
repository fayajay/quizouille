
package quiz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import quiz.entity.Question;

/**
 *
 * @author admin
 */
public class QuestionDAO {

    public List<Question> listerQuestion() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT que FROM Question que").getResultList();
    }

    public Question rechercherParId(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Question.class, id);
    }

    public void enregistrerQuestion(Question que) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();

        em.persist(que);

        em.getTransaction().commit();
    }

    public void modifierQuestion(Question que) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();

        em.merge(que);

        em.getTransaction().commit();
    }

}
