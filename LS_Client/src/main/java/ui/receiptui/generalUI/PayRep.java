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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Exception.ExceptionPrint;
import Exception.NumNotFoundException;
import VO.Receipt.PayRepVO;
import VO.Receipt.PayVO;
import bl.receiptbl.PayRepbl.PayRepController;
import ui.receiptui.ReceiptCheckUI.PayCheck;
import ui.util.MyFrame;
import util.enumData.PayThing;

/**
 *
 * @author apple
 */
public class PayRep extends javax.swing.JPanel {

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private MyFrame myFrame;
	private javax.swing.JButton cancelLabel;
	private javax.swing.JButton checkAllRepsButton;
	private javax.swing.JComboBox<String> choosePayThingBox;
	private javax.swing.JLabel choosePayThingLabel;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable;
	private javax.swing.JLabel numLabel;
	private javax.swing.JTextField numText;
	private javax.swing.JButton okButton;
	private javax.swing.JLabel payManLabel;
	private javax.swing.JTextField payManText;
	private javax.swing.JTextField resultMsgText;
	private javax.swing.JLabel sumLabel;
	private javax.swing.JTextField sumText;
	private PayRepController control;
	private DefaultTableModel model;
	private Vector<String> columnIdentifiers;
	private Vector<Object> dataVector;
	private PayRepVO oriPayRepVO = null;
	// End of variables declaration//GEN-END:variables

