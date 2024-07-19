package com.newlecture.code.struct.lotto;

import java.util.Random;


public class Lotto {

	public int x;
	public int y;
	public int[] nums;// = new int[6];
	
	public static void genAuto(Lotto lotto) {
		Random rand = new Random();
		
		for(int i=0; i<6; i++) {
			int num = rand.nextInt(45)+1; // 0~44 + 1
			lotto.nums[i] = num;
		}
		
	}

	public static void parse(Lotto lotto, String strLotto) {
		String[] tokens = strLotto.split(" ");
		for(int i=0; i<6; i++)
			lotto.nums[i] = Integer.parseInt(tokens[i]);
	}
}
