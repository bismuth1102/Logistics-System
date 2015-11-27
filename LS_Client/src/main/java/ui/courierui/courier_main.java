/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.courierui;

import javax.swing.JFrame;

import ui.mainFrame.MainFrame;
import ui.receiptui.Order;

/**
 *
 * @author Administrator
 */
public class courier_main extends javax.swing.JPanel {
    /**
     * Creates new form courier__main
     */
    public courier_main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newGoodsbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        businessOfficeNum_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        account_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        goodsNum6daysAgo_progressBar = new javax.swing.JProgressBar();
        goodsNum5daysAgo_progressBar = new javax.swing.JProgressBar();
        goodsNum4daysAgo_progressBar = new javax.swing.JProgressBar();
        goodsNum3daysAgo_progressBar = new javax.swing.JProgressBar();
        goodsNum2daysAgo_progressBar = new javax.swing.JProgressBar();
        goodsNum1dayAgo_progressBar = new javax.swing.JProgressBar();
        goodsNumToday_progressBar = new javax.swing.JProgressBar();
        dateToday_label = new javax.swing.JLabel();
        date1dayAgo_label = new javax.swing.JLabel();
        date2daysAgo_label = new javax.swing.JLabel();
        date3daysAgo_label = new javax.swing.JLabel();
        date4daysAgo_label = new javax.swing.JLabel();
        date5daysAgo_label = new javax.swing.JLabel();
        date6daysAgo_label = new javax.swing.JLabel();
        signedGoodsbtn = new javax.swing.JButton();

        newGoodsbtn.setText("新订单");
        newGoodsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newGoodsbtnMouseClicked(evt);
            }
        });

        jLabel3.setText("营业厅：");

        businessOfficeNum_label.setText("南京 025001");

        jLabel4.setText("账户：");

        account_btn.setText("老王（包括更改密码、退出登录）");
        account_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_btnActionPerformed(evt);
            }
        });

        exit_btn.setText("退出系统");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        jLabel5.setText("最近7天业绩（收派件数）");

        goodsNum6daysAgo_progressBar.setForeground(new java.awt.Color(240, 40, 240));
        goodsNum6daysAgo_progressBar.setValue(50);

        goodsNum5daysAgo_progressBar.setValue(70);

        goodsNum4daysAgo_progressBar.setValue(15);

        goodsNum3daysAgo_progressBar.setValue(95);

        goodsNum2daysAgo_progressBar.setValue(65);

        goodsNum1dayAgo_progressBar.setValue(45);

        goodsNumToday_progressBar.setValue(50);

        dateToday_label.setText("10/30");

        date1dayAgo_label.setText("10/29");

        date2daysAgo_label.setText("10/28");

        date3daysAgo_label.setText("10/27");

        date4daysAgo_label.setText("10/26");

        date5daysAgo_label.setText("10/25");

        date6daysAgo_label.setText("10/24");

        signedGoodsbtn.setText("已签收");
        signedGoodsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signedGoodsbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signedGoodsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newGoodsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(businessOfficeNum_label)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(date5daysAgo_label)
                                    .addComponent(date4daysAgo_label)
                                    .addComponent(date6daysAgo_label)
                                    .addComponent(date3daysAgo_label)
                                    .addComponent(date2daysAgo_label)
                                    .addComponent(date1dayAgo_label)
                                    .addComponent(dateToday_label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(goodsNum3daysAgo_progressBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(goodsNum4daysAgo_progressBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(goodsNumToday_progressBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(goodsNum1dayAgo_progressBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(goodsNum2daysAgo_progressBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(goodsNum5daysAgo_progressBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(goodsNum6daysAgo_progressBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(account_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(exit_btn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(account_btn)
                        .addComponent(jLabel4)
                        .addComponent(businessOfficeNum_label)
                        .addComponent(jLabel3))
                    .addComponent(exit_btn))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(goodsNum6daysAgo_progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date5daysAgo_label)
                                    .addComponent(goodsNum5daysAgo_progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(date4daysAgo_label))
                            .addComponent(newGoodsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(date3daysAgo_label))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(goodsNum4daysAgo_progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(goodsNum3daysAgo_progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(date6daysAgo_label)
                            .addGap(95, 95, 95))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date2daysAgo_label)
                    .addComponent(goodsNum2daysAgo_progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goodsNum1dayAgo_progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signedGoodsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(goodsNumToday_progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(date1dayAgo_label)
                                .addGap(18, 18, 18)
                                .addComponent(dateToday_label)))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void account_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_btnActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_btnActionPerformed

    private void signedGoodsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signedGoodsbtnMouseClicked
        new courier_signed().setVisible(true);
    }//GEN-LAST:event_signedGoodsbtnMouseClicked
    private void newGoodsbtnMouseClicked(java.awt.event.MouseEvent evt){
    	JFrame frame=new JFrame(); frame.setSize(200, 100);
    	frame.setContentPane(new Order());
    	frame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account_btn;
    private javax.swing.JLabel businessOfficeNum_label;
    private javax.swing.JLabel date1dayAgo_label;
    private javax.swing.JLabel date2daysAgo_label;
    private javax.swing.JLabel date3daysAgo_label;
    private javax.swing.JLabel date4daysAgo_label;
    private javax.swing.JLabel date5daysAgo_label;
    private javax.swing.JLabel date6daysAgo_label;
    private javax.swing.JLabel dateToday_label;
    private javax.swing.JButton exit_btn;
    private javax.swing.JProgressBar goodsNum1dayAgo_progressBar;
    private javax.swing.JProgressBar goodsNum2daysAgo_progressBar;
    private javax.swing.JProgressBar goodsNum3daysAgo_progressBar;
    private javax.swing.JProgressBar goodsNum4daysAgo_progressBar;
    private javax.swing.JProgressBar goodsNum5daysAgo_progressBar;
    private javax.swing.JProgressBar goodsNum6daysAgo_progressBar;
    private javax.swing.JProgressBar goodsNumToday_progressBar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton newGoodsbtn;
    private javax.swing.JButton signedGoodsbtn;
    // End of variables declaration//GEN-END:variables
    
    
    /**
     * for test~~
     * @param args
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	JFrame frame = new JFrame();
        		frame.setSize(830, 590);
        		frame.setVisible(true);
        		frame.setContentPane(new courier_main());
        		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);	
            }
        });	
	}
}
