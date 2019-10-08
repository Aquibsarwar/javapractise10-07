package com.javaStudy.Enum;

public enum Enum {
	Aquib("Awesome", "25"),
	sabah("bekub", "22"),
	aysha("awesome","24");

	private final String desc;
	private final String year;
	
	Enum(String desc, String year) {
		this.desc=desc;
		this.year=year;
	}

	public String getDesc() {
		return desc;
	}

	public String getYear() {
		return year;
	}
	
}
