package step06.ex6;

/**
 * "인스턴스 메서드
 *  - 인스턴스가 있어야만 작업을 수행할 수 있는 메서드.
 *  - 인스턴스를 사용하는 메서드는 인스턴스 메서드로 만들어라!
 *  - 인스턴스를 사용하지 않는 메서드는 클래스 메서드(static Method)
 *   - 인스턴스를 사용하지 않음 -> static
 *   - 인스턴스를 사용함 -> 
 *   - 인스천스 메서드로 선언하면 , 메서드를 호출할때
 *   - 메서드 앞에 인스턴스 주소를 줄 수 있다. 즉 
 *   - calc1.init(3)이게 가능하다. -> 클래스 메서드로 처리하는 것 보다 코드가 간결해진다.
 *   - => static을 빼면 된다.
 *   --문법
 *   1) static을 빼라!
 *   2) 인스턴스 주소를 받는 파라미터를 선언하지 말아라! 파라미터에 Calculator3 that ->
 *   이걸 뺴라는 말이다.
 *   그럼 인스턴스 주소는 어디에 있을까?
 *   3) 자바는 인스턴스 메서드에 대해 인스턴스 주소를 담고있는
 *      숨겨진 변수를 자동으로 제공한다.
 *      =>그 숨겨진 변수의 이름은? this
 *  */
public class Calculator3 {
//계산 결과를 저장할 클래스 변수는 개별적으로 관리되는 인스턴스 변수가 된다.
//  인스턴스 변수는 반드시 new라는 키워드로 만들어야 한다.
  public  int result;
  
//  결과 값을 담을 변수를 초기화 시키는 메서드
//  초기값을 설정해주는 메소드
  public  void init(int value) {
    //인스턴스 주소를 가지고 있는 숨겨진 변수가 있다!
    //그러니깐 calc1의 주소인지 calc2의 주소인지
    //this는 알고 있다.
//    따로 인스턴스 주소를 받을 parameter를 선언할 필요가 없다.
    this.result = value;
  }

  public  void plus(int value) {
    this.result += value;
  }

  public  void minus( int value) {
//    that.result = that.result*value;
    this.result *= value;
  }

  public  void multiple( int value) {
    this.result *= value;
  }

  public  void divided( int value) {
    this.result /= value;
  }

  public  void remainder( int value) {
    this.result %= value;
  }


}

  


