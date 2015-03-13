package step07.ex7;


/*  클래스 로딩
 *  클래스를 실행하려면 .class파일을 메모리에 읽어야 한다. =>클래스 로딩
 *  .class파일은 Method Area라는 영역에 로딩된다.
 *  
 *   
 *   Test 클래스 실행 과정 (java -classpath ....Test)
 *   1)Test.class 파일찾기
 *      -JVM 경로(JDK홈/jre/lib*.jar, .class파일을 다 뒤져본다.)
 *      -CLASSPATH 환경변수에 등록된 경로를 뒤진다.
 *   2) ByteCode 유효성 검사한다.
 *   3) Method Area에 Test.class를 로딩한다(Method Area영역에).
 *   4) main()을 호출한다.
 *        - score변수를 준비한다. (stack영역에)
 *        - score Instance를 생성한다.
 *        -score.class 적재한다.(Method Area 영역에)
 *           클래스 파일찾기 => byteCode 유효성 검사 => Class Loading...
 *        -Score.class 에 서넌된 대로 인스턴스 변수를 준비한다 (Heap 영역에)
 *        - 인스턴스의 주소를 score 레퍼런스 변수에 저장한다.
 *        -score2변수를 준비한다(stack영역에)
 *            Score.class가 이미 적재되어 있기 때문에 다시 적재하지 않는다.
 *            -Score클래스에 선언된 대로 인스턴스 변수를 준비한다.(in heap)
 *            - 인스턴스 주소를 score2 참조 변수에 저장한다.
 *            
 *             
 *    5) main() 호출종료하면
 *      -JVM이 사용했던 모든 메모리는 OS에 강제 반환된다.
 *      
 *      주목!
 *      -클래스는 로딩시점 => 인스턴스를 만들 때 , 클래스 변수나 클래스 메서드를 사용할 때.
 *      - 클래스는 단 한번만 적재된다. 죽복 적재하지 않는다. JVM당 한번. *        
 *        */
 
public class Test {
  
  public static void main(String[] args) {
//    주의! Reference변수를 만들때는 클래스가 로딩되지 않는다.
    Score score ; 
    //인스턴스를 준비하려 할 때 비로소 클래스를 로딩한다.( 물론 , 로딩되어 있지 않다면)
//      이미 앞쪽에서 로딩 했다면 다시 로딩하지 않는다.
//    클래스는 딱 한번만 로딩한다.
    score = new Score("홍길동", 100, 100, 100);
    Score score2 = new Score("임꺽정",90,90,90);
  }

}
