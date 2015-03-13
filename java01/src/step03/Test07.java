package step03;
/*
 * 비트 연산자
 *  & , | , ~ ,^
 *  
 *    &  : 비트 단위로 AND 연산을 수행한다.
 *    |   : 비트 단위로 OR 연산을 수행한다.
 *    ~  : 모든 비트를 반대값으로 변경
 *    ^  : 비트 단위로 XOR연산을 수행. -> 베타적 or => 둘다 값이 다를때만 True
 *    
 *    비트연산자를 언제 사용할까?
 *     - 그래핑 처리 어플리 캐이션을 만들때 사용한다.
 *     - 하나의 이미지에 다른 이미지를 겹치는 경우.
 *     - 마스크를 입히는 경우.*/

public class Test07 {

  public static void main(String[] args) {
    
    int v1 = 13;
    int v2 = 5;
    System.out.printf("%x , %x",v1 , v2);
    System.out.printf("%x , %x , %x , %x\n" , v1 & v2 , v1 | v2 , ~v1 , v1 ^ v2);
    
    
  

  }

}
