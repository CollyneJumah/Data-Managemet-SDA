/*
 * Copyright (c) 2018, CollyneJumah
 * All rights reserved.
 *
 */

package sms_project;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class MainUI extends javax.swing.JFrame {

    /** Creates new form MainUI */
    public MainUI() {
         ImageIcon img = new ImageIcon(getClass().getResource("/icons/sda4.png"));
        this.setIconImage(img.getImage());
        this.setTitle("Kisii University Seventh Day Adventist Church(SDA)");
        
        initComponents();
        /*set the initial view as send sms panel*/
        Component add = this.rootPanel.add(new Dashboard());
//         Component ad = this.rootPanel.add(new reg());
       
        
        eventHandler();
    }

    private void eventHandler(){
        jBtnHome.addActionListener((e) -> {
            changeView(new Dashboard());
        });
        
        jBtnStudent.addActionListener((e) -> {
            changeView(new reg());
        });
         jBtnExecutives.addActionListener((e) -> {
            changeView(new Executives());
        });
        jBtnMessages.addActionListener((e) -> {
            changeView(new SendSMS());
        });
          jBnViewMsg.addActionListener((e) -> {
            changeView(new SMSLogs());
        });
            jBtManage.addActionListener((e) -> {
            changeView(new manageRecords());
        });
           
            jBtDisplayMembers.addActionListener((e) -> {
            changeView(new DisplayMembers());
        });  
            btnGroups.addActionListener((e)->{
                changeView(new churchGroups());
    });
            jBtAssets.addActionListener((e)->{
                changeView(new assets());
    });
                              
    }
    
    private void changeView(JPanel p){
        this.rootPanel.removeAll();
        this.rootPanel.add(p);
        this.rootPanel.revalidate();
        this.rootPanel.repaint();
    }
         
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnHome = new javax.swing.JButton();
        jBtnStudent = new javax.swing.JButton();
        jBnViewMsg = new javax.swing.JButton();
        jBtnExecutives = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jBtnMessages = new javax.swing.JButton();
        jBtManage = new javax.swing.JButton();
        jBtDisplayMembers = new javax.swing.JButton();
        jBtAssets = new javax.swing.JButton();
        btnGroups = new javax.swing.JButton();
        rootPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Quick Access", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnHome.setBackground(new java.awt.Color(255, 255, 153));
        jBtnHome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtnHome.setForeground(new java.awt.Color(0, 102, 51));
        jBtnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Dashboard_48px.png"))); // NOI18N
        jBtnHome.setText("DashBoard");
        jBtnHome.setAutoscrolls(true);
        jBtnHome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Dashboard_30px_2.png")))); // NOI18N
        jBtnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 62, 159, -1));

        jBtnStudent.setBackground(new java.awt.Color(255, 255, 153));
        jBtnStudent.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtnStudent.setForeground(new java.awt.Color(0, 102, 51));
        jBtnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_User_Male_30px.png"))); // NOI18N
        jBtnStudent.setText("members");
        jBtnStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBtnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnStudentActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 122, 159, 49));

        jBnViewMsg.setBackground(new java.awt.Color(255, 255, 153));
        jBnViewMsg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBnViewMsg.setForeground(new java.awt.Color(0, 102, 51));
        jBnViewMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Open_Envelope_30px.png"))); // NOI18N
        jBnViewMsg.setText("view messages");
        jBnViewMsg.setActionCommand("messages");
        jBnViewMsg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBnViewMsg.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBnViewMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnViewMsgActionPerformed(evt);
            }
        });
        jPanel1.add(jBnViewMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 493, 160, 49));

        jBtnExecutives.setBackground(new java.awt.Color(255, 255, 153));
        jBtnExecutives.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtnExecutives.setForeground(new java.awt.Color(0, 102, 51));
        jBtnExecutives.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Manager_30px_1.png"))); // NOI18N
        jBtnExecutives.setText("executives");
        jBtnExecutives.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnExecutives.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBtnExecutives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExecutivesActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnExecutives, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 182, 159, 49));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms_project/images/Search_30px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 17, 40, 39));

        jTextField1.setBackground(new java.awt.Color(0, 102, 51));
        jTextField1.setForeground(new java.awt.Color(153, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 28, 115, 27));

        jBtnMessages.setBackground(new java.awt.Color(255, 255, 153));
        jBtnMessages.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtnMessages.setForeground(new java.awt.Color(0, 102, 51));
        jBtnMessages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_SMS_30px.png"))); // NOI18N
        jBtnMessages.setText("messages");
        jBtnMessages.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnMessages.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBtnMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMessagesActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnMessages, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 429, 159, 49));

        jBtManage.setBackground(new java.awt.Color(255, 255, 153));
        jBtManage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtManage.setForeground(new java.awt.Color(0, 102, 51));
        jBtManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Data_Sheet_30px.png"))); // NOI18N
        jBtManage.setText("records");
        jBtManage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtManage.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBtManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtManageActionPerformed(evt);
            }
        });
        jPanel1.add(jBtManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 302, 159, 49));

        jBtDisplayMembers.setBackground(new java.awt.Color(255, 255, 153));
        jBtDisplayMembers.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtDisplayMembers.setForeground(new java.awt.Color(0, 102, 51));
        jBtDisplayMembers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Open_30px_2.png"))); // NOI18N
        jBtDisplayMembers.setText("Display Records");
        jBtDisplayMembers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtDisplayMembers.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBtDisplayMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtDisplayMembersActionPerformed(evt);
            }
        });
        jPanel1.add(jBtDisplayMembers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 160, 49));

        jBtAssets.setBackground(new java.awt.Color(255, 255, 153));
        jBtAssets.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtAssets.setForeground(new java.awt.Color(0, 102, 51));
        jBtAssets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Help_30px.png"))); // NOI18N
        jBtAssets.setText("Assets");
        jBtAssets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtAssets.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBtAssets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAssetsActionPerformed(evt);
            }
        });
        jPanel1.add(jBtAssets, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 560, 159, 49));

        btnGroups.setBackground(new java.awt.Color(255, 255, 153));
        btnGroups.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnGroups.setForeground(new java.awt.Color(0, 102, 0));
        btnGroups.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_User_Groups_30px.png"))); // NOI18N
        btnGroups.setText("church groups");
        btnGroups.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGroups.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnGroups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroupsActionPerformed(evt);
            }
        });
        jPanel1.add(btnGroups, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 242, 159, 49));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 0, 170, 633);

        rootPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Dashboard", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        rootPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rootPanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        rootPanel.setMinimumSize(new java.awt.Dimension(2, 2));
        rootPanel.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(rootPanel);
        rootPanel.setBounds(180, 121, 920, 520);

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kisii University Seventh Day Adventist Church");

        jLabel3.setFont(new java.awt.Font("Broadway", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("KSUSDA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(180, 0, 940, 120);

        setSize(new java.awt.Dimension(1134, 683));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMessagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnMessagesActionPerformed

    private void jBtnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnStudentActionPerformed
     
    }//GEN-LAST:event_jBtnStudentActionPerformed

    private void jBtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnHomeActionPerformed

    private void jBtnExecutivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExecutivesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnExecutivesActionPerformed

    private void jBnViewMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnViewMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnViewMsgActionPerformed

    private void jBtManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtManageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtManageActionPerformed

    private void jBtDisplayMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtDisplayMembersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtDisplayMembersActionPerformed

    private void jBtAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAssetsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtAssetsActionPerformed

    private void btnGroupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroupsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGroupsActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

   
    public static void main(String args[]) {
        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

}

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGroups;
    private javax.swing.JButton jBnViewMsg;
    private javax.swing.JButton jBtAssets;
    private javax.swing.JButton jBtDisplayMembers;
    private javax.swing.JButton jBtManage;
    private javax.swing.JButton jBtnExecutives;
    private javax.swing.JButton jBtnHome;
    private javax.swing.JButton jBtnMessages;
    private javax.swing.JButton jBtnStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel rootPanel;
    // End of variables declaration//GEN-END:variables

}
