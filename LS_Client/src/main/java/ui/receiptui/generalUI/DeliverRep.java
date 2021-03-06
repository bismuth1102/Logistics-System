/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.receiptui.generalUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import ui.receiptui.ReceiptCheckUI.DeliverCheck;
import ui.util.MyFrame;
import Exception.ExceptionPrint;
import Exception.GoodsNotFound;
import VO.Receipt.DeliverRepVO;
import VO.Receipt.DeliverVO;
import bl.controllerfactorybl.ControllerFactoryImpl;
import blservice.loginblservice.LoginBLService;
import blservice.receiptblservice.DeliverRepblService;

/**
 *
 * @author apple
 */
public class DeliverRep extends javax.swing.JPanel {

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private MyFrame myFrame;
	private javax.swing.JButton cancelButton;
	private javax.swing.JLabel courierLabel;
	private javax.swing.JTextField courierText;
	private javax.swing.JLabel dateLabel;
	private javax.swing.JTextField dateText;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable;
	private javax.swing.JLabel numLabel;
	private javax.swing.JTextField numText;
	private javax.swing.JLabel officeLabel;
	private javax.swing.JTextField officeText;
	private javax.swing.JButton okButton;
	private javax.swing.JButton orderButton;
	private javax.swing.JLabel orderNumLabel;
	private javax.swing.JTextField orderNumText;
	private javax.swing.JTextField resultMsgText;
	private javax.swing.JButton checkAllRepsButton;
	private DeliverRepblService control;
	private DefaultTableModel model;
	private Vector<String> columnIdentifiers;
	private Vector<Object> dataVector;
	private String officeNum;
	 private LoginBLService logincontroller;

	// End of variables declaration//GEN-END:variables

