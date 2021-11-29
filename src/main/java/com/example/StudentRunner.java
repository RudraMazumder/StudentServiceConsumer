package com.example;

import java.util.List;

import com.example.api.DefaultApi;
import com.example.api.handler.ApiClient;
import com.example.models.Course;
import com.example.models.Student;
import com.example.models.StudentAddress;

public class StudentRunner {

	public static void main(String[] args) {
		
		DefaultApi api = new DefaultApi();
		ApiClient apiClient = api.getApiClient();
		apiClient.setBasePath("http://localhost:8080");
		Student student = new Student();
		student.setAge(7);
		StudentAddress address = new StudentAddress();
		address.setCity("Hoofddorp");
		address.setHouseNumber(36);
		address.setStreetName("Obelisk");
		student.setAddress(address);
		student.setGroupID("group_1");
		student.setStudentName("Rudra");
		api.studentPost(student );
		
		List<Student> studentGet = api.studentGet(null, null, null);
		studentGet.forEach(t->System.out.println(t.getStudentName()));

	}

}
