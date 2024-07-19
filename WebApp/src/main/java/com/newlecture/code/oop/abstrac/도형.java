package com.newlecture.code.oop.abstrac;

public abstract class 도형 {
	private int x;
	private int y;
	
	public void 이동(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void 그리기();
}
