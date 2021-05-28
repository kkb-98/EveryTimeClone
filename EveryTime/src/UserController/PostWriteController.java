
package UserController;

import java.sql.ResultSet;
import main.databaseSQL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import main.EveryTime_Main;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
        
public class PostWriteController extends databaseSQL  {
    String bt4;

    public PostWriteController() { 
     
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PostTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        PostEnroll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Content = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("휴먼편지체", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Everytime");

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel2.setText("게시글 작성");

        PostTitle.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jLabel3.setText("제목 :");

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jLabel4.setText("내용");

        Back.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        Back.setText("뒤로가기");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        PostEnroll.setBackground(new java.awt.Color(153, 0, 0));
        PostEnroll.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        PostEnroll.setForeground(new java.awt.Color(255, 255, 255));
        PostEnroll.setText("완료");
        PostEnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostEnrollActionPerformed(evt);
            }
        });

        Content.setColumns(20);
        Content.setRows(5);
        jScrollPane1.setViewportView(Content);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(PostTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PostEnroll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Back))
                            .addComponent(jScrollPane1))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PostTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(PostEnroll))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PostEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostEnrollActionPerformed
 // 게시글 등록      EveryTime_Main.PostNum
        dbLoad();   // db연결
        //String boardtitle = EveryTime_Main.addBoard; // 게시판 이름
        String boardtitle = "test";     // 게시판 이름
        String postNum;              // 게시글 번호
        String postContent = Content.getText();    // 게시글 내용
        //String userNum = EveryTime_Main.UserNum;    // usernum 불러오기
        String userNum = "00001";
        String postTitle = PostTitle.getText();    // 게시글 제목
        boolean check;
        int recommend = 0;
        
            if(postTitle.replaceAll("[^a-zA-Zㄱ-힣]", "").length() == 0){
                JOptionPane.showMessageDialog(this, "[ 제목을 입력하세요 ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
            }else if(postContent.replaceAll("[^a-zA-Zㄱ-힣]", "").length() == 0){
                JOptionPane.showMessageDialog(this, "[ 내용을 입력하세요 ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
            }else{
                try{
                    int random; 
                    do{
                        random =(int)((Math.random()*100000)-1);
                        postNum = String.format("%05d", random);
                        EveryTime_Main.PostNum = postNum;

                    }while(check = searchData("post","postNum", EveryTime_Main.PostNum));
                    
                    if(check == false){
                        postBoard( boardtitle, EveryTime_Main.PostNum, postTitle, postContent, userNum, recommend);
                        // 게시판명, 게시글 번호, 게시글 제목, 게시 내용, 작성자 번호, 게시일, 추천수
                        dbClose();
                        System.out.println("DB 등록 완료");
                    }
                    

                }catch (SQLException ex) {
                    Logger.getLogger(PostListController.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "[ 게시물이 등록되었습니다. ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
                dispose();  // 현재 gui 종료
               
                new PostListController().setVisible(true);  // 등록 후 postlist로 이동
        }
        


    }//GEN-LAST:event_PostEnrollActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed
  
    public static void main (String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostWriteController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextArea Content;
    private javax.swing.JButton PostEnroll;
    private javax.swing.JTextField PostTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

  
}
