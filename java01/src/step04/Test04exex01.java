package step04;

public class Test04exex01 {

  public static void main(String[] args) {
    int w=5;

    for (int i = 0; i < w/2+1; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");        
      }
      for (int j = 0; j < w-(i*2); j++) {
        System.out.print("*");        
      }
      System.out.println("");
      
    }
    
    for (int i = 0; i <(w/2)+1 ; i++) {
      for (int j =(w/2)-i; j>0; j--) {
        System.out.print(" ");
      }
      for (int k=0 ; k<(i*2)+1 ; k++){
        System.out.print("*");
      }      
      System.out.println("");
      }
      
    }

  }


