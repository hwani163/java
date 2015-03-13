package step07.ex6;

/**
 * 
 * this()를 이용하여 중복 되는 코드를 간결하게 만들자!
 * 
 * **/


//  초기화 문장을 이용하여 인스턴스 변수의 값을 초기화 시키기.
//   - 인스턴스가 생성 =>초기화 문장이 실행 =>생성자가 호출
    
//    인스턴스가 준비되면 , 모든 변수는 0으로 자동 초기화 된다.
//    클래스 변수(static)도 0으로 자동 초기화 된다.
//    method의 로컬변수는  0으로 초기화 되지 않는다.

//  0으로 초기화 된다는 것은
//  byte , short , int , long , float , double =>0으로 초기화됨.
//  boolean =false;
//  char =>유니코드 0x00000000으로 초기화 된다. 결국 0이다.
//  로컬변수는 자동초기화가 되지 않는다. 그래서 초기화 하고 사용해야한다.
//  하지만 초기화 하지 않고 사용하려고 하면 컴파일 에러가 뜬다.


public class Score {
  String name="홍길동";
  int kor=50;
  int eng=50;
  int math=50;
  int sum;
  float average;

//다른 생성자를 호출하여 초기화 작업을 완료한다.
  public Score() {
//    로컬변수는 자동으로 초기화 되지 않기 떄문에 , 다음과 같이 변수를 선언한후
//    바로 값을 꺼내려 하면 컴파일 오류가 발생한다.
    
//    인스턴스 변수는 인스턴스 생성시 자동 초기화 되기 때문에 그냥 값을 꺼내도 된다.
//    어차피 꺼내봐야 0이다.(초기화되기때문)
    this.summarize();
    this.average();
  }

  // 이름만 받는 생성자
  public Score(String name) {
    this(); //초기화 문장을 통해 배정된 값으로 총점과 평균을 먼저 구하자!
    this.name=name;  //이름을 저장하자.
  }
  

  public Score(String name, int kor, int eng, int math) {

    this(kor ,eng ,math ,name);
    
  }
  
  public Score( int kor, int eng, int math,String name) {

    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.summarize();
    this.average();
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
