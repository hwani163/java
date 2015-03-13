package step05;
/**
 * Instance 전달하기 *
 * 
 * call by reference 의 대표적인것
 * **/

public class Test10 {
  
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;
  }
  
  static Score makeScore(String name , int kor , int eng , int math){
    Score score = new Score();
    score.eng=eng;
    score.kor=kor;
    score.name=name;
    score.math=math;
    score.sum=math+kor+eng;
    score.average=score.sum/3f;
    return score; //인스턴스를 리턴하는것이아니라 인스턴스 주소를 리턴하는것이다.
    
  }
  static void printScore(Score score){
    System.out.printf("이름 : %s\n",score.name);
    System.out.printf("국어 : %d\n",score.kor);
    System.out.printf("영어 : %d\n",score.eng);
    System.out.printf("수학 : %d\n",score.math);
    System.out.printf("총점 : %d , 평균 : %.1f\n",score.sum , score.average);   
    
  }

  public static void main(String[] args) {
//    사용자 정의 데이터 자료형
    
    Score score = makeScore("홍길동", 100, 80, 90);
    printScore(score);
    
  }

}
