/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.receiptui;

/**
 *
 * @author apple
 */
public class AddInstitution extends .JPanel {

    /**
     * Creates new form 增加机构
     */
    public AddInstitution() {
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

        jLabel1 = new .JLabel();
        jTextField1 = new .JTextField();
        jLabel2 = new .JLabel();
        jScrollPane1 = new .JScrollPane();
        jTextArea1 = new .JTextArea();
        jLabel3 = new .JLabel();
        jTextField2 = new .JTextField();
        jLabel4 = new .JLabel();
        jTextField3 = new .JTextField();
        jScrollPane2 = new .JScrollPane();
        jTable1 = new .JTable();
        jButton1 = new .JButton();
        jButton2 = new .JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("机构编号:");

        jTextField1.setEditable(false);

        jLabel2.setText("机构地点:");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("联系方式:");

        jLabel4.setText("人员组成:");

        jTextField3.setText("人数");

        jTable1.setModel(new .table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "编号", "地点", "联系方式", "人员"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("取消");

        jButton2.setText("确认");

        .GroupLayout layout = new .GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, .GroupLayout.PREFERRED_SIZE, 82, .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, .GroupLayout.PREFERRED_SIZE, 105, .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, .GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, .GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(90, 90, 90)
                .addComponent(jButton2)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, .GroupLayout.PREFERRED_SIZE, 46, .GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, .GroupLayout.PREFERRED_SIZE, .GroupLayout.DEFAULT_SIZE, .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, .GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addPreferredGap(.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private .JButton jButton1;
    private .JButton jButton2;
    private .JLabel jLabel1;
    private .JLabel jLabel2;
    private .JLabel jLabel3;
    private .JLabel jLabel4;
    private .JScrollPane jScrollPane1;
    private .JScrollPane jScrollPane2;
    private .JTable jTable1;
    private .JTextArea jTextArea1;
    private .JTextField jTextField1;
    private .JTextField jTextField2;
    private .JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
