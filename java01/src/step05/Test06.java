package step05;
/**
 * Parameter와 Return Type이 있는 Method*/
public class Test06 {
  
  static int plus (int a , int b){
    return a+b;
  }
  static int minus (int a , int b){
    return a-b;
  }
  static int multiple (int a , int b){
    return a*b;
  }
  
  static int divided (int a , int b){
    return a/b;
  }

  public static void main(String[] args) {
    
    int v1 = 10 , v2 = 20;
//    argument를 넘기고 결과를 받는 Method 호출 예
    int result = plus(v1, v2);
    System.out.println(result);
    
//   Method의 argument로 method를 호출하는 예
    System.out.println(minus(v1, v2));
    System.out.println(multiple(v1, v2));
    System.out.println(divided(v1, v2));
    
    

  }

}
