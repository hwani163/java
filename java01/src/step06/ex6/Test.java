package step06.ex6;


/**
    문제?
    계산을 병렬로 진행 하려고 한다.
    그런데 , Class변수는 하나 밖에 없기 때문에
    병렬로 계산을 수행 할 수 없다.
    어떻게 하면 해결 할 수 있을까?
    
    해결책 => Calculator2와 Test2를 참고!
  
 * */

public class Test {

  public static void main(String[] args) {

    Calculator.init(3);
    Calculator.init(5);
    
    Calculator.multiple(7);
    Calculator.minus(2);
    
    Calculator.minus(4);
    Calculator.multiple(3);
    
    Calculator.plus(8);
    Calculator.multiple(2);
    
    Calculator.divided(2);
    

    System.out.printf("결과 = %d\n", Calculator.result);

  }

}
