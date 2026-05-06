package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.comps.CarLoanInterest;
import com.nt.comps.HomeLoanInterest;
import com.nt.comps.InterestStrategy;
import com.nt.comps.PersonalLoanInterest;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
	
@Bean("hl")
public InterestStrategy homeLoanInterest() {
	return new HomeLoanInterest();
}

@Bean("cl")
public InterestStrategy carLoanInterest() {
	return new CarLoanInterest();
	
}
@Bean("pl")
public InterestStrategy PersonalLoanInterest() {
	return new PersonalLoanInterest();
}
	
}
