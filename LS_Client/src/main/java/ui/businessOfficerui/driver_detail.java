/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.businessOfficerui;

/**
 *
 * @author Administrator
 */
public class driver_detail extends .JFrame {

    /**
     * Creates new form driver_detail
     */
    public driver_detail() {
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

        sex_comboBox = new .JComboBox();
        jLabel7 = new .JLabel();
        IDnum_text = new .JTextField();
        jLabel8 = new .JLabel();
        jLabel9 = new .JLabel();
        phoneNum_text = new .JTextField();
        validTime_text = new .JTextField();
        jLabel10 = new .JLabel();
        year_comboBox = new .JComboBox();
        jLabel11 = new .JLabel();
        month_comboBox = new .JComboBox();
        jLabel12 = new .JLabel();
        day_comboBox = new .JComboBox();
        jLabel13 = new .JLabel();
        jComboBox6 = new .JComboBox();
        cancel_btn = new .JButton();
        ok_btn = new .JButton();
        jLabel1 = new .JLabel();
        delete_btn = new .JButton();
        driverNum_text = new .JTextField();
        name_text = new .JTextField();
        jLabel2 = new .JLabel();
        jLabel3 = new .JLabel();
        jLabel4 = new .JLabel();

        setDefaultCloseOperation(.WindowConstants.EXIT_ON_CLOSE);

        sex_comboBox.setModel(new .DefaultComboBoxModel(new String[] { "男", "女" }));

        jLabel7.setText("身份证号");

        IDnum_text.setText("有初始值");
        IDnum_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDnum_textActionPerformed(evt);
            }
        });

        jLabel8.setText("生日");

        jLabel9.setText("手机号");

        phoneNum_text.setText("有初始值");

        validTime_text.setText("3");
        validTime_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validTime_textActionPerformed(evt);
            }
        });

        jLabel10.setText("行驶证期限");

        year_comboBox.setModel(new .DefaultComboBoxModel(new String[] { "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));

        jLabel11.setText("年");

        month_comboBox.setModel(new .DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel12.setText("月");

        day_comboBox.setModel(new .DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day_comboBoxActionPerformed(evt);
            }
        });

        jLabel13.setText("日");

        jComboBox6.setModel(new .DefaultComboBoxModel(new String[] { "年", "月", "天" }));

        cancel_btn.setText("取消");

        ok_btn.setText("保存");

        jLabel1.setText("司机编号");

        delete_btn.setBackground(new java.awt.Color(255, 0, 0));
        delete_btn.setForeground(new java.awt.Color(255, 0, 0));
        delete_btn.setText("X删除");

        driverNum_text.setEditable(false);
        driverNum_text.setText("02500107001");
        driverNum_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverNum_textActionPerformed(evt);
            }
        });

        name_text.setText("有初始值");
        name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_textActionPerformed(evt);
            }
        });

        jLabel2.setText("姓名");

        jLabel3.setText("性别");

        jLabel4.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("司机详细信息");

        .GroupLayout layout = new .GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
                                    .addComponent(sex_comboBox, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_text, .GroupLayout.PREFERRED_SIZE, 112, .GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneNum_text, .GroupLayout.PREFERRED_SIZE, 100, .GroupLayout.PREFERRED_SIZE)
                                    .addComponent(driverNum_text, .GroupLayout.PREFERRED_SIZE, 112, .GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(validTime_text, .GroupLayout.PREFERRED_SIZE, 33, .GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox6, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(year_comboBox, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(month_comboBox, .GroupLayout.PREFERRED_SIZE, 38, .GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(day_comboBox, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13))
                                    .addComponent(IDnum_text, .GroupLayout.PREFERRED_SIZE, 170, .GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(50, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.TRAILING)
                    .addComponent(delete_btn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancel_btn)
                        .addGap(27, 27, 27)
                        .addComponent(ok_btn)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
                    .addComponent(driverNum_text, .GroupLayout.Alignment.TRAILING, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, .GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name_text, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sex_comboBox, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(delete_btn, .GroupLayout.PREFERRED_SIZE, 60, .GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(IDnum_text, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(year_comboBox, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(month_comboBox, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(day_comboBox, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNum_text, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                        .addComponent(validTime_text, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox6, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(.LayoutStyle.ComponentPlacement.RELATED, .GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_btn)
                    .addComponent(ok_btn))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDnum_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDnum_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDnum_textActionPerformed

    private void validTime_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validTime_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validTime_textActionPerformed

    private void day_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_day_comboBoxActionPerformed

    private void driverNum_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverNum_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driverNum_textActionPerformed

    private void name_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_textActionPerformed

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
            for (.UIManager.LookAndFeelInfo info : .UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    .UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(driver_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(driver_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(driver_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(driver_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new driver_detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private .JTextField IDnum_text;
    private .JButton cancel_btn;
    private .JComboBox day_comboBox;
    private .JButton delete_btn;
    private .JTextField driverNum_text;
    private .JComboBox jComboBox6;
    private .JLabel jLabel1;
    private .JLabel jLabel10;
    private .JLabel jLabel11;
    private .JLabel jLabel12;
    private .JLabel jLabel13;
    private .JLabel jLabel2;
    private .JLabel jLabel3;
    private .JLabel jLabel4;
    private .JLabel jLabel7;
    private .JLabel jLabel8;
    private .JLabel jLabel9;
    private .JComboBox month_comboBox;
    private .JTextField name_text;
    private .JButton ok_btn;
    private .JTextField phoneNum_text;
    private .JComboBox sex_comboBox;
    private .JTextField validTime_text;
    private .JComboBox year_comboBox;
    // End of variables declaration//GEN-END:variables
}
