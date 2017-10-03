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
 * JFXSigningPanel.java
 *
 * Created on 25.8.2011, 15:04:00
 */
package org.netbeans.modules.javafx2.project.ui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.netbeans.modules.javafx2.project.JFXProjectProperties;
import org.openide.DialogDescriptor;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle;

/**
 *
 * @author Petr Somol
 * @author Tomas Zezula
 */
public class JFXSigningPanel extends javax.swing.JPanel implements DocumentListener {

    private final JFXProjectProperties jfxProps;
    private DialogDescriptor desc;
    
    /** Creates new form JFXSigningPanel */
    public JFXSigningPanel(JFXProjectProperties props) {
        this.jfxProps = props;
        initComponents();
    
        if (JFXProjectProperties.SigningType.KEY == jfxProps.getSigningType()) {
            radioButtonSpecKey.setSelected(true);
        } else {
            radioButtonSelfSign.setSelected(true);
        }
        textFieldPath.setText(jfxProps.getSigningKeyStore());
        textFieldKeyAlias.setText(jfxProps.getSigningKeyAlias());
        if (jfxProps.getSigningKeyStorePassword() != null) passwordField.setText(new String(jfxProps.getSigningKeyStorePassword()));
        if (jfxProps.getSigningKeyPassword() != null) passwordFieldKey.setText(new String(jfxProps.getSigningKeyPassword()));

        refreshComponents();
    }

    void setDialogDescriptor(DialogDescriptor desc) {
        this.desc = desc;
        updateDialogButtonsAndMessage();
    }
    
    void registerListeners() {
        textFieldPath.getDocument().addDocumentListener(this);
        passwordField.getDocument().addDocumentListener(this);
        textFieldKeyAlias.getDocument().addDocumentListener(this);
        passwordFieldKey.getDocument().addDocumentListener(this);
    }
    
    void unregisterListeners() {
        textFieldPath.getDocument().removeDocumentListener(this);
        passwordField.getDocument().removeDocumentListener(this);
        textFieldKeyAlias.getDocument().removeDocumentListener(this);
        passwordFieldKey.getDocument().removeDocumentListener(this);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        updateDialogButtonsAndMessage();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        updateDialogButtonsAndMessage();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        updateDialogButtonsAndMessage();
    }
        
    private void refreshComponents() {
        boolean keyAlias = radioButtonSpecKey.isSelected();
        textFieldPath.setEnabled(keyAlias);
        buttonPath.setEnabled(keyAlias);
        passwordField.setEnabled(keyAlias);
        textFieldKeyAlias.setEnabled(keyAlias);
        passwordFieldKey.setEnabled(keyAlias);
        labelPath.setEnabled(keyAlias);
        labelPassword.setEnabled(keyAlias);
        labelKeyAlias.setEnabled(keyAlias);
        labelKeyPassword.setEnabled(keyAlias);
    }
    
    void store() {
        if(radioButtonSelfSign.isSelected()) {
            jfxProps.setSigningType(JFXProjectProperties.SigningType.SELF);
        } else {
            jfxProps.setSigningType(JFXProjectProperties.SigningType.KEY);
        }
        jfxProps.setSigningKeyStore(textFieldPath.getText().trim());
        jfxProps.setSigningKeyStorePassword(passwordField.getPassword());
        jfxProps.setSigningKeyAlias(textFieldKeyAlias.getText().trim());
        jfxProps.setSigningKeyPassword(passwordFieldKey.getPassword());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupSigning = new javax.swing.ButtonGroup();
        radioButtonSelfSign = new javax.swing.JRadioButton();
        radioButtonSpecKey = new javax.swing.JRadioButton();
        labelPath = new javax.swing.JLabel();
        textFieldPath = new javax.swing.JTextField();
        buttonPath = new javax.swing.JButton();
        labelPassword = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        labelKeyAlias = new javax.swing.JLabel();
        textFieldKeyAlias = new javax.swing.JTextField();
        labelKeyPassword = new javax.swing.JLabel();
        passwordFieldKey = new javax.swing.JPasswordField();
        warningSigning = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setPreferredSize(new java.awt.Dimension(570, 240));
        setLayout(new java.awt.GridBagLayout());

        buttonGroupSigning.add(radioButtonSelfSign);
        radioButtonSelfSign.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(radioButtonSelfSign, org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "LBL_JFXSigningPanel.radioButtonSelfSign.text")); // NOI18N
        radioButtonSelfSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonSelfSignActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(radioButtonSelfSign, gridBagConstraints);
        radioButtonSelfSign.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AN_JFXSigningPanel.radioButtonSelfSign.text")); // NOI18N
        radioButtonSelfSign.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AD_JFXSigningPanel.radioButtonSelfSign.text")); // NOI18N

