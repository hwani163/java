package step09.ex4;
/**
 * 상속 문법 적용
 *  - 기존의 Score 클래스를 상속 받는다.
 *  - 사회와 과학 점수를 저장할 인스턴스 변수를 추가한다.
 *  
 *  import란?
 *  다른 패키지의 클래스를 사용 하려면 , 
 *  반드시 패키지 이름을 포함하여 클래스 이름을 작성한다.
 *  => 좀더 쉽게 처리하는 방법
 *  import명령을 사용하여 클래스의 정보를 컴파일러에게 알려준다.
 *  그러면 , 컴파일러는 컴파일 할 때 그 정보를 바탕으로 클래스를 찾는다.
 *  그리고 클래스를 완전한 이름으로 변경한다.
 *  */


//    다음과 같이 클래스가 소속되어 있는 패키지 명만 적어도 된다.
//    - 이러한 방식으로 표현된 import문이 많다면 , 
// 1)컴파일러는 해당 클래스를 찾기위해 일일히 패키지들을 뒤져야 한다.
//  =>컴파일속도가 저하되는 문제가 있다.
// 2) import를 봐서는 해당클래스가 어떤 패키지에 있는지 알 수 없다.
// 결론 , 가능한 위의 방식처럼 클래스 이름까지 명확하게 지정하라!
// 그것이 소스코드를 읽는데 도움이 된다.


//질문 : import문을 작성할때 클래스의 이름까지 지정하게 된다면,
//  클래스의 갯수가 많을때 import문도 많아지는 문제가 생기지 않느냐?
//  import문을 많이 작성한다고 , 바이트코드가 커지는 것은 아니다.
//  어차피 컴파일 할 때 각각의 단축 클래스 이름은 패키지 명을 포함한 이름으로 변경되기 때문이다.
//  import문은 byteCode에 포함되지 않는다.
import step09.ex3.Score;
import step09.ex3.*;
public class ScoreEx  extends Score{
  
//  추가할 인스턴스 변수 선언
  protected int soc; //사회
  protected int sci;  //과학
  
//  인스턴스의 값을 꺼내고 저장할 getter setter정의
  public int getSoc() {
    return soc;
  }
  public void setSoc(int soc) {
    this.soc = soc;
    compute();
  }
  public int getSci() {
    return sci;
  }
  public void setSci(int sci) {
    this.sci = sci;
    compute();
  }
  
//  Score에서 name을 protected로 선언했기 때문에 Test에서 접근할 수 없다.
//  Test클래스에서 Name값을 설정할수 있도록 Getter/setter추가한다.!
  public String getName(){
    return name;//protected이기 때문에 자식클래스에서는 접근가능
  }
  public void setName(String name){
    this.name = name;
  }
  
  
  
  
  

  
  
}
