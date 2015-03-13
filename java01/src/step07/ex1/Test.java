package step07.ex1;
/**
 생성자
   - 인스턴스를 생성한 후 자동 호출 되는 메서드로서
   - 인스턴스의 메모리를 초기화 하는 용도
   - 문법이 있다
     =>리턴 타입이 없다.
     =>메서드 이름은 클래스 이름과 같아야 한다.
     =>파라미터를 받지 않는 생성자를 "기본 생성자 (default constructor)"라고 부른다.
     
 *      */

public class Test {
/*
  static void init(Score score, String name, int kor, int math, int eng) {
    score.name = name;
    score.kor = kor;
    score.eng = eng;
    score.math = math;
  }

  
*/
  public static void main(String[] args) {
   
  
    
/*    이전방식 :  인스턴스생성후 별도의 초기화 메서드를 호출하였다(이곳에서는 init호출)
    Score s1 = new Score();
    s1.init("홍길동", 100, 80, 60);
    //s1에 대해 점수 합을 구하는 연산자를 실행한다.
    s1.summarize();
    //s1에 대해 점수의 평균을 구하는 연산자를 실행한다.
    s1.average();
    */
    
//    새로운방식 : 생성자를 사용한방식
//    인스턴스 생성시 초기화 메서드를 바로 호출하고,
//    초기화 시키는데 필요한 값을 바로 전달한다.
    
    Score s2 = new Score("홍길동",100,90,80);
    
    s2.summarize();
    s2.average();
 
   
//    new 클래스명(호출하는 생성자의 파리미터 값);
//    Score s3 = new Score(); //생성자 호출 시 값을 넘겨주지 않으면 컴파일 오류가 발생한다!
//    s3.init("윤봉길", 100, 100, 100);
//    s3.summarize();
//    s3.average();
    
    
    

    
//    s1에 대해 내용을 화면에 출력하는 연산자를 실행한다.
   
    s2.print();
    
    
    
//    생성자를 따로 호출 할 수 없다.
    //s2.Score("임꺽정",100,,100,100);
  
    

    

  }

}
