package step07.ex4;

/**
 * 
 * this()를 이용하여 중복 되는 코드를 간결하게 만들자!
 * 
 * **/

//  오버로딩을 이용하여 생성자를 여러개 선언하기

public class Score2 {
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float average;

//다른 생성자를 호출하여 초기화 작업을 완료한다.
  public Score2() {
    this("홍길동");
  }

  // 이름만 받는 생성자
  public Score2(String name) {
    this(100,100,100,name);
  }
  

  public Score2(String name, int kor, int eng, int math) {

    this(kor ,eng ,math ,name); //문법 오류! this()는 반드시 첫번쨰로 호출되어야 한다.
    System.out.println("this()는 반드시 첫번째로 호출해야 한다.!");
  }
  
  public Score2( int kor, int eng, int math,String name) {

    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.sum = sum;
    this.average = average;
  }




//  인스턴스의 점수 합을 구하는 연산자 정의
  public void summarize() {
    this.sum = this.eng + this.math + this.kor;
//    this("홍길동"); //오류! 용서받지 못할 오류!!
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
