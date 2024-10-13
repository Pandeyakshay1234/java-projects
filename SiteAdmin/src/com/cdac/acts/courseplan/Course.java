package com.cdac.acts.courseplan;

import java.time.LocalDate;

import com.cdac.acts.courseplan.enums.Frequency;
import com.cdac.acts.courseplan.enums.Status;


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
		
		public Course()
		{
			this.courseId = ++genrateId;
		}
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
		
		
		

		public int getCourseId() {
			return courseId;
		}
		public void setCourseId(int courseId) {
			this.courseId = courseId;
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
		public void setFee(long fee) {
			this.fee = fee;
		}
		public float getDiscount() {
			return discount;
		}
		public void setDiscount(float discount) {
			this.discount = discount;
		}
		public Frequency getFrequency() {
			return frequency;
		}
		public void setFrequency(Frequency frequency) {
			this.frequency = frequency;
		}
		public LocalDate getStartDate() {
			return startDate;
		}
		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}
		public LocalDate getEndDate() {
			return endDate;
		}
		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}
		public Status getStatus() {
			return status;
		}
		public void setStatus(Status status) {
			this.status = status;
		}
		public LocalDate getUpdateDateTime() {
			return updateDateTime;
		}
		public void setUpdateDateTime(LocalDate updateDateTime) {
			this.updateDateTime = updateDateTime;
		}
		public static int getGenrateId() {
			return genrateId;
		}
		public static void setGenrateId(int genrateId) {
			Course.genrateId = genrateId;
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


