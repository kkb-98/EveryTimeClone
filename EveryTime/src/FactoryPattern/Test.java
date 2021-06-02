/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

//테스트용
public class Test {

    public static void main(String[] args) {
        CommentRegist cr = new DiviWriter();
        
        Comment com = cr.RegeComment("00001", "Writer", "흐이이잉");
        System.out.println(com.getcomment());
        com.prepare();
          
        com = cr.RegeComment("00002", "Reader", "프히컄컄");
        System.out.println(com.getcomment());
        com.prepare();
    }
    
}
