package step06.ex5;

/**
 * 클래스 변수(스태틱 변수라고도 한다.)!
 *  -  클래스에 중간 계산 결과를 저장할 변수(result)를 선언한다.
 *  - static으로 선언한다.
 *  - new 명령으로 준비하지 않는다.
 *  
 *  - 클래스가 로딩되는 시점에 Method Area 영역에 준비된다.
 *  - 클래스는 한 번만 로딩된다.
 *  - 따라서 클래스 변수는 딱 한번만 준비된다.
 *  
 *  스태틱으로 선언되면 자동으로 준비된다. 
 *  스태틱으로 선언되지 않으면 new명령으로 준비 시켜야 한다.
 *  */
public class Calculator {
//계산 결과를 저장할 클래스 변수
  public static int result;// method Area영역에 준비된다.
//  결과 값을 담을 변수를 초기화 시키는 메서드
//  초기값을 설정해주는 메소드
  public static void init(int value) {
    result = value;
  }

  public static void plus(int value) {
    result += value;
  }

  public static void minus(int value) {
    result -= value;
  }

  public static void multiple(int value) {
    result *= value;
  }

  public static void divided(int value) {
    result /= value;
  }

  public static void remainder(int value) {
    result %= value;
  }


}

  


