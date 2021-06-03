/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Recommend extends Sorting {
    UserInfo userinfo = UserInfo.getInstance();
    
    public Recommend (){
        dbLoad();
        String postNum = userinfo.PostNum;   // 게시글 번호
        
        
        try{
            int recommend = returnRecommend("recommend", postNum);   // 추천수 얻어오기
            System.out.println("추천수 : "+recommend);
            recommend = recommend + 1;  // recommend +1 
            updateRecommend(postNum, recommend);  // 추천눌렀을때 원래 값에서 +1되도록
        }catch(SQLException ex){
            Logger.getLogger(BoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbClose();
    }
    
}
