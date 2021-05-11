package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class databaseSQL extends javax.swing.JFrame {
    protected Connection conn;
    protected static final String USERNAME = "everytime";
    protected static final String PASSWORD = "everytime";
    //protected static final String URL = "jdbc:mysql://221.162.246.224:3306/teamproject?serverTimezone=UTC";
    protected static final String URL = "jdbc:mysql://221.162.246.224:3306/teamproject";
    protected Statement stmt = null;
    protected ResultSet rs = null;
    
    protected void dbLoad() { //데이터베이스 접속
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("드라이버 로드 실패");
        }
    }
    
    protected void dbClose() { //데이터베이스 접속 해제
        try {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(databaseSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(databaseSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(databaseSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void updateData(String a, String b, String c, String d, String e) throws SQLException {
        // a: 테이블, b: 컬럼명, c: 바꿀 데이터의 키값, d: 바꿀 데이터의 데이터값, e: 바꿀 데이터 값
        // 원하는 int data를 수정하는 메쏘드
        String sql = "UPDATE " + a + " "
                + "SET"
                + " " + b + " =?"
                + "WHERE " + c + " =?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, e);
        st.setString(2, d);
        st.executeUpdate();
    }
    
    protected void signupUser(String userID, String userPW, String userName, String userUniv,
            String userDept, String userNum, boolean isConfirm, int report, boolean isSponser) throws SQLException {
        //사용자 회원가입
        //순서 : 아이디, 패스워드, 닉네임, 대학교, 학과, 고유번호, 학교인증여부, 신고수, 과금여부
        String sql = "INSERT INTO user( "
                + " userID, "
                + " userPW, "
                + " userName, "
                + " userUniv, "
                + " userDept, "
                + " userNum, "
                + " isConfirm, "
                + " report, "
                + " isSponser"
                + ") VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, userID);
        st.setString(2, userPW);
        st.setString(3, userName);
        st.setString(4, userUniv);
        st.setString(5, userDept);
        st.setString(6, userNum);
        st.setBoolean(7, isConfirm);
        st.setInt(8, report);
        st.setBoolean(9, isSponser);
        st.executeUpdate();
    }
    
    protected void signoutUser(String userID) throws SQLException {
        //사용자 계정 삭제 - 현재 게시글은 삭제 안됨
        String sql = "delete from user where userID=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, userID);
        st.executeUpdate();
    }
    
    protected boolean loginUser(String id, String pw) throws SQLException { //로그인
        Statement stmt2 = null;
        stmt2 = conn.createStatement();
        rs = stmt2.executeQuery("select * from user");
        while (rs.next()) {
            String name = rs.getString("userID");;
            String password = rs.getString("userPW");
            if (name.equals(id) && password.equals(pw))
                return true;
        }
        return false;
    }
    
    protected boolean serachData(String table, String data) throws SQLException {
        //특정 값이 특정 테이블에 존재하는지 확인 - 존재한다면 true 리턴
        Statement stmt2 = null;
        stmt2 = conn.createStatement();
        rs = stmt2.executeQuery("select * from " + table);
        while (rs.next()) {
            String name = rs.getString("userID");;
            if (name.equals(data)) return true;
        }
        return false;
    }
    
    protected String returnData(String table, String column, String keycolumn, String keydata) throws SQLException {
        //특정 테이블에서 특정 컬럼의 값 얻어오기
        Statement stmt2 = null;
        stmt2 = conn.createStatement();
        rs = stmt2.executeQuery("select " + column + " from " + table + " where " + keycolumn + "='" + keydata + "'");
        while (rs.next()) {
            String a = rs.getString(column);
            return a;
        }
        return null;
    }
    
    protected void postBoard(String boardTitle, String postNum, String postTitle, String postContent,
            String userNum, String postDate, int recommend) throws SQLException {
        //게시글 작성
        //순서 : 게시판명, 게시글 번호, 게시글 제목, 게시 내용, 작성자 번호, 게시일, 추천수(default=0)
        String sql = "INSERT INTO post( "
                + " boardTitle, "
                + " postNum, "
                + " postTitle"
                + " postContent"
                + " userNum"
                + " postDate"
                + " recommend"
                + ") VALUES (?,?,?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, boardTitle);
        st.setString(2, postNum);
        st.setString(3, postTitle);
        st.setString(4, postContent);
        st.setString(5, userNum);
        st.setString(6, postDate);
        st.setInt(7, recommend);
        st.executeUpdate();
    }
}
