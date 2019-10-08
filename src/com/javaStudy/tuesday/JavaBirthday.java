package com.javaStudy.tuesday;

public class JavaBirthday {
	private int month;
	private int day;
	private int year;
	
	
	public JavaBirthday(int month, int day, int year) {
		this.month = month;
		this.day=day;
		this.year=year;
	}
	
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
}
