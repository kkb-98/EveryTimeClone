package UserController;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionListener;
import main.databaseSQL;
import javax.swing.event.ListSelectionEvent;
import SingletonPattern.UserInfo;

public class BoardController extends databaseSQL implements MouseListener, KeyListener,ListSelectionListener {
    String bbt;
    DefaultListModel model = new DefaultListModel();
    UserInfo userinfo = UserInfo.getInstance();

    public BoardController() {
        initComponents();
        BoardIn.addMouseListener(this);
        BoardList.addListSelectionListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BoardAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NewBoard = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BoardList = new javax.swing.JList<>();
        BoardIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("휴먼편지체", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("EveryTime");

        BoardAdd.setBackground(new java.awt.Color(153, 0, 0));
        BoardAdd.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        BoardAdd.setForeground(new java.awt.Color(255, 255, 255));
        BoardAdd.setText("게시판 등록");
        BoardAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoardAddActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        jLabel2.setText("게시판");

        NewBoard.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        NewBoard.setText("게시판 이름 입력"); // NOI18N
        NewBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBoardActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        Back.setText("뒤로가기");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        BoardList.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jScrollPane2.setViewportView(BoardList);

        BoardIn.setBackground(new java.awt.Color(153, 0, 0));
        BoardIn.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        BoardIn.setForeground(new java.awt.Color(255, 255, 255));
        BoardIn.setText("확인");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(NewBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BoardIn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BoardAdd))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(Back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BoardIn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoardAdd))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
    
    private void BoardAddActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
        int i=1 ;
        String title = NewBoard.getText(); //게시판 추가할때
            String about = " "; //게시판 설명은 일단 공백으로 통일
            String userN = " ";
            int result = JOptionPane.showConfirmDialog(null, "게시판을 등록 하시겠습니까?.","BordAdd",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.CLOSED_OPTION || result ==JOptionPane.NO_OPTION){
            }
            else if(result==JOptionPane.YES_OPTION){
         try {
             //게시판 디비에 추가
             BoardControl(title,about,userN);
             userinfo.addBoard = title;
             model.addElement(title); //게시판 리스트에 등록하는거임
             while(rs.next()){
                 model.addElement(rs.getString("boardTitle"));
                 i++;
             BoardList.setModel(model);
            }
              String a= userinfo.addBoard;
             
         } catch (SQLException ex) {
             Logger.getLogger(BoardController.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
            dbClose();
    }                                        

   
    private void NewBoardActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        // 이 라인은 위 의 버튼에서 다해먹습니다.
    }                                        

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {                                     
        dispose();
        //뒤로가기 이벤트
    }                                    

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        //게시판제목 리스트에 불러오기
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
            DefaultListModel model = new DefaultListModel();
            int i=1 ;
            try {
                while(rs.next()){
                    model.addElement(rs.getString("boardTitle"));
                    
                    i++;
                    BoardList.setModel(model);
                    
                }
             }catch (SQLException ex) {
            Logger.getLogger(BoardController.class.getName()).log(Level.SEVERE, null, ex);
            }
            dbClose();
    }                                 
     private void BoardInActionPerformed(java.awt.event.ActionEvent evt) {                                        
        dispose();
    }   

    // Variables declaration - do not modify                     
    private javax.swing.JButton Back;
    private javax.swing.JButton BoardAdd;
    private javax.swing.JButton BoardIn;
    private javax.swing.JList<String> BoardList;
    private javax.swing.JTextField NewBoard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration                   

    @Override
    public void mouseClicked(MouseEvent e) {
        String bt =BoardList.getSelectedValue();
        if(e.getSource()== BoardIn){
            System.out.println(bt);
            System.out.println(bt+"가 선택되었습니다.");
            PostListController PCL = new PostListController();
            PCL.bt2= bt;
            PCL.setVisible(true);}
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
