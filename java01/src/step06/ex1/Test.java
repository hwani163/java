
package step06.ex1;
// 메서드를 분류하기전
public class Test {
  static int plus(int a , int b){
    return a+b;
  }
  static int minus(int a , int b){
    return a-b;
  }
  static int multiple(int a , int b){
    return a*b;
  }
  static int divided(int a , int b){
    return a/b;
  }
  public static void main(String[] args) {
    
    int result = 0;
    result = multiple(3, 7);
    result = minus(result, 4);
    result = plus(result, 8);
    result = divided(result, 2);
    
    System.out.printf("결과 = %d\n",result);

  }

}
