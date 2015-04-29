package step19.ex2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import step19.ex2.DaoException;
import step19.ex2.domain.User;
import step19.ex2.util.DBConnectionPool;

// 커넥션 관리 기법:
// 2단계. DBConnectionPool 도입
// => SQL 작업을 수행할 때 마다 DBConnectionPool에서 커넥션을 빌린다.
// => 사용 후 반납한다.
public class MemberDao {
  DBConnectionPool dbPool;
  
  public MemberDao(DBConnectionPool dbPool) {
    this.dbPool = dbPool;
  }
  
  public void destroy() {}
  
  public void insert(final User user) {
    Connection con = null;
    PreparedStatement stmt = null;

    try {
      con = dbPool.getConnection(); // DBConnectionPool에서 커넥션 객체를 빌린다.
      stmt = con.prepareStatement(
          "INSERT INTO USERS (NAME,EMAIL,TEL,HP,TWIT) VALUES (?,?,?,?,?)");

      stmt.setString(1, user.getName());
      stmt.setString(2, user.getEmail());
      stmt.setString(3, user.getTel());
      stmt.setString(4, user.getHomepage());
      stmt.setString(5, user.getTwitter());

      stmt.executeUpdate();

    } catch (SQLException e) {
      throw new DaoException(e);

    } finally {
      try {stmt.close();} catch (Exception e) {}
      dbPool.returnConnection(con); //다른 SQL 작업에서 사용할 수 있도록 반납한다.
    }
  }

  public ArrayList<User> selectList() {
    ArrayList<User> list = new ArrayList<User>();
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      con = dbPool.getConnection(); 
      stmt = con.createStatement();

      rs = stmt.executeQuery(
          "SELECT uno,name,email,tel FROM users");

      while (rs.next()) {
        User user = new User();
        user.setNo(rs.getInt("uno"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        user.setTel(rs.getString("tel"));

        list.add(user);
      }

      return list;

    } catch (SQLException e) {
      throw new DaoException(e); 

    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      dbPool.returnConnection(con);
    }

  }

  public User select(int no) {
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      con = dbPool.getConnection(); 
      stmt = con.prepareStatement(
          "SELECT uno,name,email,tel,hp,twit FROM users WHERE uno = ?");
      stmt.setInt(1, no);
      rs = stmt.executeQuery();

      if (rs.next()) {
        User user = new User();
        user.setNo(rs.getInt("uno"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        user.setTel(rs.getString("tel"));
        user.setHomepage(rs.getString("hp"));
        user.setTwitter(rs.getString("twit")); 
        return user;
        
      } else {
        return null;
      }
      
    } catch (SQLException e) {
      throw new DaoException(e); 

    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      dbPool.returnConnection(con);
    }
  }

  public int delete(int no) {
    Connection con = null;
    PreparedStatement stmt = null;

    try {
      con = dbPool.getConnection(); 
      stmt = con.prepareStatement(
          "DELETE FROM USERS WHERE UNO = ?");
      stmt.setInt(1, no);
      return stmt.executeUpdate();
      
    }catch (SQLException e) {
      throw new DaoException(e); 

    } finally {
      try {stmt.close();} catch (Exception e) {}
      dbPool.returnConnection(con);
    }
  }

  public int update(User user) {
    Connection con = null;
    PreparedStatement stmt = null;

    try {
      con = dbPool.getConnection(); 
      stmt = con.prepareStatement(
          "UPDATE USERS SET NAME = ?, EMAIL = ?, TEL = ?, HP = ?, TWIT = ?"
          + " WHERE UNO = ?");
      stmt.setString(1, user.getName());
      stmt.setString(2, user.getEmail());
      stmt.setString(3, user.getTel());
      stmt.setString(4, user.getHomepage());
      stmt.setString(5, user.getTwitter());
      stmt.setInt(6, user.getNo());
      
      return stmt.executeUpdate();
      
    }catch (SQLException e) {
      throw new DaoException(e); 

    } finally {
      try {stmt.close();} catch (Exception e) {}
      dbPool.returnConnection(con);
    }
    
  }

}











