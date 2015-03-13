package step04;

public class Test04 {

  public static void main(String[] args) {

    for (int x = 2; x < 10; x++) {
      for (int y = 1; y < 10; y++)
        System.out.printf("%d X %d = %d\n", x, y, x * y);
    }

    System.out.println("-------------------------");

    // 5*5까지만 출력하기
    label1: // 바깥 for문에 라벨을 붙인다.
    for (int x = 2; x < 10; x++) {
      for (int y = 1; y < 10; y++) {
        System.out.printf("%d X %d = %d\n", x, y, x * y);
        if (x == 5 && y == 5)
          break label1; // label1 문장을 탈출하라
      }
    }
    // break는 자기가 속한 반복문을 탈출 하기때문에 위에서는 작은 포문만 탈출한다.
    // 반복문을 여러단계를 뛰어넘어서 탈출하고 싶을때는 label을 사용하여탈출하면 된다!

//     *****5단과 6단은 출력에서 제외한다.
//    곱하기 3과 곱하기 7은 제외한다.
    
    // continue 명령을 사용하면 된다!
    System.out.println("-------------------------");

    for (int x = 2; x < 10; x++) {
      if (x == 5 || x == 6) {
        continue; // 다음 명령을 실행하지말고 증가문으로 이동하여라!
      }
      for (int y = 1; y < 10; y++) {
        if(y==3 || y==7){
          continue;   //다음 명령을 실행하지 말고 증가문으로 보낸다.
        }
        System.out.printf("%d X %d = %d\n", x, y, x * y);
      }
    }

  }

}
