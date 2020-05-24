package hibernat.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session =sessionFactory.getCurrentSession();
        session.beginTransaction();
        InstructorDetail instructorDetail = new InstructorDetail("youtube1","hobby5");
        Instructor instructor = new Instructor("dksjdj","dhjshd","dhjsahdj");
        instructor.setInstructorDetail(instructorDetail);
        System.out.println(instructor.getFirstName());
        session.save(instructor);
        session.getTransaction().commit();

    }
}
