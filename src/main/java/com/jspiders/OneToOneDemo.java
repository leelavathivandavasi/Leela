package com.jspiders;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {
    static SessionFactory sessionFactory;
    static{
        Configuration config=new Configuration();

        config.configure("hibernate.cfg.xml");

        sessionFactory=config.buildSessionFactory();
    }
    public static void addAudiDetails(){
        Session session=sessionFactory.openSession();
        //logics
        Audi audi1=new Audi();
        AudiAddress audiAddress=new AudiAddress();
        Transaction transaction = session.beginTransaction();
        audi1.setName("audi-2");
        audi1.setSeatRows(30);
        audi1.setSeatColumns(20);

        audiAddress.setStreetName("street-2");
        audiAddress.setArea("NAGAVARA");
        audiAddress.setCity("Banglore");
        audiAddress.setPinCode(524171);

        System.out.println("Links the both auditorium table and AudiAddress table");
        audi1.setAudiAddress(audiAddress);

        session.persist(audi1);
        transaction.commit();

        session.close();
    }
    public static void getAudiDetails(Long id){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Audi a1 = session.find(Audi.class, id);
        System.out.println("====================Audi details===============");
//        System.out.println(a1.getId());
//        System.out.println(a1.getName());
//        System.out.println(a1.getSeatRows());
//        System.out.println(a1.getSeatColumns());
//
//        System.out.println(a1.getAudiAddress().getId());
//        System.out.println(a1.getAudiAddress().getStreetName());
//        System.out.println(a1.getAudiAddress().getArea());
//        System.out.println(a1.getAudiAddress().getCity());
//        System.out.println(a1.getAudiAddress().getPinCode());
        System.out.println(a1);
    }
    public static void getAudiAddressDetails(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        AudiAddress ad1 = session.find(AudiAddress.class, id);
        System.out.println("====================Audi Address details===============");
        System.out.println(ad1.getId());
        System.out.println(ad1.getStreetName());
        System.out.println(ad1.getArea());
        System.out.println(ad1.getCity());
        System.out.println(ad1.getPinCode());

        System.out.println("====================Audi details===============");
        System.out.println("Auditorium Id"+ad1.getAudi().getId());
        System.out.println("Auditorium Name"+ad1.getAudi().getName());
        System.out.println("Auditorium Rows"+ad1.getAudi().getSeatRows());
        System.out.println("Auditorium Columns"+ad1.getAudi().getSeatColumns());

    }

    public static void main(String[] args) {
        System.out.println("program starts...");
       // addAudiDetails();
        getAudiDetails(1l);
      //  getAudiAddressDetails(2l);

        sessionFactory.close();

        System.out.println("program ends...");
    }
}
