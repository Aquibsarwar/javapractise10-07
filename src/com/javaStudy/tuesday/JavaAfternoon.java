package com.javaStudy.tuesday;

public class JavaAfternoon {

	private String name;
	private JavaBirthday birthday;
	
	public JavaAfternoon(String name, JavaBirthday thedate) {
		this.name=name;
		birthday=thedate;
	}
	public String toString() {
		return String.format("my name is %s, my bithday is %s", name, birthday);
	}
}
