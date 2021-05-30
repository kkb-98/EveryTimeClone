package main;

import StatePattern.Notice;
import UserController.LoginController;

public class EveryTime_Main extends databaseSQL {
    
    public static String UserNum;
    
    //프로그램 실행 시 main 함수로 쓰여질 클래스
    public static void main(String[] args) {
        try {
            //javax.swing.UIManager.setLookAndFeel( javax.swing.UIManager.getCrossPlatformLookAndFeelClassName() );
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
                   e.printStackTrace();
        } // 크로스 플랫폼에서 출력 이상하게 나오는 문제 해결 코드, 삭제하지 마세요
        
        //Grades_Function GF = new Grades_Function();
        //GF.sub_input(); //학점관리기능 함수 실행
        LoginController loginMenu = new LoginController();
        loginMenu.setVisible(true); //로그인 화면 띄움
    }
}
