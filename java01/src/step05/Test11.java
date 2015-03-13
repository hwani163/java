package step05;
/**
 * 프로그램 Argument
 *  - 자바 클래스를 실행할때 main() method에 넘겨 주는 값을 말한다.
 *  - How?
 *   java -classpath ... step05.Test11 aaa bbb ccc
 *   
 *  - 클래스 이름 뒤에 주고 싶은 값을 문자열로 나열한다.
 *  - 각각의 값은 공백으로 구분한다.
 *  */
public class Test11 {

  public static void main(String[] args) {
//    java step05.Test11 aaaa bbbb cccc 라고 argument를 주었다면.
//    1. JVM은 각각의 문자열을 배열에 넣는다.
//    2.  main()을 호출할때 그 배열의 주소를 넘겨준다.
    
    System.out.printf("Program argument 개수는 : %d\n",args.length);
    
    for(String value : args){
      System.out.println(value);
    }

  }

}
