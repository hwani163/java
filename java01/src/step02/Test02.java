package step02;
//형식을 갖춰 출력하기
//printf() , fromat()
/*
 * 1)printf("형식 문자열",변수,변수,....);*/
public class Test02 {

  public static void main(String[] args) {
//    printlf(포멧,값들...)
//    포맷 문법 : %[argument_index$] [flags] [width] [.precision] conversion
//    1.conversion(대소문자 모두허용) (의미 : 변환 , 개조)
//    b : boolean
//    h : 16진수
//    s : 문자열
//    c : 유니코드문자(문자)
//    d : 10진수
//    o : 8진수
//    x : 16진수
//    n : 줄바꿈 %n or \n 둘다 가능하다.

    System.out.printf("국어 : %d\n영어 : %d\n" , 100,90);    
    System.out.printf("%d, %o, %x  , %h , %n" , 13,13,null,null);
    System.out.printf("%s , %c , %d","오호라" , 0xAC00,0xAC00);
    
//    %[argument_index$]
    System.out.printf("\n%3$d,%1$d,%2$d\n",100,90,80);
    System.out.printf("국어 : %d\n영어 : %d\n수학 : %d\n수학+영어 : %3$d+%2$d=%d\n",
        100,90,80,(90+80));
    
//    [width} 사용법
    System.out.printf("%d,%d,%d\n",100,90,80);
    System.out.printf("%5d,%5d,%5d\n",100,90,80);
    
//    [flags] 사용법
//    - : 왼쪽정렬
//    0 : 빈자리가 0으로 채워짐

    System.out.printf("%-5d,%-5d,%-5d\n",100,90,80);
    System.out.printf("%05d,%05d,%05d\n",100,90,80);
    
//    [.precision] 사용법
    System.out.printf("%f\n",3.141592f);
    System.out.printf("%.2f\n",3.141592f); //소수점은 2자리만 표현할것.
    System.out.printf("%5.2f\n",3.141592f);//전체자리수 5자리 , 소수점은 2자리
    
//    날짜 출력하기
//    java.util 패키지에 있는 Date클래스의 설계도에 따라 메모리를 준비하라.
//    =>날짜와 시간 정보를 담을 메모리가 준비된다.
//    메모리의 기본 값을 현재 날짜와 시간으로 초기화 하라!
//    %t 다음에 상세 포멧이 와야한다.
//    H : 24시간 표시(00~24)
//    I : 12시간 표시(01~12)
//    k : 24시간 표시(0~23)
//    l : 12시간 표시(1~12)
//    M : 분 표시(00~59)
//    S : 초 표시(00~60)
//    P : 오전 오후 표시(am ,pm)
//    B : 월 표시(January ....)
//    b : 월 약자표시 (Jan,Feb ...)
//    A : 요일 표시 (Sunday,...)
//    a : 요일표시 약어 (Sun , Mon ...)
//    Y : 년 표시(2015)4자리
//    y : 년 표시(00,99,15 ...)2자리
//    m : 월표시 (01)
//    d : 일표시 (01~31)
//    e : 일표시(1~31)
    
    System.out.printf("%tY-%1$tm-%1$td\n", new java.util.Date());

    System.out.format("%tY-%1$tm-%1$td\n", new java.util.Date());
    
    
  
    
    
    
    
    
    
    
    

  }

}
