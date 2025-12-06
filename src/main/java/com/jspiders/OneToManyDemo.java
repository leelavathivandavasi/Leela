package com.jspiders;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.List;

public class OneToManyDemo {
    static SessionFactory sessionFactory;
    static{
        Configuration config=new Configuration();

        config.configure("hibernate.cfg.xml");

        sessionFactory=config.buildSessionFactory();
    }
//public static void addAudiAndShows(){
//    Session session = sessionFactory.openSession();
//    Transaction transaction = session.beginTransaction();
//    System.out.println("creating auditorium");
//    Audi a1=new Audi();
//     a1.setName("audi-10");
//     a1.setSeatRows(21);
//
//
//    System.out.println("creating show-1");
//    Shows s1=new Shows();
//    s1.setShowTime(LocalDate.now());
//    s1.setEndTime(LocalDate.now());
//    s1.setStatus("AVAILABLE");
//
//    System.out.println("creating show-2");
//    Shows s2=new Shows();
//    s2.setShowTime(LocalDate.now());
//    s2.setEndTime(LocalDate.now());
//    s2.setStatus("AVAILABLE");
//    System.out.println("Linking audi to  shows");
//    a1.getShows().add(s1);
//    a1.getShows().add(s2);
//    System.out.println("save the data to audi");
//    session.persist(a1);
//    transaction.commit();
//
//    session.close();
//}
//public static void getShowsbyAudi(Long audi_id){
//    Session session = sessionFactory.openSession();
//    Transaction transaction = session.beginTransaction();
//    System.out.println("Finding auditorium with id:"+audi_id);
//    Audi audi=session.find(Audi.class,audi_id);
//    List<Shows> shows=audi.getShows();
//    System.out.println("=======================SHOW DETAILS==================");
//    for(int i=0;i<shows.size();i++){
//        System.out.println();
//        System.out.println(shows.get(i).getShowTime());
//        System.out.println(shows.get(i).getEndTime());
//        System.out.println(shows.get(i).getStatus());
//        System.out.println();
//    }
//    transaction.commit();
//    session.close();
//}
//public static void addShows(Long audi_id){
//    Session session = sessionFactory.openSession();
//    Transaction transaction = session.beginTransaction();
//    System.out.println("Creating shows");
//    Shows s1=new Shows();
//    s1.setShowTime(LocalDate.now());
//    s1.setEndTime(LocalDate.now());
//    s1.setStatus("NEW=SHOW-S1");
//
//    System.out.println("Finding auditorium with id:"+audi_id);
//    Audi a1=session.find(Audi.class,audi_id);
//
//    System.out.println("Linking shows to audi");
//    a1.getShows().add(s1);
//    session.persist(a1);
//    transaction.commit();
//    System.out.println("Show added Successfully");
//    session.close();
//}
//    public static void deleteAudiAndShows(){
//
//    }
//    public static void deleteShows(Long audi_id,Long show_id){
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        System.out.println("Finding auditorium with id:"+audi_id);
//        Audi a1=session.find(Audi.class,audi_id);
//        List<Shows> shows=a1.getShows();
//        System.out.println("=======================SHOW DETAILS==================");
//        for(int i=0;i<shows.size();i++) {
//            Long ssid = shows.get(i).getId();
//            System.out.println();
//            if (ssid == show_id) {
//                System.out.println("show found with id:" + show_id);
//                shows.remove(i);
//                break;
//            }
//        }
//             session.merge(a1);
//             transaction.commit();
//            System.out.println("shows with given id deleted:"+show_id);
//            session.close();
//    }

    public static void main(String[] args) {

        System.out.println("program starts ....");
       // addAudiAndShows();
        //addShows(3l);
       // deleteAudiAndShows(5l);
       // deleteShows(3l,1l);
        //getShowsbyAudi(3l);
        System.out.println("program ends....");
    }
}
