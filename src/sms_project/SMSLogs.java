/*
 * Copyright (c) 2017, info@mimidots.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package sms_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIT.co.ke
 */
public class SMSLogs extends javax.swing.JPanel {

    private DefaultTableModel model;
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    private static Timer scheduler = new Timer();

    /**
     * Creates new form SMSLogs
     */
    public SMSLogs() {
        initComponents();
        eventHandler();
    }

    private void eventHandler() {
        jBtnInbox.addActionListener((e) -> {
            populateOutboxTable();
        });
        jBtnOutbox.addActionListener((e) -> {
            populateInboxTable();
        });
    }

    private void populateOutboxTable() {
         model = new DefaultTableModel() {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false; //To change body of generated methods, choose Tools | Templates.
                    }
                };
                String cols[] = {"No", "Name", "Reg.no.", "Phone", "Year", "Message", "status", "Time sent"};
                model.setColumnIdentifiers(cols);
                conn = new Connect().connect();
                String sqlQuery = "SELECT registermembers.`name`,"
                        + "registermembers.regNumber,registermembers.phone,registermembers.year,"
                        + "smslog.MessageText as message, smslog.StatusCode as status,"
                        + "smslog.SendTime as timesent FROM `registermembers` "
                        + "inner join smslog on smslog.MessageTo=registermembers.phone ORDER BY `smslog`.`SendTime` DESC";

//        scheduler.schedule(new TimerTask() {
//            @Override
//            public void run() {
               model.setRowCount(0);
                try {
                    pst = conn.prepareStatement(sqlQuery);
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                }

                Object rows[] = new Object[8];
                try {
                    rs = pst.executeQuery();
                    if (rs.isBeforeFirst()) {
                        int i = 1;
                        while (rs.next()) {
                            for (Object row : rows) {
                                rows[0] = Integer.toString(i);
                                rows[1] = rs.getObject("name");
                                rows[2] = rs.getObject("regNumber");
                                 rows[3] = rs.getObject("phone");
                                rows[4] = rs.getObject("year");
                                rows[5] = rs.getObject("message");
                                rows[6] = convertStatus(rs.getInt("status"));
                                rows[7] = rs.getString("timesent");
                            }
                            i++;
                            model.addRow(rows);
                        }
                        jTable1.setModel(model);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, ex);
                }
//            }
//        }, 1, 10000);

    }

    private void populateInboxTable() {
        /**
         * instantiate the main variable outside the loop thread
         */
        model = new DefaultTableModel();
        String cols[] = {"No", "Name", "Reg no.", "Year", "Phone", "Message", "Time received"};
        model.setColumnIdentifiers(cols);
        conn = new Connect().connect();
        String sqlQuery = "SELECT registermembers.name,registermembers.year,"
                + "registermembers.regNumber,registermembers.phone,"
                + "inbox.sender,inbox.receiver,inbox.msg,inbox.senttime from inbox inner join"
                + " registermembers on inbox.sender=registermembers.phone order by inbox.senttime DESC";

        
//        scheduler.schedule(new TimerTask() {
//            @Override
//            public void run() {
        model.setRowCount(0);
                try {
                    pst = conn.prepareStatement(sqlQuery);
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                }

                Object rows[] = new Object[7];
                try {
                    rs = pst.executeQuery();
                    if (rs.isBeforeFirst()) {
                        int i = 1;
                        while (rs.next()) {
                            for (Object row : rows) {
                                rows[0] = Integer.toString(i);
                                rows[1] = rs.getObject("name");
                                rows[2] = rs.getObject("regNumber");
                                rows[3] = rs.getObject("year");
                                rows[4] = rs.getObject("phone");
                                rows[5] = rs.getObject("msg");
                                rows[6] = rs.getString("senttime");
                            }
                            i++;
                            model.addRow(rows);
                        }
                        jTable1.setModel(model);
                    } else {
                        JOptionPane.showMessageDialog(null, "No new message");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                }
//            }
//        }, 1, 10000);

    }

    /*
    Method to convert message status code to a neat readable messages
     */
    private String convertStatus(int code) {
        switch (code) {
            case 201:
                return "Sent";
            case 301:
                return "Network error";
            case 300:
                return "Failed";
            case 200:
                return "Delivered";
            default:
                return Integer.toString(code); //not interpreted
        }
    

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnInbox = new javax.swing.JButton();
        jBtnOutbox = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true), "Manage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12), new java.awt.Color(0, 102, 0))); // NOI18N

        jBtnInbox.setBackground(new java.awt.Color(0, 102, 0));
        jBtnInbox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jBtnInbox.setForeground(new java.awt.Color(255, 255, 153));
        jBtnInbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Outbox_30px.png"))); // NOI18N
        jBtnInbox.setText("Outbox");
        jBtnInbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBtnOutbox.setBackground(new java.awt.Color(0, 102, 0));
        jBtnOutbox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jBtnOutbox.setForeground(new java.awt.Color(255, 255, 153));
        jBtnOutbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Inbox_30px.png"))); // NOI18N
        jBtnOutbox.setText("Inbox");
        jBtnOutbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnOutbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOutboxActionPerformed(evt);
            }
        });

        search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 0)));

        jToggleButton1.setBackground(new java.awt.Color(0, 102, 0));
        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 153));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_30px.png"))); // NOI18N
        jToggleButton1.setText("Search");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addGap(18, 18, 18)
                .addComponent(jBtnOutbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnInbox)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1)
                    .addComponent(jBtnOutbox)
                    .addComponent(jBtnInbox))
                .addGap(7, 7, 7))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Available Messages", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12), new java.awt.Color(0, 102, 0))); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnOutboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOutboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnOutboxActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnInbox;
    private javax.swing.JButton jBtnOutbox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
