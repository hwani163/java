package step02;

/*
 * 키보드로 부터 입력 받기
 * System.in을 이용하여 처리
 * 사용자가 입력한 값을 문자열로 쉽게 처리하기 위해
 * Scanner라는 도구를 이용한다.*/


public class Test03 {

  public static void main(String[] args) {    
    java.util.Scanner keyboardScanner = new java.util.Scanner(System.in);
    
//    next() 하나의 토큰(token) 문자열을 읽는다.
//    토큰의 기준은 무엇일까? 토큰이란?
//    공백이나  Enter
    String s = keyboardScanner.next();
    
    
    System.out.println(s);
    
    String s2 =keyboardScanner.next();
    String s3 =keyboardScanner.next();
    
    System.out.printf("%s , %s",s2,s3);
    
    
    keyboardScanner.close(); //스캐너 사용을 끝낸후 반드시 닫아줄것!!
//    close => scanner가 사용한 HW자원을 해제하는 일을 한다.
    
    
    
    
        
    
    
    
    
    
  }

}
