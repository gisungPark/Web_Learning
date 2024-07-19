package com.newlecture.code.struct.exam;

public class Exam {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public static void setName(Exam exam, String value) {
		exam.name = value;
	}

	public static String getName(Exam exam) {
		return exam.name;
	}
	
	public static void setKor(Exam exam, int value) {
		exam.kor = value;
	}

	public static int getKor(Exam exam) {
		return exam.kor;
	}
	
	public static void setEng(Exam exam, int value) {
		exam.eng = value;
	}

	public static int getEng(Exam exam) {
		return exam.eng;
	}
	
	public static void setMath(Exam exam, int value) {
		exam.math = value;
	}

	public static int getMath(Exam exam) {
		return exam.math;
	}
	
	
}
