package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HibernateRunner {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
//        configuration.addAnnotatedClass(User.class);
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            session.beginTransaction();


//              Books given user
//            User user = session.get(User.class,17);
//            Books book1 = session.load(Books.class,1);
//            Books book2 = session.load(Books.class,2);
//            Books book3 = session.load(Books.class,3);
//            user.getBooks().addAll(List.of(book1,book2, book3));
//            session.save(user);


            User e = session.get(User.class, 15);

            List<Books> books = e.getBooks();

            Books books1 = books.get(0);
            System.out.println(books1);

//            List<User> userList = new ArrayList<>();
//            userList.add(e);
//            userList.add(session.get(User.class,16));
//            userList.add(session.get(User.class,17));
//            System.out.println(userList);
//
//            List<Books> booksList = new ArrayList<>();
//            booksList.add(session.get(Books.class,1));
//            booksList.add(session.get(Books.class,2));
//            booksList.add(session.get(Books.class,3));
//            System.out.println(booksList);









//            CREATE USER
//            User user1 = User.builder()
//                    .name("Vlad")
//                    .surname("Romanenko")
//                    .date(LocalDate.of(1995, 02, 06))
//                    .age(27)
//                    .build();
//            session.save(user1);
//            User user2 = User.builder()
//                    .name("Ivan")
//                    .surname("Khomenko")
//                    .date(LocalDate.of(1995, 06, 15))
//                    .age(26)
//                    .build();
//            session.save(user2);
//            User user3 = User.builder()
//                    .name("Andrii")
//                    .surname("Vasylenko")
//                    .date(LocalDate.of(1993, 07, 01))
//                    .age(29)
//                    .build();
//            session.save(user3);

//            Books book4 = Books.builder()
//                    .name("Вірші")
//                    .author("Леся Українка")
//                    .build();
//            session.save(book4);
//            Books book2 = Books.builder()
//                    .name("Енеїда")
//                    .author("Іван Котляревський")
//                    .build();
//            session.save(book2);
//            Books book3 = Books.builder()
//                    .name("Тореодори з Васюківки")
//                    .author("Всеволод Нестайко")
//                    .build();
//            session.save(book3);


//            DELETE USER
//            User user = session.get(User.class,3);
//            session.delete(user);
//
//            UPDATE USER
//            User user1 = session.get(User.class,5);
//            user1.setName("Ivan");
//            user1.setSurname("Ivanov");
//            user1.setAge(12);
//            user1.setDate(LocalDate.of(2010,12,12));
//            session.update(user1);
//
//            READ USER
//            User user = session.get(User.class,1);
//            System.out.println(user);

            session.getTransaction().commit();
        }

    }
}
