/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import quiz.entity.Quiz;

/**
 *
 * @author admin
 */
public class QuizDAO {
    

    public List<Quiz> listerQuiz() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT q FROM Quiz q").getResultList();
    }

    public Quiz rechercherParId(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Quiz.class, id);
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
