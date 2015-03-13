package step03;
/*
 *    연산자 우선순위
 *    괄호 ()
 *    * , % : 먼저 나온 순서 대로 실행
 *    + , - : 먼저 나온 순서 대로 실행
 *    
 * */


public class Test02 {

  public static void main(String[] args) {
    
    int result = 1 + 3 * 2 + 7;
    System.out.println(result);
    
    int result2 = 1 + 3 * (2+7);
    System.out.println(result2);
    
//    우선으로 해야할 연산이 있다면  우선순위 따지지말고 ()괄호를 넣어서 하면된다!
    
    
   

  }

}
