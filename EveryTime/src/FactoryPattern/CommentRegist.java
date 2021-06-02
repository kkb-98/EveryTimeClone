/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;
// 댓글 등록

public abstract class CommentRegist {
    
    protected abstract Comment registercom(String userNum, String type, String comment);
    public Comment RegeComment(String userNum, String type, String comment){
        Comment reg_comment = registercom(userNum, type, comment);
        System.out.println("Register comment");
        return reg_comment;
    }
}
