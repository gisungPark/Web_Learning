package com.newlecture.code.oop.abstrac;

public class 원 extends 도형 {
	
	private int 반지름;
	private final static String 형식;
	
	static {
		형식="원";
	}
	
	public 원() {
		// TODO Auto-generated constructor stub
	}
	
	public void 그리기() {
		System.out.println(toString());		
	}
	
	

	@Override
	public String toString() {
		return "원 [x=" +  ", y=" + ", 반지름=" + 반지름 + "]";
	}
	
	
}
