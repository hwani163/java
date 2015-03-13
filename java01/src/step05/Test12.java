package step05;

public class Test12 {
  
  
  static class Score{
    String name;
    int math;
    int kor;
    int eng;
    float avg;
    int sum;    
  }

  public static void main(String[] args) {
    
    Score sc = new Score();
    sc.name = args[0];
    sc.math = Integer.parseInt(args[1]);
    sc.kor = Integer.parseInt(args[2]);
    sc.eng = Integer.parseInt(args[3]);
    sc.sum = (sc.math+sc.kor+sc.eng);
    sc.avg = sc.sum/3;
    
    printScore(sc);
    

  }

   static void printScore(Score sc) {
     
     
     
     System.out.println("이름 : "+sc.name);
     System.out.println("수학 : "+sc.math);
     System.out.println("국어 : "+sc.kor);
     System.out.println("영어 : "+sc.eng);     
     System.out.printf("총점 : %d 평균 : %.1f",sc.sum,sc.avg);
     
    
    
  }

}
