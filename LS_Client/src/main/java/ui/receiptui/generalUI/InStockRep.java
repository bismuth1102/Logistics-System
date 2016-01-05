/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.receiptui.generalUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Exception.ExceptionPrint;
import Exception.GoodsNotFound;
import VO.StockDivisionVO;
import VO.Receipt.InStockRepVO;
import VO.Receipt.InStockVO;
import bl.controllerfactorybl.ControllerFactoryImpl;
import blservice.receiptblservice.InStockRepblService;
import ui.receiptui.ReceiptCheckUI.InStockCheck;
import ui.warehousemanui.WarehousePanel;
import util.enumData.City;
import util.CurrentCity;

/**
 *
 * @author apple
 */
public class InStockRep extends javax.swing.JPanel {

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JFrame frame;
	private javax.swing.JButton addButton;
	private javax.swing.JButton cancelButton;
	private javax.swing.JButton checkAllRepsButton;
	private javax.swing.JLabel dateLabel;
	private javax.swing.JTextField dateText;
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
	private InStockRepblService control;
	private DefaultTableModel model;
	private Vector<String> columnIdentifiers;
	private Vector<Object> dataVector;
	private String officeID;
	// End of variables declaration//GEN-END:variables

	/**
	 * Creates new form InStockRep
	 */

