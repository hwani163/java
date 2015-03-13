package step07.ex2;

/**
 *  복합 자료형에 배정 연산자를 추가한다.
 *  = ? 아니 , 기존의 배정 연산자는 재정의 할 수 없다.
 *  메서드로 표현한다.
 *  
 * 
 * */

public class Score {
  
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float average;
 
  /* 이전방법 : 초기화 메서들 별도로 정의!
  public void init(String name, int kor, int math, int eng) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }
  */
  
//  새로운 방식 : 초기화 메서드 대신 생성자로 정의한다.
  
//  만약 클래스에 단 하나의 생성자도 없다면 , 컴파일러가 다음과 같은 기본생성자를 추가한다.
  public Score(){
}
  /*public Score(String name , int kor , int eng , int math){
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;    
  }*/
//  초기화 메서드를 별도로 사용하여 해도 되지만
//  생성자를 사용하면 훨씬 더 간결하고 안전한 코드를 작성 할 수 있다.
//  생성자가 더 안전한 이유 init메서드의 호출은 선택사항이다. 즉! 호출하지 않아도
//  컴파일 할 때 아무런 문제가 없다. 
//  하지만 생성자는 호출하지 않으면 컴파일 오류가 발생한다.
//  따라서 강제로 인스턴스의 값을 초기화 시키고 싶으면 일반메서드를 통해 초기화 하지말고
//  생성자를 이용하여 초기화 하면 된다.
  
//  인스턴스의 점수 합을 구하는 연산자 정의
  public void summarize() {
    this.sum = this.eng + this.math + this.kor;

  }

//  인스턴스의 점수 평균을 구하는 연산자 정의
  public void average() {
    this.average = this.sum / 3;
  }
  
//  인스턴스의 값을 출력하는 연산자
  public void print(){
    System.out.println("========================");
    System.out.printf("이름 : %s\n",this.name);
    System.out.printf("국어 : %d\n",this.kor);
    System.out.printf("영어 : %d\n",this.eng);
    System.out.printf("수학 : %d\n",this.math);
    System.out.printf("총점 : %d\n",this.sum);
    System.out.printf("평균 : %.1f\n",this.average);
    System.out.println("========================");
    

  }
  
}
