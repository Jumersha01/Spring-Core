package com.nt.comps;

public class HomeLoanInterest implements InterestStrategy{

double rate = 7.0;
@Override
public double calculateInterest(double principle, int timeInYears) {
	
	return (principle*this.rate*timeInYears)/100;
}
}
