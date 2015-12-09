/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.receiptui.generalUI;

import java.awt.Color;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import Exception.NumNotFoundException;
import VO.StockDivisionVO;
import VO.StockVO;
import VO.ReceiptVO.ShippingRepVO;
import VO.ReceiptVO.TransferRepVO;
import bl.controllerfactorybl.ControllerFactoryImpl;
import bl.loginbl.LoginblController;
import bl.stockbl.Stock;
import blservice.receiptblservice.InStockRepblService;
import blservice.stockblservice.StockBLService;
import blservice.stockblservice.StockDivisionBLService;
import ui.warehousemanui.WarehousePanel;
import util.CurrentCity;
import util.CurrentTime;
import util.FromIntToCity;
import util.enumData.City;
import util.enumData.ResultMessage;
import util.enumData.ShipForm;

/**
 *
 * @author apple
 */
public class InStockRep extends javax.swing.JPanel {
	StockDivisionBLService s = ControllerFactoryImpl.getInstance().getStockDivisionController();
	InStockRepblService i = ControllerFactoryImpl.getInstance().getInStockRepblService();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private String repNum;
	private JFrame frame; 
	/**
	 * 暂时储存添加在表中却没有存入数据层的区位号
	 */
	private ArrayList<StockDivisionVO> templist;
	private javax.swing.JButton addButton;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JTextField areaText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton checkAllRepsButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel locLabel;
    private javax.swing.JTextField locText;
    private javax.swing.JLabel numLabel;
    private javax.swing.JTextField numText;
    private javax.swing.JLabel officeLabel;
    private javax.swing.JTextField officeText;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel orderLabel;
    private javax.swing.JTextField orderText;
    private javax.swing.JTextField resultMessage;
    
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form InStockRep
     */
    public InStockRep(JFrame frame) {
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
    	this.setSize(500, 330);
    	
    	this.setVisible(true);

    	templist = new ArrayList<StockDivisionVO>();
        dateText = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        officeText = new javax.swing.JTextField();
        officeLabel = new javax.swing.JLabel();
        numLabel = new javax.swing.JLabel();
        numText = new javax.swing.JTextField();
        areaLabel = new javax.swing.JLabel();
        areaText = new javax.swing.JTextField();
        locLabel = new javax.swing.JLabel();
        locText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        orderLabel = new javax.swing.JLabel();
        orderText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        resultMessage = new javax.swing.JTextField();
        checkAllRepsButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [30][] 
                        ,
                    new String [] {
                       "订单号","区号","位号"
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
        jScrollPane1.setViewportView(jTable1);
        

        dateText.setEditable(false);
        dateText.setText(CurrentTime.getDate());

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
			 repNum += 2;
			 //4位顺序编号
			 //TODO 这个方法有问题，没能执行过去	
			 String number = i.createNum(date);			
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
        
        

        areaLabel.setText("区号:");

        locLabel.setText("位号:");
        locText.setEditable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "订单号", "区号", "位号"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        orderLabel.setText("订单号:");

        addButton.setText("添加");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					addButtonActionPerformed(evt);
				} catch (NotBoundException | IOException e) {
					showFeedback(ResultMessage.REMOTE_FAILED, "");
				}
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
            .addComponent(resultMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(checkAllRepsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(officeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(officeText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelButton)
                                .addGap(18, 18, 18)
                                .addComponent(okButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(areaLabel)
                                    .addComponent(orderLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orderText, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(areaText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(locLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(locText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(26, 26, 26)
                        .addComponent(addButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel)
                            .addComponent(officeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(officeLabel)
                            .addComponent(checkAllRepsButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numLabel)
                            .addComponent(numText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(orderLabel)
                        .addComponent(orderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areaLabel)
                            .addComponent(areaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locLabel)
                            .addComponent(locText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(resultMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkAllRepsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllRepsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAllRepsButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) throws MalformedURLException, RemoteException, NotBoundException, IOException {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    	
    	//1.首先判断订单号是否符合10位数字
    	ResultMessage rm = i.checkNum(orderText.getText(), 10);
    	
    	
    	switch (rm) {
		case REPNUM_LENGTH_LACKING:			
		case REPNUM_LENGTH_OVER:
		case REPNUM_NOT_ALL_NUM:
			showFeedback(rm, "输入订单号");
			break;
		case ADD_SUCCESS:
			//2.得到用户输入的区号,将其转化成城市传给库存，让库存给出这个区的空余地方防入templist
			//  ,然后每次从templist中得到第一个提供给用户，然后从templist中删除它，如果某次templist
			//  空了，那么就应该提醒用户该区已满，请换区
			String inputarea = areaText.getText();
			boolean isNumber = true;
			for(int i = 0;i<inputarea.length();i++){
				if(inputarea.charAt(i)<'0'||inputarea.charAt(i)>'9')
					isNumber = false;
					showFeedback(ResultMessage.REPNUM_NOT_ALL_NUM,"输入区号");
			}
			int area = 0;
			if (isNumber) {
				area = Integer.parseInt(inputarea);
				if (area>=1&&area<=8) {
					//TODO 
					//转化成城市
					City city = FromIntToCity.toCity(area);
					ArrayList<StockDivisionVO> list = s.getBlock(city);
					
					
					
					if (list.size()>0) {
						
						int i = 0;
						//循环至找到一个不在templist中的区位
						while (list.get(i) != null) {
							for (int j = 0; j < templist.size(); j++) {
								if (isNumber) {
									
								}
							}
							
						}
						StockDivisionVO vo = templist.get(0);
						
						locText.setText(vo.place+"");
					} else {
						showFeedback(null, "该区已满，请换区");
					}
					
//					if (templist.size()>0) {
//						StockDivisionVO vo = templist.get(0);
//						
//						locText.setText(vo.place+"");
//					} else {
//						showFeedback(null, "该区已满，请换区");
//					}
					
				} else {
					showFeedback(null, "区号请输入1~8正整数");
				}
			} else {
				showFeedback(null, "区号请输入1~8正整数");
			}
			
			break;

		default:
			break;
		}
    }//GEN-LAST:event_addButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
    	 WarehousePanel w = new WarehousePanel();
    	 w.setVisible(true);
    	 this.frame.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void showFeedback(ResultMessage msg, String operation) {
     	
   	
   	 
    	if (msg.equals(ResultMessage.ADD_SUCCESS)) {
    		this.resultMessage.setForeground(Color.GREEN);
		} else {
			this.resultMessage.setForeground(Color.RED);
		}
    	
    	this.resultMessage.setText(operation + ResultMessage.toFriendlyString(msg));
	}
}
