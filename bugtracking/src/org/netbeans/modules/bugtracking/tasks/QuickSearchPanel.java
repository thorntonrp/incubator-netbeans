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
package org.netbeans.modules.bugtracking.tasks;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.event.ChangeListener;
import org.netbeans.modules.bugtracking.IssueImpl;
import org.netbeans.modules.bugtracking.RepositoryImpl;
import org.netbeans.modules.bugtracking.tasks.dashboard.DashboardViewer;
import org.netbeans.modules.bugtracking.ui.search.QuickSearchComboBar;
import org.openide.util.NbBundle;

/**
 *
 * @author jpeska
 */
public class QuickSearchPanel extends javax.swing.JPanel {

    private List<Category> categories;
    private final QuickSearchComboBar quickIssueSearch;

    /**
     * Creates new form QuickSearchPanel
     */
    public QuickSearchPanel(RepositoryImpl repositoryImpl) {
        initComponents();
        quickIssueSearch = new QuickSearchComboBar(this);
        GroupLayout layout = (GroupLayout) this.getLayout();
        quickIssueSearch.setRepository(repositoryImpl);
        layout.replace(placeholderTask, quickIssueSearch);
    }

    private DefaultComboBoxModel getCategoryModel() {
        categories = DashboardViewer.getInstance().getCategories(true, false);
        String[] catNames = new String[categories.size() + 1];
        catNames[0] = "<" + NbBundle.getMessage(QuickSearchPanel.class, "LBL_NoCategory") + ">"; //NOI18N
        for (int i = 0; i < categories.size(); i++) {
            catNames[i + 1] = categories.get(i).getName();
        }
        return new DefaultComboBoxModel(catNames);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboxCategory = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        placeholderTask = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        cboxCategory.setModel(getCategoryModel());

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, NbBundle.getMessage(QuickSearchPanel.class, "QuickSearchPanel.jLabel3.text")); // NOI18N

        placeholderTask.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1", "Item 2" }));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, NbBundle.getMessage(QuickSearchPanel.class, "QuickSearchPanel.jLabel5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, NbBundle.getMessage(QuickSearchPanel.class, "QuickSearchPanel.jLabel1.text")); // NOI18N
        jLabel1.setEnabled(false);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, NbBundle.getMessage(QuickSearchPanel.class, "QuickSearchPanel.jLabel2.text")); // NOI18N
        jLabel2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboxCategory, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(placeholderTask, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeholderTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboxCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox placeholderTask;
    // End of variables declaration//GEN-END:variables

    public void addQuickSearchListener(ChangeListener listener) {
        quickIssueSearch.addChangeListener(listener);
    }

    public void removeQuickSearchListener(ChangeListener listener) {
        quickIssueSearch.removeChangeListener(listener);
    }

    public Category getSelectedCategory() {
        int selectedIndex = cboxCategory.getSelectedIndex();
        if (selectedIndex == 0) {
            return null;
        } else {
            return categories.get(selectedIndex - 1);
        }
    }

    public IssueImpl getSelectedTask() {
        return quickIssueSearch.getIssueImpl();
    }

}