package com.nt.sbeans;

public class RandomTableGenerator {
 private RandomNumberGenerator  number;
 
 public void setNumber(RandomNumberGenerator number) {
	 this.number=number;
 }
  
 public void randomTable() {
	int num = number.randomNumber();
	 for(int i = 1;i<=10;i++) {
		 IO.println(i+" x "+ num*i);
	 }
 }
  
}
