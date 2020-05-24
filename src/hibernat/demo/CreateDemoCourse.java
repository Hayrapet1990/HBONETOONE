package hibernat.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemoCourse {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session =sessionFactory.getCurrentSession();
        session.beginTransaction();
        Course course =new Course("titledasfsahjs");
        Course course1 =new Course("tjskjdkitledas");
        Instructor instructor = session.get(Instructor.class,1);
        instructor.add(course);
        instructor.add(course1);
        course.setInstructor(instructor);
        course1.setInstructor(instructor);
        session.save(course);
        session.save(course1);



                session.getTransaction().commit();

    }
}
