package step05;

/**
 *  메서드 호출과 로컬 변수의 관계
 *  1. 메서드에 선언하는 변수 : 로컬 변수
 *  2. parameter도 로컬변수의 일종이다.
 *  3. 메서드 호출시 선언된 변수는 "스택"이라고 불리우는 메모리 영역에 준비된다.
 *  4. 메서드가 호출되면 스택 영역에 그 메서드를 위한 변수들이 준비된다.
 *  5. 메서드 호출이 끝나면 스택 영역에 준비된 메모리가 자동 해제된다.

**/
public class Test07 {
  
  static void m(int a){
    int b = a * 2;
    System.out.printf("m() : a=%d , b=%d\n",a,b);   //다른 method의 변수에 접근불가!
    a++;
    System.out.printf("m() : a= %d\n",a);
  }

  public static void main(String[] args) {
    
    int a =10;
    m(a);   //a변수 자체를 넘기는것이 아니라 a변수에 들어있는 값을 넘긴다.
    
    a=20;
    m(a);
    
    a=30;
    m(a);   
   
    
    System.out.println("main() : "+a);  //22번라인의 a값이 나온다.
   // System.out.println(b); //다른 메서드의 변수에 접근할 수 없다. 오류!!
    
    
      }

}
