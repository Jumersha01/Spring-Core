package com.nt.comps;

public class CarLoanInterest implements InterestStrategy {
 double rate = 9.0;
 double processigFee = 2000;
	@Override
	public double calculateInterest(double principle, int timeInYears) {
		
		return ((principle*this.rate*timeInYears)/100)+this.processigFee;
	}

}
