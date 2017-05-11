package ua.mega.testharness;

import ua.mega.domain.Student;
import ua.mega.domain.Tutor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HibernateTestHarness {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Tutor t1 = new Tutor("adc123", "Aaron", 18314243);
        em.persist(t1);

        t1.createNewStudentAndAddToSupervisorGroup("Student-1", "1-STD", "1 The Street", "Anytown-1", "1112233");
        t1.createNewStudentAndAddToSupervisorGroup("Student-2", "2-STD", "2 The Street", "Anytown-2", "23624786");
        t1.createNewStudentAndAddToSupervisorGroup("Student-3", "3-STD", "2 The Street", "Anytown-2", "23624786");
        t1.createNewStudentAndAddToSupervisorGroup("Student-4", "4-STD", "2 The Street", "Anytown-2", "23624786");
        t1.createNewStudentAndAddToSupervisorGroup("Student-5", "5-STD", "2 The Street", "Anytown-2", "23624786");

        tx.commit();
        em.close();
    }

}