	public InStockRep(JFrame frame) {
		this.frame = frame;
		initComponents();
		frame.setTitle("入库单");
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
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable = new javax.swing.JTable();
		orderLabel = new javax.swing.JLabel();
		orderText = new javax.swing.JTextField();
		addButton = new javax.swing.JButton();
		cancelButton = new javax.swing.JButton();
		okButton = new javax.swing.JButton();
		resultMsgText = new javax.swing.JTextField();
		checkAllRepsButton = new javax.swing.JButton();
		control = ControllerFactoryImpl.getInstance().getInStockRepblService();
		columnIdentifiers = new Vector<String>();
		dataVector = new Vector<Object>();
		model = new DefaultTableModel(dataVector, columnIdentifiers) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		setBackground(new java.awt.Color(255, 255, 255));

		dateText.setEditable(false);
		dateText.setText(control.getDate());

		dateLabel.setText("日期:");

		officeText.setEditable(false);
		try {
			officeText.setText(City.toString(CurrentCity.getCurrentCity()));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}
		officeID = CurrentCity.getCurrentOptorID(officeText.getText());

		officeLabel.setText("中转中心:");

		numLabel.setText("编号:");

		numText.setEditable(false);
		String num = officeID + "000";
		num += control.getDateInNum(dateText.getText());
		num += "2";
		try {
			num += control.createNum(dateText.getText(), officeID);
			numText.setText(num);
		} catch (ClassNotFoundException | NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}

		columnIdentifiers.add("订单号");
		columnIdentifiers.add("区号");
		columnIdentifiers.add("位号");
		columnIdentifiers.add("删除");
		model.setDataVector(dataVector, columnIdentifiers);
		jTable.setModel(model);
		jTable.setGridColor(new java.awt.Color(0, 0, 0));
		jScrollPane1.setViewportView(jTable);

		orderLabel.setText("订单号:");

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
				if (col == 3) {
					deleteBlock((String) jTable.getValueAt(row, 0));
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
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(resultMsgText)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(checkAllRepsButton).addGap(15, 15, 15).addComponent(officeLabel)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(officeText, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
												javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(dateLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
								javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap())
				.addGroup(layout.createSequentialGroup().addGap(21, 21, 21)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup().addComponent(orderLabel)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(orderText, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(addButton))
								.addGroup(layout.createSequentialGroup().addComponent(numLabel)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE, 182,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(75, 75, 75).addComponent(cancelButton)
										.addGap(18, 18, 18).addComponent(okButton)))
						.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(dateLabel)
								.addComponent(officeText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(officeLabel).addComponent(checkAllRepsButton)))
						.addGroup(layout.createSequentialGroup().addGap(54, 54, 54).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(numLabel)
								.addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(
						layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(orderLabel)
								.addComponent(orderText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(addButton))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(okButton)
						.addComponent(cancelButton))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(resultMsgText, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
	}// </editor-fold>//GEN-END:initComponents

	private void setColumn() {
		TableColumn column1 = jTable.getColumnModel().getColumn(0);
		column1.setPreferredWidth(105);
		TableColumn column2 = jTable.getColumnModel().getColumn(1);
		column2.setPreferredWidth(50);
		TableColumn column3 = jTable.getColumnModel().getColumn(2);
		column3.setPreferredWidth(50);
		TableColumn column4 = jTable.getColumnModel().getColumn(3);
		column4.setPreferredWidth(50);
	}

	private void deleteBlock(String order) {
			try {
				control.delete(order);
			} catch (ClassNotFoundException | NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resultMsgText.setText(ExceptionPrint.print(e));
			}
	}

	private void checkAllRepsButtonActionPerformed(java.awt.event.ActionEvent evt) {
		new InStockCheck(officeID);
	}

	private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
		resultMsgText.setText("");
		String order = orderText.getText();
		if (order.equals("")) {
			resultMsgText.setText("请填写订单号");
			return;
		}
    	if(checkRepeat(order)){
    		resultMsgText.setText("该订单号已填写");
    		return;
    	}
		String resultMessage = control.checkNum(order, 10, "编号");
		resultMsgText.setText(resultMessage);
		if (!resultMessage.equals("添加成功")) {
			return;
		}
		String destination = null;
		StockDivisionVO stockDivisionVO = null;
		try {
			destination = control.getCity(order);
		} catch (GoodsNotFound e) {
			// TODO Auto-generated catch block
			resultMsgText.setText(ExceptionPrint.print(e));
			return;
		}
		City destinationCity = City.getCityByNum(destination);
		try {
			stockDivisionVO = control.getAvailableDivision(destinationCity);
		} catch (NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
			return;
		}
		if (stockDivisionVO == null)
			resultMsgText.setText("该区已满");
		else {
			Vector<String> arr = new Vector<String>();
			arr.add(order);
			arr.add(stockDivisionVO.block + "");
			arr.add(stockDivisionVO.place + "");
			dataVector.add(arr);
			model.setDataVector(dataVector, columnIdentifiers);
			setColumn();
			ArrayList<InStockVO> inStockVOs = new ArrayList<InStockVO>();
			inStockVOs.add(new InStockVO(order, stockDivisionVO.block + "", stockDivisionVO.place + ""));
			InStockRepVO inStockRepVO = new InStockRepVO(numText.getText(), dateText.getText(), inStockVOs);
			orderText.setText("");
			try {
				control.update(inStockRepVO);
			} catch (MalformedURLException | RemoteException | NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resultMsgText.setText(ExceptionPrint.print(e));
				return;
			}
			ArrayList<Integer> overblocks;
			try {
				overblocks = control.checkOver(stockDivisionVO.block);
			} catch (NotBoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resultMsgText.setText(ExceptionPrint.print(e));
				return;
			}
			if(overblocks.size()>0){
				resultMsgText.setText("该区库存超过警戒值");
			}
		}
	}

	private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
		String num = numText.getText();
		String date = dateText.getText();
		ArrayList<InStockVO> inStockVOs = new ArrayList<InStockVO>();
		for (int i = 0; i < dataVector.size(); i++) {
			InStockVO inStockVO = new InStockVO((String) jTable.getValueAt(i, 0), 
					(String) jTable.getValueAt(i, 1),
					(String) jTable.getValueAt(i, 2));
			inStockVOs.add(inStockVO);
		}
		InStockRepVO inStockRepVO = new InStockRepVO(num, date, inStockVOs);
		try {
			control.submit(inStockRepVO);
		} catch (NotBoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
			return;
		}
		WarehousePanel w = new WarehousePanel();
		w.setVisible(true);
		w.showProcess();
		this.frame.dispose();
	}

	private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
		for (int i = 0; i < dataVector.size(); i++) {
			deleteBlock((String) jTable.getValueAt(i, 0));
		}
		WarehousePanel w = new WarehousePanel();
		w.setVisible(true);
		this.frame.dispose();
	}
	
    private boolean checkRepeat(String num){
    	for(int i = 0;i < dataVector.size();i++){
    		if(((String)jTable.getValueAt(i, 0)).equals(num)){
    			return true;
    		}
    	}
    	return false;
    }

}
