package step01;
/*변수 선언 : 메모리를 준비시키는 명령어
 * 문법 : 
 *  메모리종류 메모리이름;
 *  메모리 종류 : Data Type(자료형)
 *  메모리 이름 : Variable(변수)
 *  세미콜론 : 명령어의 끝 표시자
 *  
 * 1. 정수메모리
 * byte v1; //1 바이트 메모리
 * short v2;  //2 바이트 메모리
 * int v3;  //4 바이트 메모리
 * long v4; //8 바이트 메모리
 * 
 * 2.메모리에 값 저장도구
 * 배정 연산자(assignment) 또는 할당 연산자라고 한다. -> =
 * */
public class Test01 {

  public static void main(String[] args) {
    byte v1;
    v1=-128;
    
    byte v2;
    v2=127;
    
    System.out.println(v1);
    System.out.println(v2);
    
//    메모리를 선언하지않고 사용하게되면, 컴파일 오류가 나게된다.
//    v3=30;
    
//    메모리의 범위를 넘어가는 값을 넣으면 컴파일 오류!
    
//    v1=-129;
//    v2=128;
    
//    여러개의 변수를 한번에 선언하는 방법!
    byte v3,v4,v5;
    v3=10;
    v4=20;
    v5=30;
    
//    변수 선언할때 초기값을 선언할수 있다.
    byte v6=20,v7;
    v7=30;
    
//    변수 이름은 중복되어서는 안된다.
//    byte v7;
    
//    변수 이름은 반드시 문자로 시작해야 한다.
//    문자 , _ , $ 가능
    byte _a , $a , aaaa , 한글 , 元錫煥;
//    byte #a; 불가능
    
//    변수이름에 숫자를 포함할수 있다.
    byte b2b , a6;
    
//    변수 이름은 공백 불가.
//    byte first name;
    

    
  }

}
