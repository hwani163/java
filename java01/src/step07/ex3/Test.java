package step07.ex3;
/**
 기본생성자를 개발자가 직접 추가하기
 - 인스턴스 생성시 기본으로 최소한의 설정할  값이 있다면
 - 기본생성자를 직접 추가하라
     
 *      */

public class Test {

  public static void main(String[] args) {
   
//    인스턴스를 생성할 때는 어떤 생성자를 호출할지 반드시 지정해야 한다.
//    지정하는 방법 : 
//    클래스 이름 뒤에 파라미터 값을 어떻게 넣느냐에 따라 결정한다.
//    다음과 같이 아무런 값을 넣지 않으면 , 기본 생성자가 호출된다.
    
    Score s2 = new Score();
    
//    기본 생성자가 호출되는 상황을 시험해 보자@
//    인스턴스 생성
    
    
    s2.summarize();
    s2.average();  
    s2.print();
    
    
//    기본생성자가 없는 경우를 시험하자
//    Score2 s3 = new Score2(); //기본생성자가 없기 때문에 문법 오류
    
//    다음과 없는 생성자 호출해도 문법오류!
//    Score2클래스에는 int값을 받는 생성자가 없다.
//    Score2 s3 = new Score2(100); //오류!
      Score2 s3 = new Score2("임꺾정");
      s3.print();

  }

}
