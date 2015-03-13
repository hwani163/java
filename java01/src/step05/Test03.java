package step05;

//값을 반환하는 메서드 (리턴)


public class Test03 {
  
//  문법 : 리턴타입 메서드명 () { return 값;}
  static float getPI() {
    return 3.15159f;
    //return 3.14159; //double이 float으로 바뀔수 없음 암시적 형변환 불가 (그릇이작음)
   //return 10; //암시적 형변환에 의하여 int가 float으로 바뀌어 Return됨
    //return true; //Error. boolean은 float으로 형변환이 될수 없기때문 (메서드에 선언된 return Type과 일치하지 않기때문)
    
  }

  public static void main(String[] args) {
    float r= 10.5f;
//    명령어 안에 메서드 호출 문장을 넣음
//     - 실행할 때 메서드의 리텀 값을 그 자리에 놓는다.
//    10.5f * 10.5f * 3.14159f;
    float area = r * r * getPI();    
    System.out.println(area);
    


  }

}
