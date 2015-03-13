package step03;

/*
 * 
 * 명시적 형변환과 암시적 형변환
 * 형 변환이란?
 * 연산을 수행하기 위하여 피 연산자의 자료형을 일치시키는 것!
 * 
 * 언제사용할까?
 *  - 값을 임의의 자료형으로 변환 할 필요가 있을때 사용한다!!
 *  
 *  
 *  사용방법 : 
 *  (변환할 자료형) 변수 or 상수 or 리터럴
 *  임시 메모리를 내부적으로 준비한후 ,  변환값을 저장한다.
 *  
 *  
 *  
 *  암시적 형변환이란?
 *  JVM이 실행중에 계산을 수행하기 위해 내부에 정한 규칙에 따라 형변환 시키는것
 *  byte short => int =>long => float =>double
 * 
 * */
public class Test03 {

  public static void main(String[] args) {
    
    int a=5;
    int b =2;

//    형변환전    
    float result = a / b;
    System.out.println(result);
    
//    형변환후
     result = (float)a / (float)b;
//    a라는 변수를 float으로 바꾸는 것이 아니다.
    
    System.out.println(result);
    
//    결과를 담는 그릇이 float이라고 무조건 float으로 계산되어 답이 나오는것이 아니다!!!
    
    
//    암시적 형변환
    
    byte bb = 10;
    short ss = 20;
    int ii = 30;
    long ll = 40;
    float ff = 50.5f;
    double dd = 60.5;
    int result2 = bb + ss;  //내부적으로 (int)v1 + (int)v2 암시적으로 바뀐다.
    int result3 = bb + ii;  //(int)bb + ii
    //int result4 = bb + ll;  //(long)bb + ll  result4가 int이고 결과가 long 때문에 오류
    long result4 = bb + ll;
    
//    long result5 = ii + ll * ff;    //오류!!
//    ii + ll * ff  => (ll*ff)부터 연산된다.
//    ll*ff => long이나 int를 float으로 바꿀때는 진짜 조심해야한다.
    
//    ii + (float)ll * ff
//    ii + (float)계산결과
//    (float)ii + (float)계산결과  = (float)최종 계산결과
    
//    float은 long에 들어갈수 없기 때문에 result5 Type을 float이나 float이상으로 바꾸어야한다.
    float result5 = ii + ll * ff;
    
    
    
//    다음코드를 암시적 형변환과 명시적 형변환을 섞어서 처리해보자
    result = (float)a / (float)b;
    
    result = a / (float)b;
    result = (float)a / b;
//    굳이 둘다 float으로 바꾸지 않아도 된다. 명시적형변환으로하면 알아서 암시적 형변환을 
//    통하여 float으로 바뀌기 때문인다.
    
    
    
    
    
    
    
    
    
    
    

  }

}
