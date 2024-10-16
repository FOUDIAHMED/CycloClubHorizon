package ahmed.foudi.db;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LazyHibernate {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new Configuration().configure().buildSessionFactory();
            } catch (Throwable ex) {
                System.err.println("SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }
        return sessionFactory;
    }

    public static Session getSession() {
        return getSessionFactory().openSession();
    }

    public static void shutdown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
    public static void main(String[] args) {
        LazyHibernate.getSessionFactory();
    }
}

