package com.cdac.acts.courseplan.datautils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;

import com.cdac.acts.courseplan.Course;
import com.cdac.acts.courseplan.Exception.FutureException;
import com.cdac.acts.courseplan.Exception.PastDateException;
import com.cdac.acts.courseplan.enums.Frequency;
import com.cdac.acts.courseplan.enums.Status;

public class DataUtils {

	public static LocalDate CheckStartDate(String startDate) throws FutureException {
		
		LocalDate date = LocalDate.parse(startDate);
		LocalDate today = LocalDate.now();
		if(date.isAfter(today))
		{
			throw new FutureException("start date can not future date");
			
		}
		return date;
		
	}
	
   private static LocalDate CheckEndDate(String sd, LocalDate startDate) throws PastDateException {
		
	      LocalDate date  = LocalDate.parse(sd);
	      LocalDate today =  LocalDate.now();
	      
	      if(date.isBefore(startDate))
	      {
	    	  throw new PastDateException("Date should not be past");
	      }
		
	      return date;
    	}
	



	public static void AddCourses(List<Course> list) throws FutureException, PastDateException {

		//String title, long fee, float discount, LocalDate startDate, Frequency frequency, Status status ,LocalDate endDate )
		Scanner sc  = new Scanner(System.in);
	   System.out.println("enter course title");
	   String title= sc.nextLine();
	   
	   System.out.println("enter course fee " );
	   long fee = sc.nextLong();
	   sc.nextLine();
	   
	   System.out.println("enter fee discount " );
	   float discount = sc.nextLong();
	   sc.nextLine();
	   
	   System.out.println("enter start date of course");
	   String sd = sc.nextLine();
	   
	    LocalDate startDate =  DataUtils.CheckStartDate(sd);
	   
	   System.out.println("enter end date of course");
	   String ed = sc.nextLine();
	   
	    LocalDate endDate =  DataUtils.CheckEndDate(sd , startDate);
	   
	   System.out.println("enter course frequency in DAILY , \r\n"
	   		+ "	WEEKDAYS_ONLY,\r\n"
	   		+ "	WEEKENDS_ONLY;\r\n"
	   		+ "");
	   String feq = sc.nextLine().toUpperCase();
	   Frequency frequency =  Frequency.valueOf(feq);
	   
	   System.out.println("enter course status in \r\n"
	   		+ "	PLANDED,\r\n"
	   		+ "	STARTED,\r\n"
	   		+ "	FINISHED,\r\n"
	   		+ "	CANCELLED;");
	   String sts = sc.nextLine().toUpperCase();
	   Status status = Status.valueOf(sts);
	   
	   Course c1 = new Course(title ,fee ,discount, startDate , frequency ,status , endDate );
	   list.add(c1);
	  // sc.close();
	}

	public static void UpdateCourse(List<Course> list) throws FutureException, PastDateException {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter course id");
		int courseId = sc.nextInt();
		sc.nextInt();
		boolean found = false;
		for(Course l : list)
		{
		    if(courseId == l.getCourseId())
		    {
		    	found = true;
		    	System.out.println("enter course title");
		 	   String title= sc.nextLine();
		 	   
		 	   System.out.println("enter course fee " );
		 	   long fee = sc.nextLong();
		 	   sc.nextLine();
		 	   
		 	   System.out.println("enter fee discount " );
		 	   float discount = sc.nextLong();
		 	   sc.nextLine();
		 	   
		 	   System.out.println("enter start date of course");
		 	   String sd = sc.nextLine();
		 	   
		 	    LocalDate startDate =  DataUtils.CheckStartDate(sd);
		 	   
		 	   System.out.println("enter end date of course");
		 	   String ed = sc.nextLine();
		 	   
		 	  LocalDate endDate =  DataUtils.CheckEndDate(sd , startDate);
		 	   
		 	   System.out.println("enter course frequency in DAILY , \r\n"
		 		   		+ "	WEEKDAYS_ONLY,\r\n"
		 		   		+ "	WEEKENDS_ONLY;\r\n"
		 		   		+ "");
		 	   String feq = sc.nextLine().toUpperCase();
		 	   Frequency frequency =  Frequency.valueOf(feq);
		 	   
		 	  System.out.println("enter course status in \r\n"
		 		   		+ "	PLANDED,\r\n"
		 		   		+ "	STARTED,\r\n"
		 		   		+ "	FINISHED,\r\n"
		 		   		+ "	CANCELLED;");
		 	   String sts = sc.nextLine().toUpperCase();
		 	   Status status  = Status.valueOf(sts);
		 	   
		 	   l.setTitle(title);
		 	   l.setDiscount(discount);
		 	   l.setEndDate(endDate);
		 	   l.setFee(fee);
		 	   l.setStartDate(startDate);
		 	   l.setFrequency(frequency);
		 	   l.setStatus(status);
		 	   l.setUpdateDateTime(LocalDate.now());
		    }
			
		}
		if(!found)
		{
			System.out.println("course not found ");
			return;
		}
		sc.close();
		
	}


	public static long getDuration(LocalDate startDate, LocalDate endDate) {
		return  ChronoUnit.DAYS.between(startDate, endDate);
	}

   

	
	
	
	
	
}
