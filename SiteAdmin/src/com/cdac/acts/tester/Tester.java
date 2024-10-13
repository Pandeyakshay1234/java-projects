package com.cdac.acts.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cdac.acts.courseplan.Course;
import com.cdac.acts.courseplan.datautils.DataUtils;


public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		List<Course> list = new ArrayList<>();
		
		
	  do {
		    System.out.println("enter 1 for create a new course ");
		    System.out.println("enter 2 for update details");
		    System.out.println("enter 3 for discount on weekend courses");
		    System.out.println("enter 5 for cancel short term courses(less than one month) and can cancel and postpond next year");
	
		    System.out.println("enter 0 to exit");
		    
		  choice = sc.nextInt();
		  
		  switch(choice)
		  {
		  case 1:{
			         DataUtils.AddCourses(list);
			          
			          
			      
			          
			           
		  }break;
		  case 2:{
			  
			  
		  }break;
		  case 3:{
			  
			  
		  }break;
		  case 4:{
			  
			  
		  }break;
		  case 0:{
			  
			  
		  }break;
		  
		  }
	  } while (choice!=0);
		
		
		
		
	}
}
