/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.receiptui.generalUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Exception.ExceptionPrint;
import Exception.NameNotFoundException;
import Exception.NumNotFoundException;
import VO.Receipt.PayRefundVO;
import VO.Receipt.PayRepRefundRepVO;
import VO.Receipt.PayRepVO;
import bl.receiptbl.PayRepbl.PayRepRefundController;
import blservice.receiptblservice.PayRepRefundblService;
import ui.util.MyFrame;
import util.enumData.ResultMessage;

/**
 *
 * @author apple
 */
public class PayRepRefund extends javax.swing.JPanel {

    // Variables declaration - do not modify//GEN-BEGIN:variables
	private MyFrame myFrame;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JTextField balanceText;
    private javax.swing.JComboBox<String> bankAccountBox;
    private javax.swing.JLabel bankAccountLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JTextField moneyText;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel reasonLabel;
    private javax.swing.JTextArea reasonText;
    private javax.swing.JTextField resultMsgText;
    private javax.swing.JLabel sumLabel;
    private javax.swing.JTextField sumText;
    private PayRepRefundblService control;
    private DefaultTableModel model;
    private Vector<String> columnIdentifiers;
    private Vector<Object> dataVector;
    private PayRepVO payRepVO;
    private PayRep payRep;
    private String bankAccount;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form PayRep付款项
     */ 
    public PayRepRefund(PayRep oriPayRep, PayRepVO oriPayRepVO, String bank) {
        payRepVO = oriPayRepVO;
        payRep = oriPayRep;
        bankAccount = bank;
        initComponents();
        myFrame = new MyFrame(627, 355, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reasonLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reasonText = new javax.swing.JTextArea();
        moneyLabel = new javax.swing.JLabel();
        moneyText = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        sumLabel = new javax.swing.JLabel();
        sumText = new javax.swing.JTextField();
        bankAccountLabel = new javax.swing.JLabel();
        bankAccountBox = new javax.swing.JComboBox<String>();
        balanceLabel = new javax.swing.JLabel();
        balanceText = new javax.swing.JTextField();
        resultMsgText = new javax.swing.JTextField();
        control = new PayRepRefundController();
        columnIdentifiers = new Vector<String>();
        dataVector = new Vector<Object>();
		model = new DefaultTableModel(dataVector, columnIdentifiers) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
        
        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");

        reasonLabel.setText("付款原因:");

        reasonText.setColumns(20);
        reasonText.setLineWrap(true);
        reasonText.setRows(3);
        jScrollPane1.setViewportView(reasonText);

        moneyLabel.setText("金额:");

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

        addButton.setText("添加");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        columnIdentifiers.add("金额");
        columnIdentifiers.add("付款原因");
        columnIdentifiers.add("删除");
        dataVector = control.initRefundTable(payRepVO, control.getDate());
        model.setDataVector(dataVector, columnIdentifiers);
        jTable.setModel(model);
        jTable.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTable);

        sumLabel.setText("总计:");

        sumText.setEditable(false);

        bankAccountLabel.setText("付款账户:");

        try {
			bankAccountBox = new JComboBox<String>(control.showBankAccount());
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
		}
		if (bankAccount != null) {
			bankAccountBox.setEnabled(false);
			for (int i = 0; i < bankAccountBox.getItemCount(); i++) {
				if (bankAccountBox.getItemAt(i).equals(bankAccount)) {
					bankAccountBox.setSelectedIndex(i);
					double balance = 0;
					try {
						balance = control.showBankBalance(bankAccount);
					} catch (ClassNotFoundException | NameNotFoundException | IOException | NumNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						resultMsgText.setText(ExceptionPrint.print(e));
					}
					balanceText.setText(balance+"");
					break;
				}
			}
		}
		bankAccountBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bankAccountBoxActionPerformed(evt);
			}
		});
        
        balanceLabel.setText("账户余额:");

        balanceText.setEditable(false);

        resultMsgText.setEditable(false);
        
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
				if(col==2){
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
            .addComponent(resultMsgText)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(moneyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moneyText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(addButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reasonLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bankAccountLabel)
                            .addComponent(sumLabel)
                            .addComponent(balanceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bankAccountBox, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sumText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(48, 48, 48)
                .addComponent(okButton)
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reasonLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moneyLabel)
                            .addComponent(moneyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bankAccountLabel)
                            .addComponent(bankAccountBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(balanceLabel)
                            .addComponent(balanceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
        column1.setPreferredWidth(60);
        TableColumn column2 = jTable.getColumnModel().getColumn(1);
        column2.setPreferredWidth(300);
        TableColumn column3 = jTable.getColumnModel().getColumn(2);
        column3.setPreferredWidth(50);
    }
    
    private String calSum(){
    	double sum = 0;
    	for(int i = 0;i < dataVector.size();i++){
    		sum += Double.parseDouble((String)jTable.getValueAt(i, 0));
    	}
    	return sum+"";
    }

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	double sum = Double.parseDouble(sumText.getText());
		double balance = Double.parseDouble(balanceText.getText());
		if(sum>balance){
			resultMsgText.setText("付款金额超过账户余额，请更换账户");
			return;
		}
    	String bankAccount = (String)bankAccountBox.getSelectedItem();
    	try {
			control.minusMoneyInBankAccount(bankAccount, sum);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
			return;
		} catch (NumNotFoundException e) {
			// TODO Auto-generated catch block
			resultMsgText.setText(ExceptionPrint.print(e));
			return;
		}
    	ArrayList<PayRefundVO> payRefundVOs = new ArrayList<PayRefundVO>();
    	for(int i = 0;i < dataVector.size();i++){
    		PayRefundVO payRefundVO = new PayRefundVO((String)jTable.getValueAt(i, 1), 
    				Double.parseDouble((String)jTable.getValueAt(i, 0)));
    		payRefundVOs.add(payRefundVO);
    	}
    	PayRepRefundRepVO payRepRefundRepVO = 
    			new PayRepRefundRepVO(sum, control.getDate(), payRefundVOs, bankAccount);
    	payRep.deleteRow("退款" + "(" + control.getDate() + ")");
    	control.submitRefund(payRepVO, payRepRefundRepVO);
    	Vector<String> arr = new Vector<String>();
    	arr.add("退款" + "(" + control.getDate() + ")");
    	arr.add(sum+"");
    	arr.add(bankAccount);
    	payRep.createRow(arr);
    	myFrame.dispose();
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	myFrame.dispose();
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	resultMsgText.setText("");
    	if(moneyText.getText().equals("")){
    		resultMsgText.setText("请填写付款原因");
    		return;
    	}
    	if(moneyText.getText().equals("")){
    		resultMsgText.setText("请填写付款金额");
    		return;
    	}
    	double money = Double.parseDouble(moneyText.getText());
    	ResultMessage resultMessage = control.checkMoney(money);
    	resultMsgText.setText(ResultMessage.toFriendlyString(resultMessage));
    	if(resultMessage==ResultMessage.ADD_SUCCESS){
        	String reason = reasonText.getText();
        	Vector<String> arr = new Vector<String>();
        	arr.add(money+"");
        	arr.add(reason);
        	dataVector.add(arr);
        	model.setDataVector(dataVector, columnIdentifiers);
    		setColumn();
    		sumText.setText(calSum());
    		reasonText.setText("");
    		moneyText.setText("");
    	}
    }
    
	private void bankAccountBoxActionPerformed(java.awt.event.ActionEvent evt){
		resultMsgText.setText("");
		String bankAccount = (String)bankAccountBox.getSelectedItem();
		double balance = 0;
		try {
			balance = control.showBankBalance(bankAccount);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMsgText.setText(ExceptionPrint.print(e));
			return;
		} catch (NameNotFoundException | NumNotFoundException e) {
			// TODO Auto-generated catch block
			resultMsgText.setText(ExceptionPrint.print(e));
			return;
		}
		balanceText.setText(balance+"");
	}

}
