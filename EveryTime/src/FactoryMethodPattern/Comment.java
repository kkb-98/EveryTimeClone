/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodPattern;


public abstract class Comment{
    
    protected String userNum;
    protected String comment;
    
    public String getComment(){return this.comment;};
    public String getUserNum(){return this.userNum;};
    
    public void regist() {
        System.out.print("Table Setting Complete");
    }; 
}
