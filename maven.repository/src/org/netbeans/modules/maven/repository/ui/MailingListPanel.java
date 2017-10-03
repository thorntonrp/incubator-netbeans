/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * MailingListPanel.java
 *
 * Created on Dec 28, 2008, 9:59:04 AM
 */

package org.netbeans.modules.maven.repository.ui;

import javax.swing.UIManager;

/**
 *
 * @author mkleint
 */
public class MailingListPanel extends javax.swing.JPanel {

    /** Creates new form MailingListPanel */
    public MailingListPanel() {
        initComponents();
        if( "Aqua".equals(UIManager.getLookAndFeel().getID()) ) { //NOI18N
            setBackground(UIManager.getColor("NbExplorerView.background")); //NOI18N
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblArchive = new javax.swing.JLabel();
        btnArchive = new javax.swing.JButton();
        lblSubscribe = new javax.swing.JLabel();
        txtSubscribe = new javax.swing.JTextField();
        lblUnsubscribe = new javax.swing.JLabel();
        txtUnsubscribe = new javax.swing.JTextField();

        lblName.setText(org.openide.util.NbBundle.getMessage(MailingListPanel.class, "MailingListPanel.lblName.text")); // NOI18N

        txtName.setEditable(false);

        lblArchive.setText(org.openide.util.NbBundle.getMessage(MailingListPanel.class, "MailingListPanel.lblArchive.text")); // NOI18N

        btnArchive.setText("archive url"); // NOI18N
        btnArchive.setBorder(null);
        btnArchive.setBorderPainted(false);
        btnArchive.setContentAreaFilled(false);
        btnArchive.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        lblSubscribe.setText(org.openide.util.NbBundle.getMessage(MailingListPanel.class, "MailingListPanel.lblSubscribe.text")); // NOI18N

        txtSubscribe.setEditable(false);

        lblUnsubscribe.setText(org.openide.util.NbBundle.getMessage(MailingListPanel.class, "MailingListPanel.lblUnsubscribe.text")); // NOI18N

        txtUnsubscribe.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblArchive)
                    .addComponent(lblSubscribe)
                    .addComponent(lblUnsubscribe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUnsubscribe, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(txtSubscribe, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(btnArchive, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArchive)
                    .addComponent(btnArchive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubscribe)
                    .addComponent(txtSubscribe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnsubscribe)
                    .addComponent(txtUnsubscribe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnArchive;
    private javax.swing.JLabel lblArchive;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSubscribe;
    private javax.swing.JLabel lblUnsubscribe;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtSubscribe;
    public javax.swing.JTextField txtUnsubscribe;
    // End of variables declaration//GEN-END:variables

}