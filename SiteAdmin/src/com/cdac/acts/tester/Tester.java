package com.cdac.acts.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cdac.acts.courseplan.Course;
import com.cdac.acts.courseplan.Exception.FutureException;
import com.cdac.acts.courseplan.Exception.PastDateException;
import com.cdac.acts.courseplan.datautils.DataUtils;
import com.cdac.acts.courseplan.enums.Frequency;
import com.cdac.acts.courseplan.enums.Status;


public class Tester {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		List<Course> list = new ArrayList<>();
		
		
	  do {
		    System.out.println("enter 1 for create a new course ");
		    System.out.println("enter 2 for update details");
		    System.out.println("enter 3 for discount on weekend courses");
		    System.out.println("enter 4 for cancel short term courses(less than one month) and postpond next year");
            System.out.println("enter 0 for exit");		    
		    choice = sc.nextInt();
		  
		  switch(choice)
		  {
		  case 1:{
			         try {
						DataUtils.AddCourses(list);
					} catch (FutureException e) {
						e.printStackTrace();
					} catch (PastDateException e) {
						e.printStackTrace();
					}	 
			         
			         System.out.println(list);
			           
		  }break;
		  case 2:{
			          try {
			     	  
						DataUtils.UpdateCourse(list);
						
					} catch (FutureException | PastDateException e) {
						
						e.printStackTrace();
					}
			  
		  }break;
		  case 3:{
			           
		             for(Course c : list)
			             {
			            	 if(c.getFrequency().equals(Frequency.valueOf("WEEKENDS_ONLY")))
			            	 {
			            		 System.out.println("previous fee" + c.getFee());
			            		 c.setDiscount(20);
			            		 c.setFee((c.getFee()*20)/100);
			            		 
			            		 System.out.println("after 20% discount on  fee" + c.getFee() );
			            	 }
			             }
    
			        
		  }break;
		  case 4:{
			           for(Course c : list)
			         {
			              long duration = DataUtils.getDuration(c.getStartDate() , c.getEndDate());
			          
			              if(duration<30)
			            {
			            	 System.out.println(c.getTitle()+":"+ "is cancelled"+ "and has been  postpond next year"); 
			            	 
			            	  c.setStartDate(c.getStartDate().plusYears(1));
			            	  c.setEndDate(c.getEndDate().plusYears(1));
			            	  System.out.println(c);
			            }  
			         
			          
			           }
			  
		  }break;
		  case 0:{
			         choice =0;
			         
			  
		  }break;
		  
		  }
	  } while (choice!=0);
		
	
		
	}
	
}
