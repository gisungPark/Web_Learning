package com.newlecture.controller.exam;

import java.util.Arrays;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		
		int a=1;
		
//		int[] x = new int[]{2,3,4,5};
		int[] x = {2,3,4,5};
		int[] y = x;
		
//		for(int i=0; i<4; i++)
//			x[i] = 20+i;
		
		// 값 바꾸기
//		[20][21][22][23]
		System.out.println(Arrays.toString(x));
		{
			int temp;
			temp = x[0];
			x[0] = x[3];
			x[3] = temp;
		}
//		[23][21][22][20]
		System.out.println(Arrays.toString(x));
		
		
		
		
		// 배열 바꾸기
		
//		x[0]=20;  // [[0][1][2][3]]
//		x[a]=20;
//		x[2]=20;
//		x[3]=20;
		
		
		
//		System.out.println(x);
		
		
//		Array;
//		Arrays;

		{
			int b;
		}
		
		
	}

}
