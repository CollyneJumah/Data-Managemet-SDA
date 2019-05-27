/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms_project;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import sun.security.krb5.internal.Krb5;

/**
 *
 * @author info@mimidots.com
 */
public final class SendSMS extends javax.swing.JPanel {
    
    private DefaultTableModel model;
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    private static String message;
    private static int countOverride;

    /**
     * Creates new form SendSMS
     */
    public SendSMS() {
        initComponents();
        initTable();
        eventHandler();
    }
    
    private void initTable() {
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 6; //set cell editable
            }
            
            //@Override
            public Class<?> getColumnClass(int columnIndex) {
                Class object = String.class;
                switch (columnIndex) {
                    case 6:
                        object = Boolean.class;
                }
                return object;
            }
            
        };
        jTable1.setRowHeight(30);
        String cols[] = {"No", "name", "regNumber", "phone","bsf", "year", ""};
        model.setColumnIdentifiers(cols);
        conn = new Connect().connect();
//        String sqlQuery="SELECT * FROM registermembers order by id ASC";
 String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers ORDER BY year ASC";
        
        try {
            pst = conn.prepareStatement(sqlQuery);
         
        } catch (SQLException ex) {
            Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        populateTable(pst);
    }
    
    private void eventHandler() {
        
        jCheckSendAll.addItemListener((ItemEvent e) -> {
            if (jCheckSendAll.isSelected()) {
                //select all recepients
                for (int i = 0; i < jTable1.getModel().getRowCount(); i++) {
                    jTable1.getModel().setValueAt(true, i, 6);
                    countOverride = i;
                }
                jLabelCount.setText("Total recepients=" + countOverride);
            }
            //bugs naah!
//            else { //un-select all recipients
//                if(e.getSource()==jCheckSendAll){      
//                for (int i = 0; i < jTable1.getModel().getRowCount(); i++) {
//              jTable1.getModel().setValueAt(false, i,5); 
//                } 
//                }
//            }

        });

        /*Filterling*/
        jTxtSearch.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                String index = jTxtSearch.getText();
          
                 String sqlQuery = "SELECT * FROM registermembers where (name like ? or regNumber like ? or phone like ?)";
    
//                String sqlQuery = "SELECT * from registermembers where (Name like ? or Reg_Number like ? or Email like? or Phone_Number like ?)";
                try {
                    pst = conn.prepareStatement(sqlQuery);
                    pst.setString(1, "%" + index + "%");
                    pst.setString(2, "%" + index + "%");
                    pst.setString(3, index + "%");
//                    pst.setString(4, "%" + index + "%");
//                    pst.setString(5,  "%" + index + "%");
////                    pst.setString(6, "%" +index + "%");
                  
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                }
                populateTable(pst);
            }
        });
        
        jComboFilter.addItemListener((e) -> {
            int index = jComboFilter.getSelectedIndex();
            switch (index) {
                case 0: {
            String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers ORDER BY year";
     
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                 case 1: {  /*use a simple inner join*/
                   String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE year='1'";
     
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                  case 2: {  /*use a simple inner join*/
                  String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE year='2'";
     
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                   case 3: {  /*use a simple inner join*/
                   String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE year='3'";
     
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                    case 4: {  /*use a simple inner join*/
                   String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE year='4'";
     
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 5: {  /*use a simple inner join*/
                       String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE year='Children'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                    case 6: {  /*use a simple inner join*/
                       String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE year='Associate'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                     case 7: {  /*use a simple inner join*/
                       String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE year='Post-Graduate'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                      case 8: {  /*use a simple inner join*/
                       String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE year='Staff'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                default: {
                    String sqlQuery = "SELECT * from registermembers where Year=? order by regNumber";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                        pst.setInt(1, index);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }

            //call the populate table method
            populateTable(pst);
            
        });


        //handle the select repients within the table
        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                int row = jTable1.rowAtPoint(e.getPoint());
                if (row >= 0) {
                    if ((Boolean) jTable1.getModel().getValueAt(row, 6) == false) {
                        jCheckSendAll.setSelected(false);
                        countOverride--;
                    } else {
                        countOverride++;
                    }
                    jLabelCount.setText("Total recepients=" + countOverride);
                }
                
            }
        });
        
        
//        End Time Stewards
//Light Bearers
//King Heralds
//The Conquerers
//The living Water
//The Trumpets
//The Amazing Grace
//The Christ Abiders
//The Veterans
//The Cornestone
//The New Jerry
//================================send message to church groups/ families=========================================================
cboFamily.addItemListener((e) -> {
            int index = cboFamily.getSelectedIndex();
            switch (index) {
                case 1: {
            String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE bsf='End Time Stewards'";
     
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                 case 2: {  /*use a simple inner join*/
                   String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE bsf='Light Bearers'";
     
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                  case 3: {  /*use a simple inner join*/
                   String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE bsf='King Heralds'";
     
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                   case 4: {  /*use a simple inner join*/
                   String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE bsf='The Conquerers'";
     
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                    case 5: {  /*use a simple inner join*/
                   String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE bsf='The living Water'";
     
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 6: {  /*use a simple inner join*/
                   String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE bsf='The Trumpets'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                    case 7: {  /*use a simple inner join*/
                   String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE bsf='The Amazing Grace'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                     case 8: {  /*use a simple inner join*/
                   String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE bsf='The Christ Abiders'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                      case 9: {  /*use a simple inner join*/
                   String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE bsf='The Veterans'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                       case 10: {  /*use a simple inner join*/
                   String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE bsf='The Cornestone'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                        case 11: {  /*use a simple inner join*/
                   String sqlQuery = "SELECT name,regNumber,phone,bsf,year FROM registermembers WHERE bsf='The New Jerry'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                default: {
                    String sqlQuery = "SELECT * from registermembers where Year=? order by regNumber";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                        pst.setInt(1, index);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }

            //call the populate table method
            populateTable(pst);
            
        });

//====================================end church groups---------------===================================
   
        /*handle the send sms action event button*/
        jBtnSend.addActionListener((ActionEvent e) -> {
            int count = 0;
            message = jTextArea1.getText(); //get the message typed
            if (message.trim().equals("")) {
                int c = JOptionPane.showConfirmDialog(null, "Are you sure you want to send a blank message?", null, JOptionPane.OK_OPTION);
                if (c == 1) {
                    jTextArea1.setBorder(new LineBorder(Color.RED));
                    return; //exit the flow of execution to allow user to enter the message
                } else {
                    message = "";
                }
            }
            //send the message
            String recepients[] = new String[model.getRowCount()];
            for (int i = 0; i < jTable1.getModel().getRowCount(); i++) {
                /*add the recepients phone numbers into an array (size=the total number of rows)*/
                if ((Boolean) jTable1.getModel().getValueAt(i, 6) == true) {
                    recepients[count] = (String) jTable1.getModel().getValueAt(i, 5);
                    count++;
                }
            }
            
            for (String recepient : recepients) {
                if (null != recepient) {
                    //call the send sms method (only insert the receipients where index value is not null!!!)
                    sendSMS(recepient);
                }
            }
            //executed after sending the sms
            try {
                Icon icon = new ImageIcon(getClass().getResource("/sms_project/images/10.gif"));
               JOptionPane.showMessageDialog(null, "Sending messages...","",JOptionPane.INFORMATION_MESSAGE,icon);

            } catch (Exception ex) {
                Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
    }
    
    int p = 1;

    /**
     * method to initiate the SMS sending process [Inserts the messages to be
     * send into the out-box table]
     *
     * @param sendTo >>the recipient number
     */
    private void sendSMS(String sendTo) {
        try {
            pst = conn.prepareStatement("INSERT INTO outbox(receiver,msg,msgtype,sender) VALUES(?,?,?,?)");
            pst.setString(1, sendTo);
            pst.setString(2, message);
            pst.setString(3, "sms.text");
            pst.setString(4, "0790366848");
            
        } catch (SQLException ex) {
            Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst.execute();
            System.out.println(p + ". sending to " + sendTo);
            p++;
        } catch (SQLException ex) {
            Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void populateTable(PreparedStatement pst) {
        Object rows[] = new Object[7];
        model.setRowCount(0); //clear the table first (to avoid appending the new data)
        countOverride = 0; //also reset the marked recepients to zero !important
        jLabelCount.setText("Total recepients=" + countOverride);
        
        try {
            rs = pst.executeQuery();
            if (rs.isBeforeFirst()) {
                jCheckSendAll.setEnabled(true); //incase it was disabled (in null filter results )
                int i = 1;
                while (rs.next()) {
                    for (Object row : rows) {
                        rows[0] = Integer.toString(i);
                        rows[1] = rs.getObject("name");
                        rows[2] = rs.getObject("regNumber");
                        rows[3] = rs.getObject("phone");
                        rows[4] = rs.getObject("bsf");
                        rows[5] = rs.getObject("year");
                        rows[6] = false;
                    }
                    i++;
                    model.addRow(rows);
                }
                jTable1.setModel(model);
            } else {
                jCheckSendAll.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckSendAll = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboFamily = new javax.swing.JComboBox<>();
        jComboFilter = new javax.swing.JComboBox<>();
        jTxtSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBtnSend = new javax.swing.JButton();
        jLabelCount = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true), "www.collynejumah.co.ke", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 0))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true), "Select recepients", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 11), new java.awt.Color(0, 102, 0))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setForeground(new java.awt.Color(102, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 270, 80));

        jCheckSendAll.setForeground(new java.awt.Color(0, 102, 0));
        jCheckSendAll.setText("send to all");
        jCheckSendAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckSendAllActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckSendAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 90, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/SMS_52px_3.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 90));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true), "Filter", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12), new java.awt.Color(0, 102, 0))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 580, 82));

        cboFamily.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cboFamily.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--Family--", "End Time Stewards", "Light Bearers", "King Heralds", "The Conquerers", "The living Water", "The Trumpets", "The Amazing Grace", "The Christ Abiders", "The Veterans", "The Cornestone", "The New Jerry" }));
        jPanel1.add(cboFamily, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 150, 33));

        jComboFilter.setForeground(new java.awt.Color(0, 102, 0));
        jComboFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "1", "2", "3", "4", "Children", "Associate", "Post-Graduates", "Staff" }));
        jComboFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFilterActionPerformed(evt);
            }
        });
        jPanel1.add(jComboFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 130, 30));

        jTxtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSearchActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 130, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("or");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 30, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 0))); // NOI18N

        jBtnSend.setBackground(new java.awt.Color(0, 153, 0));
        jBtnSend.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtnSend.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSend.setText("Send");
        jBtnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSendActionPerformed(evt);
            }
        });

        jLabelCount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCount.setForeground(new java.awt.Color(0, 102, 0));
        jLabelCount.setText("Total recepients=0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jBtnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jBtnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboFilterActionPerformed

    private void jCheckSendAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckSendAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckSendAllActionPerformed

    private void jBtnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSendActionPerformed

    private void jTxtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboFamily;
    private javax.swing.JButton jBtnSend;
    private javax.swing.JCheckBox jCheckSendAll;
    private javax.swing.JComboBox<String> jComboFilter;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTxtSearch;
    // End of variables declaration//GEN-END:variables
}
