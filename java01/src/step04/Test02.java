package step04;
/*
 * 조건문 : switch
 * 문법
 * 
 * swith(4바이트 정수값){
 *    case 상수 : 
 *        명령들....
 *        break;
 *    case 상수 : 
 *        명령들
 *        break;
 *    default : 
 *        명령들....
 *                
 * }
 * 
 * JDK 7 부터는 switch 조건에 문자열을 넣을 수 있다.
 * 
 * switch 조건 : byte ,  short , int , char , Enum 타입 값 , 문자열
 * */

public class Test02 {

  public static void main(String[] args) {
    
    int level =0;
    
//    표준 사용 예
    switch (level) {
    case 0:
      System.out.println("손님입니다.");
      break;
    case 1:
     System.out.println("일반 입니다.");
     break;
    case 2:
      System.out.println("관리자 입니다.");
      break;      
      default : 
        System.out.println("허용 되지 않은 권한 입니다.");
     
    }
    System.out.println("..........................................................................");
//    break의 의미
//    break 를 사용하지 않으면  break 를 만날때 까지 또는 스위치 문을 나갈때 까지
//    다음 문장을 계속 실행한다.
    level = 3;
    int bounusPoint = 0;
    switch (level) {
    case 3:
      System.out.println("최우수 사용자 입니다..");
      bounusPoint += 3000;
      
    case 2:
     System.out.println("우수사용자 포인트 적립");
     bounusPoint +=1000;
     
    case 1:
      System.out.println("일반 사용자 포인트 적립.");
      bounusPoint += 100;
      default : 
        System.out.println("손님 입니다. 포인트적립 안함");
     
    }
    System.out.println(bounusPoint);
    
    System.out.println("----------------------------------------");
    byte b =100;
    short s = 200;
    int i = 300;
    long l = 400;
    float f = 500f;
    double d = 600;
    
    switch (b) {}
    switch (s) {}
    switch (i) {}
//    switch (l) {} //불가능!!
//    switch (f) {} //불가능!!
//    switch (d) {} //불가능!!
    
//    문자 2byte 크기의 정수값이기때문에 가능하다. 
//    싱글 쿼티션 '' 를 하게되면 유니코드 값으로 변환해준다.
//    case의 값은 반드시 중복 되어서는 안된다!!!!!!!!
//    숫자로 분기처리하기 간편하다!
    char c = '가';
    
    switch ('가') {}
    switch (c) {
    case '가' : 
      System.out.println("가");
      break;
      case 0xAC01 :
        System.out.println("각");
      case 0xAC00+2 : 
        System.out.println("갂");
      break;
      
//    변수와 상수의 연산은 변수이다. 변수의 값에 따라 결과가 바뀐다. 불가!!!
//    변수를 case문에 주게되면 case문이 중복될수 있기때문에 허용하지 않는다!!!!!!
//    변수를 사용함ㄴ 기존의 case값과 같아질 가능성이 있다. 그래서 불가!!!!!!!!!!!!!!!
      
//      case c+3 
//      System.out.println("4."+c);
//      break;
    
    }
    
/**    
  
     논리
    정수 값이 아니다. 정수 값이 아닌 것을 증명하라!
    정수는 더하기 빼기가 가능한다.
    boolean bool = true +0; 는 불가능하다.
    
    
    **/
    
    boolean bool = true;
    
//    switch (bool) {
//    }
    
    System.out.println("---------------------------------------");
    
//    ()()()()()()()()()()()()()()()()()()()()()()()()()()
//        JDK 7 부터는 문자열 가능!!!
//    ()()()()()()()()()()()()()()()()()()()()()()()()()()
    
    String str = "How old are you";
    switch (str) {
    case "Hello" : 
      System.out.println("반갑 습니다.");
      break;
    case "How old are you" : 
      System.out.println("청년이오");
    }


    
    
    

  }

}
