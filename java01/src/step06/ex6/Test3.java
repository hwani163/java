package step06.ex6;


/**
    인스턴스 변수를 사용하는 메서드를 좀 더 직관적이고 간결하게 표현하기!!!
     - 인스턴스 주소를 넘기는 방법을 더 간단히 표현한다.
  
 * */

public class Test3 {

  public static void main(String[] args) {
    
//    결과를 개별적으로 관리하기 위해 인스턴스 생성한다.
    Calculator3 calc1 = new Calculator3();
    Calculator3 calc2 = new Calculator3();
/*   인스턴스 주소를 넘기는 위치를 앞으로 이동한다.
//     - 인스턴스 주소가 앞에 위치하므로 , 다루는 메모리를 더 강조한다.
 *    -더 직관적이다.
 *    - 메서드에 넘기는 것은 그 메서드가 작업하는데 필요한 값이다.
 *    - 즉, 메서드가 다루는 메모리와 작업하는데 필요한 값을 분리 =>더 직관적이다.
*/    
    
    
    //Calculator3.init(calc1, 3);
//    주소만 보여주면 , 클래스 이름은 어떻게 아는가?
//    15 , 16 번라인 선언문을 보면 알수있다!
    
//    인스턴스메서드는 인스턴스 주소 없이 호출 할 수 없다.
//    Calculator3.init(3); <=문법적으로 오류난다. 인스턴스가 필요한데 인스턴스 주소를주지 않았기 때문이다.
    
    calc1.init(3); // calc1의 주소가 init의 this안에 들어가게된다.
    calc2.init(5);
    
    calc1.multiple(7);   
    calc2.minus(2);
    
    calc1.minus(4);    
    calc2.multiple(3); 
    
    calc1.plus(8);
    calc2.multiple(2);
    
    calc1.divided(2);
    

    System.out.printf("결과 = %d\n", calc1.result);
    System.out.printf("결과 = %d\n", calc2.result);


  }

}
