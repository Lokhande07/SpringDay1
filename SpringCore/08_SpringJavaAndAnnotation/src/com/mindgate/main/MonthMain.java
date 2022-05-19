package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.FinanacialYearDeatails;
import com.mindgate.pojo.MonthsDetails;

public class MonthMain {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		FinanacialYearDeatails finanacialYearDeatails = applicationContext.getBean("finanacialyeardetails", FinanacialYearDeatails.class);
		finanacialYearDeatails.setYearStartDate(LocalDate.now());
		finanacialYearDeatails.setYearEndDate(LocalDate.of(2023, 05, 20));
		System.out.println(finanacialYearDeatails);
		
		System.out.println("-".repeat(100));
		MonthsDetails monthsDetails = applicationContext.getBean("monthsdetails", MonthsDetails.class);
		System.out.println(monthsDetails);
	}

}
