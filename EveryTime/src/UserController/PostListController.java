
package UserController;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.awt.*;
import java.awt.event.*;
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
import main.EveryTime_Main;
import UserController.BoardController;
import ManagerController.ManagerBoardController;
import javax.swing.event.ListSelectionEvent;

public class PostListController extends databaseSQL implements MouseListener, KeyListener,ListSelectionListener {
    String bt2;
    String bbt2;
    DefaultListModel model2 = new DefaultListModel();
 
    public PostListController() {
        initComponents();
        PostList.addListSelectionListener(this);
        OK.addMouseListener(this);
        PostWrite.addMouseListener(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BoardName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        PostWrite = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PostList = new javax.swing.JList<>();
        OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("휴먼편지체", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Everytime");

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel2.setText("게시글");
        jLabel2.setToolTipText("");

        BoardName.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("(<- 게시판 이름 뜨도록)");

        Back.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        Back.setText("뒤로가기");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        PostWrite.setBackground(new java.awt.Color(153, 0, 0));
        PostWrite.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        PostWrite.setForeground(new java.awt.Color(255, 255, 255));
        PostWrite.setText("게시글 작성");
        PostWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostWriteActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(PostList);

        OK.setBackground(new java.awt.Color(153, 0, 0));
        OK.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        OK.setForeground(new java.awt.Color(255, 255, 255));
        OK.setText("확인");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PostWrite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BoardName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(PostWrite)
                    .addComponent(OK))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>                        

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {                                     
        dispose();
        // TODO add your handling code here:
    }                                    

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {                                   
            PostController PC = new PostController();
            //PC.bt3=bt2;
            PC.setVisible(true);
    }                                  

    private void PostWriteActionPerformed(java.awt.event.ActionEvent evt) {                                          
            PostWriteController PW = new PostWriteController();
            //PW.bt4=bt2;
            PW.setVisible(true);
    }                                         

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        BoardName.setText(bt2);
        dbLoad();
            java.sql.Statement stmt2 = null;
        
        try {          
            stmt2 = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(PostListController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String sql = "select * from post where boardTitle =  \"" + bt2 + "\" ";
            rs = stmt2.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(PostListController.class.getName()).log(Level.SEVERE, null, ex);
        }
            int i = 1;
        try {
            while(rs.next()){
                model2.addElement(rs.getString("postTitle"));
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostListController.class.getName()).log(Level.SEVERE, null, ex);
        }
             
            PostList.setModel(model2);
            dbClose();
        
    }                                 

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostListController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Back;
    private javax.swing.JTextField BoardName;
    private javax.swing.JButton OK;
    private javax.swing.JList<String> PostList;
    private javax.swing.JButton PostWrite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration                   

    @Override
    public void mouseClicked(MouseEvent e) {
//        String bt2 =PostList.getSelectedValue();
//        if(e.getSource()==PostWrite){
//            PostWriteController PW = new PostWriteController();
//            PW.bt4=bt2;
//            PW.setVisible(true);
//        }
//        if(e.getSource()== OK){
//            PostController PC = new PostController();
//            //PC.bt3=bt2;
//            PC.setVisible(true);
//        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
