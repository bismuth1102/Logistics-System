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
import java.util.Iterator;
import java.util.ResourceBundle.Control;
import java.util.Vector;
import Exception.NameNotFoundException;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import VO.GoodsVO;
import VO.Receipt.CashRepVO;
import VO.Receipt.CashVO;
import bl.controllerfactorybl.ControllerFactoryImpl;
import bl.receiptbl.CashRepbl.CashRepController;
import blservice.receiptblservice.CashRepblService;
import ui.receiptui.ReceiptCheckUI.CashCheck;
import ui.util.MyFrame;
import Exception.ExceptionPrint;
import Exception.NumNotFoundException;

/**
 *
 * @author apple
 */
public class CashRep extends javax.swing.JPanel {

	/**
     * Creates new form CashRep
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
	private MyFrame myFrame;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton courierButton;
    private javax.swing.JLabel courierNumLabel;
    private javax.swing.JTextField courierNumText;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel numLabel;
    private javax.swing.JTextField numText;
    private javax.swing.JLabel officeLabel;
    private javax.swing.JTextField officeText;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel sumLabel;
    private javax.swing.JTextField sumText;
    private javax.swing.JTextField resultMsgText;
    private javax.swing.JButton checkAllRepsButton;
    private CashRepblService control;
    private DefaultTableModel model;
    private Vector<String> columnIdentifiers;
    private Vector<Object> dataVector;
 // End of variables declaration//GEN-END:variables
    
    public CashRep() {
        initComponents();
        myFrame = new MyFrame(480, 635, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    	
        numLabel = new javax.swing.JLabel();
        numText = new javax.swing.JTextField();
        courierNumLabel = new javax.swing.JLabel();
        courierNumText = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        sumLabel = new javax.swing.JLabel();
        sumText = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        officeText = new javax.swing.JTextField();
        officeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        accountLabel = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<String>();
        courierButton = new javax.swing.JButton();
        resultMsgText = new javax.swing.JTextField();
        checkAllRepsButton = new javax.swing.JButton();
        control = ControllerFactoryImpl.getInstance().getCashRepblService();
        columnIdentifiers = new Vector<String>();
        dataVector = new Vector<Object>();
        model = new DefaultTableModel(dataVector, columnIdentifiers){
			@Override
			public boolean isCellEditable(int row, int column){
				if(column==3)
					return true;
				else 
					return false;
			}
		};

        setBackground(new java.awt.Color(255, 255, 255));
        
        resultMsgText.setEditable(false);
        
        dateLabel.setText("日期:");
        
        dateText.setText(control.getDate());
        dateText.setEditable(false);
        
        officeText.setEditable(false);
        officeText.setText("025001");

        officeLabel.setText("营业厅:");

        numLabel.setText("编号:");

        numText.setEditable(false);
        numText.setText(officeText.getText()+control.getDateInNum(dateText.getText())+"10000");

        courierNumLabel.setText("快递员编号:");

        sumLabel.setText("总和:");

        sumText.setEditable(false);

        cancelButton.setText("取消");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        okButton.setText("确认");
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });

        jTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
        columnIdentifiers.add("快递员名字");
        columnIdentifiers.add("快递员编号");
        columnIdentifiers.add("金额");
        columnIdentifiers.add("备注");
        columnIdentifiers.add("删除");
		try {
			dataVector = control.initTable(officeText.getText());
			model.setDataVector(dataVector, columnIdentifiers);
	        jTable.setModel(model);
		} catch (NotBoundException | ClassNotFoundException | IOException | NumNotFoundException e) {
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}
        
        jTable.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable);
        
        accountLabel.setText("收款账号:");

        courierButton.setText("确定");
        courierButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courierButtonMouseClicked(evt);
            }
        });
        
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        
        checkAllRepsButton.setText("查看所有单据");
        checkAllRepsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	checkAllRepsButtonMouseClicked(evt);
            }
        });
        
        try {
			jComboBox = new JComboBox<String>(control.showBankAccount());
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}
        
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
				if(col==4){
					model.removeRow(row);
					jTable.setModel(model);
					sumText.setText(calSum());
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkAllRepsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(officeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(officeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(accountLabel)
                                    .addComponent(sumLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sumText, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(cancelButton)
                                        .addGap(91, 91, 91)
                                        .addComponent(okButton))
                                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(courierNumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courierNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courierButton)))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(resultMsgText)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(officeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel)
                            .addComponent(officeLabel)
                            .addComponent(checkAllRepsButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numLabel)
                    .addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courierNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courierNumLabel)
                    .addComponent(courierButton))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountLabel)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultMsgText))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setColumn(){
    	TableColumn column1 = jTable.getColumnModel().getColumn(0);
        column1.setPreferredWidth(60);
        TableColumn column2 = jTable.getColumnModel().getColumn(1);
        column2.setPreferredWidth(80);
        TableColumn column3 = jTable.getColumnModel().getColumn(2);
        column3.setPreferredWidth(50);
        TableColumn column4 = jTable.getColumnModel().getColumn(3);
        column4.setPreferredWidth(60);
        TableColumn column5 = jTable.getColumnModel().getColumn(4);
        column5.setPreferredWidth(50);
    }
    
    private String calSum(){
    	double sum = 0;
    	for(int i = 0;i < dataVector.size();i++){
    		sum += Double.parseDouble((String)jTable.getValueAt(i, 2));
    	}
    	return sum+"";
    }
    
    private void courierButtonMouseClicked(java.awt.event.MouseEvent evt) {
    	if(courierNumText.getText().equals("")){
    		resultMsgText.setText("请填写快递员编号");
    		return;
    	}
    	String courierNum = courierNumText.getText();
    	if(checkRepeat(courierNum)){
    		resultMsgText.setText("该快递员编号已填写");
    		return;
    	}
    	String resultMessage = control.checkNum(courierNum, 11, "快递员编号");
    	resultMsgText.setText(resultMessage);
    	if(!resultMessage.equals("添加成功")){
    		return;
    	}
    	String courierName = null;
    	double money;
		try {
			courierName = control.getCourierName(courierNum);
		} catch (ClassNotFoundException | NameNotFoundException | NumNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
			return;
		}
		ArrayList<GoodsVO> arrGoods = control.getGoods(courierNum, dateText.getText());
    	money = control.getMoneySum(arrGoods);
    	Vector<String> arr = new Vector<String>();
    	arr.add(courierName);
    	arr.add(courierNum);
    	arr.add(money+"");
    	arr.add(null);
    	dataVector.add(arr);
    	model.setDataVector(dataVector, columnIdentifiers);
    	setColumn();
    	sumText.setText(calSum());
    	courierNumText.setText("");
    }
    
    private void okMouseClicked(java.awt.event.MouseEvent evt) {
		String num = numText.getText();
		String date = dateText.getText();
		double sum = Double.parseDouble(sumText.getText());
		String bankAccount = (String)jComboBox.getSelectedItem();
    	try {
			control.addMoneyInBankAccount(bankAccount, sum);
		} catch (ClassNotFoundException | NumNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
			return;
		}
		ArrayList<CashVO> cashVOs = new ArrayList<CashVO>();
		for(int i = 0;i < dataVector.size();i++){
			CashVO vo = new CashVO(Double.parseDouble((String)jTable.getValueAt(i, 2)),
					(String)jTable.getValueAt(i, 1), 
					(String)jTable.getValueAt(i, 0), 
					(String)jTable.getValueAt(i, 3));
			cashVOs.add(vo);
		}
		CashRepVO cashRepVO = new CashRepVO(num, date, sum, (String)jComboBox.getSelectedItem(), cashVOs);
		try {
			control.submit(cashRepVO, officeText.getText());
		} catch (NotBoundException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
			return;
		}
		myFrame.dispose();
	}
    
    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {
    	myFrame.dispose();
    }
    
    private void checkAllRepsButtonMouseClicked(java.awt.event.MouseEvent evt) {
    	new CashCheck(officeText.getText());
    }
    
    /**返回true表示重复
     * @param num
     * @return
     */
    private boolean checkRepeat(String num){
    	for(int i = 0;i < dataVector.size();i++){
    		if(((String)jTable.getValueAt(i, 1)).equals(num)){
    			return true;
    		}
    	}
    	return false;
    }
    
}
