package com.jspiders;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class Mains {
    private static SessionFactory sessionfactory = null;

    static {
        //load configuration
        System.out.println("1.Load Configuration");
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        //create sessionfactory
        System.out.println("2.Create SessionFactory");
        sessionfactory = config.buildSessionFactory();
    }

    public static void addMovie() {
        //create session
        System.out.println("3.Create Session");
        Session session = sessionfactory.openSession();
        Transaction transaction = session.beginTransaction();

        //logics
        Movie movie1 = new Movie();
        movie1.setTitle("Bahubali");
        movie1.setLanguage("Telugu");
        movie1.setCertification("U/A");
        movie1.setDuration(180);
        movie1.setStatus(MovieStatus.AVAILABLE);
        movie1.setCreatedAt(LocalDate.now());
        movie1.setCreatedBy(124l);
        try {
            System.out.println("4.Save Entity to DB");
            session.persist(movie1);//persist-->save
            transaction.commit();
            System.out.println("Save Entity to DB SUCCESS");
        } catch (Exception ex) {
            ex.printStackTrace();
            transaction.rollback();
        }
        System.out.println("5.Close Session");
        session.close();
    }

    public static void updateMovie(Long movie_id)
    {
        Session session = sessionfactory.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("4.Find the movie by ID");
        Movie movie = session.find(Movie.class,movie_id);//select * from movie where id = 1// find() is used to read/ select the data

        System.out.println("5.Update the movie data");

        movie.setDuration(150);
        movie.setStatus(MovieStatus.NOT_AVAILABLE);
        movie.setUpdatedAt(LocalDate.now());
        movie.setUpdatedBy(125l);

        session.merge(movie);//update db
        transaction.commit();

        System.out.println("Update the Movie details Successfully");

        System.out.println("6.Close Session");
        session.close();
    }

    public static void getMovie(Long id)
    {
        Session session = sessionfactory.openSession();
        Transaction transaction = session.beginTransaction();
        Movie movie = session.find(Movie.class,id);
        transaction.commit();

        System.out.println("Movie Found");
        System.out.println(movie);
    }

    public static void deleteMovie(Long id)
    {
        Session session = sessionfactory.openSession();
        Transaction transaction = session.beginTransaction();
        Movie movie = session.find(Movie.class,id);
        session.remove(movie);//delete
        transaction.commit();
        System.out.println("Movie Deleted");
    }
    public static void main(String[] args) {
        System.out.println("Program starts...");
//        addMovie();
//        updateMovie(2l);
         deleteMovie(1L);
//         getMovie(2L);
        System.out.println("6.Close Session Factory");
        sessionfactory.close();

        System.out.println("Program ends...");
    }
}
