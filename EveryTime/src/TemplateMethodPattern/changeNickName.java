/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethodPattern;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class changeNickName extends updateTable {
    
    @Override
    protected void addFunction() {
        dbLoad();
        for(int i=0; i < columndata1.size() ; i++) {
            try {
                columndata1.set(i, returnData("user", "userNickname", "userNum", (String)columndata1.get(i)));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "sql오류 : ."+ex, "메세지", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        dbClose();
    }
}
