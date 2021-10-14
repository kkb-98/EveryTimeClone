
package BuilderPattern;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.databaseSQL;

public class Member extends databaseSQL {
    private String id; //필수
    private String pw; //필수
    private String name; //필수
    private String nick;
    private String univ;
    private String dept;
    private int isConfirm;
    
    public static Builder builder() {
        return new Builder();
    }
    
    public static class Builder{
    // 필수적으로 필요한 정보
        private String id; //필수
        private String pw; //필수
        private String name; //필수
        private int isConfirm; //필수
        // 선택적으로 필요한 정보 - 상황에 따라 기본값으로 초기화해줄 필요성
        private String nick;
        private String univ;
        private String dept;
        
        // 선택적으로 필요한 정보들에 대한 정보를 받고 미완성된 객체들을 전달할 메소드
        public Builder id(String id) {
            this.id = id;
            return this; // . 으로 체인을 이어가기 위함
        }
        
        public Builder pw(String pw) {
            this.pw = pw;
            return this; // . 으로 체인을 이어가기 위함
        }
        
        public Builder name(String name) {
            this.name = name;
            return this; // . 으로 체인을 이어가기 위함
        }
        
        public Builder isConfirm(int isConfirm) {
            this.isConfirm = isConfirm;
            return this; // . 으로 체인을 이어가기 위함
        }
            
        public Builder nick(String nick) {
            this.nick = nick;
            return this; // . 으로 체인을 이어가기 위함
        }

        public Builder univ(String univ) {
            this.univ = univ;
            return this;
        }

        public Builder dept(String dept) {
            this.dept = dept;
            return this;
        }

        public Member build() {
            // 메소드의 최종에 사용해 완성된 객체를 어떤 상황에서도 반환
            return new Member(this);
        }
    }

    private Member(Builder builder) {
        this.id = builder.id;
        this.pw = builder.pw;
        this.name = builder.name;
        this.nick = builder.nick;
        this.univ = builder.univ;
        this.dept = builder.dept;
        this.isConfirm = builder.isConfirm;
    }
    
    public void MemberSave(){
        String stringNum = null;
        int randomNum;
        
        dbLoad();
        try {
            do{
                randomNum = (int)((Math.random()*100000) - 1);
                stringNum = String.format("%05d", randomNum);
                //System.out.println("int :" + randomNum);
                //System.out.println("string :" + stringNum);
            }while(searchData("user", "userNum", stringNum));
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            signupUser(this.id, this.pw, this.name, this.nick, this.univ, this.dept, stringNum, this.isConfirm);
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        //순서 : 아이디, 패스워드, 이름, 닉네임, 대학교, 학과, 고유번호, 학교인증여부
        System.out.println(this.id + "\n" + this.pw + "\n" + this.name + "\n" + this.nick + "\n" + this.univ + "\n" + this.dept + "\n" + stringNum + "\n" + this.isConfirm);
        dbClose();
    }
}