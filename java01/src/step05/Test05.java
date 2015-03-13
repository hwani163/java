package step05;

/**
 * 명령어를 실행할때 값을 받는 메서드 
 * void 메서드명(값을 담을 변수 선언 , ...) {명령어들}
 * 용어정리!
 * 값을 담는 변수 : 파라미터 (Parameter , 매개변수)
 * 메서드를 호출할때 전달하는 값 : 아규먼트(argument,인자)*/

public class Test05 {
  
  static void printHi(String name){
    System.out.printf("%s님 반값습니다.%n",name);
    System.out.println("끝까지 잘 마무리 하여 좋은 직장 얻자\n");
  }
  
  static void printMyStandardWeight(String name, float height, float weight) {
    System.out.printf("%s님의 현재 몸무게는 %.1f입니다.\n", name, weight);
    float standardWeight = (height - 100) * 0.9f;
    System.out.printf("표준 몸무게는 %.1f Kg 안팎 이여야 합니다.\n", standardWeight);
    System.out.printf("표준 몸무게와의 차이는 %.1f입니다.\n", weight - standardWeight);

  }
  
  /************************************************/
//  가변인자(Optional Parameter) 사용법
//    - 0개 이상의 값을 넘길수 있다.
//    - 타입... 변수명
//  맨 마지막에 위치해야한다.
//  Optional Parameter
  /************************************************/
  static void printScoreSum(String name , String tel , int... scores){
    System.out.printf("이름 : %s\n" , name);
    System.out.printf("전화 : %s\n",tel);
    int sum=0;
    for (int score : scores) {
      sum +=score;
    }
    System.out.printf("총점 : %d\n",sum);
    
  }

  public static void main(String[] args) {
   printHi("홍길동");
   
   System.out.println("-----------------------------------");   
   
   printMyStandardWeight("홍길동", 174 , 63.1f );
   
   System.out.println("-----------------------------------");
   
   printScoreSum("홍길동", "010-300", 100,80,70,60,40,10);
   
  }
  
 

}
