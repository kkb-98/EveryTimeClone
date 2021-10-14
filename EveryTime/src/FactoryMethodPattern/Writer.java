/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodPattern;
// 댓글 작성자가 글쓴이 일때

public class Writer extends Comment{
    public Writer (String userNum, String comment){
        this.userNum = userNum;
        this.comment = "글쓴이 : "+ comment;
    }
    public void regist() {
        System.out.println("댓글 등록 완료");
    };
}
