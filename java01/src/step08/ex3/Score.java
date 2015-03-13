package step08.ex3;

/**
 * static 블록 사용
 * 클래스가 로딩 된 후 인스턴스 블럭 처럼 자동으로 실행하는 블록
 * 
 * 클래스 로딩
 *  - 클래스 파일을 찾는다
 *  - 바이트 코드 유효여부 검사
 *  - 클래스 파일을 Method Area에 로딩한다.
 *  - 클래스 변수를 Method Area에 준비시키고
 *  - 클래스 변수에 대한 초기화 문장이 있다면 실행한다.(17라인),
 *  - 클래스 블록을 실행 한다.*/

public class Score {
  
  static int count = 100;
  
//  스태틱 블록 선언
  static {
    System.out.println("Score 클래스를 로딩 했습니다.");
    count = 200;
  }
  
  public Score(){
    System.out.println("생성자 : "+count);
//    문자열 + 숫자 =>숫자를 가지고 임시 문자열로 만들어 두 문자열을 결합시킨다.
  }
  
  public static void printCount(){
    System.out.println("클래스 메서드 : "+count);
  }

}
