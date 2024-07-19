package com.newlecture.code.oop.lotto;

public class App {

	public static void main(String[] args) {
		
		System.out.println("main started");
		// 준비물 로또를 
		int a = 4;
		
		
		LottoService service = new LottoService();
		
				
		// 1. 로또 관리 메뉴를 출력하고
		
		// 2. 메뉴를 입력 받고
		
		// 2-1 로또 자동 생성
		//	몇 개를 생성할까요?
		int count = 3;
		service.genLottos(count);
		
		
		
		// 2-2 로또 수동 생성
		//  계속할까요?
		// 
		
		// 2-3 로또 번호 수정
//		어떤 로또번호를 수정하고 싶으세요
//		인덱스입력>2
		int index = 2;
		
////		어떤 번호로 바꾸고 싶으세요
////		번호입력>2 3 5 6 7 8
//		int[] nums = ...;
//		service.changeLotto(index, nums);
//		
//		번호가 변경되었습니다. 바뀐 로또 번호는 다음과 같습니다.
//		인덱스 2
//		번호 2 3 5 6 7 8
//		
		
		
		
//		Lotto lotto = new Lotto();
//		Lotto lotto1 = new Lotto();
//		
//		// lotto 초기화
//		//Lotto.init(); // 정적함수, 고전적인 함수 / 
//		//lotto.reset(); // 인스턴스 함수, 객체를 넘겨 받는 함수 / 
//		//lotto1.reset();
//
//		// swap 0<->1; swap(0, 1);
//		lotto.swap(0,1);
//		lotto.setNum(2/*index*/,4/*value*/);
//		
//		//lotto.reset();
//		
//		// print();
//		for(int i=0; i<6; i++) {
//			int num = lotto.getNum(i);
//			System.out.println(num);
//		}
//		
	}

}
