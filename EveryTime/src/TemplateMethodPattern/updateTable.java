/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethodPattern;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.databaseSQL;
import SingletonPattern.UserInfo;
import java.util.ArrayList;
import java.util.List;

public abstract class updateTable extends databaseSQL {
    
    UserInfo userinfo = UserInfo.getInstance();
    
    private String Table;
    private String check;
    private String col1;
    private String col2;
    private String col3;
        
    public List<Object> columndata1 = new ArrayList<Object>();
    public List<Object> columndata2 = new ArrayList<Object>();
    public List<Object> columndata3 = new ArrayList<Object>();
    
    public void upTable(String Table,String check, String col1, String col2, String col3) {
        this.Table = Table;
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
        this.check = check;
        finddata();
        addFunction();
    }
    
    private void finddata() {
        dbLoad();
        try {
            String sql="select " + col1 + " ," + col2 + ", " + col3 + " from " + Table + " where " + check + " = '"+ userinfo.UserNum + "' ";
            PreparedStatement st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                String column1 = rs.getString(col1);
                String column2 = rs.getString(col2);
                String column3 = rs.getString(col3);
                
                columndata1.add(column1);
                columndata2.add(column2);
                columndata3.add(column3);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "sql오류 : ."+ex, "메세지", JOptionPane.INFORMATION_MESSAGE);
        }
        dbClose();
    }
    
    protected abstract void addFunction();
}
