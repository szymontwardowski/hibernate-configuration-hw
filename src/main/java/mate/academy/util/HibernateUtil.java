package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory factory = initSessionFactory();

    // To jest ten prywatny konstruktor, którego wymaga test:
    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException("Nie udało się stworzyć fabryki sesji!", e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}