package step09.ex2;


/**
 * Score 클래스에 캡슐화 문법 적용
 * 1) sum변수에 직접 적용하지 못하게 한다.
 * 2) kor 변수에 값을 바꿀 때 마다 자동으로 compute()가 호출되게 한다.
 * 
 * */
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
    

    
///문제상황 1.
//    접근을 폐쇄 했다.!!
    //s1.sum=100; 
    s1.print();
    
    //총점과 국 , 영 , 수 평균과 총점이 일치하지 않는다.
//    이유 : 총점을 개발자가 임의로 접근해서 바꿨기 때문이다.
//    해결책 ?
//    1.개발자가 그런 실수를 하지 않기를 바란다.
//    2.강제적으로 접근하지 못하게 한다. =>sum변수를 외부에서접근하지 못하도록 막는다.
//    캡슐화 문법을 적용한다. => Test2참조
    
//    문제상황2 아직 해결 안됨! =>Score2와 ex3.Test2에서 해결함.
//    깜박잊고 호출 해야할 메서드를 호출하지 못할 경우!
    s2.kor = 40;
    s2.compute(); //점수가 바뀔 때 마다 총점과 평균을 다시 산출하기 위해 호출하여야 한다.
    s2.print();

}
}