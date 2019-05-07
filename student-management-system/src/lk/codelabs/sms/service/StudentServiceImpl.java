package lk.codelabs.sms.service;
import java.util.*;

import lk.codelabs.sms.model.Student;
import lk.codelabs.sms.repository.HibernateStudentRepository;
import lk.codelabs.sms.repository.StudentRepository;
public class StudentServiceImpl implements StudentService {

	StudentRepository repository;
	
	public StudentServiceImpl(StudentRepository repository) {
		
		this.repository = repository;
	}

	public StudentRepository getRepository() {
		return repository;
	}

	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}

	/* (non-Javadoc)
	 * @see lk.codelabs.sms.service.StudentService#fetchAllStudents()
	 */
	@Override
	public List<Student> fetchAllStudents(){
		
		return repository.fetchAllStudents();
	}
}
