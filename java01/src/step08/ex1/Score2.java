package step08.ex1;


/**
 * 래스 변수의 활용
 * 학생의 카운트를 Score클래스에서 관리한다.
 * 클래스 변수의 생성시점
 *  - 클래스가 로딩될때 Method Area 영역에 준비 된다.*/
public class Score2 {
  
//  전체 학생의 수와 같이 개별적으로 관리하는 데이터가 아니고 , 
//  여러 인스턴스 들이 공유해야 하는 데이터는 클래스 변수에 보관한다.
  static int count; //전체 학생수를 저장
  int no;//학생의 고유 번호 , 학번
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  
  public Score2(String name , int kor , int eng , int math){
    this.no = ++count; //
//    클래스 변수는 원래 클래스 이름을 지정하여 사용해야 한다.
//    하지만 같은 클래스는 클래스 이름을 지정하지 않아도 된다(생략가능)
//    즉 Score2.count 라고해야하지만 생략가능하여 count해도 된다.
//    Test2.java의 25번라인 참조하세요
    
    
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.sum = this.kor+this.eng+this.math;
  }
  
  

}