	/**
	 * Creates new form PayRep
	 */
	public PayRep() {
		initComponents();
		myFrame = new MyFrame(691, 367, this);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		numLabel = new javax.swing.JLabel();
		numText = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable = new javax.swing.JTable();
		choosePayThingLabel = new javax.swing.JLabel();
		choosePayThingBox = new javax.swing.JComboBox<String>();
		cancelLabel = new javax.swing.JButton();
		okButton = new javax.swing.JButton();
		payManText = new javax.swing.JTextField();
		payManLabel = new javax.swing.JLabel();
		sumLabel = new javax.swing.JLabel();
		sumText = new javax.swing.JTextField();
		resultMsgText = new javax.swing.JTextField();
		checkAllRepsButton = new javax.swing.JButton();
		control = new PayRepController();
		model = new DefaultTableModel();
		columnIdentifiers = new Vector<String>();
		dataVector = new Vector<Object>();

		setBackground(new java.awt.Color(255, 255, 255));

		numLabel.setText("编号:");

		numText.setEditable(false);
		numText.setText(control.getDate());
		
		try {
			payManText.setText(control.payPeople());
		} catch (ClassNotFoundException | NumNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}

		try {
			oriPayRepVO = control.getSubmitPayRep();
		} catch (ClassNotFoundException | IOException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}

		columnIdentifiers.add("付款项");
		columnIdentifiers.add("金额");
		columnIdentifiers.add("付款账户");
		columnIdentifiers.add("备注");
		columnIdentifiers.add("删除");
		try {
			dataVector = control.initTable();
		} catch (ClassNotFoundException | NotBoundException | IOException | NumNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}
		model.setDataVector(dataVector, columnIdentifiers);
		jTable.setModel(model);
		jTable.setGridColor(new java.awt.Color(0, 0, 0));
		jScrollPane1.setViewportView(jTable);

		choosePayThingLabel.setText("请选择付款对象:");

		choosePayThingBox.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "<请选择>", "退款", "司机工资", "奖金", "人员工资", "快递员工资", "租金", "运费" }));
		choosePayThingBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				choosePayThingBoxActionPerformed(evt);
			}
		});

		cancelLabel.setText("取消");
		cancelLabel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancelLabelActionPerformed(evt);
			}
		});

		okButton.setText("确定");
		okButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				okButtonActionPerformed(evt);
			}
		});

		payManLabel.setText("付款人");

		sumLabel.setText("总计:");

		sumText.setEditable(false);

		resultMsgText.setEditable(false);

		checkAllRepsButton.setText("查看所有单据");
		checkAllRepsButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkAllRepsButtonActionPerformed(evt);
			}
		});

		setColumn();

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(17, 17, 17)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addComponent(checkAllRepsButton).addGap(57, 57, 57)
						.addComponent(payManLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(payManText, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(29, 29, 29).addComponent(numLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(numText,
								javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addComponent(choosePayThingLabel)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(choosePayThingBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addComponent(sumLabel)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(sumText, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(95, 95, 95).addComponent(cancelLabel).addGap(47, 47, 47).addComponent(okButton))
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addContainerGap(22, Short.MAX_VALUE)).addComponent(resultMsgText));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(15, 15, 15)
								.addGroup(layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
												layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(numLabel)
														.addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(payManText, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(payManLabel))
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
								layout.createSequentialGroup().addGap(2, 2, 2).addComponent(checkAllRepsButton)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(choosePayThingLabel).addComponent(choosePayThingBox,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(sumLabel)
						.addComponent(sumText, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(cancelLabel).addComponent(okButton)).addGap(18, 18, 18)
				.addComponent(resultMsgText, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
						javax.swing.GroupLayout.PREFERRED_SIZE)));
	}// </editor-fold>//GEN-END:initComponents

	private void setColumn() {
		TableColumn column1 = jTable.getColumnModel().getColumn(0);
		column1.setPreferredWidth(100);
		TableColumn column2 = jTable.getColumnModel().getColumn(1);
		column2.setPreferredWidth(60);
		TableColumn column3 = jTable.getColumnModel().getColumn(2);
		column3.setPreferredWidth(180);
		TableColumn column4 = jTable.getColumnModel().getColumn(3);
		column4.setPreferredWidth(270);
		TableColumn column5 = jTable.getColumnModel().getColumn(4);
		column5.setPreferredWidth(10);
	}

	private String calSum() {
		double sum = 0;
		for (int i = 0; i < dataVector.size(); i++) {
			sum += (double) jTable.getValueAt(i, 1);
		}
		return sum + "";
	}

	private void checkAllRepsButtonActionPerformed(java.awt.event.ActionEvent evt) {
		new PayCheck();
	}

	private void cancelLabelActionPerformed(java.awt.event.ActionEvent evt) {
		myFrame.dispose();
	}

	private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
		double sum = Double.parseDouble(sumText.getText());
		ArrayList<PayVO> payVOs = new ArrayList<PayVO>();
		for (int i = 0; i < dataVector.size(); i++) {
			PayVO payVO = new PayVO(PayThing.getPayThing((String) jTable.getValueAt(i, 0)),
					(double) jTable.getValueAt(i, 1), (String) jTable.getValueAt(i, 2),
					(String) jTable.getValueAt(i, 3));
			payVOs.add(payVO);
		}
		PayRepVO payRepVO = new PayRepVO(numText.getText(), numText.getText(), sum, payVOs, 
				payManText.getText(), oriPayRepVO.refund, oriPayRepVO.staffSalary, oriPayRepVO.freight, 
				oriPayRepVO.rent, oriPayRepVO.driverSalary, oriPayRepVO.courierSalary, oriPayRepVO.bonus);
		try {
			control.submit(payRepVO);
		} catch (NotBoundException | IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}
		myFrame.dispose();
	}

	private void choosePayThingBoxActionPerformed(java.awt.event.ActionEvent evt) {
		if (evt.getSource() == choosePayThingBox) {
			int index = choosePayThingBox.getSelectedIndex();
			switch (index) {
			case 1:
				new PayRepRefund(this, oriPayRepVO);
				break;
			case 2:
				new PayRepDriver(this, oriPayRepVO);
				break;
			case 3:
				new PayRepBonus(this, oriPayRepVO);
				break;
			case 4:
				new PayRepStaff(this, oriPayRepVO);
				break;
			case 5:
				new PayRepCourier(this, oriPayRepVO);
				break;
			case 6:
				new PayRepRent(this, oriPayRepVO);
				break;
			case 7:
				new PayRepFreight(this, oriPayRepVO);
				break;
			default:
				break;
			}
		}
	}
	
	public void createRow(Vector<String> arr){
		dataVector.add(arr);
		model.setDataVector(dataVector, columnIdentifiers);
    	setColumn();
	}
	
	public void deleteRow(String payThing){
		for(int i = 0;i < dataVector.size();i++){
			if(((String)jTable.getValueAt(i, 0)).equals(payThing)){
				model.removeRow(i);
				jTable.setModel(model);
				sumText.setText(calSum());
				break;
			}
		}
	}
	
}