        buttonGroupSigning.add(radioButtonSpecKey);
        org.openide.awt.Mnemonics.setLocalizedText(radioButtonSpecKey, org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "LBL_JFXSigningPanel.radioButtonSpecKey.text")); // NOI18N
        radioButtonSpecKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonSpecKeyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 0);
        add(radioButtonSpecKey, gridBagConstraints);
        radioButtonSpecKey.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AN_JFXSigningPanel.radioButtonSpecKey.text")); // NOI18N
        radioButtonSpecKey.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AD_JFXSigningPanel.radioButtonSpecKey.text")); // NOI18N

        labelPath.setLabelFor(textFieldPath);
        org.openide.awt.Mnemonics.setLocalizedText(labelPath, org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "LBL_JFXSigningPanel.labelPath.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 7, 0);
        add(labelPath, gridBagConstraints);
        labelPath.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AN_JFXSigningPanel.labelPath.text")); // NOI18N
        labelPath.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AD_JFXSigningPanel.labelPath.text")); // NOI18N

        textFieldPath.setPreferredSize(new java.awt.Dimension(350, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 7, 0);
        add(textFieldPath, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(buttonPath, org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "LBL_JFXSigningPanel.buttonPath.text")); // NOI18N
        buttonPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPathActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 2, 10);
        add(buttonPath, gridBagConstraints);
        buttonPath.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AN_JFXSigningPanel.buttonPath.text")); // NOI18N
        buttonPath.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AD_JFXSigningPanel.buttonPath.text")); // NOI18N

        labelPassword.setLabelFor(passwordField);
        org.openide.awt.Mnemonics.setLocalizedText(labelPassword, org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "LBL_JFXSigningPanel.labelPassword.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 7, 0);
        add(labelPassword, gridBagConstraints);
        labelPassword.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AN_JFXSigningPanel.labelPassword.text")); // NOI18N
        labelPassword.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AD_JFXSigningPanel.labelPassword.text")); // NOI18N

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 7, 0);
        add(passwordField, gridBagConstraints);

        labelKeyAlias.setLabelFor(textFieldKeyAlias);
        org.openide.awt.Mnemonics.setLocalizedText(labelKeyAlias, org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "LBL_JFXSigningPanel.labelKeyAlias.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 7, 0);
        add(labelKeyAlias, gridBagConstraints);
        labelKeyAlias.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AN_JFXSigningPanel.labelKeyAlias.text")); // NOI18N
        labelKeyAlias.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AD_JFXSigningPanel.labelKeyAlias.text")); // NOI18N

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 7, 0);
        add(textFieldKeyAlias, gridBagConstraints);

        labelKeyPassword.setLabelFor(passwordFieldKey);
        org.openide.awt.Mnemonics.setLocalizedText(labelKeyPassword, org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "LBL_JFXSigningPanel.labelKeyPassword.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 3, 0);
        add(labelKeyPassword, gridBagConstraints);
        labelKeyPassword.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AN_JFXSigningPanel.labelKeyPassword.text")); // NOI18N
        labelKeyPassword.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "AD_JFXSigningPanel.labelKeyPassword.text")); // NOI18N

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 3, 0);
        add(passwordFieldKey, gridBagConstraints);

        warningSigning.setText(org.openide.util.NbBundle.getMessage(JFXSigningPanel.class, "JFXSigningPanel.warningSigning.text")); // NOI18N
        warningSigning.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        warningSigning.setPreferredSize(new java.awt.Dimension(400, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 10, 0, 10);
        add(warningSigning, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        add(filler1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void radioButtonSpecKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonSpecKeyActionPerformed
        refreshComponents();
        updateDialogButtonsAndMessage();
    }//GEN-LAST:event_radioButtonSpecKeyActionPerformed

    private void radioButtonSelfSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonSelfSignActionPerformed
        refreshComponents();
        updateDialogButtonsAndMessage();
    }//GEN-LAST:event_radioButtonSelfSignActionPerformed

    private void buttonPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPathActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setMultiSelectionEnabled(false);
        chooser.setDialogTitle(NbBundle.getMessage(JFXSigningPanel.class, "TITLE_KeystoreBrowser")); //NOI18N
        if (JFileChooser.APPROVE_OPTION == chooser.showOpenDialog(this)) {
            File file = FileUtil.normalizeFile(chooser.getSelectedFile());
            textFieldPath.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_buttonPathActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSigning;
    private javax.swing.JButton buttonPath;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel labelKeyAlias;
    private javax.swing.JLabel labelKeyPassword;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPath;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordFieldKey;
    private javax.swing.JRadioButton radioButtonSelfSign;
    private javax.swing.JRadioButton radioButtonSpecKey;
    private javax.swing.JTextField textFieldKeyAlias;
    private javax.swing.JTextField textFieldPath;
    private javax.swing.JLabel warningSigning;
    // End of variables declaration//GEN-END:variables

    private void updateDialogButtonsAndMessage() {
        if(!radioButtonSpecKey.isSelected()) {
            warningSigning.setText(NbBundle.getMessage(JFXSigningPanel.class, "JFXSigningPanel.warningSigning.message")); //NOI18N
            warningSigning.setVisible(true);
            desc.setValid(true);
        } else {
            if(textFieldPath.getDocument().getLength()>0 && passwordField.getDocument().getLength()>5 && 
                    textFieldKeyAlias.getDocument().getLength()>0 && passwordFieldKey.getDocument().getLength()>5 ) {
                desc.setValid(true);
                warningSigning.setText(null);
                warningSigning.setVisible(false);
            } else {
                desc.setValid(false);
                warningSigning.setText(NbBundle.getMessage(JFXSigningPanel.class, "JFXSigningPanel.WarnMissingInfo")); // NOI18N
                warningSigning.setVisible(true);
            }
        }
    }

}