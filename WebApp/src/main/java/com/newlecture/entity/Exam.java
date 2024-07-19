package com.newlecture.entity;

public class Exam {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
		this("",0,0,0);
	}

		
	public Exam(String name, int kor, int eng, int math) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	protected void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Exam [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
}
