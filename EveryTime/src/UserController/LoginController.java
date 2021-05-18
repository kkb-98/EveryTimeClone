
package UserController;
import ManagerController.ManagerLoginController;
import ManagerController.ManagerMainController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.databaseSQL;
import main.EveryTime_Main;

public class LoginController extends databaseSQL {

    public LoginController() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        UserID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UserLogin = new javax.swing.JButton();
        Join = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Manager = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        UserPW = new javax.swing.JPasswordField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("휴먼편지체", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Everytime");

        UserID.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        UserID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        jLabel3.setText("PW");

        UserLogin.setBackground(new java.awt.Color(153, 0, 0));
        UserLogin.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        UserLogin.setForeground(new java.awt.Color(255, 255, 255));
        UserLogin.setText("LOGIN");
        UserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLoginActionPerformed(evt);
            }
        });

        Join.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Join.setText("JOIN");
        Join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        jLabel5.setText("회원가입이 필요하신가요?");

        Manager.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Manager.setText("MANAGER");
        Manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        jLabel6.setText("관리자 로그인");

        UserPW.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Join, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Manager, javax.swing.GroupLayout.PREFERRED_SIZE, 112, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(UserID)
                            .addComponent(UserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UserPW))))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(UserPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(UserLogin)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Join))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Manager))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLoginActionPerformed
        // 정보가 있다면.. 로그인 성공
        dbLoad();
        //String a = UserID.getText(); //ID
        String id = UserID.getText(); //a
        String pw = new String(UserPW.getPassword()); //b
        boolean login = false;
        boolean isAdmin = false;
        try {
            login = loginUser(id, pw);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            EveryTime_Main.UserNum = loginUserNum(id,pw);
        } catch (SQLException ex) {
        } // 로그인이 됬다면 id,pw 가 검증이 된상태라서 익셉션 설정은 안했는대 한번 확인바랍니다.
        if(id.equals("admin")) isAdmin = true;
        if (login) {
            dispose(); //현재 GUI 종료 (비정상 종료)
            if (isAdmin) {
                JOptionPane.showMessageDialog(this, "[ 관리자 로그인 ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
                new ManagerMainController().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, EveryTime_Main.UserNum, "메세지", JOptionPane.INFORMATION_MESSAGE);
                // 로그인 됬을때 UserNum가 정상적으로 넘어가지는지 확인하기위함 나중에 지우세욤
                JOptionPane.showMessageDialog(this, "[ 로그인 성공 ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
                new MainPageController().setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "[ 로그인 실패 ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_UserLoginActionPerformed

    private void JoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinActionPerformed
        UserJoinController UJ = new UserJoinController();
        UJ.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_JoinActionPerformed

    private void UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIDActionPerformed

    private void ManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerActionPerformed
        ManagerLoginController ML = new ManagerLoginController();
        ML.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_ManagerActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Join;
    private javax.swing.JButton Manager;
    private javax.swing.JTextField UserID;
    private javax.swing.JButton UserLogin;
    private javax.swing.JPasswordField UserPW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
