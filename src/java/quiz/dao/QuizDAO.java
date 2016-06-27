package quiz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import quiz.entity.Quiz;

public class QuizDAO {

    public List<Quiz> listerQuiz() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT q FROM Quiz q").getResultList();
    }

    public Quiz rechercherParId(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Quiz.class, id);
    }

    public Quiz rechercherParNom(String nom) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Quiz.class, nom);
    }

    public void enregistrerQuiz(Quiz q) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();

        em.persist(q);

        em.getTransaction().commit();
    }

    public void modifierQuiz(Quiz q) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();

        em.merge(q);

        em.getTransaction().commit();
    }

}
