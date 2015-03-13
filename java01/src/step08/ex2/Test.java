package step08.ex2;


    /**
     * 클래스 변수가 생성되는 시점
     * 클래스가 로딩 될 때(클래스가 로딩 되어 있지 않다면)
     * => new 를 사용하여 인스턴스를 만들때.
     * => 클래스 변수를 사용할 때  step07.ex7.Test.java 31번라인 확인하셍
     * => 클래스 메서드를 사용할 때
     * */

public class Test {

  public static void main(String[] args) {
//    1.인스턴스 생성시 클래스 변수 값 확인
    //Score s = new Score();
    
//    2. 클래스 변수 사용시 클래스 변수값 확인
//    클래스 변수를 사용 하려는 순간
//    만약 클래스가 로딩되어 있지 않다면 , 즉시 로딩한다.
//    당연히 클래스가 로딩 되기 때문에 클래스 변수가 바로 만들어 진다.
//    System.out.println("클래스 변수 직접사용 : "+Score.count);
    
//    3.클래스 메서드 사용시 클래스 변수값 확인
//    클래스 메서드를 호출하려면 ,  클래스가 먼저 로딩 되어 있어야한다.
//    클래스가 로딩되면 클래스 변수는 준비된다!!
    Score.printCount();
    
//    클래스를 사용하려 할 때 , 클래스가 로딩되어 있어야 할 것 아닌가?
//    클래스를 사용 하려는 상황?
//    1.인스턴스를 생성하려할때 , 
//    2.클래스 변수를 (접근)사용하려할때 ,
//    3.클래스 메서드를 호출하려 할때
    /*************************************************************************/
//    주의! 레퍼런스 변수를 준비하는 경우에는 클래스의 자세한 정보가 필요없다.
//    따라서 클래스를 로딩하지 않는다.
      //Score score;//클래스가 로딩되지 않는다.
    /*************************************************************************/
    
    

  }

}
