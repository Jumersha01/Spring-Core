package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.comps.InterestStrategy;

@Component("ls")
public class LoanService {
	
InterestStrategy interestStrategy;

@Autowired
@Qualifier("hl")
public void setInterestStrategy(InterestStrategy interestStrategy) {
	this.interestStrategy=interestStrategy;
}
public double calculateLoanInterest(double princeple,int time) {
	return this.interestStrategy.calculateInterest(princeple, time);
}
	
}
