package main;

import StatePattern.Notice;
import UserController.LoginController;

public class EveryTime_Main extends databaseSQL {
    
    //프로그램 실행 시 main 함수로 쓰여질 클래스
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
                   e.printStackTrace();
        } // 크로스 플랫폼에서 출력 이상하게 나오는 문제 해결 코드, 삭제하지 마세요
        
        LoginController loginMenu = new LoginController();
        loginMenu.setVisible(true); //로그인 화면 띄움
    }
}
