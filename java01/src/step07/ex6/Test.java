package step07.ex6;
/**
 초기화 문장의 활용
  - 초기화 문장이란?
  인스턴스 변수 선언시 값을 배정하는 명령어
  
  class Score{
  String name = "홍길동";
  ......
  }
  
  - 초기화 문장은 생성자가 호출되기 전에 수행된다.
  
  */

public class Test {

  public static void main(String[] args) {
    // 다양한생성자를 호출하여 인스턴스를 초기화 시켜보자!
    
    // 1) 기본 생성자 호출
//    실행순서 : 인스턴스 메모리 준비 =>0으로 초기화시킴 =>초기화 문장실행 =>생성자호출
    Score s1 = new Score();
    s1.print();

//    이름을 받는 생성자 호출
    Score s2 = new Score("유관순");
    s1.print();
//    이름과 성적을 받는 생성자 호출
    Score s3 = new Score("임꺽정", 90, 90, 100);
    s3.print();

    
  }

}
