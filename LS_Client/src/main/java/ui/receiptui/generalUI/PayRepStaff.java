/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.receiptui.generalUI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Exception.ExceptionPrint;
import Exception.NumNotFoundException;
import VO.Receipt.PayRepStaffSalaryRepVO;
import VO.Receipt.PayRepVO;
import VO.Receipt.PayStaffSalaryVO;
import bl.receiptbl.PayRepbl.PayRepController;
import ui.util.MyFrame;
import util.enumData.Authority;

/**
 *
 * @author apple
 */
public class PayRepStaff extends javax.swing.JPanel {

    // Variables declaration - do not modify//GEN-BEGIN:variables
	private MyFrame myFrame;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JTextField balanceText;
    private javax.swing.JComboBox<String> bankAccountBox;
    private javax.swing.JLabel bankAccountLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField resultMsgText;
    private javax.swing.JLabel sumLabel;
    private javax.swing.JTextField sumText;
    private PayRepController control;
    private DefaultTableModel model;
    private Vector<String> columnIdentifiers;
    private Vector<Object> dataVector;
    private PayRepVO payRepVO;
    private PayRep payRep;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Creates new form PayRep工资
     */
    public PayRepStaff(PayRep oriPayRep, PayRepVO oriPayRepVO) {
    	payRepVO = oriPayRepVO;
    	payRep = oriPayRep;
        initComponents();
        myFrame = new MyFrame(442, 474, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        bankAccountBox = new javax.swing.JComboBox<String>();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        sumLabel = new javax.swing.JLabel();
        sumText = new javax.swing.JTextField();
        balanceLabel = new javax.swing.JLabel();
        balanceText = new javax.swing.JTextField();
        bankAccountLabel = new javax.swing.JLabel();
        resultMsgText = new javax.swing.JTextField();
        control = new PayRepController();
        model = new DefaultTableModel();
        columnIdentifiers = new Vector<String>();
        dataVector = new Vector<Object>();

        setBackground(new java.awt.Color(255, 255, 255));

        columnIdentifiers.add("职位");
        columnIdentifiers.add("名字");
        columnIdentifiers.add("编号");
        columnIdentifiers.add("金额");
        columnIdentifiers.add("删除");
        model.setDataVector(dataVector, columnIdentifiers);
        jTable.setModel(model);
        jTable.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTable);

        try {
			bankAccountBox = new JComboBox<String>(control.showBankAccount());
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		} 
        
        cancelButton.setText("取消");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okButton.setText("确认");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        sumLabel.setText("总计:");

        sumText.setEditable(false);

        balanceLabel.setText("账户余额:");

        balanceText.setEditable(false);

        bankAccountLabel.setText("付款账户:");

        resultMsgText.setEditable(false);
        
        setColumn();
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bankAccountLabel)
                            .addComponent(balanceLabel)
                            .addComponent(sumLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bankAccountBox, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(cancelButton))
                                    .addComponent(balanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addComponent(okButton))
                            .addComponent(sumText, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(resultMsgText)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumLabel)
                    .addComponent(sumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankAccountLabel)
                    .addComponent(bankAccountBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceLabel)
                    .addComponent(balanceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultMsgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void setColumn(){
    	TableColumn column1 = jTable.getColumnModel().getColumn(0);
        column1.setPreferredWidth(105);
        TableColumn column2 = jTable.getColumnModel().getColumn(1);
        column2.setPreferredWidth(75);
        TableColumn column3 = jTable.getColumnModel().getColumn(2);
        column3.setPreferredWidth(115);
        TableColumn column4 = jTable.getColumnModel().getColumn(3);
        column4.setPreferredWidth(60);
        TableColumn column5 = jTable.getColumnModel().getColumn(4);
        column5.setPreferredWidth(10);
    }
    
    private String calSum(){
    	double sum = 0;
    	for(int i = 0;i < dataVector.size();i++){
    		sum += (double)jTable.getValueAt(i, 3);
    	}
    	return sum+"";
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	myFrame.dispose();
    }

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	sumText.setText(calSum());
    	double sum = Double.parseDouble(sumText.getText());
    	String bankAccount = (String)bankAccountBox.getSelectedItem();
    	try {
			control.minusMoneyInBankAccount(bankAccount, sum);
		} catch (ClassNotFoundException | NumNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
			return;
		}
    	ArrayList<PayStaffSalaryVO> PayStaffSalaryVOs = new ArrayList<PayStaffSalaryVO>();
    	for(int i = 0;i < dataVector.size();i++){
    		PayStaffSalaryVO payStaffSalaryVO = new PayStaffSalaryVO((String)jTable.getValueAt(i, 1),
    				(String)jTable.getValueAt(i, 2),
    				(double)jTable.getValueAt(i, 3),
    				Authority.toAuthority((String)jTable.getValueAt(i, 0)));
    		PayStaffSalaryVOs.add(payStaffSalaryVO);
    	}
    	PayRepStaffSalaryRepVO payRepStaffSalaryRepVO = 
    			new PayRepStaffSalaryRepVO(bankAccount, sum, PayStaffSalaryVOs);
    	control.submitStaff(payRepVO, payRepStaffSalaryRepVO);
    	payRep.deleteRow("人员工资");
    	Vector<String> arr = new Vector<String>();
    	arr.add("人员工资");
    	arr.add(sum+"");
    	arr.add(bankAccount);
    	payRep.createRow(arr);
    	myFrame.dispose();
    }


}
