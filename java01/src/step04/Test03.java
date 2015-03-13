package step04;

/*
 *  반복문
 *  특정 명령어를 조건에 따라 반복 실행하고 싶을 때 사용
 *  while (조건) {} =>조건이 참인 동안 계속 반복
 *  do {} while (조건) =>조건이 참인 동안 계속 반복 do while은 무조건 한 번은 실행!!
 *  
 *  for (초기화문장 ; 조건 ; 증가문) { } => 조건이 참인 동안 계속 반복
 *    인덱스를 기중으로 반복할 때 적합
 *    
 *    for (변수 : 배열 또는 Collection Instance) {} // 배열의 항목을 모두 돌 때 까지 반복한다.
 *  
 * 
 * 
 * 
 * */
public class Test03 {

  public static void main(String[] args) {

    // 팩토리얼
    int index = 1;
    int result = 1;

    while (index <= 5) {
      result *= index;
      index++; // 반복문을 탈출할수 있는 코드를 넣어야 합니다.
      // 전위 연산자 를사용하나 후위 연산자를 사용하나 똑같다 왜냐하면
    }
    System.out.println(result);
    System.out.println(index);

    index = 1;
    result = 1;

    while (index <= 5) {
      result *= index++;
      // 가독성이 떨어지기 때문에 실수할 가능성이 농후함
      // 후위연산자는 증가되기 전 값을 먼저 연산하고 증가한다!!!
      // 전위 연산자는 증가하고나서 연산!

    }
    System.out.println(result);
    System.out.println(index);

    System.out.println(".....................................");

    // do....while
    // do while문은 조건을 나중에 따지기 때문에 최소 1번 은 실행한다.
    // 하지만 while 문을 사용할
    index = 1;
    result = 1;

    do {
      result *= index;
      index++;
    } while (index <= 5);

    System.out.println(result);

    // for문
    // 인덱스를 가지고 반복을 처리할 때 . ex)배열 데이터 처리할때
    result = 1;
    for (int i = 1; i <= 5; i++) {
      result *= i;

    }
    // System.out.println(i); // i 는 for 문 안에서 선언되었기 때문에 for문 밖에서는 사용할수 없다.
    System.out.println(result);

    // for문에서 초기화 문을 생략할 수 있다.
    int k = 1;
    result = 1;
    for (; k <= 5; k++) {
      result *= k;
    }
    System.out.println(result);

    k = 1;
    result = 1;
    for (; k <= 5;) {
      result *= k;
      k++;
    }
    System.out.println(result);

    k = 1;
    result = 1;
    for (;;) {
      result *= k;
      k++;
      if (k > 5)
        break;
    }
    System.out.println(result);

    // for (변수 : 배열 또는 컬렉션 객체)
    int[] scores = { 100, 90, 100, 80, 100 };
    int sum = 0;
    
    for (int i = 0; i <= 4; i++) { //조건의 끝을 명확하게 지정
      sum +=scores[i];      
    }
    
    
    //실무에서는 밑의 코드와 같이 조건을 적는다. (i<5)
    sum=0;
    for (int i = 0; i < 5; i++) { //조건의 값이 갯수를 나타낸다 적응하면 옹히려 쉽다. 몇번 반복하는지 알수 있다.
      sum +=scores[i];      
    }
    System.out.printf("합계 : %d\n",sum);
    
    
    //배열의 갯수를 직접 적는 대신 , 계산한 값을 넣는다.
//    배열변수.length ----> 배열의 개수를 알려준다.
    sum=0;
    for (int i = 0; i < scores.length; i++) { 
      sum +=scores[i];      
    }
    System.out.printf("합계 : %d\n",sum);
    
//    @ 추가된 문법 : 배열을 전문적으로 사용하는 for @
//    배열의 끝까지 반복할 경우 적합하다. 
//    단 , 몇번째 인지 알려면 인겟스를 별도로 관리해야 한다.
    sum=0;
    int count=0;
    for (int score :scores) { //scores 배열에서 꺼낸 값은 score에 저장된다.
      sum += score;
      count++; //따로 반복 인덱스를 관리 해야 하므로 불편한 점도 있다.
      if(count==3)
        break;
      }
    System.out.println(sum);
    
    
    sum = 0;
    for(int i :scores){
      sum = sum+ i;
    }
    System.out.println(sum);
  }

}
