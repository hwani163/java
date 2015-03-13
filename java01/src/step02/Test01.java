package step02;
/*표준 출력장치(모니터) 로의 출력
 * 1)System.out
 *  System 클래스에 들어있는 out은 표준 출력 장치인 모니터(콘솔)를 가리킨다.
 *  
 * 2) System.in
 *  System클래스에 들어있는 in은 표준 입력 장치인 키보드 를 가리킨다.
 *  
 * 3) System.err
 *  System클래스에 들어있는 err는 오류를 출력하는 장치(기본모니터)를 가리킨다.
 *  */
public class Test01 {

  public static void main(String[] args) {
    
//    ptint() : 출력한 뒤에 줄바꿈을 하지 않는다.
    System.out.print("하하하");
    System.out.print("호호호");
    
//    줄바꿈을 하고 싶으면 줄바꿈 명령어를 출력하라.
    System.out.print("\n");
    System.out.print("헐.....");
    
//    줄바꿈 명령은 문자열 안에 포함 될 수 있다.
    System.out.print("ABC\nDef\n그렇군요?");

//    이렇게 줄바꿈 명령어 처럼 문자열 사이에 넣는 특수 명령을 Escape 문자라고 한다.
//    문자는 문자인데 ,출력되지 않는 문자 -> Escape문자!
    
//    Escape 문자 : \n , \t , \" (큰따옴표) , \' (작은 따옴표) , \\(역슬래시) ....
//    http://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html#jls-3.10.6
//    특징 :  역슬래시로 시작한다.
    
//    \t : 
    System.out.print("\n가나다\t라마바\t사아자");    
//    큰따옴표를 사용하고 싶을때 \"
    System.out.print("\n사람들은 \"행복하다\"말한다.");
//    역슬래시(\)를 출력하고 싶을때
    System.out.print("\n이스케이프 문자는 역슬래시(\\)다음에 명령이 온다.");    
    System.out.print("\n우리의 작업 폴더는 c:\\bit이다");
    
    System.out.print("\n작은 따옴표는 '표시합니다.");
    
    char c = '\'';

//    println
//    출력문 뒤에 줄바꿈 명령을 자동으로 붙인다.
    System.out.println("하하하");
    System.out.println("호호호");
    
    
    

  }

}
