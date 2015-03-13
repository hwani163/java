package step09.ex1;


/**
 * 캡슐화를 적용하지 않았을 때의 문제점 확인 하자.*/
public class Test {

  public static void main(String[] args) {
//    static 메서드는 this라는 숨겨진 로컬 변수가 없다!
    
    Score s1 = new Score("홍길동", 100, 100, 100);
 
    //초기값 없이 인스턴스 생성한다.
    Score s2 = new Score();
    
    s2.name="임꺽정";
    s2.kor = 90;
    s2.eng =10;
    s2.math = 90;
    s2.compute();
    
    s1.print();
    s2.print();
    
//    개발자가 조심조심해서 오류가 없도록 프로그래밍을 하는 상황
    s1.eng=50;
    s1.compute();
    s1.print();
    
///문제상황 1.
    s1.sum=100;
    s1.print();
    
    //총점과 국 , 영 , 수 평균과 총점이 일치하지 않는다.
//    이유 : 총점을 개발자가 임의로 접근해서 바꿨기 때문이다.
//    해결책 ?
//    1.개발자가 그런 실수를 하지 않기를 바란다.
//    2.강제적으로 접근하지 못하게 한다. =>sum변수를 외부에서접근하지 못하도록 막는다.
//    캡슐화 문법을 적용한다. => Test2참조
    
//    문제상황2
//    깜박잊고 호출 해야할 메서드를 호출하지 못할 경우!
    s2.kor = 50;
    s2.compute(); //점수가 바뀔 때 마다 총점과 평균을 다시 산출하기 위해 호출하여야 한다.
    s2.print();

}
}