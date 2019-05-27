/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms_project;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author CollyneJumah
 */
public class Executives extends javax.swing.JPanel {

   
     private Connection conn;
      private PreparedStatement pst;
     private ResultSet rs;
    
    /**
     * Creates new form Parents
     */
    public Executives() {
        initComponents();
        txtPhone.setText("+2547");
        txtPhone.setEditable(false);
        txtfName.setEditable(false);
        txtReg.setEditable(false);
        txtYear.setEditable(false);
        txtBst.setEditable(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtfName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jBtnReset = new javax.swing.JButton();
        jBtSubmit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        enterSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtBst = new javax.swing.JTextField();
        txtReg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        cboRole = new javax.swing.JComboBox<>();
        cboYearLead = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true), "Register Student Parent", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(0, 102, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Full Name:");

        txtfName.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        txtfName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 51)));
        txtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Phone:");

        txtPhone.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 51)));
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });

        jBtnReset.setBackground(new java.awt.Color(255, 153, 0));
        jBtnReset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtnReset.setForeground(new java.awt.Color(255, 255, 255));
        jBtnReset.setText("Reset");
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        jBtSubmit.setBackground(new java.awt.Color(0, 102, 0));
        jBtSubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jBtSubmit.setText("Submit");
        jBtSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSubmitActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Warning Shield_30px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("search by  Reg number or Name");

        enterSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        enterSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enterSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));
        enterSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterSearchActionPerformed(evt);
            }
        });
        enterSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterSearchKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("search");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        female.setForeground(new java.awt.Color(0, 102, 0));
        female.setText("Female");

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        male.setForeground(new java.awt.Color(0, 102, 0));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 0));
        jLabel11.setText("Role");

        txtBst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBst.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 51)));

        txtReg.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        txtReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 51)));
        txtReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Bible Study Family");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("Year");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Registration");

        txtYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtYear.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 51)));

        cboRole.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboRole.setForeground(new java.awt.Color(0, 102, 0));
        cboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--Role--", "Pastor", "Patron", "1-st Elder", "Associate Elder", "Music Elder", "Family Elder", "Welfare Elder", "Spritual Elder", "Technical Elder", "Church Clerk", "Treasurer", "Head Deacon", "Deacons", "Head Deaconess", "Deaconesses", "Family Life", "Church Development Leader", "Education & Publishing", "Children Teachers", "Personal Ministries", "Sabath School Supretendant", "Welfare Leader", "Nature & Reletion Leader", "Amo Leader", "ALO Leader", "Music Director", "Choristers", "Gospel Campaign Chair", "Stewardship", "Medical Missionary", "VOP Chair" }));

        cboYearLead.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboYearLead.setForeground(new java.awt.Color(0, 102, 0));
        cboYearLead.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--Year--", "2017/2018", "2018/2019", "2019/2020", "2020/2021", "2021/2022", "2022/2023" }));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Year of Leadership");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Select Gender");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel2.setText("Some fields are disabled therefore you are required to search member in the above field by registration number.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 514, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtReg, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(female)))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cboYearLead, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtBst, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBst, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtReg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(male)
                            .addComponent(female))
                        .addGap(562, 562, 562))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboYearLead, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Register Executives");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSubmitActionPerformed
        saveData();
    }//GEN-LAST:event_jBtSubmitActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
       reset();
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
         char c = evt.getKeyChar();

        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER))) {

            JOptionPane.showMessageDialog(null, "Enter Numerics Only!");
            evt.consume();

        }          // TODO add your handling code here:

        String phoneNumber=txtPhone.getText();

        if(phoneNumber.length()==13){
            evt.consume();
            JOptionPane.showMessageDialog(this,phoneNumber+"\n Reached Maxmum!");

        }

    }//GEN-LAST:event_txtPhoneKeyTyped

    private void enterSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterSearchKeyTyped
         Filter();
    }//GEN-LAST:event_enterSearchKeyTyped

    private void enterSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterSearchKeyReleased
                                                                              
    }//GEN-LAST:event_enterSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNameActionPerformed

    private void enterSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterSearchActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void txtRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cboRole;
    private javax.swing.JComboBox<String> cboYearLead;
    private javax.swing.JTextField enterSearch;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jBtSubmit;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField txtBst;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtReg;
    private javax.swing.JTextField txtYear;
    private javax.swing.JTextField txtfName;
    // End of variables declaration//GEN-END:variables


