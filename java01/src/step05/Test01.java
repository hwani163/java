package step05;

/**
 * 명령어를 조직화 시키는 문법
 * 1.메서드 : 명령어 보따리
 * 1) 단순 메서드 void 보따리명 () {명령어}
 * 
 * 2)값을 반환하는 메써드
 *  자료형 보따리명 (){ return 반환값; } ex) float pi() { return 3.14159; }
 * 
 * 3)값을 전달해야 하는 메서드
 * void 보따리명 (전달한 값을 담을 변수 선언 , ....){ 명령어들 } ex) void
 * hello(String name){ System.out.println(name+"님 반값습니다."); }
 * 
 * 4)값을 받아서 명령어를 수행한 후 그 결과를 반환 하는 메서드
 * 반환할 값의 자료형 보따리명 (전달한 값을 담을 변수 선언 , ....){
 * 명령어 수행 return 결과; }
 * 
 * 예 : int plus(a,b){ return a+b; }
 * 
 * 
 * 
 * */

public class Test01 {

  // 값을 받아서 명령어를 수행하는 메서드 활용 예
  // 명령어 보따리 정의
  static void printBitShiftValue(int value) {
    System.out.println("-------------------------------");
    System.out.printf("%d , %x\n", value, value);
    System.out.printf("왼왼쪽으로 4비트 이동 : (<<) : %x\n", value << 4);
    System.out.printf("오른쪽으로 4비트 이동 : (>>) : %x\n", value >> 4);
    System.out.printf("오른쪽으로 4비트 이동 : (>>) : %x\n", value >>> 4);
    System.out.println("-------------------------------");
  }

  public static void main(String[] agrs) {
    int value = 0x6a5a4a3a;

    printBitShiftValue(value);

    value = -1784302138;
    printBitShiftValue(value);
//     System.out.println("-------------------------------");
//     System.out.printf("%d , %x\n",value , value);
//     System.out.printf("왼왼쪽으로 4비트 이동 : (<<) : %x\n",value << 4);
//     System.out.printf("오른쪽으로 4비트 이동 : (>>) : %x\n",value >> 4);
//     System.out.printf("오른쪽으로 4비트 이동 : (>>) : %x\n",value >>> 4);
//     System.out.println("-------------------------------");
  
  }

}
