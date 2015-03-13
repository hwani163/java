package step07.ex4;

/**
 * 다형성의 오버로딩(OverLoading)을 이용하여
 * 생성자 여러개 선언하기
 * 
 * 오버로딩?
 *  - 같은 기능을 수행하는 메서드에 대해 같은 이름을
 *  부여함으로서 프로그래밍에 일관성을 부여하는 것
 *  과적재**/

//  오버로딩을 이용하여 생성자를 여러개 선언하기

public class Score {
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float average;

  // 오버로딩을 이용하여 생성자를 여러개 선언하기
  // - 같은 이름을 갖는 생성자를 여러개 선언할 수 있는 이유?
  // - 자바는
  // 기본생성자
  public Score() {
    System.out.println("Score 인스턴스 생성");
    name = "홍길동";
    this.kor = 100;
    this.eng = 100;
    this.math = 100;
    this.sum = this.kor + this.eng + this.math;
    this.average = this.sum / 3;
  }

  // 이름만 받는 생성자
  public Score(String name) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.sum = sum;
    this.average = average;
  }

  // 변수명은 메서드를 구분하는데 아무런 소용이 없다.
  // 따라서 다음과 같이 타입과 개수는 같은 변수명이 다른 메서드를
  // 추가할 수 없다.
  // 메서드를 구분하는 방법?
  // 호출 하는 쪽에서 어떤값을 던지느냐에 따라 메서드를 찾기 때문이다.

  public Score(String name, int kor, int eng, int math) {

    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.sum = sum;
    this.average = average;
  }

  // 아래는 불가능
  /*
   * public Score(String name, int eng,int kor , int math, int sum, float
   * average) {
   * 
   * this.name = name; this.kor = kor; this.eng = eng; this.math = math;
   * this.sum = sum; this.average = average; }
   */


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
