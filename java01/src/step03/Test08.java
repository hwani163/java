package step03;
/*
 * 조건 연산자 : 피연산자가(operand)가 논리 값이여야 한다.
 * 
 *  - && , || , ?
 *  1) && 두개의 논리 값이 모두 true 일때 결과는 true
 *  2) || 둘중 하나라도 true이면 결과는 true
 *  3) 조건 ? 문장1 : 문장2 - 조건이 true이면 문장1 수행 false이면 문장2 수행*/

public class Test08 {

  public static void main(String[] args) {
    
    int v1 = 10;
    int v2 = 20;
    
//    System.out.printf("%b", v1 && v2); // 피연산자가 int이기 때문에 오류!
    
    System.out.printf("%b , %b\n" ,true && true , true && false );
    System.out.printf("%b , %b\n",true || true , true || false);
    
    System.out.printf("%s\n",(10<11)? "작다" : "크다");
//    조건 연산자!!
//    기억을 잘해두어야 한다!!!!!
    
    System.out.println();
    
   /*******************************************************************************
        $$네이버 , 다음 , 기술평가시 많이 나오는 문제 $$
      
        & vs &&
        x && y => x가 거짓이면 y는 수행하지 않는다.(효율적이다)
        x& y => x가 거짓이라고  y를 끝까지 수행한다.!(비효율적이다)
      
        & 또는 | 의 경우 피 연산자가 논리 값이라면 
        비트 연산자가 아니라 AND  , OR 연산자로 동작한다.
      
    ********************************************************************************/
    boolean v3 =false;
    
    boolean r1 = (10 > 100) && (v3 = true);    
    System.out.printf("%b , %b\n" , r1 , v3);
    
     v3 =false;
     r1 = (10 > 100) & (v3 = true);    
    System.out.printf("%b , %b" , r1 , v3);
    
    
    /*******************************************************************************
        $$네이버 , 다음 , 기술평가시 많이 나오는 문제 $$
    
       || vs |
     
       x || y : x가 true이면 y를 실행하지 않는다.(효율적)
       x | y : x가 true라 할지라도 y를 끝까지 실행한다. (비 효율적이다.)
     
    
  ********************************************************************************/
    
    
    r1 = (10 > 100) || (v3 = true);    
    System.out.printf("%b , %b\n" , r1 , v3);
    
     v3 =false;
     r1 = (10 > 100) | (v3 = true);    
    System.out.printf("%b , %b" , r1 , v3);
    
    
    
    
    
    
    }

}
