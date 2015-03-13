package step06.ex3;


/**
 * 메서드의 접근 범위
 *  - public , protected , (default) , private
 *  - 1. public : 누구나 접근 가능
 *  - 2. protected : 같은 패키지 소속 클래스나 , 자식 클래스 접근가능
 *  - 3. (default) : 같은 패키지에 소속된 클래스 접근가능.
 *  - 4. private : 클래스 내부에서만 사용가능
 *  
 *  =>특정 메서드를 공개하고 비공개 하는것은 
 *      잘못된 사용을 방지하기 위함이다.
 *      ->객체지향 프로그래밍의 3대 특징중 하나인 "캡슐화(encapsulation)"라고 부른다.
 * */

public class Test {
  
  public static void main(String[] args){
    int result = 0;
    result = Calculator.multiple(3, 7);
    result = Calculator.minus(result, 4);
    result = Calculator.plus(result, 8);
    result = Calculator.divided(result, 2);
    
    System.out.printf("결과 = %d\n",result);
    
    /** remainder 메소드는 private접근 범위를 같기 때문에
    외부 클래스에서 호출 할 수 없다.
    Calculator.remainder(10,2);
    */
    
    
     
    
  }

}
