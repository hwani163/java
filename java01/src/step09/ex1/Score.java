package step09.ex1;


    /**
     * 캡슐화 적용 전*/
public class Score {
  
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
  
  // 0으로 초기화되어있는 인스턴스를 생성할 수 있도록 , 기본 생성자를 선언한다.
  public Score(){}
  
  public Score(String name , int kor , int eng , int math){
    //로컬변수가 있기 때문에 this를 생략하게되면 로컬변수와 인스턴스 변수를 혼동하므로
//    this를 써줘야 한다.
//    로컬변수이름을 인스턴스 변수의 이름과 다르게 지정한다면 this를 안써도 되지만
//    권장하지 않는다 일관성이 없기 때문이다.
    
//    숨겨진 로컬변수가 있다.
//    Score this;
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
//    같은 멤버의 메서드를 호출 할 때도,this를 생략 할 수 있다.
//    (같은 클래스에 소속 되어 있는 메서드를 호출 할 때도)
//    생략되어있으면 컴파일할때 자동으로 this가 붙는다.
    //this.computer();
    compute();
  }
  
  public void compute(){
//    Score this = 메서드를 호출 할 때 넘겨준 인스턴스 주소
    //로컬 변수와 인스턴스 변수 사이에 혼동할 일이 없다. =>this생략 가능
//    밑에 print method와 같이 local변수가 없기 때문에 this를 써주지 않아도 인스턴스 변수로
//    간주된다.
    sum = kor+eng+math;
    aver = sum/3f;
  }
  
  /* 혼동할 것이 없다면 this 레퍼런스를 생략 할 수 있다
   * local 변수 가 있는지 찾아보고 , 없다면 인스턴스 변수로 간주한다.*/
  public void print(){
    System.out.printf("%s , %d , %d , %d , %d , %.1f\n",
        name,kor , eng , math ,sum , aver);
  }

}
