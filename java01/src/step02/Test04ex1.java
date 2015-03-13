package step02;

import java.util.Scanner;

public class Test04ex1 {

  public static void main(String[] args) {
/*
 * 이름 : 홍길동
 * 국어 : 100
 * 영어 : 90
 * 수학 : 80
 * 총점 : 270 입니다. 평균은 90.0 입니다.*/    
    

   java.util.Scanner keyScan = new Scanner(System.in);
   
   System.out.print("이름? ");
   String name = keyScan.next();
   
   System.out.print("국어? ");
   int kor = keyScan.nextInt();
   
   System.out.print("영어? ");
   int eng= keyScan.nextInt();
   
   System.out.print("수학? ");
   int math = keyScan.nextInt();
   
   int sum =kor + eng + math;
   float avr = sum / 3;
 
   System.out.printf("총점은 : %d 이고 평균은 %.1f입니다.\n", sum, avr);
   
   keyScan.close();
   
  }

}
