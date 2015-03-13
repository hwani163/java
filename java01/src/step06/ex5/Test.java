package step06.ex5;


/**
  클래스 변수
  - 메서드가 다루는 데이터는 그 메서드가 소속된 클래스에 두는것이 좋다.
  - Test.java에서 결과를 저장하기 위해 선언된 result 변수를 Calulator로 옮기자!
  
 * */

public class Test {

  public static void main(String[] args) {

    Calculator.init(3);
    Calculator.multiple(7);
    Calculator.minus(4);
    Calculator.plus(8);
    Calculator.divided(2);

    System.out.printf("결과 = %d\n", Calculator.result);

  }

}
