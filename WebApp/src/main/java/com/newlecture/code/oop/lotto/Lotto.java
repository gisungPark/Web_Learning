package com.newlecture.code.oop.lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	private int[] nums;
	
	public Lotto(){
		nums = new int[6];
	}
	
	public void genAuto() {
		Random rand = new Random();
		
		for(int i=0; i<6; i++)
			nums[i] = rand.nextInt(45)+1;
	}


	public void swap(int s, int d) {
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
	}

	@Override
	public String toString() {
		return "Lotto [nums=" + Arrays.toString(nums) + "]";
	}

	public int getNum(int index) {
		
		return nums[index];
	}

	public void setNum(int index, int value) {
		nums[index] = value;
	}

//	protected int[] getNums() {
//		return nums;
//	}
	
	

}
