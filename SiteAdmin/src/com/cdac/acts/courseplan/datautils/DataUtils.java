package com.cdac.acts.courseplan.datautils;

import java.time.LocalDate;
import java.util.List;

import com.cdac.acts.courseplan.Course;
import com.cdac.acts.courseplan.Exception.FutureException;

public class DataUtils {

	public static LocalDate CheckDate(String startDate) throws FutureException {
		
		LocalDate date = LocalDate.parse(startDate);
		LocalDate today = LocalDate.now();
		if(date.isAfter(today))
		{
			throw new FutureException("start date can not future date");
			
		}
		return date;
		
	}



	public static void AddCourses(List<Course> list) {

	   System.out.println("enter 1 for add course");
	   System.out.println("enter 2 for " );
		
	}
	
	
	
	
	
}
