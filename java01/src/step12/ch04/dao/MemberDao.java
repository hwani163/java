package step12.ch04.dao;

import step12.ch04.domain.User;

//회원 데이터를 다루는 클래스 : Entity
public class MemberDao {
  User[] users = new User[100];
  int length;
  
  public void insert(final User user) {
    users[length++] = user;
  }

}
