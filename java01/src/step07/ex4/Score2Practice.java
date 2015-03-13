package step07.ex4;

public class Score2Practice {
  
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float average;  

  public Score2Practice(){
    this("홍길동");
  }
  
  public Score2Practice(String name){
    this(100,100,100,name);
  }
  
  public Score2Practice(int kor , int  eng , int math , String name){
    
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.name = name;
    this.sum = sum;
    this.average = average;
  }
  
  public Score2Practice(String name , int kor , int eng , int math){
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.name = name;
    this.sum = sum;
    this.average = average;
  }
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
  
  public void summarize() {
    this.sum = this.eng + this.math + this.kor;
//    this("홍길동"); //오류! 용서받지 못할 오류!!
  }

//  인스턴스의 점수 평균을 구하는 연산자 정의
  public void average() {
    this.average = this.sum / 3;
  }
  
}
