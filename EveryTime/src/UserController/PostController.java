
package UserController;

import FactoryMethodPattern.Comment;
import FactoryMethodPattern.CommentRegist;
import FactoryMethodPattern.DiviWriter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import main.databaseSQL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import SingletonPattern.UserInfo;
import StrategyPattern.Reader;
import StrategyPattern.Recommend;
import StrategyPattern.Report;
import StrategyPattern.Sorting;
import StrategyPattern.Writer;
import javax.swing.DefaultListModel;
import java.sql.PreparedStatement;

public class PostController extends databaseSQL implements MouseListener, KeyListener,ListSelectionListener {
    String bt3;
    String PP;
    UserInfo userinfo = UserInfo.getInstance();
    String postNum =userinfo.PostNum;
    String userNum =userinfo.UserNum;
    String posterNum;
    
    public PostController() {
        initComponents();
        dbLoad();     

        CommentList.setModel(new DefaultListModel());
        DefaultListModel model = (DefaultListModel)CommentList.getModel();
        
        try{
            // 제목 출력
            posterNum = returnData("post", "userNum" , "postNum", postNum);
            String postTitle = returnData("post", "postTitle" , "postNum", postNum);
            PostTitle.setText(postTitle);
            //  내용 출력
            String  postContent = returnData("post", "postContent", "postNum", postNum);
            PostContent.setText(postContent);
             // 추천수 출력
             int count = returnRecommend("recommend", postNum);
             CountReco.setText(Integer.toString(count));
             
             String writer = returnData("post", "userNum", "postNum", postNum);
            // 작성자일때 신고, 쪽지 안보이게함
             if(writer.equals(userNum)){
                SendMessage.setVisible(false);
                Report.setVisible(false);
             }
            // 댓글 출력
            String sql= "select comContent from comment where postNum = '" + postNum + "'";
            PreparedStatement st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                String comContent = rs.getString("comContent");

                model.addElement(comContent);
            }
        }catch(SQLException ex){
            Logger.getLogger(BoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbClose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PostContent = new javax.swing.JTextArea();
        Register = new javax.swing.JButton();
        InputComment = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        Recommend = new javax.swing.JButton();
        Report = new javax.swing.JButton();
        PostTitle = new javax.swing.JTextField();
        SendMessage = new javax.swing.JButton();
        CountReco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        CommentList = new javax.swing.JList<>();

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

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("휴먼편지체", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Everytime");

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jLabel2.setText("게시글");

        PostContent.setEditable(false);
        PostContent.setColumns(20);
        PostContent.setRows(5);
        jScrollPane2.setViewportView(PostContent);

        Register.setBackground(new java.awt.Color(153, 0, 0));
        Register.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setText("등록");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        InputComment.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        back.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        back.setText("뒤로가기");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        Recommend.setText("👍");
        Recommend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecommendActionPerformed(evt);
            }
        });

