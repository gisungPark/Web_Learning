package com.newlecture.code.func;

public class App3 {

	public static void main(String[] args) {
//		값 변수와 참조 변수를 이용한 함수 호출
//		참조 변수를 전달하면 수정된 값들을 반환할 필요가 없다.
		
		int[] nums = {3,6,5,2,3,4};
		int num = 30;
		
		print(nums);
		print(num);
		
		sort(nums);
		num = update(num);
		
		print(nums);
		print(num);
		
//		// 출력
//		{
//			
//		}
//		
//		// 정렬
//		{
//			
//		}
//		
//		// 출력
//		{
//			
//		}
		
	}

	private static int update(int num) {
		num++;		
		return num;
	}

	private static void print(int num) {
		System.out.println(num);
	}

	private static void sort(int[] a) {
		a[0] = 4000;		
	}

	private static void print(int[] a) {
		// TODO Auto-generated method stub
		
	}

}
