package tsnifc2tc.b09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import tsnifc2tc.b09.entity.Student;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(FirstProjectApplication.class, args);
	    Student student= context.getBean(Student.class);
        student.display();
	}
	
}
