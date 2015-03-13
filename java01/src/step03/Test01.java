package step03;
/*산술연산자
 * +, -, *, /, %
 * */
public class Test01 {
  
  public static void main(String[] args){
    
    
//    10은 자바에서 32비트 정수이다.
//    v1에 넣을수 없는데 오류가 발생하지 않는다.
//    이유? 
//    리터럴로 값을 표현하고 해당 메모리에 그 값을 넣을수 있다면
//    int 값이라고 하더라도  byte , short 메모리에 넣는 것을 허락한다.
//    
    byte v1 =10; //허락
    byte v2 =20;  //허락    
//    byte v3 = 128;  //거절 cannot convert from int to byte    
    int i1 = 10;
//    v1 =i1; //=> 변수에 들어있는 값이 저장 가능한 값이라도 , 크기가 작으면 넣을수 없다.!!
//    int의 그릇이 더 크다!!
    
    
    
    byte v4 = 10 + 20; //리터럴과 리터럴의 연산결과는 리터이다!
//    byte v5 = 10 + v2; // v2의 값이 변할수 있는 값이기때문에 허용하지 않는다.! 그러니깐
//    10 + v2가 변할수 있는 값이기 때문에 v5에 들어갈지 안들어갈지 모르기 때문에 불가능
    
    
//    10+v2가 변수라 하더라도 v2가 byte형 이기 때문에 저장 할수 있어야 하는게 아닌가?
    byte v5 = v4;   //바이트 변수의 값을 직접 바이트 변수에 넣을때는 가능하다. 
//    왜? 복제이기 때문에 가능하다.
//    연산결과는 바이트 범위를 넘어갈수 있기 때문에 허락할수 없다.
    
//    두 바이트 변수의 결과를 short에 넣는다면?
    byte v6  = 127;
    byte v7 = 127;
//    short s1 = v6+v7;   //오류가나네? : 자바의 최소 연산 단위는 32비트이다!
//    자바는 연산하기 위해서 무조건 32비트로 바꾸어 연산한다!
//    즉 ,  v6의 값을 32비트 임시 메모리에 저장하고 , 
//    v7의 값을 32 비트 임시메모리에 저장한 후 계산하기 때문이다.
    
    int i2 = v6+v7;    
//    v6의 값은 암시적으로 int 형으로 바뀐다. => implicit type conversion(암시적 형변환)
//    <<메모리 아깝다고 생각말고 계산은 int로 !!>>
//    byte와 short에 대해서는 연산자가 등록되어 있지 않다.
    
//    바이트는 이미지데이터를 저장할때 바이트 배열을 사용하여 저장하기 때문에
//    그때 바이트를 사용한다.
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
  }

}
