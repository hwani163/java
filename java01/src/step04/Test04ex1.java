package step04;

import java.util.Scanner;

/**
 * 별 도형 그리기**/
public class Test04ex1 {

  public static void main(String[] args)  {
    
    /* 문제1. 직각 삼각형 출력하기
     * 밑변의 별 개수? 8
     * (홀수 짝수 상관 없다.)
     * *
     * **
     * ***
     * ****
     * *****
     * ******
     * *******
     * ********
     */
    
    /* 문제2. 직각 삼각형 출력하기2
     * 밑변의 별 개수? 8
     * (홀수 짝수 상관 없다.)
     *        *
     *       **
     *      ***
     *     ****
     *    *****
     *   ******
     *  *******
     * ********
     */
    
    /* 문제3. 역삼각형 출력하기
     * 밑변의 별 개수? 8
     * (만약 짝수가 입력된다면 하나 증가시켜서 홀수로 만든다.)
     * *********
     *  *******
     *   *****
     *    ***
     *     *
     */
    
    /* 문제4. 삼각형 출력하기
     * 밑변의 별 개수? 8
     * (만약 짝수가 입력된다면 하나 증가시켜서 홀수로 만든다.)
     *     * 
     *    ***
     *   *****
     *  *******
     * *********
     */
    
    
    
    
    System.out.println("1번 : 밑변입력하세요");
    java.util.Scanner scanner = new Scanner(System.in);
    int width = scanner.nextInt();
    
   
    for (int i = 0; i <= width; i++) {
      for (int j = 0; j < i; j++) {         
        System.out.print("*");  
      }
      System.out.println();      
    }
    
   System.out.println("------------------------------");
   
   for (int i = 0; i < width+1; i++) {
     for (int j = 0; j <width-i ; j++) {
      System.out.print(" ");
    }
     for (int j = 0; j <i ; j++) {
      System.out.print("*");
    }
    System.out.println();
  }
    
   System.out.println("3번 밑변");
   
   int width2 = scanner.nextInt();
   
   if(width2%2==0){
     width2++;
   }
   
   
    for (int i = 0; i <width2/2+1 ; i++) {
      for (int d=(width2/2)-i ; d>0 ; d--) {
        System.out.print(" ");
      }
      for (int s=0 ; s<(i*2)+1 ; s++){
        System.out.print("*");
      }      
      System.out.println();
      }
    
    System.out.println("--------------------------------");
    System.out.println("4번 밑변");
    
    width2 = scanner.nextInt();
    if(width2%2==0){
      width2++;
    }
    
    for (int i = 0; i < width2/2+1; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");        
      }
      for (int j = 0; j < width2-(i*2); j++) {
        System.out.print("*");        
      }
      System.out.println();
      
    }
    
    

    
    
    
    
    
  
    
  }

}
