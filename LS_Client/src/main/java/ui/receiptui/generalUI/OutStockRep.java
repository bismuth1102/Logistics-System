/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.receiptui.generalUI;

import java.awt.Color;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import Exception.NumNotFoundException;
import VO.StockVO;
import VO.ReceiptVO.OutStockRepVO;
import VO.ReceiptVO.ShippingRepVO;
import VO.ReceiptVO.TransferRepVO;
import bl.controllerfactorybl.ControllerFactoryImpl;
import bl.loginbl.LoginblController;
import blservice.receiptblservice.OutStockRepblService;
import blservice.receiptblservice.ShippingRepblService;
import blservice.receiptblservice.TransferRepblService;
import ui.warehousemanui.WarehousePanel;
import util.CurrentCity;
import util.CurrentTime;
import util.enumData.City;
import util.enumData.ResultMessage;
import util.enumData.ShipForm;

/**
 *
 * @author apple, G
 */
public class OutStockRep extends javax.swing.JPanel {
	OutStockRepblService o = ControllerFactoryImpl.getInstance().getOutStockRepblService();
    TransferRepblService t = ControllerFactoryImpl.getInstance().getTransferRepblService();
    ShippingRepblService s = ControllerFactoryImpl.getInstance().getShippingRepblService();
    /**
     * Creates new form OutStockRep
     */
    public OutStockRep(JFrame frame) {
    	this.frame = frame;
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
         listsTable = new javax.swing.JTable();
         okButton = new javax.swing.JButton();
         cancelButton = new javax.swing.JButton();
         destinationText = new javax.swing.JTextField();
         resultMessage = new javax.swing.JTextField();
         checkAllRepsButton = new javax.swing.JButton();
         
       

         listsTable.setModel(new javax.swing.table.DefaultTableModel(
                 new Object [20][] 
                         ,
                     new String [] {
                        "订单号"
                     }
                 ) {
         			/**
         			 * 
         			 */
         			private static final long serialVersionUID = 1L;
         			boolean[] canEdit = new boolean [] {
                         false, false, false, false, false, false
                     };

                     public boolean isCellEditable(int rowIndex, int columnIndex) {
                         return canEdit [columnIndex];
                     }
                 });
         jScrollPane1.setViewportView(listsTable);
         
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
			 //前三位
			 repNum = s.substring(0, 3);
			 //中转中心编号
			 String tranString = "000";
			 repNum += tranString;
			 //8位日期+5
			 String date = CurrentTime.getDate();
			 String tempdate = date.replaceAll("-", "");
			 repNum += tempdate;
			 repNum += 5;
			 //4位顺序编号
			 //TODO 这个方法有问题，没能执行过去	
			 String number = o.createNum(date);	
			 repNum += number;
		} catch (RemoteException e) {
			numText.setText("远程错误未能得到当前账号");
		} catch (ClassNotFoundException e) {
			numText.setText("远程错误未能得到当前账号");
		} catch (NotBoundException e) {
			numText.setText("远程错误未能得到当前账号");
		} catch (IOException e) {
			numText.setText("远程错误未能得到当前账号");
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

         listsTable.setModel(new javax.swing.table.DefaultTableModel(
                 new Object [20][] 
                     ,
                 new String [] {
                     "订单号"
                 }
             ) {
     			/**
     			 * 
     			 */
     			private static final long serialVersionUID = 1L;
     			boolean[] canEdit = new boolean [] {
                     false, false, false, false, false, false
                 };

                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                     return canEdit [columnIndex];
                 }
             });
         listsTable.setGridColor(new java.awt.Color(0, 0, 0));
         jScrollPane1.setViewportView(listsTable);

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

