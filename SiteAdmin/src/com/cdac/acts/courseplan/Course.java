package com.cdac.acts.courseplan;

import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;

import com.cdac.acts.courseplan.enums.Frequency;

public class Course {

	private int courseId;
	private  String title;
	private long fee;
	private float discount;
	private Frequency frequency;
	private LocalDate startDate;
	private LocalDate endDate;
	private Status status;
	private LocalDate updateDateTime;
	
	public static int genrateId= 1000;
	
	public Course(String title, long fee, float discount, LocalDate startDate, Frequency frequency, Status status ,LocalDate endDate ) {
		super();
		this.courseId = ++genrateId;
		this.title = title;
		this.fee = fee;
		this.discount = discount;
		this.startDate = startDate;
		this.endDate = endDate;
		this.frequency = frequency;
		this.status = status;
		this.updateDateTime = LocalDate.now();
	}
	
	public Course() {
		super();
	}
	

	public int getCourseId() {
		return courseId;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getFee() {
		return fee;
	}
	
	public float getDiscount() {
		return discount;
	}

	public LocalDate getStartDate() {
		return startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public Frequency getFrequency() {
		return frequency;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public LocalDate getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(LocalDate updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId 
				+ ", title=" + title + ", fee=" + fee 
				+ ", discount=" + discount
				+ ", startDate=" + startDate 
				+ ", endDate=" + endDate 
				+ ", frequency=" + frequency 
				+ ", status=" + status
				+ ", updateDateTime="
				+ updateDateTime + "]";
	}
	 
	
}
