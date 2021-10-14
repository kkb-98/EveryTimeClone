
package UserController;
import ManagerController.ManagerMainController;
import SingletonPattern.UserInfo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.databaseSQL;

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
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Join, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))))
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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(36, 36, 36))
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
        
        UserInfo userinfo = UserInfo.getInstance();
        try {
            userinfo.UserNum = loginUserNum(id,pw);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(id.equals("admin")) isAdmin = true;
        if (login) {
            dispose(); //현재 GUI 종료 (비정상 종료)
            if (isAdmin) {
                JOptionPane.showMessageDialog(this, "[ 관리자 로그인 ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
                new ManagerMainController().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "[ 로그인 성공 ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
                new MainPageController().setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "[ 로그인 실패 ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
        }
        dbClose();
    }//GEN-LAST:event_UserLoginActionPerformed

    private void JoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinActionPerformed
        UserJoinController UJ = new UserJoinController();
        UJ.setVisible(true);
        // 회원가입
    }//GEN-LAST:event_JoinActionPerformed

    private void UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Join;
    private javax.swing.JTextField UserID;
    private javax.swing.JButton UserLogin;
    private javax.swing.JPasswordField UserPW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
