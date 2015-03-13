package step06.ex4;

/**
 * default 접근 범위를 갖는 메서드를 호출 할 수 있을까?
 *  - 같은 패키지 소속이 아니면 호출 할 수 없다. **/
public class Test {
  public static void main(String[] args){
    
//    step06.ex3.Calculator.plus() 메소드의 접근범위는 default이기 때문에
//    다른 패키지소속의 클래스 에서는 호출 할 수 없다.
//    default 접근범위 : 같은 패키지 이내
    
//    int result = step06.ex3.Calculator.plus(10,20);
    
    
    //메서드가 public 접근 범위를 갖기 때문에 호출할 수 있다.
    int result = step06.ex3.Calculator2.plus(10,20);
    
  }

}
