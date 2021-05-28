
package UserController;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;

public  class ScoreCalculController extends javax.swing.JFrame {
    //스코어 1~8까지 성적 1~8까지
    //String[] score ={"A+","A0","B+","B0","C+","C0","D+","D0","F"};
    // 4.5 4.0 3.5 3.0 2.5 2.0 1.5 1.0 0
    double[] sc= new double[8];
    
    public ScoreCalculController() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Score1 = new javax.swing.JComboBox<>();
        Score3 = new javax.swing.JComboBox<>();
        Score4 = new javax.swing.JComboBox<>();
        Score6 = new javax.swing.JComboBox<>();
        Score7 = new javax.swing.JComboBox<>();
        Score8 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Calculation = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        TotalCredit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Score2 = new javax.swing.JComboBox<>();
        Score5 = new javax.swing.JComboBox<>();
        c4 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c6 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        c8 = new javax.swing.JTextField();
        c7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("휴먼편지체", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Everytime");

        jLabel2.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        jLabel2.setText("학점 계산기");

        Score1.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Score1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        Score3.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Score3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        Score4.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Score4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        Score6.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Score6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        Score7.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Score7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        Score8.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Score8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        jLabel3.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        jLabel3.setText("점수");

        jLabel4.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        jLabel4.setText("학점");

        Calculation.setBackground(new java.awt.Color(153, 0, 0));
        Calculation.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Calculation.setForeground(new java.awt.Color(255, 255, 255));
        Calculation.setText("입력완료");
        Calculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculationActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        Back.setText("뒤로가기");

        TotalCredit.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        jLabel5.setText("점수");

        jLabel6.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        jLabel6.setText("학점");

        jLabel7.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jLabel7.setText("총학점 :");

        Score2.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Score2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        Score5.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Score5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Score1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Score2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TotalCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Score4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Score3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Back, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Calculation, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Score6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Score7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Score8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(Score5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Back)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Score1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Score2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Score3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Score4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Score5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Score6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Score7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Score8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calculation)
                    .addComponent(TotalCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void multiply(){
    
    }
    private void CalculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculationActionPerformed
        //계산 코드
        //String sc1 = Score1.getSelectedItem().toString(); 
        
        //String[] SC = {sc1,sc2,sc3,sc4,sc5,sc6,sc7,sc8};
        //String[] SS = {ss2,ss3,ss4,ss5,ss6,ss7,ss8};
        //double Result = 4.33;
        // tmp = Double.toString(Result);
        //TotalCredit.setText(tmp);
        
        //텍스트필드 학점
        /*
        Double C1 =Double.parseDouble(c1.getText().toString()); Double C2 =Double.parseDouble(c2.getText().toString());
        Double C3 =Double.parseDouble(c3.getText().toString()); Double C4 =Double.parseDouble(c4.getText().toString()); 
        Double C5 =Double.parseDouble(c5.getText().toString()); Double C6 =Double.parseDouble(c6.getText().toString());
        Double C7 =Double.parseDouble(c7.getText().toString()); Double C8 =Double.parseDouble(c8.getText().toString());
        */
        String C1 =c1.getText().toString(); String C2 = c2.getText().toString();
        String C3 =c3.getText().toString(); String C4 = c4.getText().toString(); 
        String C5 =c5.getText().toString(); String C6 = c6.getText().toString();
        String C7 =c7.getText().toString(); String C8 = c8.getText().toString();
        for(int i =1;i<9;i++){
            String N = "c"+i;
            //코드 고치는중
            if(N.isEmpty()==true){
                N  = "0";
            }
        }
        String[] carray = {C1,C2,C3,C4,C5,C6,C7,C8};
        
        
        double[] q = new double[10];
        double result = 0;
        //콤보박스 점수
        String s1= Score1.getSelectedItem().toString(); String s2= Score2.getSelectedItem().toString(); 
        String s3= Score3.getSelectedItem().toString(); String s4= Score4.getSelectedItem().toString();
        String s5= Score5.getSelectedItem().toString(); String s6= Score6.getSelectedItem().toString(); 
        String s7= Score7.getSelectedItem().toString(); String s8= Score8.getSelectedItem().toString();
        
        double[] CC = new double[8];
        for (int i=1;i<9;i++){
            CC[i-1] = Double.parseDouble(carray[i-1]);
        }
       
        double[] SG = new double[8];
        double re=0;
        for(int i = 1;i<9;i++){
             String sg = Double.toString(CC[i-1]);
             SG[i-1]= Double.parseDouble(sg);
             re += SG[i-1];
        }
        String tmp = Double.toString(re);
        
        //double w =CC1 * 4.5;
        //String tmp = Double.toString(w);
        TotalCredit.setText(C1);
        /*
        for (int i=1;i<9;i++){
            String score = "s"+i;
            String CC = "C"+i;
            String c = "c"+i;
            Double Credit = Double.parseDouble(CC);
         q[i-1]=Credit + 4.5;
         result += q[i-1];
        
         System.out.println(score + CC + c);
        }
       
        if (score.equals("A+")){
            q[i-1] = 4.5 * Credit;
        }else if(s1.equals("A0")){
            q[i-1] = 4.0 * Credit;
        }else if(s1.equals("B+")){
            q[i-1] = 3.5 * Credit;
        }else if(s1.equals("B0")){
            q[i-1] = 3.0 * Credit;
        }else if(s1.equals("C+")){
            q[i-1] = 2.5 * Credit;
        }else if(s1.equals("C0")){
            q[i-1] = 2.0 * Credit;
        }else if(s1.equals("D+")){
            q[i-1] = 1.5 * Credit;
        }else if(s1.equals("D0")){
            q[i-1] = 1.0 * Credit;
        }else if(s1.equals("F")){
            q[i-1] = 0;
        }else{continue;}
        result += q[i-1];
        
        
        }*/
        //System.out.println(result);
        //String tmp = Double.toString(3.33);
        
        //TotalCredit.setText(tmp);
    //계산 끝*/
    }//GEN-LAST:event_CalculationActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreCalculController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Calculation;
    private javax.swing.JComboBox<String> Score1;
    private javax.swing.JComboBox<String> Score2;
    private javax.swing.JComboBox<String> Score3;
    private javax.swing.JComboBox<String> Score4;
    private javax.swing.JComboBox<String> Score5;
    private javax.swing.JComboBox<String> Score6;
    private javax.swing.JComboBox<String> Score7;
    private javax.swing.JComboBox<String> Score8;
    private javax.swing.JTextField TotalCredit;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField c6;
    private javax.swing.JTextField c7;
    private javax.swing.JTextField c8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
