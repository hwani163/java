package step01;

public class Test04ex1 {

  public static void main(String[] args) {
//    책정보에 대한 자료형을 정의하라! 자료형 이름은"Book"
//    1.자료형에 들어갈 항목은 페이지수 , 너비 , 높이 , 출판년도
//    2.메모리를 준비하여 , 다음 두관의 책 정보를 저장하라.
//    -200page , 20cm , 30cm , 2015년
//    -800page , 25cm , 37cm , 2014년
//    3. 첫번째 책의 정보를 출력하라.
    
    
    class Book{
      int page;
      short height;
      short weight;
      int year;      
    }
    
    Book b1 = new Book();
    b1.page=200;
    b1.weight=20;
    b1.height=30;
    b1.year=2015;
    
    Book b2 = new Book();
    b2.page=800;
    b2.weight=25;
    b2.height=37;
    b2.year=2014;
    
    System.out.println(b1.page);
    System.out.println(b1.weight);
    System.out.println(b1.height);
    System.out.println(b1.year);

  }

}