public void reset(){
        txtfName.setText("");
        txtReg.setText("");
        txtPhone.setText("");
        txtYear.setText("");
        txtBst.setText("");
        cboRole.setSelectedIndex(0);
        cboYearLead.setSelectedIndex(0);
    
}
public void saveData(){
   
       Connect cc= new Connect();
       conn=cc.connect();
       
        
//            String dl=((JTextField)dat.getDateEditor().getUiComponent()).getText();
            
            String Fname=txtfName.getText();
            String phone=txtPhone.getText();
            String reg=txtReg.getText();
            String bs=txtBst.getText();
            String phne=txtPhone.getText();
            String role=(String) cboRole.getSelectedItem();
            String Gender;
            String Yl=(String) cboRole.getSelectedItem();
//            String year=(String) cboYear.getSelectedItem();
             if(female.isSelected()){
                Gender="Female";
            }else{
                Gender="Male";
            }
            if(male.isSelected()){
                Gender="Male";
            }else{
                Gender="Female";
            }
            if(txtfName.getText().equals("")){
                    txtfName.setBorder(new LineBorder(Color.red));
                    JOptionPane.showMessageDialog(this," name is required");
                    }
           
            else if(txtReg.getText().equals("")){
                      txtReg.setBorder(new LineBorder(Color.red));
                      JOptionPane.showMessageDialog(this,"Registration Number required");
                     }
             else if(txtPhone.getText().equals("")){
                      txtPhone.setBorder(new LineBorder(Color.red));
                      JOptionPane.showMessageDialog(this,"Phone number is mandatory required");
                            
                            }
            else if(phone.length() !=13){
                    txtPhone.setBorder(new LineBorder(Color.red));
                    JOptionPane.showMessageDialog(this,"your phone number is either incorrect or too short");
                    txtPhone.setText("+2547");
            }
            else if(phone.startsWith("07")|| phone.startsWith("0")){
                    txtPhone.setBorder(new LineBorder(Color.red));
                    JOptionPane.showMessageDialog(this, "Incorrect format! Use +2547");
                    txtPhone.setText("+2547");
             
            
            }else if(cboRole.getSelectedIndex()==0){
                cboRole.setBorder(new LineBorder(Color.red));
                JOptionPane.showMessageDialog(this, "Your current role is required");
            }
            else if(cboYearLead.getSelectedIndex()==0){
                cboYearLead.setBorder(new LineBorder(Color.red));
                JOptionPane.showMessageDialog(this, "Your leadership year is required.");
            }else if(txtBst.getText().equals("")){
                txtBst.setBorder(new LineBorder(Color.red));
                JOptionPane.showMessageDialog(this,"Enteryour bible study group.");
            
            }
       
           else{
                     
       try{
      
              String sql="INSERT INTO  executives(Name,Reg,gender,phone,year,bst,role,yearLead)VALUES('"+txtfName.getText()+"','"+txtReg.getText()+"','"+Gender+"','"+txtPhone.getText()+"','"+txtYear.getText()+"','"+txtBst.getText()+"','"+cboRole.getSelectedItem()+"','"+cboYearLead.getSelectedItem()+"')";
            pst=conn.prepareStatement(sql);
            pst.execute();
       
            int save;
            save=  JOptionPane.showConfirmDialog(null,"Save","Are you Sure you/n want to Save Data?",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
            
            if(save==JOptionPane.YES_NO_OPTION){
                
                JOptionPane.showMessageDialog(this,"Saved Successfully!");
             reset();
         
          }
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,"Dear"+" "+Fname+" "+"\nYou are registered Member"+e.getLocalizedMessage());
       }
            
            }
}
public void Filter(){
        
        int component;
        Connection con=null;
        ResultSet rs;
        Statement st;
        PreparedStatement pst=null;

        try{
            String dbname="sda";
            String pass="";
            String username="root";
            String Url="jdbc:mysql://localhost:3306/";
            String Drivers="com.mysql.jdbc.Driver";

            Class.forName(Drivers);

            
            
            con=DriverManager.getConnection(Url+dbname,username,pass);

            
            String sql="SELECT * FROM registermembers WHERE regNumber LIKE '%"+enterSearch.getText()+"%'|| Name LIKE '%"+enterSearch.getText()+"%'|| phone LIKE '%"+enterSearch.getText()+"%'";

            st=con.createStatement();
            rs=st.executeQuery(sql);
           
         
               
            while (rs.next()==true){
                
              //   model.setRowCount(model.getRowCount()+1);

               // String fn=rs.getString("First_Name");
                String n=rs.getString("name");
                String rn=rs.getString("regNumber");
                String gd=rs.getString("gender");
                String phn=rs.getString("phone");
                String yos=rs.getString("year");
                String fc=rs.getString("bsf");
              
                txtfName.setText(n);
                txtReg.setText(rn);
                txtPhone.setText(phn);
                txtYear.setText(yos);
                txtBst.setText(fc);
             
               // model.addRow(new Object[]{fn,mn,ln,gd,rn,phn,yos,jmy});
                   
//            JOptionPane.showMessageDialog(this,"No RECORD FOUND");
        }
       
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"NO RECORDS FOUND"+e.getLocalizedMessage());
        }
     }
}
