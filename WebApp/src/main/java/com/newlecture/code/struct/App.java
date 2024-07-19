package com.newlecture.code.struct;

public class App {

	public static void main(String[] args) {		
		// Notice 데이터 하나
		Notice notice=new Notice();
		int x=10;
		// 입력(모든 속성 상수로 직접대입)
		input(notice);		
		// 출력(모든 속성 출력)
		print(notice,x);		
		// 조횟수 1업
		hitUp(notice);
		print(notice,0);
	}

	private static void input(Notice notice) {
		notice.id = 1;
		notice.title = "데이터란?";
		notice.content = "hehe";				
	}

	private static void print(Notice notice, int x) {
		System.out.println(notice);
		String template = """
				id:%d
				title:%s
				content:%s
				hit:%d
				""";
		System.out.printf(template, 
				notice.id, notice.title, notice.content, notice.hit);
//		System.out.printf("id:%d\n", notice.id);
//		System.out.printf("tiitle:%s\n", notice.title);
//		System.out.printf("tiitle:%s\n", notice.title);
//		System.out.printf("id:%d\n", notice.id);
	
	}

	private static void hitUp(Notice notice) {
		notice.hit++;
	}
}
