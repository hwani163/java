package step08.ex1;


  /**
   * 클래스 변수의 활용법을 알아보자!
   * 학생의 수는 Score클래스에서 관리한다.*/
public class Test2 {
  
  static void printScore(Score2 score){
    System.out.printf("%d , %s, %d, %d, %d\n",
        score.no,score.name , score.kor , score.eng , score.math);
  }

  public static void main(String[] args) {
    
    
    Score2 s1 = new Score2("홍길동", 100, 100, 100);
    Score2 s2 = new Score2("임꺽정", 90, 90, 90);
    Score2 s3 = new Score2("안중근", 80, 80, 80);
    
    printScore(s1);
    printScore(s2);
    printScore(s3);
    
    System.out.println(Score2.count);
    //System.out.println(count);   <=오류
    

  }

}
