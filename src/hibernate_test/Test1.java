package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();
            Employee emp = new Employee("Alexander", "Ivanov", "IT", 600);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            System.out.println(emp);
        } finally {
            sessionFactory.close();
        }

        System.out.println("Done");





    }

}
