/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

// 알림이 1이상인 상태

import UserController.NoticeController;
import javax.swing.JOptionPane;

public class Receive implements State {

    private static Receive receive = new Receive();

    private Receive() { }

    // 싱글턴 적용
    public static Receive getInstance() {
        return receive;
    }

    @Override
    public void normal_alarm (Notice notice) {
        // 새로운 알림이 있을때 명령
        notice.setState(new Normal());
        notice.readNotice();
        JOptionPane.showMessageDialog(null, "새로운 알림이 있습니다!" , "메세지", JOptionPane.INFORMATION_MESSAGE);
        NoticeController NT = new NoticeController();
        NT.setVisible(true);
    }
}