	/**
	 * Creates new form DeliverRep
	 */
	public DeliverRep() {
		logincontroller=ControllerFactoryImpl.getInstance().getLoginController();
		initComponents();
		myFrame = new MyFrame(673, 519, this);
		myFrame.setTitle("派件单");
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
try {
	officeNum=logincontroller.getCurrentOfficeNum();
} catch (RemoteException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	System.out.println("获取登录人员机构编号失败!");
}
		dateText = new javax.swing.JTextField();
		dateLabel = new javax.swing.JLabel();
		officeText = new javax.swing.JTextField();
		officeLabel = new javax.swing.JLabel();
		numLabel = new javax.swing.JLabel();
		numText = new javax.swing.JTextField();
		courierLabel = new javax.swing.JLabel();
		courierText = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable = new javax.swing.JTable();
		orderNumLabel = new javax.swing.JLabel();
		orderNumText = new javax.swing.JTextField();
		orderButton = new javax.swing.JButton();
		okButton = new javax.swing.JButton();
		cancelButton = new javax.swing.JButton();
		resultMsgText = new javax.swing.JTextField();
		checkAllRepsButton = new javax.swing.JButton();
		control = ControllerFactoryImpl.getInstance().getDeliverRepblService();
        columnIdentifiers = new Vector<String>();
        dataVector = new Vector<Object>();
		model = new DefaultTableModel(dataVector, columnIdentifiers) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		setBackground(new java.awt.Color(255, 255, 255));

		resultMsgText.setEditable(false);

		dateLabel.setText("日期:");

		dateText.setEditable(false);
		dateText.setText(control.getDate());

		officeText.setEditable(false);
		officeText.setText(officeNum);

		officeLabel.setText(" 营业厅:");

		numLabel.setText("编号:");

		numText.setEditable(false);
		String num = officeText.getText();
		num += control.getDateInNum(dateText.getText());
		num += "4";
		try {
			num += control.createNum(dateText.getText(), officeText.getText());
			numText.setText(num);
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
		columnIdentifiers.add("删除");
		model.setDataVector(dataVector, columnIdentifiers);
		jTable.setModel(model);
		jTable.setGridColor(new java.awt.Color(0, 0, 0));
		jScrollPane1.setViewportView(jTable);

		orderNumLabel.setText("订单号:");

		orderButton.setText("添加");
		orderButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				orderMouseClicked(evt);
			}
		});

		okButton.setText("确认");
		okButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				okMouseClicked(evt);
			}
		});

		cancelButton.setText("取消");
		cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				cancelMouseClicked(evt);
			}
		});

		checkAllRepsButton.setText("查看所有单据");
		checkAllRepsButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				checkAllRepsButtonMouseClicked(evt);
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
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(checkAllRepsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(officeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(officeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(dateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(courierLabel)
                                    .addComponent(numLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(courierText, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addGap(100, 100, 100)
                        .addComponent(okButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderNumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orderNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(orderButton)))
                .addGap(193, 193, 193))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultMsgText)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel)
                    .addComponent(officeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(officeLabel)
                    .addComponent(checkAllRepsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numLabel)
                    .addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courierLabel)
                    .addComponent(courierText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderNumLabel)
                    .addComponent(orderButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultMsgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
	}// </editor-fold>//GEN-END:initComponents

	private void setColumn() {
		TableColumn column1 = jTable.getColumnModel().getColumn(0);
		column1.setPreferredWidth(105);
		TableColumn column2 = jTable.getColumnModel().getColumn(1);
		column2.setPreferredWidth(75);
		TableColumn column3 = jTable.getColumnModel().getColumn(2);
		column3.setPreferredWidth(110);
		TableColumn column4 = jTable.getColumnModel().getColumn(3);
		column4.setPreferredWidth(355);
		TableColumn column5 = jTable.getColumnModel().getColumn(4);
		column5.setPreferredWidth(50);
	}

	private void orderMouseClicked(java.awt.event.MouseEvent evt) {
    	resultMsgText.setText("");
		String order = orderNumText.getText();
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
		String name = null;
		String phoneNum = null;
		String address = null;
		try {
			name = control.getNameByOrder(order);
			phoneNum = control.getPhoneByOrder(order);
			address = control.getAddressByOrder(order);
		} catch (GoodsNotFound e) {
			resultMsgText.setText(ExceptionPrint.print(e));
			return;
		}
		Vector<String> arr = new Vector<String>();
		arr.add(order);
		arr.add(name);
		arr.add(phoneNum);
		arr.add(address);
		dataVector.add(arr);
		model.setDataVector(dataVector, columnIdentifiers);
		setColumn();
		orderNumText.setText("");
	}

	private void okMouseClicked(java.awt.event.MouseEvent evt) {
		String courierNum = courierText.getText();
		if (courierNum.equals("")) {
			resultMsgText.setText("请填写快递员编号");
			return;
		}
		String resultMessage = control.checkNum(courierNum, 11, "快递员编号");
		resultMsgText.setText(resultMessage);
		if (!resultMessage.equals("添加成功")) {
			return;
		}
		if(!courierNum.substring(0,6).equals(officeText.getText())){
			resultMsgText.setText("请填写本营业厅快递员");
			return;
		}
		if (!control.isTrueAccount(courierNum)) {
			resultMsgText.setText("未找到该派件员");
			return;
		}
		String num = numText.getText();
		String date = dateText.getText();
		ArrayList<DeliverVO> deliverVOs = new ArrayList<DeliverVO>();
		for (int i = 0; i < dataVector.size(); i++) {
			DeliverVO vo = new DeliverVO((String) jTable.getValueAt(i, 0), (String) jTable.getValueAt(i, 1),
					(String) jTable.getValueAt(i, 2), (String) jTable.getValueAt(i, 3));
			deliverVOs.add(vo);
		}
		DeliverRepVO deliverRepVO = new DeliverRepVO(num, date, courierText.getText(), deliverVOs);
		try {
			control.submit(deliverRepVO);
		} catch (NotBoundException | IOException e) {
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
			return;
		}
		myFrame.dispose();
	}

	private void cancelMouseClicked(java.awt.event.MouseEvent evt) {
		myFrame.dispose();
	}

	private void checkAllRepsButtonMouseClicked(MouseEvent evt) {
		new DeliverCheck(officeText.getText());
	}
	
    /**返回true表示重复
     * @param num
     * @return
     */
    private boolean checkRepeat(String num){
    	for(int i = 0;i < dataVector.size();i++){
    		if(((String)jTable.getValueAt(i, 0)).equals(num)){
    			return true;
    		}
    	}
    	return false;
    }

}
