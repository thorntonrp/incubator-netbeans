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
package org.netbeans.modules.mercurial.ui.rebase;

/**
 *
 * @author Ondrej Vrabec
 */
public class SelectBasePanel extends javax.swing.JPanel {

    /**
     * Creates new form RebaseSimple
     */
    public SelectBasePanel () {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/mercurial/resources/icons/rebase-dest-base.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "SelectBasePanel.jLabel1.text")); // NOI18N

        tfBaseRevision.setEditable(false);
        tfBaseRevision.setText(org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "SelectBasePanel.tfBaseRevision.text")); // NOI18N

        tfDestinationRevision.setEditable(false);
        tfDestinationRevision.setText(org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "SelectBasePanel.tfDestinationRevision.text")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/mercurial/resources/icons/base.png"))); // NOI18N
        jLabel2.setLabelFor(tfBaseRevision);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "SelectBasePanel.lblBase.text")); // NOI18N
        jLabel2.setToolTipText(org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "SelectBasePanel.lblBase.toolTipText")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/mercurial/resources/icons/destinations.png"))); // NOI18N
        jLabel3.setLabelFor(tfDestinationRevision);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "SelectBasePanel.lblDest.text")); // NOI18N
        jLabel3.setToolTipText(org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "SelectBasePanel.lblDest.TTtext")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/mercurial/resources/icons/base.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "PreviewPanel.legend.lblBaseRevision.text")); // NOI18N
        jLabel4.setToolTipText(org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "PreviewPanel.legend.lblBaseRevision.TTtext")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/mercurial/resources/icons/destinations.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "PreviewPanel.legend.lblDestRevision.text")); // NOI18N
        jLabel5.setToolTipText(org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "PreviewPanel.legend.lblDestRevision.TTtext")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/mercurial/resources/icons/working.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "PreviewPanel.legend.lblWorkingDirectory.text")); // NOI18N
        jLabel6.setToolTipText(org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "PreviewPanel.legend.lblWorkingDirectory.TTtext")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/modules/mercurial/resources/icons/tip.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "PreviewPanel.legend.lblTip.text")); // NOI18N
        jLabel7.setToolTipText(org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "PreviewPanel.legend.lblTip.TTtext")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnBrowseDest, org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "SelectBasePanel.btnBrowseDest.text")); // NOI18N
        btnBrowseDest.setToolTipText(org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "SelectBasePanel.btnBrowseDest.TTtext")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "RebasePanel.lblPreview.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnBrowseBase, org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "SelectBasePanel.btnBrowseBase.text")); // NOI18N
        btnBrowseBase.setToolTipText(org.openide.util.NbBundle.getMessage(SelectBasePanel.class, "SelectBasePanel.btnBrowseBase.toolTipText")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfBaseRevision, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfDestinationRevision, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBrowseBase, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBrowseDest, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addComponent(jLabel8)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfBaseRevision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowseBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDestinationRevision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowseDest))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    final javax.swing.JButton btnBrowseBase = new javax.swing.JButton();
    final javax.swing.JButton btnBrowseDest = new javax.swing.JButton();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    final javax.swing.JTextField tfBaseRevision = new javax.swing.JTextField();
    final javax.swing.JTextField tfDestinationRevision = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}