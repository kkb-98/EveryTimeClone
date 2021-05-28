package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;

public class databaseSQL extends javax.swing.JFrame {
    protected Connection conn;
    protected static final String USERNAME = "everytime";
    protected static final String PASSWORD = "everytime";
    //protected static final String URL = "jdbc:mysql://221.162.246.224:3306/teamproject?serverTimezone=UTC";
    protected static final String URL = "jdbc:mysql://49.50.175.24:3306/teamproject";
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
    
    protected void signupUser(String userID, String userPW, String userName, String userNickname, String userUniv,
            String userDept, String userNum, int isConfirm, int report, int isSponser) throws SQLException {
        //사용자 회원가입
        //순서 : 아이디, 패스워드, 이름, 닉네임, 대학교, 학과, 고유번호, 학교인증여부, 신고수, 과금여부
        String sql = "INSERT INTO user( "
                + " userID, "
                + " userPW, "
                + " userName, "
                + " userNickname, "
                + " userUniv, "
                + " userDept, "
                + " userNum, "
                + " isConfirm, "
                + " report, "
                + " isSponser"
                + ") VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, userID);
        st.setString(2, userPW);
        st.setString(3, userName);
        st.setString(4, userNickname);
        st.setString(5, userUniv);
        st.setString(6, userDept);
        st.setString(7, userNum);
        st.setInt(8, isConfirm);
        st.setInt(9, report);
        st.setInt(10, isSponser);
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
    
    protected String loginUserNum(String id, String pw) throws SQLException { //로그인
        Statement stmt2 = null;
        stmt2 = conn.createStatement();
        rs = stmt2.executeQuery("select * from user");
        String userNum = "null";
        while (rs.next()) {
            String name = rs.getString("userID");;
            String password = rs.getString("userPW");
            if (name.equals(id) && password.equals(pw))
                userNum = rs.getString("userNum");
        }
        return userNum;
    }
    
    protected boolean searchData(String table, String keycolumn, String data) throws SQLException {
        //특정 값이 특정 테이블에 존재하는지 확인 - 존재한다면 true 리턴
        //table = 테이블, keycolumn = 찾을 대상이 되는 컬럼, data = 찾을 값
        Statement stmt2 = null;
        stmt2 = conn.createStatement();
        rs = stmt2.executeQuery("select * from " + table);
        while (rs.next()) {
            String name = rs.getString(keycolumn);;
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
    
    protected void BoardControl(String boardTitle, String boardAbout, String userNum) throws SQLException{
        String sql = "INSERT INTO board( "
                + " boardTitle, "
                + " boardAbout, "
                + " userNum"
                + ") VALUES (?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, boardTitle);
        st.setString(2, boardAbout);
        st.setString(3, userNum);
        st.executeUpdate();
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
    
    protected int returnPost(String recommend, String postnum) throws SQLException{
        Statement stmt2 = null;
        stmt2 = conn.createStatement();
        rs = stmt2.executeQuery("select " + recommend + " from post" + " where postNum ='" + postnum+ "'");
        while (rs.next()) {
            int a = rs.getInt(recommend);
            return a;
        }
        return 0;
    }
    
    protected void updatePost(String postnum, int recommend) throws SQLException{
        // a: 테이블, b: 컬럼명, c: 바꿀 데이터의 키값, d: 바꿀 데이터의 데이터값, e: 바꿀 데이터 값
        // UPDATE [테이블] SET [열] = '변경할값' WHERE [조건]

        String sql = "UPDATE post "
                + "SET"
                + " " + recommend + " =?"
                + "WHERE postNum" + " =?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, recommend+1);
        st.setString(2, postnum);
        st.executeUpdate();
    }
    protected int returnRecommend(String recommend, String postnum) throws SQLException{
        // 추천수 얻어오기
        Statement stmt2 = null;
        stmt2 = conn.createStatement();
        rs = stmt2.executeQuery("select " + recommend + " from post" + " where postNum ='" + postnum + "'");
        while (rs.next()) {
            int a = rs.getInt(recommend);
            return a;
        }
        return 0;
    }
    
    protected void updateRecommend(String postnum, int recommend) throws SQLException{
        // 추천 누를 시 +1
        // UPDATE [테이블] SET [열] = '변경할값' WHERE [조건]
        String sql = "UPDATE post SET recommend =? WHERE postNum =?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, recommend);
        st.setString(2, postnum);
        st.executeUpdate();
    }
    
    protected String returnComment(String usernum, String content, String keydata) throws SQLException {
        // comment 테이블에서 게시글 번호 비교하여 해당되는 댓글 내용 가져오기
        Statement stmt2 = null;
        String tmpStr = "";
        
        stmt2 = conn.createStatement();
        rs = stmt2.executeQuery("select " + usernum + ", " + content + " from comment" + " where postNum ='" + keydata + "'");
        if(rs.next()){
            ArrayList<String> list = new ArrayList<String>();
            do{
                String a = rs.getString(usernum);
                String b = rs.getString(content);
                tmpStr = a + ": " + b +"\n";
                list.add(tmpStr);
            }while (rs.next());{ 
                
                return tmpStr;
            }
        }else{
            return null;
        }
    }

     protected void postComment(String postNum,String userNum, String comment) throws SQLException {
        // 댓글 작성
        //순서 : 게시판번호, 작성자 번호, 댓글 내용
        String sql = "INSERT INTO comment( "
                + " postNum, "
                + " userNum"
                + " comContent"
                + ") VALUES (?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, postNum);
        st.setString(2, userNum);
        st.setString(3, comment);
        st.executeUpdate();
    }
    
    protected void sendMsg(String senderNum, String receiverNum, String messageContent) throws SQLException {
        // 메세지 보내기 , messageDate는 함수가 호출되는 시간 으로 설정, isCheck = default 0 ~> 읽으면 +1
        Calendar cal = new GregorianCalendar();
        Timestamp ts = new Timestamp(cal.getTimeInMillis());
        
        String sql = "INSERT INTO message( "
                + " senderNum, "
                + " receiverNum, "
                + " messageDate,"
                + " messageContent,"
                + " isCheck"
                + ") VALUES (?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, senderNum);
        st.setString(2, receiverNum);
        st.setTimestamp(3, ts); // Timestamp 형식으로 초기화
        st.setString(4, messageContent);
        st.setInt(5, 0); // int 형식으로 초기화
        st.executeUpdate();
    }
}
