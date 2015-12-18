/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.receiptui.generalUI;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Exception.ExceptionPrint;
import Exception.NumNotFoundException;
import VO.Receipt.PayFreightVO;
import VO.Receipt.PayRepFreightRepVO;
import VO.Receipt.PayRepVO;
import bl.receiptbl.PayRepbl.PayRepController;
import ui.util.MyFrame;
import util.enumData.ResultMessage;

/**
 *
 * @author apple
 */
public class PayRepFreight extends javax.swing.JPanel {

    // Variables declaration - do not modify//GEN-BEGIN:variables
	private MyFrame myFrame;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JTextField balanceText;
    private javax.swing.JComboBox<String> bankAccountBox;
    private javax.swing.JLabel bankAccountLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField resultMsgText;
    private javax.swing.JLabel sumLabel;
    private javax.swing.JTextField sumText;
    private javax.swing.JLabel transferRepLabel;
    private javax.swing.JTextField transferRepText;
    private PayRepController control;
    private DefaultTableModel model;
    private Vector<String> columnIdentifiers;
    private Vector<Object> dataVector;
    private PayRepVO payRepVO;
    private PayRep payRep;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form PayRep运费
     */
    public PayRepFreight(PayRep oriPayRep, PayRepVO oriPayRepVO) {
    	payRepVO = oriPayRepVO;
    	payRep = oriPayRep;
        initComponents();
        myFrame = new MyFrame(441, 527, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transferRepLabel = new javax.swing.JLabel();
        transferRepText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        sumText = new javax.swing.JTextField();
        balanceLabel = new javax.swing.JLabel();
        balanceText = new javax.swing.JTextField();
        bankAccountLabel = new javax.swing.JLabel();
        bankAccountBox = new javax.swing.JComboBox<String>();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        sumLabel = new javax.swing.JLabel();
        resultMsgText = new javax.swing.JTextField();
        control = new PayRepController();
        model = new DefaultTableModel();
        columnIdentifiers = new Vector<String>();
        dataVector = new Vector<Object>();

        setBackground(new java.awt.Color(255, 255, 255));

        transferRepLabel.setText("中转单编号:");

        addButton.setText("添加");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        columnIdentifiers.add("中转单编号");
        columnIdentifiers.add("金额");
        columnIdentifiers.add("备注");
        columnIdentifiers.add("删除");
        model.setDataVector(dataVector, columnIdentifiers);
        jTable.setModel(model);
        jTable.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable);

        sumText.setEditable(false);

        balanceLabel.setText("账户余额:");

        balanceText.setEditable(false);

        bankAccountLabel.setText("付款账户:");

        bankAccountBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        try {
			bankAccountBox = new JComboBox(control.showBankAccount());
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

        resultMsgText.setEditable(false);
        
        setColumn();
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultMsgText)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bankAccountLabel)
                            .addComponent(balanceLabel)
                            .addComponent(sumLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bankAccountBox, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sumText, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(cancelButton)
                        .addGap(74, 74, 74)
                        .addComponent(okButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transferRepLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transferRepText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(addButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferRepLabel)
                    .addComponent(transferRepText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(resultMsgText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void setColumn(){
    	TableColumn column1 = jTable.getColumnModel().getColumn(0);
        column1.setPreferredWidth(180);
        TableColumn column2 = jTable.getColumnModel().getColumn(1);
        column2.setPreferredWidth(60);
        TableColumn column3 = jTable.getColumnModel().getColumn(2);
        column3.setPreferredWidth(180);
        TableColumn column4 = jTable.getColumnModel().getColumn(3);
        column4.setPreferredWidth(10);
    }
    
    private String calSum(){
    	double sum = 0;
    	for(int i = 0;i < dataVector.size();i++){
    		sum += (double)jTable.getValueAt(i, 1);
    	}
    	return sum+"";
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	String transferRepNum = transferRepText.getText();
    	ResultMessage resultMessage = control.checkNum(transferRepNum, 19);
    	String resultMsg = ResultMessage.toFriendlyString(resultMessage);
		resultMsgText.setText(resultMsg);
		if (resultMessage == ResultMessage.ADD_SUCCESS) {
			Vector<String> arr = new Vector<String>();
			double money = 0;
			try {
				money = control.getFreightMoney(transferRepNum);
			} catch (ClassNotFoundException | NotBoundException | IOException | NumNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resultMsgText.setText(ExceptionPrint.print(e));
			}
			arr.add(transferRepNum);
			arr.add(money+"");
			dataVector.add(arr);
			model.setDataVector(dataVector, columnIdentifiers);
			setColumn();
			sumText.setText(calSum());
		}
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	myFrame.dispose();
    }

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	double sum = Double.parseDouble(sumText.getText());
    	String bankAccount = (String)bankAccountBox.getSelectedItem();
    	try {
			control.minusMoneyInBankAccount(bankAccount, sum);
		} catch (ClassNotFoundException | NumNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}
    	
    	ArrayList<PayFreightVO> payFreightVOs = new ArrayList<PayFreightVO>();
    	for(int i = 0;i < dataVector.size();i++){
    		PayFreightVO payFreightVO = new PayFreightVO((String)jTable.getValueAt(i, 0), 
    				(String)jTable.getValueAt(i, 2), 
					(double)jTable.getValueAt(i, 1));
    		payFreightVOs.add(payFreightVO);
    	}
    	PayRepFreightRepVO payRepFreightRepVO = new PayRepFreightRepVO(sum, bankAccount, payFreightVOs);
    	control.submitFreight(payRepVO, payRepFreightRepVO);
    	payRep.deleteRow("运费");
    	Vector<String> arr = new Vector<String>();
    	arr.add("运费");
    	arr.add(sum+"");
    	arr.add(bankAccount);
    	payRep.createRow(arr);
    	myFrame.dispose();
    }

}
