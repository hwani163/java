package step05;

public class Test12exex {
  public static void main(String[] args){
    int n=5;
    char[] arr =new char[n];
    
    
    for (int i = 0; i < arr.length+1; i++) {      
      for (int j = 0; j < i; j++) {        
        arr[j]='*';
        System.out.print(arr[j]);
      }
      System.out.println();
    }
    
    System.out.println("-----------------------");
    
    for (int i = 0; i < arr.length; i++) {
      arr[i]=' ';
      }    
    for(int i=1; i<arr.length+1;i++){
    arr[arr.length-i]='*';
    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j]);
    }
    System.out.println();
    }
    
    
    System.out.println((arr.length-1)/2);
    
//    for (int i = 0; i < arr.length; i++) {
//      arr[i]=' ';
//      }
//    int center=(arr.length-1)/2;
//    
//    for (int i = 1; i < arr.length-1; i++) {
//        if (arr[center]!='*')
//          arr[center]='*';
//        else {
//          
//          if (center-i <=0 && center+i<arr.length) {
//            arr[center-i]='*';
//            arr[center+i]='*';
//          }
//          
//        }
//        
//      for (int j = 0; j < arr.length; j++) {
//        System.out.print(arr[j]);
//      }
//      System.out.println();
//      }
      
      

        
    
    
    
    
//    for (int i = 0; i < arr.length+1; i++) {      
//      for (int j = 0; j < i; j++) {        
//        arr[arr.length-1]='*';
//        System.out.print(arr[arr.length]);
//      }
//      System.out.println();
//    }
    
    
    
    
    
  }

}
