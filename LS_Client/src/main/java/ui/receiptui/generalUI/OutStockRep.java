/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.receiptui.generalUI;

import java.awt.Frame;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import bl.controllerfactorybl.ControllerFactoryImpl;
import bl.loginbl.LoginblController;
import bl.receiptbl.OutStockRepbl.OutStockRepController;
import blservice.receiptblservice.OutStockRepblService;
import ui.warehousemanui.WarehousePanel;
import util.CurrentCity;
import util.CurrentTime;
import util.enumData.City;

/**
 *
 * @author apple
 */
public class OutStockRep extends javax.swing.JPanel {
	OutStockRepblService o = ControllerFactoryImpl.getInstance().getOutStockRepblService();
    
    /**
     * Creates new form OutStockRep
     */
    public OutStockRep() {
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

    	/**
    	 * 设置窗体大小
    	 */
    	this.setSize(800, 400);
    	
    	this.setVisible(true);
    	
    	
    	 dateText = new javax.swing.JTextField();
         dateLabel = new javax.swing.JLabel();
         officeText = new javax.swing.JTextField();
         officeLabel = new javax.swing.JLabel();
         numLabel = new javax.swing.JLabel();
         numText = new javax.swing.JTextField();
         repTypeLabel = new javax.swing.JLabel();
         repTypeText = new javax.swing.JTextField();
         destinationLabel = new javax.swing.JLabel();
         shipFormLabel = new javax.swing.JLabel();
         shipForm = new javax.swing.JTextField();
         repTypeBox = new javax.swing.JComboBox();
         jScrollPane1 = new javax.swing.JScrollPane();
         jTable1 = new javax.swing.JTable();
         okButton = new javax.swing.JButton();
         cancelButton = new javax.swing.JButton();
         destinationText = new javax.swing.JTextField();
         resultMsgText = new javax.swing.JTextField();
         checkAllRepsButton = new javax.swing.JButton();

         setBackground(new java.awt.Color(255, 255, 255));

         dateText.setEditable(false);
         dateText.setText(CurrentTime.getDate());
         shipForm.setText("        ");
         shipForm.setEditable(false);
         dateLabel.setText("日期:");

         officeText.setEditable(false);
         try {
			officeText.setText(City.toString(CurrentCity.getCurrentCity()));
		} catch (RemoteException e) {
			officeText.setText("未知");
		}

         officeLabel.setText("中转中心:");
       

         numLabel.setText("编号:");

         numText.setEditable(false);
         LoginblController login = new LoginblController();
      
 		try {
			 String s = login.getCurrentOptorId();
			 //前三位+9
			 repNum = s.substring(0, 3)+9;
			 //中转中心编号
			 String tranString = "000";
			 repNum += tranString;
			 //8位日期
			 String date = CurrentTime.getDate();
			 String tempdate = date.replaceAll("-", "");
			 repNum += tempdate;
			 //5位顺序编号
			 String number = o.createNum(date);
			 repNum += number;
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
 		
 		numText.setText(repNum);
 		 
         numText.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 numTextActionPerformed(evt);
             }
         });

         repTypeLabel.setText("出库单据类型:");

         repTypeText.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 repTypeTextActionPerformed(evt);
             }
         });

         destinationLabel.setText("目的地:");

         shipFormLabel.setText("装运形式:");

        

         repTypeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "中转单", "中转中心装车单" }));
         repTypeBox.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 repTypeBoxActionPerformed(evt);
             }
         });

         jTable1.setModel(new javax.swing.table.DefaultTableModel(
             new Object [][] {
                 {null}
             },
             new String [] {
                 "订单号"
             }
         ) {
             Class[] types = new Class [] {
                 java.lang.String.class
             };

             public Class getColumnClass(int columnIndex) {
                 return types [columnIndex];
             }
         });
         jTable1.setGridColor(new java.awt.Color(0, 0, 0));
         jScrollPane1.setViewportView(jTable1);

         okButton.setText("确认");
         okButton.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 okButtonActionPerformed(evt);
             }
         });

         cancelButton.setText("取消");
         cancelButton.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 cancelButtonActionPerformed(evt);
             }
         });

         destinationText.setEditable(false);

         resultMsgText.setEditable(false);

         checkAllRepsButton.setText("查看所有单据");
         checkAllRepsButton.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 checkAllRepsButtonActionPerformed(evt);
             }
         });

         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
         this.setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGap(15, 15, 15)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addGroup(layout.createSequentialGroup()
                         .addComponent(checkAllRepsButton)
                         .addGap(18, 18, 18)
                         .addComponent(officeLabel)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addComponent(officeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                         .addComponent(dateLabel)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                             .addComponent(numLabel)
                             .addComponent(repTypeLabel)
                             .addComponent(destinationLabel))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addGroup(layout.createSequentialGroup()
                                 .addComponent(repTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addComponent(repTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                             .addGroup(layout.createSequentialGroup()
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                     .addGroup(layout.createSequentialGroup()
                                         .addComponent(destinationText, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                         .addGap(52, 52, 52)
                                         .addComponent(shipFormLabel))
                                     .addGroup(layout.createSequentialGroup()
                                         .addGap(29, 29, 29)
                                         .addComponent(cancelButton)
                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                         .addComponent(okButton)))
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addComponent(shipForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                             .addGroup(layout.createSequentialGroup()
                                 .addGap(9, 9, 9)
                                 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                         .addGap(1, 1, 1)))
                 .addContainerGap(19, Short.MAX_VALUE))
             .addComponent(resultMsgText)
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGap(15, 15, 15)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(dateLabel)
                     .addComponent(officeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(officeLabel)
                     .addComponent(checkAllRepsButton))
                 .addGap(18, 18, 18)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(numLabel))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(repTypeLabel)
                     .addComponent(repTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(repTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(destinationLabel)
                     .addComponent(shipFormLabel)
                     .addComponent(shipForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(destinationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(18, 18, 18)
                 .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                 .addGap(13, 13, 13)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(okButton)
                     .addComponent(cancelButton))
                 .addGap(18, 18, 18)
                 .addComponent(resultMsgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
         );
     }// </editor-fold>//GEN-END:initComponents

     private void numTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTextActionPerformed
         // TODO add your handling code here:
     }//GEN-LAST:event_numTextActionPerformed

     private void repTypeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repTypeTextActionPerformed
         // TODO add your handling code here:
     }//GEN-LAST:event_repTypeTextActionPerformed

     private void checkAllRepsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllRepsButtonActionPerformed
         // TODO add your handling code here:
     }//GEN-LAST:event_checkAllRepsButtonActionPerformed

     private void repTypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repTypeBoxActionPerformed
         // TODO add your handling code here:
     }//GEN-LAST:event_repTypeBoxActionPerformed

     private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
         // TODO add your handling code here:
     }//GEN-LAST:event_cancelButtonActionPerformed

     private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
         // TODO add your handling code here:
     }//GEN-LAST:event_okButtonActionPerformed


     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton cancelButton;
     private javax.swing.JButton checkAllRepsButton;
     private javax.swing.JLabel dateLabel;
     private javax.swing.JTextField dateText;
     private javax.swing.JLabel destinationLabel;
     private javax.swing.JTextField destinationText;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTable jTable1;
     private javax.swing.JLabel numLabel;
     private javax.swing.JTextField numText;
     private javax.swing.JLabel officeLabel;
     private javax.swing.JTextField officeText;
     private javax.swing.JButton okButton;
     private javax.swing.JComboBox repTypeBox;
     private javax.swing.JLabel repTypeLabel;
     private javax.swing.JTextField repTypeText;
     private javax.swing.JTextField resultMsgText;
     private javax.swing.JTextField shipForm;
     private javax.swing.JLabel shipFormLabel;
     private String repNum;
     // End of variables declaration//GEN-END:variables
 }
