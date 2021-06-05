package ManagerController;
import IteratorPattern.BT;
import UserController.LoginController;
import SingletonPattern.UserInfo;
import IteratorPattern.BTG;
import IteratorPattern.BTGIterator;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.databaseSQL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ManagerMainController extends databaseSQL implements MouseListener, KeyListener,ListSelectionListener {
    UserInfo userinfo = UserInfo.getInstance();
    List<Object> btarray = new ArrayList<Object>();
    String okbt;
    public ManagerMainController() {
        initComponents();
        Search.addMouseListener(this);
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UserInfor = new javax.swing.JButton();
        Board = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        SearchController = new javax.swing.JTextField();
        Search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("휴먼편지체", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Everytime");

        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("⏰");

        jLabel3.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        jLabel3.setText("관리자");

        UserInfor.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        UserInfor.setText("사용자 정보");
        UserInfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserInforActionPerformed(evt);
            }
        });

        Board.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        Board.setText("게시판");
        Board.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoardActionPerformed(evt);
            }
        });

        Logout.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        Logout.setText("로그아웃");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        SearchController.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        Search.setBackground(new java.awt.Color(153, 0, 0));
        Search.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("검색");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Board, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UserInfor)
                                .addGap(18, 18, 18)
                                .addComponent(Logout))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchController)
                                .addGap(18, 18, 18)
                                .addComponent(Search)))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchController, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Board)
                    .addComponent(UserInfor)
                    .addComponent(Logout))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // 관리자 - 로그아웃
        userinfo.UserNum = "00000";
        dispose();
        new LoginController().setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void BoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoardActionPerformed

        ManagerBoardController MB = new ManagerBoardController();
        MB.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_BoardActionPerformed

    private void UserInforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserInforActionPerformed
        ManagerUserInfoController MI = new ManagerUserInfoController();
        MI.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_UserInforActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
    }//GEN-LAST:event_SearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Board;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchController;
    private javax.swing.JButton UserInfor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        dbLoad();
        String bT;
        java.sql.Statement stmt2 = null;
        try {
            stmt2 = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerMainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs = stmt2.executeQuery("select * from board");
        } catch (SQLException ex) {
            Logger.getLogger(ManagerMainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
                while(rs.next()){
                    btarray.add(rs.getString("boardTitle"));
                }
             }catch (SQLException ex) {
            Logger.getLogger(ManagerMainController.class.getName()).log(Level.SEVERE, null, ex);
            }
        BTG btg = new BTG(btarray.size());  //이터레이터 패턴 적용
        for (int i=0;i<btarray.size();i++){
            btg.AddBT(new BT((String) btarray.get(i)));
        }
        BTGIterator iterator = btg.iterator();
        String title = SearchController.getText();
        while(iterator.hasNext()){
            BT bt = (BT)iterator.next();
            if (bt.getTitle().equals(SearchController.getText())){
                //bt가 검색한 게시판제목임.
                okbt=bt.getTitle();
            }else{
                continue;
            }
        }
        dbClose();
        
        if(e.getSource()==Search){
            ManagerPostController MPC = new ManagerPostController();
                MPC.BT2 =okbt;
                MPC.setVisible(true);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
