package com.hibernate;

import javax.persistence.*;
import java.util.List;

public class HibernateJPQLSelect {
    private static final String PERSISTENCE_UNIT_NAME = "my-pu";
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager entityManager = emf.createEntityManager();

        try {
            entityManager.getTransaction().begin();

            Query query = entityManager.createQuery("SELECT u FROM User u INNER JOIN u.books b  WHERE u.id=15",User.class);
            User user = (User) query.getSingleResult();
//            for (User u : users) {
//                System.out.println(u.getName() + " - " + u.getBooks());
//            }
//            users.forEach(x-> System.out.println(x));
            System.out.println(user);
            System.out.println(user.getBooks());

            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
            emf.close();
        }
    }
}
