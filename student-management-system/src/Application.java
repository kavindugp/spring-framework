import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lk.codelabs.sms.model.Student;
import lk.codelabs.sms.service.StudentService;
import lk.codelabs.sms.service.StudentServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		StudentService service = (StudentService) ctx.getBean("studentService");
		
		//= new StudentServiceImpl();
		List<Student> students = service.fetchAllStudents();
		
		for (Student student : students) {
			System.out.println(student.getName());
		}
	}
}
