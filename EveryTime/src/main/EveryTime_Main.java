package main;

import UserController.LoginController;

public class EveryTime_Main {
    //프로그램 실행 시 main 함수로 쓰여질 클래스
    public static void main(String[] args) {
        //Grades_Function GF = new Grades_Function();
        //GF.sub_input(); //학점관리기능 함수 실행
        LoginController loginMenu = new LoginController();
        loginMenu.setVisible(true); //로그인 화면 띄움
    }
}
