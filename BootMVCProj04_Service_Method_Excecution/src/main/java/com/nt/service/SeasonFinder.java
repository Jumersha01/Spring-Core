package com.nt.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class SeasonFinder {

	private LocalDate ldate = LocalDate.now();

	public String getSeason() {
		int month = ldate.getMonthValue();
		if (month >= 3 && month < 7)
			return "Summer";
		else if (month >= 7 && month < 10)
			return "Rainy";
		else
			return "Winter";

	}
}
