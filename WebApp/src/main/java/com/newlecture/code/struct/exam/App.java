package com.newlecture.code.struct.exam;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Exam exam = new Exam();
		
		while(true) {
			
			int menu = inputMenu();
			
			switch(menu) {
			case 2: // 입력
				clear();
				set(exam);
				
				pause();
				break;
			case 3: // 출력
				clear();
				print(exam);
//				print()
				pause();
				break;
			}
			
		}
	}

	static void print(Exam exam) {
		System.out.printf("name:%s, kor:%d, eng:%d, math:%d\n",
//				exam.name,
//				exam.kor,
//				exam.eng,
//				exam.math
				Exam.getName(exam),
				Exam.getKor(exam),
				Exam.getEng(exam),
				Exam.getMath(exam)
				);
		
	}

	static void set(Exam exam) {
//		exam.name="홍길동";
//		exam.kor = 30;
//		exam.eng = 40;
//		exam.math = 50;		
		Exam.setName(exam, "홍길동");
		Exam.setKor(exam, 30);
		Exam.setEng(exam, 40);
		Exam.setMath(exam, 50);
	}

	static int inputMenu() {
		System.out.println("""
            ┌───────────────────────────────┐
            │            성적관리           │
            └───────────────────────────────┘
            
            1. 목록보기
            2. 성적추가
            3. 성적로드
            4. 성적저장
            5. 종료
        """);

        Scanner scan = new Scanner(System.in);
        System.out.print("메뉴번호입력>");
        int menu = Integer.parseInt(scan.nextLine());
            
		return menu;
	}


	static void pause() {
		System.out.println();
        System.out.println("───────────────────────────────");
        System.out.println("Press any key to continue>");

        Scanner scan = new Scanner(System.in);
        scan.nextLine();
	}
    static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }

    static void clear() {
        try {
            String operatingSystem = System.getProperty("os.name");
            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
