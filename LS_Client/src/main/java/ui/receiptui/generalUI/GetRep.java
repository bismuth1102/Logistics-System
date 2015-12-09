/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.receiptui.generalUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import Exception.ExceptionPrint;
import Exception.NumNotFoundException;
import VO.ReceiptVO.ArriveVO;
import VO.ReceiptVO.GetRepVO;
import bl.receiptbl.GetRepbl.GetRepController;
import blservice.receiptblservice.GetRepblService;
import util.enumData.GoodsArrivalState;
import util.enumData.Rep;
import util.enumData.ResultMessage;

/**
 *
 * @author apple
 */
public class GetRep extends javax.swing.JPanel {

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton addButton;
	private javax.swing.JComboBox arriveStateBox;
	private javax.swing.JLabel arriveStateLabel;
	private javax.swing.JButton cancelButton;
	private javax.swing.JButton checkAllRepsButton;
	private javax.swing.JLabel dateLabel;
	private javax.swing.JTextField dateText;
	private javax.swing.JLabel departLabel;
	private javax.swing.JTextField departText;
	private javax.swing.JComboBox getTypeBox;
	private javax.swing.JLabel getTypeLabel;
	private javax.swing.JTextField getTypeText;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable;
	private javax.swing.JLabel numLabel;
	private javax.swing.JTextField numText;
	private javax.swing.JLabel officeLabel;
	private javax.swing.JTextField officeText;
	private javax.swing.JButton okButton;
	private javax.swing.JLabel orderLabel;
	private javax.swing.JTextField orderText;
	private javax.swing.JTextField resultMsgText;
	private GetRepblService control;
	private DefaultTableModel model;
	private Vector<String> columnIdentifiers;
	private Vector<Object> dataVector;
	private javax.swing.JButton completeButton;
	private javax.swing.JButton confirmButton;

	// End of variables declaration//GEN-END:variables

