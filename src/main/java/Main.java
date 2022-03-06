import com.kaisar.models.Customers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.xml.transform.Result;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
//        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
//
//        try (SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//             Session session = sessionFactory.openSession()) {
//
//            session.beginTransaction();
//            Customers c = new Customers(1000000008, "The Toy Store HIBERNATE", "Chicaco 3rd Street", "+77718553555");
//            session.save(c);
//            session.getTransaction().commit();
//
//            if (session != null) session.close();
//        }
        String url = "jdbc:mysql://localhost:3306/sqlstart";
        String user = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            statement.execute("UPDATE Customers SET cust_name='The Toy Store JDBC' WHERE cust_id = 1000000006");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM Customers");
            while (resultSet.next()) {
                String courseName = resultSet.getString("cust_name");
                System.out.println(courseName);
            }

            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
