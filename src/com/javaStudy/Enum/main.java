package com.javaStudy.Enum;

public class main {

	public static void main(String[] args) {
		for(Enum people: Enum.values()) {
			System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getYear());
		}
	}



}
