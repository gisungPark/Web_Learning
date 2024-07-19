package com.newlecture.code.func;

public class App4 {

	public static void main(String[] args) {
		
		// Notice 데이터 하나
		int id = 0;
		String title = null;
		String content = null;
		int hit = 0;
		
		// 입력(모든 속성 상수로 직접대입)
		input(id, title, content, hit);		
		// 출력(모든 속성 출력)
		print(id, title, content, hit);		
		// 조횟수 1업
		hitUp(hit);
		print(id, title, content, hit);
	}
	private static void input(int id, String title, String content, int hit) {
		// TODO Auto-generated method stub
		id=1;
		title="hehe";
		content = "무";
		hit = 0;
	}

	private static void print(int id, String title, String content, int hit) {
		System.out.printf("id:%d, title:%s, content:%s, hit:%d\n"
				, id, title, content, hit);
	}

	
	private static void hitUp(int hit) {		
	}

}
