package hibernat.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.swing.plaf.IconUIResource;
import java.util.concurrent.Callable;


public class GetCreateDemoCourse {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).addAnnotatedClass(Student.class)
        .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            session.beginTransaction();
            Course tempCourse = new Course("Pacmasefdwan - How To Scorekkrerefewjrehrkejhr One Million Points");
            Course tempCourse1 = new Course("Paasafdsaewcman - How To Scorekkrerefjrehrdke32jhr One Million Psoints");

            // save the course
            System.out.println("\nSaving the course ...");

            System.out.println("Saved the course: " + tempCourse);

            // create the students
            Student tempStudent1 = new Student("Joahdn", "saDfdsoe", "johnvfd32@luv2aassar32eresdcode.com");
            session.save(tempStudent1);


            // add students to the course
            tempStudent1.add(tempCourse);
            tempStudent1.add(tempCourse1);


            // save the students
            System.out.println("\nSaving students ...");
            session.save(tempCourse);
            session.save(tempCourse1);


            // commit transaction
            session.getTransaction().commit();



            // close the session


        }
        finally {

            // add clean up code
            session.close();

            factory.close();
        }
    }

}





