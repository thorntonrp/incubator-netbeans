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
package org.netbeans.core;

import java.util.prefs.Preferences;
import org.netbeans.api.keyring.Keyring;
import org.openide.util.NbBundle;
import org.openide.util.NbPreferences;

/**
 *
 * @author  lukas
 */
final class NbAuthenticatorPanel extends javax.swing.JPanel {

    private String realmName;
    private final Preferences prefs;
    private final String keyringKey;

    /** Creates new form AuthenticatorPanel */
    public NbAuthenticatorPanel(String realmName) {
        this.realmName = realmName;
        initComponents();
        prefs = NbPreferences.forModule(NbAuthenticatorPanel.class).node("authentication"); // NOI18N
        keyringKey = "authentication." + realmName; // NOI18N
        String username = prefs.get(realmName, null);
        if (username != null) {
            userName.setText(username);
            char[] pwd = Keyring.read(keyringKey);
            if (pwd != null) {
                password.setText(new String(pwd));
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userNameLbl = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        realmNameLbl = new javax.swing.JLabel();

        userNameLbl.setLabelFor(userName);
        org.openide.awt.Mnemonics.setLocalizedText(userNameLbl, org.openide.util.NbBundle.getMessage(NbAuthenticatorPanel.class, "NbAuthenticatorPanel.userNameLbl.text")); // NOI18N

        passwordLbl.setLabelFor(password);
        org.openide.awt.Mnemonics.setLocalizedText(passwordLbl, org.openide.util.NbBundle.getMessage(NbAuthenticatorPanel.class, "NbAuthenticatorPanel.passwordLbl.text")); // NOI18N

        realmNameLbl.setText(realmName);
        realmNameLbl.setFocusable(false);
        realmNameLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameLbl)
                    .addComponent(passwordLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(realmNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(realmNameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLbl)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel realmNameLbl;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userNameLbl;
    // End of variables declaration//GEN-END:variables

    public char[] getPassword() {
        Keyring.save(keyringKey, password.getPassword(),
                NbBundle.getMessage(NbAuthenticatorPanel.class, "NbAuthenticatorPanel.password.description", realmName));
        return password.getPassword(); // call getPassword again, since previous return value nulled out
    }

    public String getUserName() {
        String username = userName.getText();
        prefs.put(realmName, username);
        return username;
    }
}