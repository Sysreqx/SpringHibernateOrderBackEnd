import com.kaisar.models.Customers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    Session session = sessionFactory.openSession();

    {
        session.beginTransaction();
        Customers c = new Customers(1000000006, "The Toy Store HIBERNATE", "Chicaco 3rd Street", "+77718553555");
        session.save(c);
        session.getTransaction().commit();
    }
}
