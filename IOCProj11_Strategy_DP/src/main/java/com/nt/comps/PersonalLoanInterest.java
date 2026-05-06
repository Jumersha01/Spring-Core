package com.nt.comps;

public class PersonalLoanInterest implements InterestStrategy{
	double rate=12.0;
	double riskSurcharge = 2.0;
	
@Override
public double calculateInterest(double principle,int timeInYears) {
	return principle*this.rate*timeInYears/100+(this.rate+this.riskSurcharge);
}
}
