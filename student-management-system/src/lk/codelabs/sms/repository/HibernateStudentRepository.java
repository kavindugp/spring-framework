package lk.codelabs.sms.repository;

import java.util.List;
import java.util.ArrayList;

import lk.codelabs.sms.model.Student;

public class HibernateStudentRepository implements StudentRepository {

	/* (non-Javadoc)
	 * @see lk.codelabs.sms.repository.StudentRepository#fetchAllStudents()
	 */
	@Override
	public List<Student> fetchAllStudents() {

		List<Student> students = new ArrayList<>();

		Student student = new Student();
		student.setId(1);
		student.setName("Krish");
		students.add(student);
		
		Student s1 = new Student();
		s1.setId(2);
		s1.setName("Krish1");
		students.add(s1);
		return students;

	}
}
