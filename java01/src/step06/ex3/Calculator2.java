package step06.ex3;

// 다른 패키지에서도 메서드를 호출할수 있도록 접근범위를 넓혀 보자!
// public 으로 설정하자
public class Calculator2 {
  // 메서드 앞에 접근 범위에 대한 설정이 붙지 않았다. 즉 , default이다.
//  default(같은 패키지에 속한애들 가능)
  public static int plus(int a , int b){
    return a+b;
  }
  public static int minus(int a , int b){
    return a-b;
  }
  public static int multiple(int a , int b){
    return a*b;
  }
  public static int divided(int a , int b){
    return a/b;
  }
  
//  private - 같은 클래스 내에서만 사용가능 하다.
//  Test.java에서 remainder에 접근불가하다
private static int remainder(int a, int b){
    return a%b;
  }


}

  


