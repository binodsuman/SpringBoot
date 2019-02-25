package com.suman.Management;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentResource  {

	List<Student> students = new ArrayList<Student>();
	
	public StudentResource() {
		Student s1 = new Student(1,"Binod");
		students.add(s1);
		s1 = new Student(2,"Bill Gates");
		students.add(s1);
		s1 = new Student(3,"Nandan Nilekani");
		students.add(s1);
		s1 = new Student(4,"Narayan Murthy");
		students.add(s1);
		s1 = new Student(5,"Pramod Modi");
		students.add(s1);
		
	}
	
	//@RequestMapping("/getstudents")
	//@RequestMapping(value="/check")
	//@RequestMapping(value="/test", method = RequestMethod.GET)
	@GetMapping("/all")
	public List<Student> getAllStudent(){
		//List<Student> students = new ArrayList<Student>();
		
		
		return students;
	}
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable final int id){
		//List<Student> students = new ArrayList<Student>();
		System.out.println("Enter id :"+id);
		for(Student student : students ){
			if(student.getId() == id){
				return student;
			}
		}
		
		return null;
	}
	
	@PostMapping("/add")
	public String added(@RequestBody Student student){
		students.add(student);
		return "Added new student";
	}
}
