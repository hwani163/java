package step01;
/*short , int, long변수 선언
 * 자바에서 정수를 표현하는 방법: Litertal(리터럴)
 * 1) 10진수 : 13
 * 2) 8진수 : 015, 0_15
 * 3) 2진수 : 0b1010 , 0B1010 0b11110000
 * 4)16진수 : 0xac00 , 0Xac00...
 * 리터럴 크기지정
 * 1) int 크기의 정수값 : 10
 * 2) long 크기의 정수값 : 10L , 10l
 * 3) float 크기의 부동소수점값 : 10f , 10F
 * 4) double 크기의 부동 소수점값 : 10
 * 
 * 자바 기본 자료형
 * 1.정수 : byte(1) , short(2) , int(4) , long(8)
 * 2.부동 소수점 : float(4) , double(8)
 * 3.논리 : boolean(1)
 * 4.문자 : char(2)
 * 총 8개의 Type의 메모리를 준비할수 있다.
 */
public class Test02 {

  public static void main(String[] args) {
    short v1 = -32768;
    short v2=32767;
//    8진수 표현
    int v3 = 015;
    int v4 = 0_15;    
    System.out.println(v3);
    System.out.println(v4);
    
//    16진수 표현
//    수는 대/소문자 구분하지 않는다.
    int v5 = 0xd; //소문자 x를 주로 많이 사용한다. 0xd를 리터럴이라 부른다.
    int v6 = 0Xd;
    int v7 = 0xD;
    int v8 = 0XD;
    System.out.println(v5);
    
//    2진수 표현
    int v9 = 0b1101;
    int v10 =0B1101;
    
    int v11 = 0b1010110000000000; //0xAC00
    int v12 = 0b1010_1100_0000_0000;//0xAc00
    
    System.out.println(v9);
    System.out.println(v10);
    System.out.println(v11);
    System.out.println(v12);
    
//    리터럴에서 크기 지정 방법
    int v13 = 10; //32비트 정수 표기법
    long v14 =10; //63비트 정수 표기법

  
    
    long v15=10L;
    long v16 =10l;
    
//    int v17=10L;   //오류! 64비트 값을 32 비트메모리에 담을수 없기 때문
    
//    16비트나 8비트 정수는 표기법이 없다!
    
//    부동소수점 리터럴 표기법
//    32비트 부동소수점 값
    float v17 = 3.14f;//현업에서 대문자보다 소문자를 많이 쓴다.
    float v18 = 3.14F;
    
//    64비트 부동소수점 표기법
    double v19 =3.14; //주로 사용한다.
    double v20 = 3.14d;
    double v21 = 3.14D;
    //float v22 = 3.14;//오류!
//    float v23 = 3.14d; //오류!! 
    
//    정수는 int를 많이쓰고 실수는 double을 많이쓴다.
        

  
//논리값 표기법 : true , false
    boolean v24 = true;
    boolean v25 = false;
    
//    주의 직접 C언어처럼 0과 1로 true 와 false를 표현할수 없다.
//    boolean v26 = 1; //오류!!!!
//    boolean v27 = 0; //오류!!
    
    //논리값을 일반 정수에 넣을수 없다.
//    int v28= true; //오류!
//    int v29 =false //오류!
    
    
    
//    문자 표기법 : 유니코드 값을 숫자로 표현하면 된다.
    char v30 = 44032;
    char v31 = 0xAC00;
    
    System.out.println(v30);
    System.out.println(v31);
    
//    특수 도구  : 문자를 유니코드 값으로 바꿔주는 연산자
//    문자의 캐릭터셋 코드값이 저장되는것이다.
//    작은 따옴표 가 하는일은 문자에 해당하는 유니코드 값을 알려준다.
    
    char v32='가';
    System.out.println(v32);
    
    
    
    
    

  }

}
