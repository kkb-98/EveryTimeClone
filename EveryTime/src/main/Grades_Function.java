package main;
import java.util.Scanner;

public class Grades_Function {
    Scanner sc = new Scanner(System.in); //과목수 입력 받기
    String[] G_term = new String[6]; //G_term = 0학년0학기
    int G_size = G_term.length;     //G_term 배열의 길이 //G_term 배열의 길이
    int a= 0;
    String[] SN = new String[10];
    String[] TG = new String[10];
    int[] SG = new int[10];
    double[] TG2 = new double[10];
    double TG3 = 0;
    int total_SG = 0;
    double total_TG = 0;
    String choice = ""; String choice2 = "";
    
    public void sub_input(){
        //Scanner sc = new Scanner(System.in); //과목수 입력 받기
        for(int i=0;i<100;i++){
            System.out.println("과목명입력 :");
            SN[i] = sc.next();
            System.out.println("과목학점입력 :");
            SG[i] = sc.nextInt();
            System.out.println("취득학점입력(ex A+,A,B+,B...): ");
            TG[i] = sc.next();
            if ("A+".equals(TG[i])){
                TG2[i]=4.5;
            }else if("A".equals(TG[i])){
                TG2[i]=4;
            }else if("B+".equals(TG[i])){
                TG2[i]=3.5;
            }else if("B".equals(TG[i])){
                TG2[i]=3;
            }else if("C+".equals(TG[i])){
                TG2[i]=2.5;
            }else if("C".equals(TG[i])){
                TG2[i]=2;
            }else if("D+".equals(TG[i])){
                TG2[i]=1.5;
            }else if("D".equals(TG[i])){
                TG2[i]=1;
            }else{
                TG2[i]=0;
            }
            a = i;
            System.out.println("입력을 종료하시겠습니까?(종료하시면 학점계산이 시작됩니다.\n"
                    +   "(Y/N)");
            choice = sc.next();
            if ("y".equals(choice) || "Y".equals(choice)){break;}
            else{continue;}
            }
        int a1 = a+1;
        
        for(int i=0;i<a1;i++){
            TG3 += SG[i] * TG2[i];
            total_SG += SG[i];
        }
        total_TG = TG3/total_SG;
        System.out.println("총 취득학점 :" + String.format("%.2f",total_TG) + "입니다.");
        System.out.println("데이터를 저장하시겠습니까?(y/n)");
        choice = sc.next();
        if ("y".equals(choice2) || "Y".equals(choice2)){
            System.out.println("학년과 학기를 적어주세요:");
            
        }
        
    }
}
