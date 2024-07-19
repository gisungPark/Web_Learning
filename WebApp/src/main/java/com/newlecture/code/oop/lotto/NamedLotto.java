//package com.newlecture.code.oop.lotto;
//
//import java.util.Arrays;
//
//public class NamedLotto extends Lotto {
//	private String name;
//	private int x;
//	
//	public NamedLotto() {
//		super(); //nums
//		name = "";
//	}
//	
//	public NamedLotto(String name) {
//		super(); //nums
//		this.name = name;
//	}
//	
//	public NamedLotto(String name, int[] nums) {
//		super(nums); //nums
//		// ?? nums를 부모에게 설정(초기화)를? 어떻게 하지?
//		this.name = name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		//return name+":Lotto [nums=" + Arrays.toString(getNums()) + "]";
//		return name+":"+super.toString();
//	}
//	
//}
