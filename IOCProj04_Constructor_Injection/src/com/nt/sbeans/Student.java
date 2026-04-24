package com.nt.sbeans;

public class Student {
	private Pen pen;
  String studentName ="Junaid";
  
  public Student(Pen pen) {
	  this.pen=pen;
  }
  public void penDetails() {
	  IO.println("Student Writting With "+this.pen.getPenName()+"whos colour is "+this.pen.getPenColour()+" and price is "+this.pen.getPenPrice());
  }
}