         resultMessage.setEditable(false);

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
             .addComponent(resultMessage)
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
                 .addComponent(resultMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
         );
     }// </editor-fold>//GEN-END:initComponents

     private void numTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTextActionPerformed
    	 //这些都不用管
     }//GEN-LAST:event_numTextActionPerformed

     private void repTypeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repTypeTextActionPerformed
    	 //这些都不用管
		
     }//GEN-LAST:event_repTypeTextActionPerformed

     private void checkAllRepsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllRepsButtonActionPerformed
    	 //TODO 查看单据
     }//GEN-LAST:event_checkAllRepsButtonActionPerformed

     private void repTypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repTypeBoxActionPerformed
    	 //这些都不用管
     }//GEN-LAST:event_repTypeBoxActionPerformed

     private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
    	 WarehousePanel w = new WarehousePanel();
    	 w.setVisible(true);
    	 this.frame.dispose();
     }//GEN-LAST:event_cancelButtonActionPerformed

     private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
    	 //1.先判断输入是否符合19位数字
    	ResultMessage rm = o.checkNum(repTypeText.getText(), 19);
    	
    	switch (rm) {
		case REPNUM_LENGTH_LACKING:			
		case REPNUM_LENGTH_OVER:
		case REPNUM_NOT_ALL_NUM:
			showFeedback(rm, "输入编号");
			break;
		case ADD_SUCCESS:
			//2.再看在中转单或是中转中心装车单中是否可以找到它
			if (repTypeBox.getSelectedIndex() == 0) {
				try {					
					TransferRepVO vo = t.getRepByNum(repTypeText.getText());
										
					if (vo == null) {
						showFeedback(null, "该中转单编号不存在");
						break;
					}
					//3.在表格中显示信息
					ArrayList<String> list = vo.goods;
					int length =list.size();
					Object[][] showObjects = new Object[length][1];
					int count = 0;
					
					for (String listNum : list) {

				    	showObjects[count][0] = listNum;
				    	
				    	++count;

			    	}
			    	
			    	
			    	listsTable.setModel(new DefaultTableModel(
			               showObjects
			                    ,
			                new String [] {
			                    "订单号"
			                }
			            ) {
			                /**
							 * 
							 */
							private static final long serialVersionUID = 1L;
							boolean[] canEdit = new boolean [] {
			                    false, false, false, false, false, false
			                };

			                public boolean isCellEditable(int rowIndex, int columnIndex) {
			                    return canEdit [columnIndex];
			                }
			            });
			    	//TODO 这里有疑问
					//4.存入新的出库单，submit自动update库存那边
//			    	OutStockRepVO outStockRepVO = new OutStockRepVO(repNum, CurrentTime.getDate(), vo.city, vo.form, rep?!!, vo.carNum, vo.goods);
			    	//submit是保存吗？
//			    	o.submit(outStockRepVO);
			    	
			
			    	destinationText.setText(City.toString(vo.city));
					shipForm.setText(ShipForm.toFrendlyString(vo.form));
					showFeedback(rm, "输入编号");
				} catch (ClassNotFoundException | NotBoundException
						| IOException e) {
					showFeedback(ResultMessage.REMOTE_FAILED, "");
					destinationText.setText("未知");
					shipForm.setText("未知");
				} catch (NumNotFoundException e) {
					showFeedback(ResultMessage.NOT_FOUND, "");
					destinationText.setText("未知");
					shipForm.setText("未知");
				}
			} else if (repTypeBox.getSelectedIndex() == 1) {
				try {
					ShippingRepVO vo = s.getRepByNum(repTypeText.getText());

			
				
					if (vo == null) {
						showFeedback(null, "该中转中心装车单编号不存在");
						break;
					}
					//3.在表格中显示信息
					ArrayList<String> list = vo.goods;
					int length =list.size();
					Object[][] showObjects = new Object[length][1];
					int count = 0;
					
					for (String listNum : list) {

				    	showObjects[count][0] = listNum;
				    	
				    	++count;

			    	}
			    	
			    	
					listsTable.setModel(new javax.swing.table.DefaultTableModel(
			                 showObjects 
			                         ,
			                     new String [] {
			                        "订单号"
			                     }
			                 ) {
			         			/**
			         			 * 
			         			 */
			         			private static final long serialVersionUID = 1L;
			         			boolean[] canEdit = new boolean [] {
			                         false, false, false, false, false, false
			                     };

			                     public boolean isCellEditable(int rowIndex, int columnIndex) {
			                         return canEdit [columnIndex];
			                     }
			                 });
					//TODO
					//4.存入新的出库单，commit自动update库存那边，问题同上
//			    	OutStockRepVO outStockRepVO = new OutStockRepVO(repNum, CurrentTime.getDate(), vo.destination, "", rep?!!, "？！这里是什么", vo.goods);
			    	//submit是保存吗？
//			    	o.submit(outStockRepVO);
			    	
			    	//TODO  这里的vo.destination的类型应该改成City
//					destinationText.setText(vo.destination);
					shipForm.setText("--");
					showFeedback(rm, "输入编号");
				} catch (ClassNotFoundException | NotBoundException
						| IOException e) {
					destinationText.setText("未知");
					shipForm.setText("--");
					showFeedback(ResultMessage.REMOTE_FAILED, "");
				} catch (NumNotFoundException e) {
					showFeedback(ResultMessage.NOT_FOUND, "");
					destinationText.setText("未知");
					shipForm.setText("--");
				}
			}
			
			break;

		default:
			break;
		}
     }//GEN-LAST:event_okButtonActionPerformed

     private void showFeedback(ResultMessage msg, String operation) {
     	
    	
    	 
     	if (msg.equals(ResultMessage.ADD_SUCCESS)) {
     		this.resultMessage.setForeground(Color.GREEN);
 		} else {
 			this.resultMessage.setForeground(Color.RED);
 		}
     	
     	this.resultMessage.setText(operation + ResultMessage.toFriendlyString(msg));
 	}

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton cancelButton;
     private javax.swing.JButton checkAllRepsButton;
     private javax.swing.JLabel dateLabel;
     private javax.swing.JTextField dateText;
     private javax.swing.JLabel destinationLabel;
     private javax.swing.JTextField destinationText;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTable listsTable;
     private javax.swing.JLabel numLabel;
     private javax.swing.JTextField numText;
     private javax.swing.JLabel officeLabel;
     private javax.swing.JTextField officeText;
     private javax.swing.JButton okButton;
     private javax.swing.JComboBox repTypeBox;
     private javax.swing.JLabel repTypeLabel;
     private javax.swing.JTextField repTypeText;
     private javax.swing.JTextField resultMessage;
     private javax.swing.JTextField shipForm;
     private javax.swing.JLabel shipFormLabel;
     private String repNum;
     private JFrame frame;
 
     // End of variables declaration//GEN-END:variables
 }
