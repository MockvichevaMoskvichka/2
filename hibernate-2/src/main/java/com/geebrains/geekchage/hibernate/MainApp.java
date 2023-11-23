package com.geebrains.geekchage.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
    private static String getDetails;

    public  static  void  main (String[] arg) {
        SessionFactory sessionFactory = new Configuration()
             .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Users.class)
                .addAnnotatedClass(UserDetails.class)
                .buildSessionFactory();
   Session session = null;


        //=== CREATE ===
    //   session = sessionFactory.getCurrentSession();
   //     session.beginTransaction();
    //   Item item = new Item("Milk", 80);
      //  System.out.println(item);
      //  session.save(item);
     //  System.out.println(item);
      //  session.getTransaction().commit();

        //=== READE ===

   //    session = sessionFactory.getCurrentSession();
    //   session.beginTransaction();
      //  Item itemFromDb = session.get(Item.class, 1l);
     //   session.get(Item.class, 1l);

     //   System.out.println(itemFromDb);


        //=== update ===

 //  session = sessionFactory.getCurrentSession();
 //      session.beginTransaction();
//Item itemFromDb = session.get(Item.class,  1l);
   //System.out.println(itemFromDb);
     //  itemFromDb.setPrice(2500);
     //   itemFromDb.setTitle("Bread");
      // session.flush();

        //=== delete ===

     //   session = sessionFactory.getCurrentSession();
      //  session.beginTransaction();
      //  Item itemFromDb = session.get(Item.class, 1l);
      //  session.remove(itemFromDb);
      //  session.getTransaction().commit();


       // session = sessionFactory.getCurrentSession();
       //    session.beginTransaction();
        //  Item item = new Item("Milk", 800);
       //    System.out.println(item);
        //    session.save(item);
        // System.out.println(item);
        //  session.getTransaction().commit();


         // session = sessionFactory.getCurrentSession();
         // session.beginTransaction();
        // List<AbstractReadWriteAccess.Item> items =session.createQuery("SELECT  i FROM Item i", Item.class).getResultList();
      //  System.out.println(items);
       // session.getTransaction().commit();
       session = sessionFactory.getCurrentSession();

        session.beginTransaction();
     //   Item item = new Item("Milk", 80);
     //    System.out.println(item);
    //     session.save(item);
   //    System.out.println(item);
     // session.getTransaction().commit();


        Users user = session.get(Users.class,4);
       System.out.println(user);

       System.out.println(user.getDetails());
    //   System.out.println(user.getDetails().getUser());
        session.getTransaction().commit();

        sessionFactory.close();
    }
}
