/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.PlainDocument;
import math.Convert;
import math.ConvertException;

/**
 * Class creates the GUI using swing
 *
 * @author Kacper Nitkiewicz
 * @version 1.0
 */
public class JFrameGUI extends javax.swing.JFrame implements ActionListener {

    // Veriables used in program
    protected boolean isHexToDec = true;
    Convert convert = new Convert();
    // Arrays can't be casted to Vectors or lists because they are used in
    // DefaultTableModel constructor with arrays
    private final String[] columnNames = { "Given number", "Converted number", "Type of conversion" };
    private final Object[][] rowValues = new Object[][] {};
    private DefaultTableModel model = new DefaultTableModel(rowValues, columnNames);

    /**
     * Creates new form JFrameGUI
     */
    public JFrameGUI() {
        initComponents();
        initListener();
    }

    /**
     * Adds listener to JFrameGUI
     */
    private void initListener() {
        hexButton.addActionListener(this);
        decButton.addActionListener(this);
        calculateButton.addActionListener(this);
    }

    /**
     * Method initializes every object that appears in the program this is
     * generated automaticly by Desing
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        multiTab = new javax.swing.JTabbedPane();
        jPanelConverter = new javax.swing.JPanel();
        hexButton = new javax.swing.JButton();
        decButton = new javax.swing.JButton();
        insertNumLabel = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        insertPane = new javax.swing.JTextPane();
        jPanelHistory = new javax.swing.JPanel();
        historyTab = new javax.swing.JScrollPane();
        jTableHistory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Converter Hex/Dec");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(700, 400));
        setMaximumSize(new java.awt.Dimension(1440, 720));
        setMinimumSize(new java.awt.Dimension(340, 350));

        multiTab.setToolTipText("");
        multiTab.setMaximumSize(new java.awt.Dimension(1920, 1080));

        jPanelConverter.setToolTipText("Converter Window");

        hexButton.setMnemonic('H');
        hexButton.setText("Hex to Dec");
        hexButton.setToolTipText("Converts Hexadecimal to Decimal number");
        hexButton.setEnabled(false);

        decButton.setMnemonic('D');
        decButton.setText("Dec to Hex");
        decButton.setToolTipText("Converts Decimal to Hexadecimal  number");

        insertNumLabel.setText("Insert number");

        calculateButton.setMnemonic('C');
        calculateButton.setText("Calculate");
        calculateButton.setActionCommand("calculateButton");

        insertPane.setToolTipText("Insert a number hex or dec");
        jScrollPane1.setViewportView(insertPane);

        javax.swing.GroupLayout jPanelConverterLayout = new javax.swing.GroupLayout(jPanelConverter);
        jPanelConverter.setLayout(jPanelConverterLayout);
        jPanelConverterLayout.setHorizontalGroup(
                jPanelConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelConverterLayout.createSequentialGroup()
                                .addContainerGap(38, Short.MAX_VALUE)
                                .addComponent(hexButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(decButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 50, Short.MAX_VALUE))
                        .addGroup(jPanelConverterLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelConverterLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanelConverterLayout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(insertNumLabel))
                                        .addGroup(jPanelConverterLayout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanelConverterLayout.setVerticalGroup(
                jPanelConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConverterLayout
                                .createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(insertNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25,
                                        Short.MAX_VALUE)
                                .addGroup(jPanelConverterLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hexButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(decButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 17, Short.MAX_VALUE)));

        multiTab.addTab("Converter", jPanelConverter);
        jPanelConverter.getAccessibleContext().setAccessibleName("Converter");

        jTableHistory.setModel(model);
        jTableHistory.setFillsViewportHeight(true);
        jTableHistory.setName("Table"); // NOI18N
        jTableHistory.setShowGrid(true);
        historyTab.setViewportView(jTableHistory);

        javax.swing.GroupLayout jPanelHistoryLayout = new javax.swing.GroupLayout(jPanelHistory);
        jPanelHistory.setLayout(jPanelHistoryLayout);
        jPanelHistoryLayout.setHorizontalGroup(
                jPanelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelHistoryLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(historyTab, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                .addContainerGap()));
        jPanelHistoryLayout.setVerticalGroup(
                jPanelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelHistoryLayout.createSequentialGroup()
                                .addComponent(historyTab, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addContainerGap()));

        multiTab.addTab("History", jPanelHistory);
        jPanelHistory.getAccessibleContext().setAccessibleName("History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(multiTab, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(multiTab, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

        multiTab.getAccessibleContext().setAccessibleName("Chooser");
        multiTab.getAccessibleContext().setAccessibleDescription(" ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Main method that runs the program
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton decButton;
    private javax.swing.JButton hexButton;
    private javax.swing.JScrollPane historyTab;
    private javax.swing.JLabel insertNumLabel;
    protected javax.swing.JTextPane insertPane;
    private javax.swing.JPanel jPanelConverter;
    private javax.swing.JPanel jPanelHistory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHistory;
    private javax.swing.JTabbedPane multiTab;
    // End of variables declaration//GEN-END:variables

    /**
     * Reacts to buttons that were pressed first if works on Hex to Dec button
     * second works on Dec to Hex button last is calculateButton which gives
     * result and adds history in second tab
     *
     * @param e event of Action made in program
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Hex to Dec")) {
            hexButton.setEnabled(false);
            decButton.setEnabled(true);
            isHexToDec = true;
        }

        if (e.getActionCommand().equals("Dec to Hex")) {
            hexButton.setEnabled(true);
            decButton.setEnabled(false);
            isHexToDec = false;
        }

        if (e.getActionCommand().equals("calculateButton")) {
            String result = "";
            try {
                if (isHexToDec == true) {
                    result = convert.hexToDec(insertPane.getText());
                    JOptionPane.showMessageDialog(null, "Result of conversion hex to dec: " + result);
                    populateHistoryTable(insertPane.getText(), result);
                }
                if (isHexToDec == false) {
                    result = convert.decToHex(insertPane.getText());
                    JOptionPane.showMessageDialog(null, "Result of conversion dec to hex: " + result);
                    populateHistoryTable(insertPane.getText(), result);
                }
            } catch (ConvertException er) {
                JOptionPane.showMessageDialog(null, er.getMessage(), "Exception!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Method adds a new row in the History tab
     *
     * @param first
     * @param second
     */
    private void populateHistoryTable(String first, String second) {
        String typeConv = null;
        if (isHexToDec) {
            typeConv = "Hex to Dec";
        } else {
            typeConv = "Dec to Hex";
        }

        String[] newRow = { first, second, typeConv };
        model.addRow(newRow);
    }

}