	/**
	 * Creates new form GetRep
	 */
	public GetRep() {
		initComponents();
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

		dateText = new javax.swing.JTextField();
		dateLabel = new javax.swing.JLabel();
		officeText = new javax.swing.JTextField();
		officeLabel = new javax.swing.JLabel();
		numLabel = new javax.swing.JLabel();
		numText = new javax.swing.JTextField();
		getTypeLabel = new javax.swing.JLabel();
		arriveStateBox = new javax.swing.JComboBox();
		getTypeText = new javax.swing.JTextField();
		departLabel = new javax.swing.JLabel();
		departText = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable = new javax.swing.JTable();
		orderLabel = new javax.swing.JLabel();
		orderText = new javax.swing.JTextField();
		arriveStateLabel = new javax.swing.JLabel();
		getTypeBox = new javax.swing.JComboBox();
		addButton = new javax.swing.JButton();
		cancelButton = new javax.swing.JButton();
		okButton = new javax.swing.JButton();
		resultMsgText = new javax.swing.JTextField();
		checkAllRepsButton = new javax.swing.JButton();
		control = new GetRepController();
		model = new DefaultTableModel();
		columnIdentifiers = new Vector<String>();
		dataVector = new Vector<Object>();
		confirmButton = new javax.swing.JButton();
		completeButton = new javax.swing.JButton();

		setBackground(new java.awt.Color(255, 255, 255));

		dateText.setEditable(false);
		dateText.setText(control.getDate());

		dateLabel.setText("日期:");

		officeText.setEditable(false);
		officeText.setText("025001");

		officeLabel.setText("营业厅:");

		numLabel.setText("编号:");

		numText.setEditable(false);
		try {
			String num = officeText.getText();
			num += control.getDateInNum(dateText.getText());
			num += "4";
			num += control.createNum(dateText.getText());
			numText.setText(num);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}

		getTypeLabel.setText("到达单据类型:");

		arriveStateBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "正常", "损毁", "丢失" }));

		departLabel.setText("出发地:");

		departText.setEditable(false);

		columnIdentifiers.add("订单号");
		columnIdentifiers.add("到达状态");
		columnIdentifiers.add("删除");

		model.setDataVector(dataVector, columnIdentifiers);
		jTable.setModel(model);
		jTable.setGridColor(new java.awt.Color(0, 0, 0));
		jScrollPane1.setViewportView(jTable);

		orderLabel.setText("订单号:");

		arriveStateLabel.setText("到达状态:");

		getTypeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "营业厅装车单", "中转中心装车单" }));

		addButton.setText("添加");
		addButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addButtonActionPerformed(evt);
			}
		});

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

		resultMsgText.setEditable(false);

		checkAllRepsButton.setText("查看所有单据");
		checkAllRepsButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkAllRepsButtonActionPerformed(evt);
			}
		});

		confirmButton.setText("确定");
		confirmButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				confirmButtonActionPerformed(evt);
			}
		});

		completeButton.setText("完成");
		completeButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				completeButtonActionPerformed(evt);
			}
		});

		setColumn();

		jTable.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				int row = jTable.getSelectedRow();
				int col = jTable.getSelectedColumn();
				if (col == 4) {
					model.removeRow(row);
					jTable.setModel(model);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(17, 17, 17)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addComponent(checkAllRepsButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(officeLabel)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(officeText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(dateLabel)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(15, 15, 15))
						.addGroup(
								layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(getTypeLabel).addComponent(numLabel)
																.addComponent(departLabel))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE, 179,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(layout.createSequentialGroup()
														.addComponent(getTypeBox,
																javax.swing.GroupLayout.PREFERRED_SIZE, 147,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(getTypeText,
																javax.swing.GroupLayout.PREFERRED_SIZE, 199,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(confirmButton))
												.addComponent(departText, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(28, 28, 28)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(cancelButton).addComponent(orderLabel)
												.addComponent(arriveStateLabel))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(arriveStateBox, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(orderText, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(layout.createSequentialGroup().addComponent(addButton)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(completeButton))
												.addComponent(okButton))))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				.addComponent(resultMsgText));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(12, 12, 12)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(dateLabel)
						.addComponent(officeText, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(officeLabel).addComponent(checkAllRepsButton))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(numLabel)
						.addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(getTypeLabel)
								.addComponent(getTypeText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(confirmButton))
						.addComponent(getTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(6, 6, 6)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(departLabel).addComponent(departText, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(
						layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
												Short.MAX_VALUE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
						.addGroup(layout.createSequentialGroup().addGap(29, 29, 29)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(orderLabel).addComponent(orderText,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(arriveStateLabel).addComponent(arriveStateBox,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(11, 11, 11)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(addButton).addComponent(completeButton))
								.addGap(53, 53, 53)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(cancelButton).addComponent(okButton))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58,
										Short.MAX_VALUE)))
				.addComponent(resultMsgText, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
	}// </editor-fold>//GEN-END:initComponents

	private void setColumn() {
		TableColumn column1 = jTable.getColumnModel().getColumn(0);
		column1.setPreferredWidth(105);
		TableColumn column2 = jTable.getColumnModel().getColumn(1);
		column2.setPreferredWidth(50);
		TableColumn column3 = jTable.getColumnModel().getColumn(2);
		column3.setPreferredWidth(10);
	}

	private void checkAllRepsButtonActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
		String order = orderText.getText();
		ResultMessage resultMessage = control.checkNum(order, 10);
		String resultMsg = ResultMessage.toFriendlyString(resultMessage);
		resultMsgText.setText(resultMsg);
		if (resultMessage == ResultMessage.ADD_SUCCESS) {
			Vector<Object> arr = new Vector<Object>();
			arr.add(order);
			arr.add(arriveStateBox.getSelectedItem().toString());
			dataVector.add(arr);
			model.setDataVector(dataVector, columnIdentifiers);
			setColumn();
		}
	}

	private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
		String num = numText.getText();
		String date = dateText.getText();
		String repString = getTypeBox.getSelectedItem().toString();
		Rep rep = Rep.getRep(repString);
		String shipNum = getTypeText.getText();
		String depart = departText.getText();
		ArrayList<ArriveVO> arriveVOs = new ArrayList<ArriveVO>();
		for (int i = 0; i < dataVector.size(); i++) {
			ArriveVO vo = new ArriveVO((String) jTable.getValueAt(i, 0),
					GoodsArrivalState.getGoodsArrivalState((String) jTable.getValueAt(i, 1)));
			arriveVOs.add(vo);
		}
		GetRepVO getRepVO = new GetRepVO(num, date, rep, shipNum, arriveVOs, depart);
		try {
			control.submit(getRepVO);
		} catch (NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}
		resultMsgText.setText(ResultMessage.toFriendlyString(ResultMessage.SUBMIT_SUCCESS));
	}

	private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {
		String repString = getTypeBox.getSelectedItem().toString();
		Rep rep = Rep.getRep(repString);
		String shipNum = getTypeText.getText();
		try {
			departText.setText(control.getDepart(rep, shipNum));
		} catch (ClassNotFoundException | NotBoundException | IOException | NumNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}
	}

	private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		String repString = getTypeBox.getSelectedItem().toString();
		Rep rep = Rep.getRep(repString);
		ArrayList<String> existOrders = new ArrayList<String>();
		for (int i = 0; i < dataVector.size(); i++) {
			existOrders.add((String) jTable.getValueAt(i, 0));
		}
		Vector<Object> arrs = null;
		try {
			arrs = control.initTable(rep, getTypeText.getText(), existOrders);
		} catch (ClassNotFoundException | NotBoundException | IOException | NumNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}
		for(int i = 0;i < arrs.size();i++){
			dataVector.add(arrs.get(i));
		}
		model.setDataVector(dataVector, columnIdentifiers);
		setColumn();
	}

}
