/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.databaseSQL;
import SingletonPattern.UserInfo;

// 알림 클래스
public class Notice extends databaseSQL {

    private State state;
    UserInfo userinfo = UserInfo.getInstance();

    // 현재 알림의 갯수에따라 최초상태 부여 (db 확인)
    public Notice() {
        dbLoad();
        try {
            if(checkNotice()) {
                state = Receive.getInstance();
            } else {
                state = Normal.getInstance();
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "sql오류 : ."+ex, "메세지", JOptionPane.INFORMATION_MESSAGE);
        }
        dbClose();
    }
    
    public void readNotice() {
        dbLoad();
        try {
        updateData("notice", "noticeCheck", "receiverNum", userinfo.UserNum, "O");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "sql오류 : ."+ex, "메세지", JOptionPane.INFORMATION_MESSAGE);
        }
        dbClose();
    }
    
    public int getState() {
        if(this.state == Normal.getInstance()) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public void setState(State state) {
        this.state = state;
    }

    // 작업 위임
    public void normal_alarm(Notice notice) {
        state.normal_alarm(this);
    }
}