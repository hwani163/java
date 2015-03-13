package step03;

public class Test05 {
  
  public static void main(String[] args){
    
    /*
     * 비트 이동 연산자
     * 
     * <<  -  왼쪽 이동 , 빈자리는 0으로 채운다. 곱하기 2와 동일한 결과를 보여 준다.
     * >>  -  오른쪽 이동 , 빈자리는 부호 비트로 채움 , 양수이면 0 , 음수이면 1 !
     * >>> -  오른쪽 이동  , 빈자리는 무조건  0 으로 채운다. 음수를 이동시키면 양수가 된다.
     * */
    
    int v1  = 0x6a5a4a3a; // = 
    System.out.printf("%d \n%x\n" , v1,v1 );
    System.out.printf("%08x %08x , %08x" , v1 << 4 , v1 >> 4 , v1 >>> 4);
    System.out.println("\n");
    
    v1 =-1784302138; // = 0x6a5a4a3a;
    System.out.printf("%d \n%x\n" , v1,v1 );
    System.out.printf("%08x %08x(%2$d) , %08x(%3$d)\n\n" , v1 << 4 , v1 >> 4 , v1 >>> 4);
    
    //>> 빈자리는 부호비트로 채워지기 때문에 1111이 채워진다 그래서 f가 되었다.
    // >>> 빈자리를 무조건 0 으로 채워지기 때문에 0 이 되었다. 또한 양수가 되었다.
    
    
    
    
//    왼쪽으로 비트이동 연산자 ( << ) 는 기존값  곱하기 2 한 값과 결과가 같다.!!!!
    
    int v2 = 2;
    System.out.println("왼쪽으로 비트이동 연산자 ( << ) 는 기존값  곱하기 2 한 값과 결과가 같다.!!!!");
    System.out.printf("%d , %d\n",v2*2 , v2 << 1);    
    System.out.printf("%d , %d\n",v2*4 , v2 << 2);    
    System.out.printf("%d , %d\n",v2*8 , v2 << 3);
    
    
    
    
    
  }

}
