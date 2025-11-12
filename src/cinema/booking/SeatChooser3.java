/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package cinema.booking;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author init1
 */
public class SeatChooser3 extends javax.swing.JFrame {
    
  

    /** Creates new form SeatChooser3 */
    public SeatChooser3() {
        initComponents();
        //seat [][] seats;
        //JButton button[][];
        int rows=6;
        int cols=10;
        //seats= new seat[rows][cols];
        //button = new JButton[rows][cols];
        
        initComponents();
        Color x = new Color (0X2C3E50);
        getContentPane().setLayout(null);
        getContentPane().setSize(1440, 1024);
        getContentPane().setBackground(x);
        
        jButton1.setText("book your seats");
        jButton1.setBounds(555, 898, 318, 41);
        jButton1.setForeground(new Color(0XFFFFFF));
        jButton1.setBackground(new Color(0XE74C3C));
        jButton1.setFont(new Font("MV Boli",Font.PLAIN,20));
        jButton1.setBorder(BorderFactory.createBevelBorder(0));
        
        jPanel1.setBackground(new Color(0XFFFFFF));
        jPanel1.setBounds(145, 115, 1151, 688);
        jPanel1.setLayout(null);
        
        jLabel1.setText("A");
        jLabel1.setHorizontalAlignment(JLabel.CENTER);
        jLabel1.setVerticalAlignment(JLabel.CENTER);
        jLabel1.setForeground(new Color(0X000000));
        jLabel1.setFont(new Font("MV Boli",Font.BOLD,36));
        jLabel1.setVisible(true);
        jLabel1.setBounds(10, 68, 55, 76);
        
        jLabel2.setText("B");
        jLabel2.setHorizontalAlignment(JLabel.CENTER);
        jLabel2.setVerticalAlignment(JLabel.CENTER);
        jLabel2.setForeground(new Color(0X000000));
        jLabel2.setFont(new Font("MV Boli",Font.BOLD,36));
        jLabel2.setVisible(true);
        jLabel2.setBounds(10, 144, 55, 76);
        
        jLabel3.setText("C");
        jLabel3.setHorizontalAlignment(JLabel.CENTER);
        jLabel3.setVerticalAlignment(JLabel.CENTER);
        jLabel3.setForeground(new Color(0X000000));
        jLabel3.setFont(new Font("MV Boli",Font.BOLD,36));
        jLabel3.setVisible(true);
        jLabel3.setBounds(10, 235, 55, 76);
        
        
        jLabel4.setText("D");
        jLabel4.setHorizontalAlignment(JLabel.CENTER);
        jLabel4.setVerticalAlignment(JLabel.CENTER);
        jLabel4.setForeground(new Color(0X000000));
        jLabel4.setFont(new Font("MV Boli",Font.BOLD,36));
        jLabel4.setVisible(true);
        jLabel4.setBounds(10, 320, 55, 76);
        
        jLabel5.setText("E");
        jLabel5.setHorizontalAlignment(JLabel.CENTER);
        jLabel5.setVerticalAlignment(JLabel.CENTER);
        jLabel5.setForeground(new Color(0X000000));
        jLabel5.setFont(new Font("MV Boli",Font.BOLD,36));
        jLabel5.setVisible(true);
        jLabel5.setBounds(10, 410, 55, 76);
        
        jLabel6.setText("F");
        jLabel6.setHorizontalAlignment(JLabel.CENTER);
        jLabel6.setVerticalAlignment(JLabel.CENTER);
        jLabel6.setForeground(new Color(0X000000));
        jLabel6.setFont(new Font("MV Boli",Font.BOLD,36));
        jLabel6.setVisible(true);
        jLabel6.setBounds(10, 499, 55, 76);
        
        jLabel7.setText("screen");
        jLabel7.setHorizontalAlignment(JLabel.CENTER);
        jLabel7.setVerticalAlignment(JLabel.CENTER);
        jLabel7.setBackground(new Color(0XACA7A7));
        jLabel7.setOpaque(true);
        jLabel7.setForeground(new Color(0X000000));
        jLabel7.setFont(new Font("MV Boli",Font.ITALIC,36));
        jLabel7.setVisible(true);
        jLabel7.setBounds(138, 620, 875, 56);
        

        
//        for(int i=0; i<rows; i++){
//            for(int j=0; j<cols; j++){
//                    seats[i][j]= new seat(i,j);
//                   // seats[i][j].getButton().addActionListener(new SeatClickListener(seats[i][j]));
//                    jPanel1.add(seats[i][j].getButton());
//                
//        
//            }
//        }
//        
//        seats[0][0].setBounds(115, 56, 55, 76);
//        seats[0][1].setBounds(188, 56, 55, 76);
//        seats[0][2].setBounds(269, 56, 55, 76);
//        seats[0][3].setBounds(350, 56, 55, 76);
//        seats[0][4].setBounds(423, 56, 55, 76);
//        seats[0][5].setBounds(628, 56, 55, 76);
//        seats[0][6].setBounds(701, 56, 55, 76);
//        seats[0][7].setBounds(782, 56, 55, 76);
//        seats[0][8].setBounds(863, 56, 55, 76);
//        seats[0][9].setBounds(936, 56, 55, 76);
//        
//        
//        seats[1][0].setBounds(115, 144, 55, 76);
//        seats[1][1].setBounds(188, 144, 55, 76);
//        seats[1][2].setBounds(269, 144, 55, 76);
//        seats[1][3].setBounds(350, 144, 55, 76);
//        seats[1][4].setBounds(423, 144, 55, 76);
//        seats[1][5].setBounds(628, 144, 55, 76);
//        seats[1][6].setBounds(701, 144, 55, 76);
//        seats[1][7].setBounds(782, 144, 55, 76);
//        seats[1][8].setBounds(863, 144, 55, 76);
//        seats[1][9].setBounds(936, 144, 55, 76);
//        
//        seats[2][0].setBounds(115, 232, 55, 76);
//        seats[2][1].setBounds(188, 232, 55, 76);
//        seats[2][2].setBounds(269, 232, 55, 76);
//        seats[2][3].setBounds(350, 232, 55, 76);
//        seats[2][4].setBounds(423, 232, 55, 76);
//        seats[2][5].setBounds(628, 232, 55, 76);
//        seats[2][6].setBounds(701, 232, 55, 76);
//        seats[2][7].setBounds(782, 232, 55, 76);
//        seats[2][8].setBounds(863, 232, 55, 76);
//        seats[2][9].setBounds(936, 232, 55, 76);
//        
//        seats[3][0].setBounds(115, 320, 55, 76);
//        seats[3][1].setBounds(188, 320, 55, 76);
//        seats[3][2].setBounds(269, 320, 55, 76);
//        seats[3][3].setBounds(350, 320, 55, 76);
//        seats[3][4].setBounds(423, 320, 55, 76);
//        seats[3][5].setBounds(628, 320, 55, 76);
//        seats[3][6].setBounds(701, 320, 55, 76);
//        seats[3][7].setBounds(782, 320, 55, 76);
//        seats[3][8].setBounds(863, 320, 55, 76);
//        seats[3][9].setBounds(936, 320, 55, 76);
//        
//        seats[4][0].setBounds(115, 408, 55, 76);
//        seats[4][1].setBounds(188, 408, 55, 76);
//        seats[4][2].setBounds(269, 408, 55, 76);
//        seats[4][3].setBounds(350, 408, 55, 76);
//        seats[4][4].setBounds(423, 408, 55, 76);
//        seats[4][5].setBounds(628, 408, 55, 76);
//        seats[4][6].setBounds(701, 408, 55, 76);
//        seats[4][7].setBounds(782, 408, 55, 76);
//        seats[4][8].setBounds(863, 408, 55, 76);
//        seats[4][9].setBounds(936, 408, 55, 76);
//        
//        
//        seats[5][0].setBounds(115, 496, 55, 76);
//        seats[5][1].setBounds(188, 496, 55, 76);
//        seats[5][2].setBounds(269, 496, 55, 76);
//        seats[5][3].setBounds(350, 496, 55, 76);
//        seats[5][4].setBounds(423, 496, 55, 76);
//        seats[5][5].setBounds(628, 496, 55, 76);
//        seats[5][6].setBounds(701, 496, 55, 76);
//        seats[5][7].setBounds(782, 496, 55, 76);
//        seats[5][8].setBounds(863, 496, 55, 76);
//        seats[5][9].setBounds(936, 496, 55, 76);
//        
        
  
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(222, 222, 222)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(96, 96, 96))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(65, 65, 65))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(23, 23, 23))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(162, 162, 162)
                    .addComponent(jLabel7)
                    .addContainerGap(163, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addGap(12, 12, 12)
                    .addComponent(jLabel5)
                    .addGap(5, 5, 5)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6))
                    .addGap(22, 22, 22)
                    .addComponent(jLabel4)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel7)
                    .addContainerGap(63, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(614, 201, 489, 146);

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(357, 108, 82, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        setBackground(new Color(0XE87F74));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SeatChooser3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatChooser3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatChooser3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatChooser3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatChooser3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
