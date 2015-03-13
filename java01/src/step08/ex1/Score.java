package step08.ex1;


  //클래스 변수의 활용
public class Score {
  int count; //전체학생의 수를 저장한다.
  int no;//학생의 고유 번호 , 학번
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  
  public Score(int no,String name , int kor , int eng , int math){
    this.no = ++count;
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.sum = this.kor+this.eng+this.math;
  }
  
  

}
