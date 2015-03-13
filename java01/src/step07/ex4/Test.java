package step07.ex4;
/**
 기본생성자를 개발자가 직접 추가하기
 - 인스턴스 생성시 기본으로 최소한의 설정할  값이 있다면
 - 기본생성자를 직접 추가하라*/

public class Test {

  public static void main(String[] args) {
    // 다양한생성자를 호출하여 인스턴스를 초기화 시켜보자!
    
    // 1) 기본 생성자 호출
    Score s1 = new Score();
    s1.print();

//    이름을 받는 생성자 호출
    Score s2 = new Score("유관순");
    s1.print();
//    이름과 성적을 받는 생성자 호출
    Score s3 = new Score("임꺽정", 90, 90, 100);
    s3.print();

    
  }

}
