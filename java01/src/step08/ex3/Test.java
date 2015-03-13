package step08.ex3;


    /**
     * static 블록을 사용하여 클래스가 로딩될 때 초기화 시키는 작업을 수행 하자!
     * */

public class Test {

  public static void main(String[] args) {
    
//    1. 인스턴스 생성
    new Score();
//    두번째 인스턴스 생성부터는 스태틱 블럭을 실행하지 않는다.
//    클래스가 이미 로딩 되어 있기 때문이다!
    new Score();
    new Score();
    new Score();
    
    

  }

}
