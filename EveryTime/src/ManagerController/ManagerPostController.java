package ManagerController;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionListener;
import main.databaseSQL;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.event.ListSelectionEvent;

public class ManagerPostController extends databaseSQL implements MouseListener, KeyListener,ListSelectionListener {
    String BT2; //게시판이름을 받아올 변수
    String BBT2;
    DefaultListModel model2 = new DefaultListModel();
    
    public ManagerPostController() {
        initComponents();
        Delete2.addMouseListener(this);
        PostList.addListSelectionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PostList = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        Delete2 = new javax.swing.JButton();
        BTname = new javax.swing.JTextField();

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
        jLabel2.setText("게시글");

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel3.setText("관리자");

        jScrollPane1.setViewportView(PostList);

        jButton1.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jButton1.setText("뒤로가기");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Delete2.setBackground(new java.awt.Color(153, 0, 0));
        Delete2.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        Delete2.setForeground(new java.awt.Color(255, 255, 255));
        Delete2.setText("삭제");
        Delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Delete2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTname, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(BTname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Delete2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void Delete2ActionPerformed(java.awt.event.ActionEvent evt) {                                        

    }                                       

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        //ManagerBoardController MBC = new ManagerBoardController();
        //BT2 가 게시판제목이다.
        System.out.println(BT2);
        BTname.setText(BT2);
        dbLoad();
            java.sql.Statement stmt2 = null;
        
        try {          
            stmt2 = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerPostController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String sql = "select * from post where boardTitle =  \"" + BT2 + "\" ";
            rs = stmt2.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerPostController.class.getName()).log(Level.SEVERE, null, ex);
        }
            int i = 1;
        try {
            while(rs.next()){
                model2.addElement(rs.getString("postTitle"));
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerPostController.class.getName()).log(Level.SEVERE, null, ex);
        }
             
            PostList.setModel(model2);
            dbClose();
    }                                 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        dispose();
    }                                        
    
    public void removeItem2(int index){
       if(index<0){
           if(model2.size()==0)
               return;
               index = 0;
       }
       int PostIndex = index;
        model2.remove(index);
        //연결되는 코드는 마우스 클릭 이벤트로 넘어갑시다.
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField BTname;
    private javax.swing.JButton Delete2;
    private javax.swing.JList<String> PostList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   

    @Override
    public void mouseClicked(MouseEvent e) {
        String BT2 =PostList.getSelectedValue();
        BBT2 = BT2;
        //게시판 삭제 기능
        if(e.getSource()== Delete2){
            int result = JOptionPane.showConfirmDialog(null, "해당 게시글을 삭제 하시겠습니까?.","Save",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.CLOSED_OPTION || result ==JOptionPane.NO_OPTION){
            }
            else if(result==JOptionPane.YES_OPTION){
            int selected2=PostList.getSelectedIndex();
             dbLoad();
             java.sql.Statement stmt2 = null;
            try {
                stmt2 = conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(ManagerBoardController.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                int su2 = 0;
                System.out.println(BT2);
                String sql = "delete from post where postTitle =  \"" + BT2 + "\" ";
                System.out.println(sql);
                PreparedStatement st = conn.prepareStatement(sql);
                su2 = st.executeUpdate();
                removeItem2(selected2);
                showMessageDialog(null,"해당 게시글이 삭제되었습니다!");
            } catch (SQLException ex) {
                Logger.getLogger(ManagerBoardController.class.getName()).log(Level.SEVERE, null, ex);
            }

            }
             dbClose();
 
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

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
