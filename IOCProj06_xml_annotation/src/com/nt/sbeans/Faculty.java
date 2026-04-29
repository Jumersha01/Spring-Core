package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("fac")

public class Faculty {
 private Course course;
 private int facId;
 private String facName;
 
 public Faculty(Course course,int facId,String facName){
	 this.course=course;
	 
 }
 public void showDetails() {
	 IO.println("Faculty name:"+this.facName+"\nFaculty id: "+this.facId+"Course Name:"+this.course.getName()+"\nCourse Duration: "+this.course.getDuration()+"\nCourse id:"+this.course.getId());
 }
  
	
}
