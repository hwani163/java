package step07.ex4;

public class Test2Practice {
  
  public static void main(String args[]){
    
    Score2Practice s1 = new Score2Practice();
    Score2Practice s2 = new Score2Practice("홍길동",100,80,70);
    
    //s1.print();
    //s2.print();
    s2.summarize();
    s2.average();
    
    s2.print();
    
  }

}
