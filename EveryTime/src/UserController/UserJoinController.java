package UserController;

import BuilderPattern.Member;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.databaseSQL;

public class UserJoinController extends databaseSQL {

    boolean isCheck = false;
    int isConfirm = 0;
    String checkedID = null;
    //String checkedNICK = null;
    
    public UserJoinController() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UserID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        UserNickname = new javax.swing.JTextField();
        UserPW = new javax.swing.JPasswordField();
        OverlapCheck = new javax.swing.JButton();
        UserJoin = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        UserUniv = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        UserDept = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("휴먼편지체", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Everytime");

        jLabel2.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        jLabel2.setText("회원가입");

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jLabel3.setText("이름 :");

        UserName.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jLabel4.setText("ID :");

        UserID.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jLabel5.setText("PW :");

        jLabel7.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jLabel7.setText("닉네임 :");

        UserNickname.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        UserPW.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        OverlapCheck.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        OverlapCheck.setText("중복확인");
        OverlapCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverlapCheckActionPerformed(evt);
            }
        });

        UserJoin.setBackground(new java.awt.Color(153, 0, 0));
        UserJoin.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        UserJoin.setForeground(new java.awt.Color(255, 255, 255));
        UserJoin.setText("회원 가입");
        UserJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserJoinActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        Back.setText("뒤로가기");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        UserUniv.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        jLabel8.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jLabel8.setText("학교 :");

        UserDept.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jLabel9.setText("학과 :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UserName))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserID)))
                        .addGap(11, 11, 11)
                        .addComponent(OverlapCheck))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(UserJoin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UserDept)
                                    .addComponent(UserUniv)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserPW))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addGap(0, 129, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(UserNickname)))))
                        .addGap(100, 100, 100)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OverlapCheck))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(UserPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(UserNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserUniv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UserDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserJoin)
                    .addComponent(Back))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void UserJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserJoinActionPerformed
        // 회원가입 버튼 클릭
        // 빈칸 확인
        String name = UserName.getText();
        String id = UserID.getText();
        String pw = UserPW.getText();
        String nick = UserNickname.getText();
        String univ = UserUniv.getText();
        String dept = UserDept.getText();
        
        if(name.length() == 0)
            JOptionPane.showMessageDialog(this, "이름을 입력해주세요.", "메세지", JOptionPane.INFORMATION_MESSAGE);
        else if(id.length() == 0)
            JOptionPane.showMessageDialog(this, "아이디를 입력해주세요.", "메세지", JOptionPane.INFORMATION_MESSAGE);
        else if(pw.length() == 0)
            JOptionPane.showMessageDialog(this, "패스워드를 입력해주세요.", "메세지", JOptionPane.INFORMATION_MESSAGE);
        else if(nick.length() == 0)
            JOptionPane.showMessageDialog(this, "닉네임을 입력해주세요.", "메세지", JOptionPane.INFORMATION_MESSAGE);
        else {
            // 글자 수 확인
            if(name.length() > 4)
                JOptionPane.showMessageDialog(this, "이름은 4자까지만 입력이 가능합니다.", "메세지", JOptionPane.INFORMATION_MESSAGE);
            else if(id.length() > 10 || id.length() < 4)
                JOptionPane.showMessageDialog(this, "4~10자 이내의 아이디를 입력해주세요.", "메세지", JOptionPane.INFORMATION_MESSAGE);
            else if(pw.length() > 15 || pw.length() < 4)
                JOptionPane.showMessageDialog(this, "4~15자 이내의 비밀번호를 입력해주세요.", "메세지", JOptionPane.INFORMATION_MESSAGE);
            else if(nick.length() > 10 || nick.length() < 2)
                JOptionPane.showMessageDialog(this, "2~10자 이내의 닉네임을 입력해주세요.", "메세지", JOptionPane.INFORMATION_MESSAGE);
            else if(isCheck==false)
                JOptionPane.showMessageDialog(this, "ID 중복 확인이 필요합니다.", "메세지", JOptionPane.INFORMATION_MESSAGE);
            else{
                if(!checkedID.equals(id)) { //|| checkedNICK != UserNickname.getText()
                    JOptionPane.showMessageDialog(this, "ID 중복 확인이 필요합니다.", "메세지", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    if(!univ.equals(null) && !dept.equals(null)) this.isConfirm = 1; //학과, 학교 모두 입력되면 학과인증 완료
                    
                    //빌더패턴 (Builder Pattern)
                    Member member = Member.builder()
                            .id(id)
                            .pw(pw)
                            .name(name)
                            .nick(nick)
                            .isConfirm(isConfirm)
                            .univ(univ)
                            .dept(dept)
                            .build();
                    member.MemberSave();
                    
                    JOptionPane.showMessageDialog(this, "회원가입이 완료되었습니다.", "메세지", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            }
        }
    }//GEN-LAST:event_UserJoinActionPerformed

    private void OverlapCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OverlapCheckActionPerformed
        // ID 중복 확인
        dbLoad();
        String id = UserID.getText();
        String nick = UserNickname.getText();
        try {
            if(searchData("user", "userID", id)){
                JOptionPane.showMessageDialog(this, "이미 존재하는 ID입니다.", "메세지", JOptionPane.INFORMATION_MESSAGE);
                isCheck = false;
            }
            /*else if(searchData("user", "userNickname", nick))
            JOptionPane.showMessageDialog(this, "이미 존재하는 닉네임입니다.", "메세지", JOptionPane.INFORMATION_MESSAGE);*/
            else {
                isCheck = true;
                checkedID = id;
                //checkedNICK = nick;
                JOptionPane.showMessageDialog(this, "사용 가능한 ID입니다.", "메세지", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserJoinController.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbClose();
    }//GEN-LAST:event_OverlapCheckActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserJoinController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserJoinController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserJoinController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserJoinController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserJoinController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton OverlapCheck;
    private javax.swing.JTextField UserDept;
    private javax.swing.JTextField UserID;
    private javax.swing.JButton UserJoin;
    private javax.swing.JTextField UserName;
    private javax.swing.JTextField UserNickname;
    private javax.swing.JPasswordField UserPW;
    private javax.swing.JTextField UserUniv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
