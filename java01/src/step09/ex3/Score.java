package step09.ex3;


    /**
     * 캡슐화 적용 후
     * */

//  kor , eng , math의 값이 바뀔 때 마다 자동으로 compute()를 호출하게 하자!
//    인스턴스의 값을 저장하는 메서드를  "쎄터(Setter)"
//  kor , eng, math에 대해서는 setter를 제공한다.
//  kor , eng , math , sum , aver에 대해서는 getter를 제공한다.
//  getter , setter 를 묶어서 Property라고 부른다.
// getter만 있는 경우 : Read Only property
// setter만 있는 경우 :  write only property
//  getter 및 setter 모두 있는 경우 read write property 또는 그냥 property

// 프로퍼티 이름?
// setter / getter 이름에서 set , get을 제거한다.
// 나머지 이름에서 첫번째 알파벳을 소문자로 한다.
// getFirstName() =>firstName 이것이 프로퍼티 이름이다.
//주의!
//인스턴스 변수를 프로퍼티 라고 부르지 않는다.
//프로퍼티 이름은 세터/겟터의 이름으로 결정한다.


//문
    
public class Score {
  
  protected String name;
  //직접 접근 하는것을 막는다. =>값은 어떻게 변경 하는가?
//  이 변수들의 값을 저장 할 수 있도록 메서드를 추가한다.
  private int kor;
  private int eng;
  private int math;

  private int sum;
  private float aver;
  
  //kor , eng , math 변수에 값을 저장 해주는 메서드를 정의
  public void setKor(int kor){
    this.kor = kor;
    compute();
  }
  public void setEng(int eng){
    this.eng = eng;
    compute();
  }
  public void setMath(int math){
    this.math = math;
    compute();
  }
  
  
  public int getSum(){
    return sum;
  }
  public float getAver(){
    return aver;
  }
  public int getKor(){
    return kor;
  }
  public int getEng(){
    return eng;
  }
  public int getMath(){
    return math;
  }
  
  
//  인스턴스의 값을 반환하는 메서드를 "Getter"라고 한다.
  
  
  
  
  public Score(){}
  
  public Score(String name , int kor , int eng , int math){
  
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    compute();
  }
  
  public void compute(){
    sum = kor+eng+math;
    aver = sum/3f;
  }

  public void print(){
    System.out.printf("%s , %d , %d , %d , %d , %.1f\n",
        name,kor , eng , math ,sum , aver);
  }

}
