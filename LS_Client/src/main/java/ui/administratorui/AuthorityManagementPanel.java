/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.administratorui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;

import org.apache.xmlbeans.impl.jam.mutable.MClass;

import main.MainFrame;

/**
 *
 * @author G
 */
public class AuthorityManagementPanel extends javax.swing.JPanel {

    /**
     * Creates new form AuthorityManagementPanel
     */
    public AuthorityManagementPanel(JFrame frame,AdministratorPanel panel) {
    	this.amdministorPanel=panel;
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

    	
        jLabel9 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox104 = new javax.swing.JCheckBox();
        jCheckBox105 = new javax.swing.JCheckBox();
        jCheckBox106 = new javax.swing.JCheckBox();
        jCheckBox107 = new javax.swing.JCheckBox();
        jCheckBox108 = new javax.swing.JCheckBox();
        jCheckBox109 = new javax.swing.JCheckBox();
        jCheckBox110 = new javax.swing.JCheckBox();
        jCheckBox111 = new javax.swing.JCheckBox();
        jCheckBox112 = new javax.swing.JCheckBox();
        jCheckBox113 = new javax.swing.JCheckBox();
        jCheckBox114 = new javax.swing.JCheckBox();
        jCheckBox115 = new javax.swing.JCheckBox();
        jCheckBox116 = new javax.swing.JCheckBox();
        jCheckBox119 = new javax.swing.JCheckBox();
        jCheckBox120 = new javax.swing.JCheckBox();
        jCheckBox121 = new javax.swing.JCheckBox();
        jCheckBox122 = new javax.swing.JCheckBox();
        jCheckBox124 = new javax.swing.JCheckBox();
        jCheckBox125 = new javax.swing.JCheckBox();
        jCheckBox139 = new javax.swing.JCheckBox();
        jCheckBox141 = new javax.swing.JCheckBox();
        jCheckBox144 = new javax.swing.JCheckBox();
        back = new javax.swing.JButton();
        addIdentity = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        confirm = new javax.swing.JToggleButton();
        resultMsg = new JLabel();

        jLabel9.setText("当前账户：大玉儿");

        exit.setText("退出");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }

			
        });

        jCheckBox104.setText("输入订单");
        jCheckBox104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox104ActionPerformed(evt);
            }
        });

        jCheckBox105.setText("输入收件信息");

        jCheckBox106.setText("车辆装车管理");

        jCheckBox107.setText("接收");
        jCheckBox107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox107ActionPerformed(evt);
            }
        });

        jCheckBox108.setText("派件");
        jCheckBox108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox108ActionPerformed(evt);
            }
        });

        jCheckBox109.setText("建立收款单");
        jCheckBox109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox109ActionPerformed(evt);
            }
        });

        jCheckBox110.setText("车辆/司机信息管理");
        jCheckBox110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox110ActionPerformed(evt);
            }
        });

        jCheckBox111.setText("装运管理");
        jCheckBox111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox111ActionPerformed(evt);
            }
        });

        jCheckBox112.setText("中转接收");
        jCheckBox112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox112ActionPerformed(evt);
            }
        });

        jCheckBox113.setText("入库管理");
        jCheckBox113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox113ActionPerformed(evt);
            }
        });

        jCheckBox114.setText("库存管理");
        jCheckBox114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox114ActionPerformed(evt);
            }
        });

        jCheckBox115.setText("日志查看");
        jCheckBox115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox115ActionPerformed(evt);
            }
        });

        jCheckBox116.setText("出库管理");
        jCheckBox116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox116ActionPerformed(evt);
            }
        });

        jCheckBox119.setText("银行账户查看");
        jCheckBox119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox119ActionPerformed(evt);
            }
        });

        jCheckBox120.setText("审批单据");
        jCheckBox120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox120ActionPerformed(evt);
            }
        });

        jCheckBox121.setText("决策制定");
        jCheckBox121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox121ActionPerformed(evt);
            }
        });

        jCheckBox122.setText("银行账户管理");
        jCheckBox122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox122ActionPerformed(evt);
            }
        });

        jCheckBox124.setText("权限管理");
        jCheckBox124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox124ActionPerformed(evt);
            }
        });

        jCheckBox125.setText("账户管理");
        jCheckBox125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox125ActionPerformed(evt);
            }
        });

        jCheckBox139.setText("报表查看");
        jCheckBox139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox139ActionPerformed(evt);
            }
        });

        jCheckBox141.setText("人员/机构管理");
        jCheckBox141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox141ActionPerformed(evt);
            }
        });

        jCheckBox144.setText("收支管理");
        jCheckBox144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox144ActionPerformed(evt);
            }
        });

        back.setText("返回");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }

			
        });

        addIdentity.setText("添加一种身份");
        addIdentity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIdentityActionPerformed(evt);
            }

			
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "快递员", "营业厅营业员", "中转中心业务员", "中转中心仓库员", "财务人员", "高级财务人员", "总经理" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        confirm.setText("确认");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }

			
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox109)
                                    .addComponent(jCheckBox116)
                                    .addComponent(jCheckBox104))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox105)
                                    .addComponent(jCheckBox114)
                                    .addComponent(jCheckBox110)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox124)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox125))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox141)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox120))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox106)
                            .addComponent(jCheckBox111)
                            .addComponent(jCheckBox115)
                            .addComponent(jCheckBox121))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox112)
                                    .addComponent(jCheckBox107))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox113)
                                    .addComponent(jCheckBox108)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox139, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox144, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox119)
                                    .addComponent(jCheckBox122))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(addIdentity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(back))
                            .addComponent(confirm, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(resultMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(346, 346, 346))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(addIdentity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox104)
                    .addComponent(jCheckBox105)
                    .addComponent(jCheckBox106)
                    .addComponent(jCheckBox107)
                    .addComponent(jCheckBox108))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox109)
                    .addComponent(jCheckBox110)
                    .addComponent(jCheckBox111)
                    .addComponent(jCheckBox112)
                    .addComponent(jCheckBox113)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox114)
                    .addComponent(jCheckBox115)
                    .addComponent(jCheckBox116)
                    .addComponent(jCheckBox119)
                    .addComponent(jCheckBox139))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox120)
                    .addComponent(jCheckBox122)
                    .addComponent(jCheckBox121)
                    .addComponent(jCheckBox141)
                    .addComponent(jCheckBox144))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox124)
                    .addComponent(jCheckBox125))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(confirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(40, 40, 40)
                        .addComponent(exit)
                        .addGap(9, 9, 9))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   
    protected void confirmActionPerformed(ActionEvent evt) {
		//TODO
	}
    
	/**
	 * @param evt
	 */
	protected void addIdentityActionPerformed(ActionEvent evt) {
		AuthorAddIdentityPanel add = new AuthorAddIdentityPanel(amdministorPanel);
		add.setVisible(true);
		this.frame.dispose();
	}

	/**
	 * @param evt
	 */
	protected void backActionPerformed(ActionEvent evt) {
		AdministratorPanel ap = new AdministratorPanel();
		ap.setVisible(true);
		this.frame.dispose();
	}

	private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    	MainFrame  mf = new MainFrame();
    	mf.setVisible(true);
    	this.frame.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox144ActionPerformed
    }//GEN-LAST:event_jCheckBox144ActionPerformed

    private void jCheckBox141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox141ActionPerformed
    }//GEN-LAST:event_jCheckBox141ActionPerformed

    private void jCheckBox139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox139ActionPerformed
    }//GEN-LAST:event_jCheckBox139ActionPerformed

    private void jCheckBox125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox125ActionPerformed
    }//GEN-LAST:event_jCheckBox125ActionPerformed

    private void jCheckBox124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox124ActionPerformed
    }//GEN-LAST:event_jCheckBox124ActionPerformed

    private void jCheckBox122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox122ActionPerformed
    }//GEN-LAST:event_jCheckBox122ActionPerformed

    private void jCheckBox121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox121ActionPerformed
    }//GEN-LAST:event_jCheckBox121ActionPerformed

    private void jCheckBox120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox120ActionPerformed
    }//GEN-LAST:event_jCheckBox120ActionPerformed

    private void jCheckBox119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox119ActionPerformed
    }//GEN-LAST:event_jCheckBox119ActionPerformed

    private void jCheckBox116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox116ActionPerformed
    }//GEN-LAST:event_jCheckBox116ActionPerformed

    private void jCheckBox115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox115ActionPerformed
    }//GEN-LAST:event_jCheckBox115ActionPerformed

    private void jCheckBox114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox114ActionPerformed
    }//GEN-LAST:event_jCheckBox114ActionPerformed

    private void jCheckBox113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox113ActionPerformed
    }//GEN-LAST:event_jCheckBox113ActionPerformed

    private void jCheckBox112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox112ActionPerformed
    }//GEN-LAST:event_jCheckBox112ActionPerformed

    private void jCheckBox111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox111ActionPerformed
    }//GEN-LAST:event_jCheckBox111ActionPerformed

    private void jCheckBox110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox110ActionPerformed
    }//GEN-LAST:event_jCheckBox110ActionPerformed

    private void jCheckBox109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox109ActionPerformed
    }//GEN-LAST:event_jCheckBox109ActionPerformed

    private void jCheckBox108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox108ActionPerformed
    }//GEN-LAST:event_jCheckBox108ActionPerformed

    private void jCheckBox107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox107ActionPerformed
    }//GEN-LAST:event_jCheckBox107ActionPerformed

    private void jCheckBox104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox104ActionPerformed
    }//GEN-LAST:event_jCheckBox104ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private AdministratorPanel amdministorPanel;
    private JFrame frame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton exit;
    private javax.swing.JButton addIdentity;
    private javax.swing.JCheckBox jCheckBox104;
    private javax.swing.JCheckBox jCheckBox105;
    private javax.swing.JCheckBox jCheckBox106;
    private javax.swing.JCheckBox jCheckBox107;
    private javax.swing.JCheckBox jCheckBox108;
    private javax.swing.JCheckBox jCheckBox109;
    private javax.swing.JCheckBox jCheckBox110;
    private javax.swing.JCheckBox jCheckBox111;
    private javax.swing.JCheckBox jCheckBox112;
    private javax.swing.JCheckBox jCheckBox113;
    private javax.swing.JCheckBox jCheckBox114;
    private javax.swing.JCheckBox jCheckBox115;
    private javax.swing.JCheckBox jCheckBox116;
    private javax.swing.JCheckBox jCheckBox119;
    private javax.swing.JCheckBox jCheckBox120;
    private javax.swing.JCheckBox jCheckBox121;
    private javax.swing.JCheckBox jCheckBox122;
    private javax.swing.JCheckBox jCheckBox124;
    private javax.swing.JCheckBox jCheckBox125;
    private javax.swing.JCheckBox jCheckBox139;
    private javax.swing.JCheckBox jCheckBox141;
    private javax.swing.JCheckBox jCheckBox144;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton confirm;
    private JLabel resultMsg;
    
    // End of variables declaration//GEN-END:variables
}
