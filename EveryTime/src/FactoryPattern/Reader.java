/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;
// 댓글 작성자가 독자일때

public class Reader extends Comment{
    public Reader (String userNum, String comment){
        this.userNum = userNum;
        //this.comment = "독자(" + userNum + ") : " + comment; // 독자 userNum : comment
        this.comment = "독자(" + userNum + ") : " + comment;
    }
    public void prepare() {
        System.out.println("댓글 등록 완료");
    };
}
