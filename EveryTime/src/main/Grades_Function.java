package main;
import java.util.Scanner;

public class Grades_Function {
    Scanner sc = new Scanner(System.in); //입력 받기
    String[] G_term = {"1학년1학기","1학년 2학기","2학년 1학기","2학년 2학기", 
        "3학년 1학기","3학년 2학기","4학년 1학기","4학년 2학기","기타학기"}; //G_term = 0학년0학기
    double[] S_term = new double[10];   //S_term = 0학년0학기의 총 취득 학점을 저장할 배열 
    int G_size = G_term.length;         //G_term 배열의 길이 //G_term 배열의 길이
    int a= 0; double a2=0;              //a 과목수 관련변수, a2 해당학기 총 취득 학점 관련변수
    String[] SN = new String[10];       //SN 과목명 입력
    String[] TG = new String[10];       //TG 해당과목 취득학점
    int[] SG = new int[10];             //SG 해당과목 학점
    double[] TG2 = new double[10];      //TG2 A+,A,B+,B... 판별
    double TG3 = 0;                     //TG2[] += (TG * SG) 학점 계산과정에 필요한 변수
    int total_SG = 0;                   //해당학기 총 이수 학점
    double total_TG = 0;                //해당학기 총 취득 학점
    String choice = ""; String choice2 = ""; String choice3 = "";  //선택시 판별 변수(Y or N)
    
    public void sub_input(){
        for(int i=0;i<100;i++){
            System.out.print("과목명입력 :");
            SN[i] = sc.next();
            System.out.print("해당과목학점입력 :");
            SG[i] = sc.nextInt();
            System.out.print("취득학점입력(ex A+,A,B+,B...): ");
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
            }else{ TG2[i]=0;}
            a = i;
            System.out.print("입력을 종료하시겠습니까?(종료하시면 학점계산이 시작됩니다.\n"
                    +   "(Y/N)");
            choice = sc.next();
            if ("y".equals(choice) || "Y".equals(choice)){break;}
            else{continue;}
         }   //for문 여기서 끝
             //밑으로는 for문 이후
//-------------------------------------------------------------------------------------------------------------------

        for(int i=0;i<a+1;i++){        
            TG3 += SG[i] * TG2[i];
            total_SG += SG[i];
        }
        total_TG = TG3/total_SG;                //for문 부터 여기까지가 학점계산
        a2 = Math.round((total_TG*100)/100.0);  //해당학기 총 취득 학점을 변수에 저장
        
        System.out.println("총 취득학점 :" + String.format("%.2f",total_TG) + "입니다.");
        System.out.print("데이터를 저장하시겠습니까?(y/n)");
        choice2 = sc.next();
        if ("y".equals(choice2) || "Y".equals(choice2)){
            System.out.print("학년과 학기를 적어주세요(0학년 0학기 - 띄어쓰기 유의바람.):");
            choice3 = sc.next();
            if("1학년 1학기".equals(choice3)){
                S_term[0]=a2;
            }else if("1학년 2학기".equals(choice3)){
                S_term[1]=a2;
             }else if("2학년 1학기".equals(choice3)){
                S_term[2]=a2;
             }else if("2학년 2학기".equals(choice3)){
                S_term[3]=a2;
             }else if("3학년 1학기".equals(choice3)){
                S_term[4]=a2;
             }else if("3학년 2학기".equals(choice3)){
                S_term[5]=a2;
             }else if("4학년 1학기".equals(choice3)){
                S_term[6]=a2;
             }else if("4학년 2학기".equals(choice3)){
                S_term[7]=a2;
             }else if("기타학기".equals(choice3)){
                S_term[8]=a2;
             }  
        }else{System.out.println("학점관리기능을 종료합니다."); return; }
        System.out.println("학점관리기능을 종료합니다."); return; }
}
