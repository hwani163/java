package step06.ex2;


//  메서드를 분류한후
//  ex1.Test.java -> 계산을 테스트 하는 함수(메인함수 , 실행)를 분류함.
public class Test {
  
  public static void main(String[] args){
    int result = 0;
    result = Calculator.multiple(3, 7);
    result = Calculator.minus(result, 4);
    result = Calculator.plus(result, 8);
    result = Calculator.divided(result, 2);
    
    System.out.printf("결과 = %d\n",result);
  }

}
