/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

// 알림이 0인 상태

import UserController.NoticeController;
import javax.swing.JOptionPane;

public class Normal implements State {

    private static Normal normal = new Normal();

    public Normal() { }

    // 싱글턴 적용
    public static Normal getInstance() {
        return normal;
    }

    @Override
    public void normal_alarm(Notice notice) {
        // 알려줄 알람이 없는 상태
        JOptionPane.showMessageDialog(null, "새로운 알림이 없습니다." , "메세지", JOptionPane.INFORMATION_MESSAGE);
        NoticeController NT = new NoticeController();
        NT.setVisible(true);
    }
}