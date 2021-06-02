/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

import main.databaseSQL;


public abstract class Comment extends databaseSQL{
    
    protected String userNum;
    protected String comment;
    
    public String getcomment(){return this.comment;};
    public String getuserNum(){return this.userNum;};
    
    public void prepare() {
        System.out.print("Table Setting Complete");
    }; 
}
