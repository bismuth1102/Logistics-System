/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.receiptui;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.util.Vector;

import .table.DefaultTableModel;

import Exception.ExceptionPrint;
import bl.receiptbl.CashRepbl.CashRepController;
import bl.receiptbl.DeliverRepbl.DeliverController;
import blservice.receiptblservice.CashRepblService;
import blservice.receiptblservice.DeliverRepblService;

/**
 *
 * @author apple
 */
public class DeliverRep extends .JPanel {
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private .JButton cancelButton;
    private .JLabel courierLabel;
    private .JTextField courierText;
    private .JLabel dateLabel;
    private .JTextField dateText;
    private .JScrollPane jScrollPane1;
    private .JTable jTable;
    private .JLabel numLabel;
    private .JTextField numText;
    private .JLabel officeLabel;
    private .JTextField officeText;
    private .JButton okButton;
    private .JButton orderButton;
    private .JLabel orderNumLabel;
    private .JTextField orderNumText;
    private .JTextField resultMsgText;
    private DeliverRepblService control;
    private DefaultTableModel model;
    private Vector<String> columnIdentifiers;
    private Vector<Object> dataVector;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form DeliverRep
     */
    public DeliverRep() {
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

        dateText = new .JTextField();
        dateLabel = new .JLabel();
        officeText = new .JTextField();
        officeLabel = new .JLabel();
        numLabel = new .JLabel();
        numText = new .JTextField();
        courierLabel = new .JLabel();
        courierText = new .JTextField();
        jScrollPane1 = new .JScrollPane();
        jTable = new .JTable();
        orderNumLabel = new .JLabel();
        orderNumText = new .JTextField();
        orderButton = new .JButton();
        okButton = new .JButton();
        cancelButton = new .JButton();
        resultMsgText = new .JTextField();
        control = new DeliverController();
        model = new DefaultTableModel();
        columnIdentifiers = new Vector<String>();
        dataVector = new Vector<Object>();

        setBackground(new java.awt.Color(255, 255, 255));

        dateLabel.setText("日期:");
        
        dateText.setText(control.getDate());

        officeText.setEditable(false);
        officeText.setText("025001");

        officeLabel.setText(" 营业厅:");

        numLabel.setText("编号:");

        numText.setEditable(false);
		try {
			numText.setText(control.createNum(dateText.getText()));
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}

        courierLabel.setText("派件员编号:");

        columnIdentifiers.add("订单号");
        columnIdentifiers.add("收件人名字");
        columnIdentifiers.add("手机");
        columnIdentifiers.add("地点");
        model.setDataVector(dataVector, columnIdentifiers);
        jTable.setModel(model);
        jTable.setGridColor(new java.awt.Color(0, 0, 0));
        jTable.setOpaque(false);
        jTable.setShowGrid(true);
        jScrollPane1.setViewportView(jTable);

        orderNumLabel.setText("订单号:");

        orderButton.setText("添加");

        okButton.setText("确认");

        cancelButton.setText("取消");

        .GroupLayout layout = new .GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
                    .addGroup(.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(270, Short.MAX_VALUE)
                        .addComponent(officeLabel)
                        .addPreferredGap(.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(officeText, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(dateLabel)
                        .addPreferredGap(.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateText, .GroupLayout.PREFERRED_SIZE, 106, .GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.TRAILING)
                                    .addComponent(courierLabel)
                                    .addComponent(numLabel))
                                .addPreferredGap(.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
                                    .addComponent(courierText, .GroupLayout.PREFERRED_SIZE, 93, .GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numText, .GroupLayout.PREFERRED_SIZE, 183, .GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(cancelButton)
                                .addGap(30, 30, 30)
                                .addComponent(okButton))
                            .addComponent(jScrollPane1, .GroupLayout.PREFERRED_SIZE, 506, .GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(orderNumLabel)
                                .addPreferredGap(.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(orderNumText, .GroupLayout.PREFERRED_SIZE, 126, .GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(orderButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(resultMsgText)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateText, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel)
                    .addComponent(officeText, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                    .addComponent(officeLabel))
                .addPreferredGap(.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                    .addComponent(numLabel)
                    .addComponent(numText, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                    .addComponent(courierLabel)
                    .addComponent(courierText, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, .GroupLayout.PREFERRED_SIZE, 234, .GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderNumText, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderNumLabel)
                    .addComponent(orderButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addPreferredGap(.LayoutStyle.ComponentPlacement.RELATED, .GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultMsgText, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextActionPerformed
        
    }//GEN-LAST:event_dateTextActionPerformed

}
