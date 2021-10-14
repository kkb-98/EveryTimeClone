/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

import UserController.BoardController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Recommend extends Sorting {
    
    public Recommend (String postNum){
        dbLoad();
        
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