        Report.setForeground(new java.awt.Color(153, 0, 0));
        Report.setText("🚨");
        Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportActionPerformed(evt);
            }
        });

        PostTitle.setEditable(false);
        PostTitle.setBackground(new java.awt.Color(255, 255, 255));
        PostTitle.setFont(new java.awt.Font("맑은 고딕", 0, 20)); // NOI18N

        SendMessage.setText("✉");
        SendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendMessageActionPerformed(evt);
            }
        });

        CountReco.setEditable(false);
        CountReco.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        jLabel3.setText("👍");

        jScrollPane5.setViewportView(CommentList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InputComment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PostTitle)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CountReco))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(back))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(SendMessage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Report)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Recommend)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(back))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CountReco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Recommend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(PostTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Register))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // 뒤로가기
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void RecommendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecommendActionPerformed
        // TODO add your handling code here: 추천  기능
        dbLoad();
                
        Sorting recommend = new Recommend(postNum);
        
         try{
            String writer = returnData("post", "userNum", "postNum", postNum);    // writer가 자신의 글인지 확인
            System.out.println("이 게시글의 작성자 : " + writer);
            if(writer.equals(userNum)){
               recommend.setFunction(new Writer());
               recommend.sort();
               JOptionPane.showMessageDialog(this, "[ 본인 글이므로 추천할 수 없습니다. ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
               Recommend.setEnabled(false);    // 버튼 비활성화
            }else{
                recommend.setFunction(new Reader());
                recommend.sort();
                JOptionPane.showMessageDialog(this, "[ 이 글을 추천하였습니다. ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
                Recommend.setEnabled(false);    // 버튼 비활성화
            }
            
        }catch(SQLException ex){
            Logger.getLogger(BoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        dbClose();

    }//GEN-LAST:event_RecommendActionPerformed

    private void ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportActionPerformed
          // TODO add your handling code here: 신고 기능
        
        dbLoad();
      
        Sorting report = new Report(postNum);
        
        try{
            String writer = returnData("post", "userNum", "postNum", postNum);    // writer가 자신의 글인지 확인
            System.out.println(writer);
            
            if(writer.equals(userNum)){ // 자신의 게시글일때
                report.setFunction(new Writer());
                report.sort();
                JOptionPane.showMessageDialog(this, "[ 본인 글이므로 신고할 수 없습니다. ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
                Report.setEnabled(false);    // 버튼 비활성화
            }else{  // 독자라면
                report.setFunction(new Reader());
                report.sort();
                JOptionPane.showMessageDialog(this, "[ 이 글을 신고하였습니다. ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
                Report.setEnabled(false);    // 버튼 비활성화
            }
        }catch(SQLException ex){
            Logger.getLogger(BoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        dbClose();
                               
    }//GEN-LAST:event_ReportActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
          // TODO add your handling code here: 댓글 등록 기능
        dbLoad();
        String comment = InputComment.getText(); // 댓글 내용        
           
        if(comment.replaceAll("[^a-zA-Zㄱ-힣]", "").length() == 0){
             JOptionPane.showMessageDialog(this, "[ 내용을 입력하세요 ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
        }else{ // 댓글 등록 되도록
            try{
                String writer = returnData("post", "userNum", "postNum", postNum);    // writer가 자신의 글인지 확인
                
                if(writer.equals(userNum)){  // 글쓴이의 댓글이라면
                    writer = "Writer";  
                }else{                  // 독자 댓글이라면
                    writer = "Reader"; 
                }
                System.out.println("2차 확인 : " + writer + " / 이후는 팩토리 출력내용"); // 누군지 확인차 출력
                                
                CommentRegist cr = new DiviWriter();    // 팩토리 함수 불러옴
                
                Comment com = cr.RegeComment(userNum, writer, comment);
                
                comment=com.getComment();
                System.out.println(userNum + postNum + comment);
                
                postComment(postNum, userNum, comment); // comment에 댓글 추가
                  
            }catch(SQLException ex){
            Logger.getLogger(BoardController.class.getName()).log(Level.SEVERE, null, ex);
        } 
            JOptionPane.showMessageDialog(this, "[ 댓글이 등록되었습니다. ]", "메세지", JOptionPane.INFORMATION_MESSAGE);
        } 
        dbClose();
    }//GEN-LAST:event_RegisterActionPerformed

    private void SendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendMessageActionPerformed
         // TODO add your handling code here: 쪽지 보내기 _ 자신의 글일때 버튼 안보이도록 
        dbLoad();
        try {
            String rcvNickname = returnData("user", "userNickName" , "userNum", posterNum);
            new MessageSendController(rcvNickname).setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "sql오류 : ."+ex, "메세지", JOptionPane.INFORMATION_MESSAGE);
        }
        dbClose();      
    }//GEN-LAST:event_SendMessageActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostController().setVisible(true);
            }
        });
        
        //CommentList
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> CommentList;
    private javax.swing.JTextField CountReco;
    private javax.swing.JTextField InputComment;
    private javax.swing.JTextArea PostContent;
    private javax.swing.JTextField PostTitle;
    private javax.swing.JButton Recommend;
    private javax.swing.JButton Register;
    private javax.swing.JButton Report;
    private javax.swing.JButton SendMessage;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
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
