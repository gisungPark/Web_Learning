package com.newlecture.code.struct.lotto;

import java.util.Random;
import java.util.Scanner;

public class G7 {

   // 입력을 6번 받을경우
   
   // 한번에 입력을 받아서 1번만 출력할 경우
   static int[] lotto = new int[6];
   static int inputLottoNums = 0;
   static String menu;
   static String answer;
   static boolean exit;
   
   public static void main(String[] args) {
      exit = true;
      while (exit) {
         lottoMenu();
         switch (menu) {
         case "1":
            lotto();
            break;
         case "2":
            lottoAuto();
            break;
         case "3":
            lottoList();
            break;
         case "4":
            lottoEnd();
            break;
         }// switch end
      } // while end
   } // main end
   
   static void lottoMenu() {
      Scanner sc = new Scanner(System.in);
      String line = """
            
            \n[로또 복권 프로그램]

            1. 수동 발권
            2. 자동 발권
            3. 발권번호 조회
            4. 종료

            메뉴입력>""";
      System.out.print(line);
      menu = sc.nextLine();
   }//lottoMenu end
   
   static void lotto() {
      Scanner sc = new Scanner(System.in);
      System.out.println("[수동 발권]\n※1~45 숫자 범위에서 원하는 번호를 스페이스를 구분자로 6개 입력하세요.\n 숫자는 정렬되어 있지 않아도 상관없다※");
      System.out.print("번호>");
      for (int i = 0; i < 6; i++) {
         inputLottoNums = sc.nextInt();
         lotto[i] = inputLottoNums; // 로또번호 배열에 저장
      } //for end
      System.out.println("입력한 번호 확인");
      System.out.printf("%d %d %d %d %d %d", lotto[0], lotto[1], lotto[2], lotto[3], lotto[4], lotto[5]);
      System.out.println("위에 입력한 번호가 맞나요? Y/N");
      answer = sc.next();
      if (answer.equals("Y")) {               
         System.out.println("프로그램 종료");
         exit = false;
      }
   }//lotto end
   
   static void lottoAuto() {
      Scanner sc = new Scanner(System.in);
      Random random = new Random();
      System.out.println("[자동 발권]");
      System.out.print("자동으로 발권한 번호>");
      for (int i = 0; i < 6; i++) {
         int temp = random.nextInt(100);
         lotto[i] = temp;
         System.out.print(" " + lotto[i]);
      }
      System.out.println("\n상위메뉴로 가려면 아무키나 누르세요.");
      sc.next();
   }//autoLotto end
   
   static void lottoList() {
      System.out.println("[발권한 로또번호]");
      for (int i = 0; i < 6; i++)
         System.out.print(" " + lotto[i]);
   }//lottoList end
   
   static void lottoEnd() {
      Scanner sc = new Scanner(System.in);
      System.out.print("종료하시겠습니까?(Y/N)>");
      answer = sc.nextLine();
      if(answer.equals("Y")) {         
         System.out.println("프로그램 종료");
         exit = false;
      }
   }//lottoEnd end
   
} // class end
