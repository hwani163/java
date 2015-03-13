package step05;
/**아주 중요한 예제입니다.*/
/**
 * Call by value   vs   Call by reference
 * 
 * call by value란? 
 * 메서드를 호출할때 값을 넘기는것을 말함.
 * - 이전 예제에서 만든 method들은 call by value이다.
 * - 즉, 자바 원시 타입의 값을 넘길때를 call by value라고 한다.
 * 
 * call by reference
 * 메서드를 호출할 때 주소를 넘기는 것을 말한다.
 * 
 * ex)
 * 
 * 
 * */

public class Test09 {
  
  static int[] makeScores(int kor , int eng , int math){
    int[] scores = new int[]{kor, eng, math, 0, 0};
//    어떤 메서드에서 배열을 생성하던간에
//    new 명령어로 만들어진 메모리는 힙(heap)에 준비된다.
//    heap에 존재하는 메모리는 method 호출이 끝나더라도 해제되지 않는다.
//    메서드 호출이 끝날을때 해제되는 스택에 존제하는 메모리이다.
//    =>스택에 있는 메모리만 해제되고 힙에 있는 메모리는 해제되지 않는다.!
    return scores;
  }
  
  static void sum(int[] scores){
    int sum = 0;
    for (int i = 0; i < 3; i++) {
      sum +=scores[i];
      
      
    }
    scores[3]=sum;
    
  }
  
  static void average(int[] scores){
    scores[4]=scores[3]/3;
  }
  
   static void printScores(int[] scores) {
    System.out.printf("국어 : %d , 영어 : %d , 수학 : %d\n", scores[0],scores[1],scores[2]);
    
  }
   
   static void printSumAverage(int sum , int averager){
     
     System.out.printf("총점 : %d , 평균 : %d\n",sum,averager);
   }

  public static void main(String[] args) {
    int [] scores = makeScores(100, 90, 80); 
    //힙에 저장되어 메소드가 끝나도 heap에 저장된
//  new로 저장된 메모리는 해제되지 않는다.!
    sum(scores);  //값이 아니라 주소를 넘기는것을 call by reference라고 한다.
    average(scores);  //call by reference
    printScores(scores);  //call by reference
    printSumAverage(scores[3], scores[4]);  //call by value

  } 

  

}
