package ManagerController;

import UserController.BoardController;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.*;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.ListSelectionModel.SINGLE_SELECTION;
import javax.swing.event.ListSelectionListener;
import main.databaseSQL;
import java.sql.ResultSet;
import javax.swing.event.ListSelectionEvent;
import main.EveryTime_Main;
import static javax.swing.JOptionPane.showMessageDialog;
public class ManagerBoardController extends databaseSQL implements MouseListener, KeyListener,ListSelectionListener {
    //String BBT;
    DefaultListModel model = new DefaultListModel();
    public ManagerBoardController() {
        initComponents();
        PostIn.addMouseListener(this);
        Delete.addMouseListener(this);
        BoardList.addListSelectionListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BoardList = new javax.swing.JList<>();
        Modify = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        PostIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("휴먼편지체", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Everytime");

        jLabel2.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        jLabel2.setText("게시판");

        jLabel3.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        jLabel3.setText("관리자");

        BoardList.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        BoardList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                BoardListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(BoardList);

        Modify.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        Modify.setText("수정");

        Delete.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        Delete.setText("삭제");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        Back.setText("뒤로가기");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        PostIn.setBackground(new java.awt.Color(153, 0, 0));
        PostIn.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        PostIn.setForeground(new java.awt.Color(255, 255, 255));
        PostIn.setText("확인");
        PostIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Modify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(PostIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete)
                    .addComponent(Back)
                    .addComponent(Modify)
                    .addComponent(PostIn))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>                        
 
    private void PostInActionPerformed(java.awt.event.ActionEvent evt) {                                       
    }                                      
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {                                     
        dispose();
    }                                    

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        dbLoad();
            java.sql.Statement stmt2 = null;
        try {
            stmt2 = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(BoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs = stmt2.executeQuery("select * from board");
        } catch (SQLException ex) {
            Logger.getLogger(BoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
            //DefaultListModel model = new DefaultListModel();
            int i = 1;
            try {
                while(rs.next()){
                    model.addElement(rs.getString("boardTitle"));
                    i++;
                }
             }catch (SQLException ex) {
            Logger.getLogger(BoardController.class.getName()).log(Level.SEVERE, null, ex);
            }
            BoardList.setModel(model);
            dbClose();
    }                                 
    private void BoardListValueChanged(javax.swing.event.ListSelectionEvent evt) {                                       
    }                                      

    public void removeItem(int index){
       if(index<0){
           if(model.size()==0)
               return;
               index = 0;
       }
       int BoardIndex = index;
        model.remove(index);
        //연결되는 코드는 마우스 클릭 이벤트로 넘어갑시다.
    }
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //게시판 삭제-관리자 모드일때
    }                                      

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerBoardController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Back;
    private javax.swing.JList<String> BoardList;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Modify;
    private javax.swing.JButton PostIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        dbLoad();
        String BT =BoardList.getSelectedValue();
        if(e.getSource()==PostIn){
           ManagerPostController MPC = new ManagerPostController();
            MPC.BT2= BT;
            MPC.setVisible(true);
        }
        if(e.getSource()== Delete){
            int result = JOptionPane.showConfirmDialog(null, "해당 게시판을 삭제 하시겠습니까?.","Save",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.CLOSED_OPTION || result ==JOptionPane.NO_OPTION){
            }
            else if(result==JOptionPane.YES_OPTION){
            int selected=BoardList.getSelectedIndex();
             
             java.sql.Statement stmt2 = null;
            try {
                stmt2 = conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(ManagerBoardController.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                int su = 0;
                //String BT = BoardList.getSelectedValue();
                System.out.println(BT);
                String sql = "delete from board where boardTitle =  \"" + BT + "\" ";
                System.out.println(sql);
                PreparedStatement st = conn.prepareStatement(sql);
                su = st.executeUpdate();
                removeItem(selected);
                showMessageDialog(null,"해당 게시판이 삭제되었습니다!");
                
            } catch (SQLException ex) {
                Logger.getLogger(ManagerBoardController.class.getName()).log(Level.SEVERE, null, ex);
            }
            }

             dbClose();
             
         }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
