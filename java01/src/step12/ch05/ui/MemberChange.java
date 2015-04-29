package step12.ch05.ui;

import java.util.Scanner;

import step12.ch05.domain.User;

//회원 변경 화면을 다루는 클래스 : Boundary
public class MemberChange {

  public User execute(User user) {
    Scanner keyScan = new Scanner(System.in);
    
    //0) 사용자가 입력한 값을 저장할 User 인스턴스를 준비한다.
    User changedUser = new User();
    String inputValue = null; //사용자가 입력한 값을 담을 변수
    
    //1) "이름: " 출력하고, 사용자로부터 이름을 입력 받는다.
    System.out.printf("이름(%s): ", user.getName());
    inputValue = keyScan.nextLine();
    if (inputValue.equals("")) { //값을 입력하지 않았으면,
      changedUser.setName(user.getName()); //기존 값을 그대로 넣는다.
    } else { //값을 입력했으면,
      changedUser.setName(inputValue); //새로운 값을 넣는다.
    }
    
    
    //2) "이메일: " 출력하고, 사용자로부터 이메일을 입력 받는다.
    System.out.printf("이메일(%s): ", user.getEmail());
    inputValue = keyScan.nextLine();
    if (inputValue.equals("")) {
      changedUser.setEmail(user.getEmail());
    } else { 
      changedUser.setEmail(inputValue);
    }
    
    //3) "전화: " 출력하고, 사용자로부터 전화번호를 입력 받는다.
    System.out.printf("전화(%s): ", user.getTel());
    inputValue = keyScan.nextLine();
    if (inputValue.equals("")) {
      changedUser.setTel(user.getTel());
    } else { 
      changedUser.setTel(inputValue);
    }
    
    //4) "홈페이지: " 출력하고, 사용자로부터 홈페이지 URL을 입력 받는다.
    System.out.printf("홈페이지(%s): ", user.getHomepage());
    inputValue = keyScan.nextLine();
    if (inputValue.equals("")) {
      changedUser.setHomepage(user.getHomepage());
    } else { 
      changedUser.setHomepage(inputValue);
    }
    
    //5) "트위터: " 출력하고, 사용자로부터 트위터 아이디를 입력 받는다.
    System.out.printf("트위터(%s): ", user.getTwitter());
    inputValue = keyScan.nextLine();
    if (inputValue.equals("")) {
      changedUser.setTwitter(user.getTwitter());
    } else { 
      changedUser.setTwitter(inputValue);
    }
    
    //6) 저장 여부를 묻는다.
    System.out.print("변경하시겠습니까?(y/n) ");
    String response = keyScan.nextLine();
    
    //7) 답변이 y이면, 안내 문구와 더불어 멤버 정보를 리턴한다.
    //8) 답변이 n이면, 안내 문구와 더불어 null을 리턴한다.
    if (response.equals("y")) {
      System.out.println("변경하였습니다.");
      return changedUser;
    } else {
      System.out.println("변경을 취소하였습니다.");
      return null;
    }
  }

}




