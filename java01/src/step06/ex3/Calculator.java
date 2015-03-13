package step06.ex3;

//  메서드를 분류한후
//  ex2.Test.java -> 계산과 관련된 메서드를 분류하여 정의함
public class Calculator {
  // 메서드 앞에 접근 범위에 대한 설정이 붙지 않았다. 즉 , default이다.
//  default(같은 패키지에 속한애들 가능)
  static int plus(int a , int b){
    return a+b;
  }
  static int minus(int a , int b){
    return a-b;
  }
  static int multiple(int a , int b){
    return a*b;
  }
  static int divided(int a , int b){
    return a/b;
  }
  
//  private - 같은 클래스 내에서만 사용가능 하다.
//  Test.java에서 remainder에 접근불가하다
private static int remainder(int a, int b){
    return a%b;
  }


}

  


