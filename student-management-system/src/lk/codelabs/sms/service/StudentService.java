package lk.codelabs.sms.service;

import java.util.List;

import lk.codelabs.sms.model.Student;

public interface StudentService {

	List<Student> fetchAllStudents();

}