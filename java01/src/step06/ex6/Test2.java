package step06.ex6;


/**
    인스턴스 변수를 사용하여 ,  계산 결과를 개별적으로 관리한다.
    인스턴스 변수를 사용해야할때 -> 개별적으로 변수를 사용할 필요가 있을때
    
  
 * */

public class Test2 {

  public static void main(String[] args) {
    
//    결과를 개별적으로 관리하기 위해 인스턴스 생성한다.
    Calculator2 calc1 = new Calculator2();
    Calculator2 calc2 = new Calculator2();
//    결과를 개별적으로 관리하기 위해 인스턴스를 생성한다.
    Calculator2.init(calc1, 3);
    Calculator2.init(calc2, 5);
    
    Calculator2.multiple(calc1, 4);
    Calculator2.minus(calc2, 3);
    
    Calculator2.minus(calc1, 4);
    Calculator2.multiple(calc2, 3);
    
    Calculator2.plus(calc1, 8);
    Calculator2.multiple(calc2, 2);
    
    Calculator2.divided(calc1, 2);
    

    System.out.printf("결과 = %d\n", calc1.result);
    System.out.printf("결과 = %d\n", calc2.result);


  }

}
