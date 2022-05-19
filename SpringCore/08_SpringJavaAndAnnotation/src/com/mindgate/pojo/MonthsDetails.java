package com.mindgate.pojo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("monthsdetails")
@Scope("prototype")
public class MonthsDetails {
	private int month;
	private LocalDate monthStartDate;
	private LocalDate monthEndDate;
	@Autowired
	private FinanacialYearDeatails finanacialYearDeatails;
	
	public MonthsDetails() {
		System.out.println("Default Constructor of MonthsDetails");
	}

	public MonthsDetails(int month, LocalDate monthStartDate, LocalDate monthEndDate,
			FinanacialYearDeatails finanacialYearDeatails) {
		super();
		this.month = month;
		this.monthStartDate = monthStartDate;
		this.monthEndDate = monthEndDate;
		this.finanacialYearDeatails = finanacialYearDeatails;
		System.out.println("Parameterized Constructor of MonthsDetails");
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public LocalDate getMonthStartDate() {
		return monthStartDate;
	}

	public void setMonthStartDate(LocalDate monthStartDate) {
		this.monthStartDate = monthStartDate;
	}

	public LocalDate getMonthEndDate() {
		return monthEndDate;
	}

	public void setMonthEndDate(LocalDate monthEndDate) {
		this.monthEndDate = monthEndDate;
	}

	public FinanacialYearDeatails getFinanacialYearDeatails() {
		return finanacialYearDeatails;
	}

	public void setFinanacialYearDeatails(FinanacialYearDeatails finanacialYearDeatails) {
		this.finanacialYearDeatails = finanacialYearDeatails;
	}

	@Override
	public String toString() {
		return "MonthsDetails [month=" + month + ", monthStartDate=" + monthStartDate + ", monthEndDate=" + monthEndDate
				+ ", finanacialYearDeatails=" + finanacialYearDeatails + "]";
	}

}
