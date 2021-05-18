package main;

import UserController.LoginController;

public class EveryTime_Main {
    public static String UserNum;
    // 자바 문법이 전역변수를 허용을 안한다고함
    // static 이용하여 UserNum 을 선언하고 다른 클래스에서
    // 에브리타임메인을 임포트한후 EveryTime_Main.UserNum 으로 일반적인 변수처럼 사용가능
    // 일단 실행 최상단인 메인클래스쪽에 변수 생성해놓았습니다.
    
    public EveryTime_Main() { // 생성자로 초기에 00000번으로 적용 되게끔함
        UserNum = "00000";
    }
    
    //프로그램 실행 시 main 함수로 쓰여질 클래스
    public static void main(String[] args) {
        //Grades_Function GF = new Grades_Function();
        //GF.sub_input(); //학점관리기능 함수 실행
        LoginController loginMenu = new LoginController();
        loginMenu.setVisible(true); //로그인 화면 띄움
    }
}
