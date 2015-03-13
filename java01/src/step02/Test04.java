package step02;

import java.util.Scanner;

/*
 * 키보드로부터 한줄 읽기*/
public class Test04 {

  public static void main(String[] args) {
    java.util.Scanner keyScnanner = new Scanner(System.in);
    
//    키보드로부터 한줄 읽기
//    nextLine 을 사용하면 
    String s1 = keyScnanner.nextLine();
    String s2 = keyScnanner.nextLine();
    
    System.out.println(s1);
    System.out.println(s2);
    
//    숫자 읽기
//    하나의 토큰(단어)을 읽은뒤 숫자로 바꾼다음에 리턴한다.
//    리턴이란 ?  작업한 결과물을 그 자리에 놓는다.
    int kor = keyScnanner.nextInt();
    int eng =  keyScnanner.nextInt();
    int math  = keyScnanner.nextInt();
    int sum = kor+eng+math;
    
    System.out.println(sum);
    
    
    
    
    keyScnanner.close();
    

  }

}
