
package StrategyPattern;

import SingletonPattern.UserInfo;
import UserController.BoardController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Report extends Sorting{ //신고
    
    public Report (String postNum){
        dbLoad();
        
        try{
            String writerNum = returnData("post","userNum","postNum", postNum);   // 게시글 작성자 아이디 불러오기
            System.out.println("작성자 : " + writerNum);  // 작성자 신고 = 계정에 report + 1;
            
            int report = returnReport("report", postNum);   // writerNum의 신고수 얻어오기
            System.out.println("기존 신고수 : "+ report);
            report = report + 1;  // recommend +1 
            
            updateReport(report, writerNum);  // 추천눌렀을때 원래 값에서 +1되도록
           
        }catch(SQLException ex){
            Logger.getLogger(BoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbClose();
    }
    
    
}
