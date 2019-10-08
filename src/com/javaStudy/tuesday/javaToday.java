package com.javaStudy.tuesday;

public class javaToday {
	private int hour;
	private int minuite;
	private int seconds;
	
	public javaToday(int hour, int minuite, int seconds) {
		setTime(hour, minuite, seconds);
	}

	public void setTime(int h, int m , int s) {
		setHour(h);
		setMinuite(m);
		setSeconds(s);		
	}

	public void setHour(int h) {
		hour = (h>=0 && h<24 ? h:0);
	}
	
	public void setMinuite(int m) {
		minuite = (m>=0 && m<60 ? m:0);
	}
	
	public void setSeconds(int s) {
		seconds = (s>=0 && s<60 ? s:0);
	}
	
	public int getHour() {
		return hour;
	}

	public int getMinuite() {
		return minuite;
	}

	public int getSecond() {
		return seconds;
	}
	
	public String toMillitarayTime() {
		return String.format("%02d:%02d:%02d", getHour(), getMinuite(),getSecond());
	}
	
	

}
