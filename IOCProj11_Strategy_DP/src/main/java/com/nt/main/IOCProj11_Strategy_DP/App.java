package com.nt.main.IOCProj11_Strategy_DP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.LoanService;

public class App {
    public static void main(String[] args) {
       try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
    	   LoanService loanService = ctx.getBean("ls",LoanService.class);
    	 
    	   System.out.println("Loan Interest: "+ loanService.calculateLoanInterest(120000, 3));
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
