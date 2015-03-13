package step06.ex7;
/**
 * 연산자(Operate)
 *  - 데이터를 다루는 도구
 *  - 자료형 마다 그 자료형의 데이터를 다루는 도구가 정의 되어 있다.
 *  - ex) int : +, -, *, / ....
 *  - ex) boolean :  && , & , | , || , == , !=
 *  
 *      하지만 + , - , * , / , % , >> 등은 정의 되어 있지 않다.
 *      
 *      연산자 없는 복합 자료형의 데이터를 다루는 예제이다.
 *      */

public class Test {

  public static void main(String[] args) {
    int i =10;
    int r =i<<2;
    boolean b =true;
    //int r2 = b <<2; //오류! <<연산자는 boolean 자료형에 대해서는 정의 되어 있지 않다.
    //int r2 = b + 2; //오류! + 연산자는 boolean자료형에 정의되어 있지 않다.
        
//    복합 자료형의 경우,
//    복합 자료형의 데이터를 다루는 연산자는?
//     : +, -, *, /, % 등의 연산자가 따로 정의 되어 있지 않다.
//     : 자료형에 명시적으로 정의해 주어야 한다.
//     : 기존의 연산자를 정의 할 수 는 없다. (참고 , c++에서는 정의하는 문법이 있다.)
//     : 그럼 자바에서는 어떻게 복합 자료형의 연산자를 정의 하는가?
//     : => 메서드 로 정의한다.
//     : => 메서드는 객체지향 세계에서 연산자(Operator)로 부른다.
    
    
    
    Score s1 = new Score();
    s1.name = "홍길동";
    s1.eng = 100;
    s1.kor = 90;
    s1.math = 80;
    
    Score s2 = new Score();
    s2.name = "임꺽정";
    s2.eng = 100;
    s2.kor = 90;
    s2.math = 80;
    
    Score s3 = new Score();
    s3.name = "윤봉길";
    s3.eng = 100;
    s3.kor = 90;
    s3.math = 80;
    
    
//    Score의 인스턴스에 한 번에 값을 할당할 배정 연산자가 필요하다.
//    Score2를 확인하라.
    
    

  }

}
