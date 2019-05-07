package lk.codelabs.sms.repository;

import java.util.List;

import lk.codelabs.sms.model.Student;

public interface StudentRepository {

	List<Student> fetchAllStudents();

}