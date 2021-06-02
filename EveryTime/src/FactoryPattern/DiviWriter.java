/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;
// 댓글 작성자 분류

public class DiviWriter extends CommentRegist{

    @Override
    protected Comment registercom(String userNum, String type, String comment) {
        switch(type){
            case "Writer":
                System.out.println("Writer 입니다.");
                return new Writer(userNum, comment);
            case "Reader":
                System.out.println("Reader 입니다.");
                return new Reader(userNum, comment);
            default:
                return null;
        }
    }
}
