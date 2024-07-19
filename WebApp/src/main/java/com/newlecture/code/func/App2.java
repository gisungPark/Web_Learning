package com.newlecture.code.func;

public class App2 {
	
	// 덧셈 출력
	static void printAdd()
	{
		int x = 3;
		int y = 4;
						
		int result = x + y;			
		
		System.out.println(result);
	}
	
	static int add()
	{
		int x = 3;
		int y = 4;
						
		int result = x + y;
		
		return result;
	}
	
	static int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	
	static float add(float x, float y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printAdd();
		// 덧셈 출력
		{
			
			int x = 3;
			int y = 4;
							
			int result = add(x, y);
			
			
//			int result = add();
			
			System.out.println(result);
		}
//				---------------------------
		// 뺄셈 출력
		{
			int x = 3;
			int y = 4;
			
			int result = x - y;
			System.out.println(result);
		}
	}



}
