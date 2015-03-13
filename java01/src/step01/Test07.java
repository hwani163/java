package step01;
/*배열
 * 같은 종류의 메모리를 여러 개 준비해야 할 경우 사용한다.
 * 문밥
 * new 자료형[개수]*/

public class Test07 {

  public static void main(String[] args) {
    
//    1.배열 사용전
    int kor , eng , math , sci, soc;
    
    kor =100;
    eng=90;
    math=20;
    sci=90;
    soc=75;

//    2. 배열 사용후
//  v1은 배열의 주소를 받을 레퍼런스
    int[] score = new int[5];
    
    score[0]=100;
    score[1]=100;
    score[2]=100;
    score[3]=100;
    score[4]=100;
    //score[5]=100; // java.lang.ArrayIndexOutOfBoundsException: 5
//    없는 인덱스를 지정하면 생기는 오류이다!
    
//    3. 배열 선언 방법 2 : 배열 선언 + 초기값 설정
    int[] score2 = new int[]{100,90,80,70,60};
    
    System.out.printf("%d,%d,%d,%d,%d\n",
        score2[0],score2[1],score2[2],score2[3],score2[4]);
    
//    %d ->d 데시머 %d에 숫자값이 올것이다.
    
//  변수를 선언해 놓고 나중에 초기화 할수 없다.
//    배열을 선언하자마자 바로 초기값을 설정 시켜야 한다.
    
//    4.배열 선언방법 3 : 배열선언+초기값 설정 <= new명령어 생략 가능
    int[] score3 = {100,200,300,400,500};
    
   

    
    
    

        
    
    
   
  }

}
