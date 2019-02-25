package com.binod.RestDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {
	
	List<Student> students = new ArrayList<Student>();
	
	public StudentResource() {
		Student s1 = new Student(1,"Binod Suman");
		students.add(s1);
		s1 = new Student(2,"Bill Gates");
		students.add(s1);
		s1 = new Student(3,"Narayan Murthy");
		students.add(s1);
		s1 = new Student(4,"Nandan Nilekani");
		students.add(s1);
		s1 = new Student(5,"Pramod Kumar");
		students.add(s1);
		
	}
	
	//@RequestMapping(value="/all", method=RequestMethod.GET)
	//@RequestMapping(value="/all")
	//@RequestMapping("/all")
	@GetMapping("/all")
	public List<Student>  getAllStudent(){
		return students;
	}
	
	@GetMapping("/{id}")
	public Student find(@PathVariable final int id){
		for(Student student : students){
			if(student.getId() == id){
				return student;
			}
		}
		return null;
	}
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student student){
		students.add(student);
		return "Added new Student :"+student.getName();
	}

}
