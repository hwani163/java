package step12.ch05.dao;

import step12.ch05.domain.User;

//회원 데이터를 다루는 클래스 : Entity
public class MemberDao {
  User[] users = new User[100];
  int length;
  
  public void insert(final User user) {
    users[length++] = user;
  }

  public User[] selectList() {
    User[] temp = new User[length];
    for (int i = 0; i < length; i++) {
      temp[i] = users[i];
    }
    return temp;
  }

  public User select(int no) {
    return users[no];
  }

  public void delete(int no) {
    length--;
    for (int i = no; i < length; i++) {
      users[i] = users[i + 1];
    }
  }

  public void update(int no, User changedUser) {
    users[no] = changedUser;
  }

}











