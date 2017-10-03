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

package org.netbeans.modules.xml.multiview.ui;

import javax.swing.UIManager;
import org.netbeans.modules.xml.multiview.Error;
//import org.netbeans.modules.xml.multiview.cookies.ErrorComponentContainer;

/** 
 * A panel for error messages.
 *
 * Created on November 19, 2004, 10:44 AM
 * @author  mkuchtiak
 */
public class ErrorPanel extends javax.swing.JPanel {

    private Error error;
    private ErrorLabel errorLabel;
    private String errorMessage;


    /** Creates new form ErrorPanel */
    public ErrorPanel(final ToolBarDesignEditor editor) {
        initComponents();
        
        errorLabel = new ErrorLabel();
        errorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Error error = getError();
                if (error!=null) {
                    Error.ErrorLocation errorLocation = error.getErrorLocation();
                    if (errorLocation!=null) {
                        SectionPanel sectPanel = ((SectionView)editor.getContentView()).findSectionPanel(errorLocation.getKey());
                        if (sectPanel == null) {
                            return;
                        }
                        if (sectPanel.getInnerPanel()==null) sectPanel.open();
                        sectPanel.scroll();
                        javax.swing.JComponent errorComp = sectPanel.getErrorComponent(errorLocation.getComponentId());
                        if (errorComp!=null) errorComp.requestFocus();
                    }
                }
            }
        });
        add(errorLabel,java.awt.BorderLayout.CENTER);
        
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    /*
    public ErrorComponentContainer getErrorComponentContainer() {
        return errorContainer;
    }
    */
    public Error getError() {
        return error;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents

        setLayout(new java.awt.BorderLayout());

    }//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
 
    
    public void setError(Error error) {
        switch (error.getErrorType()) {
            case Error.ERROR_MESSAGE : {
                errorMessage="Error: "+error.getErrorMessage();
                break;
            }
            case Error.WARNING_MESSAGE : {
                errorMessage="Warning: "+error.getErrorMessage();
                break;
            }
            case Error.MISSING_VALUE_MESSAGE : {
                errorMessage="Missing Value: "+error.getErrorMessage();
                break;
            }            
            case Error.DUPLICATE_VALUE_MESSAGE : {
                errorMessage="Duplicate Value: "+error.getErrorMessage();
                break;
            }
        }
        this.error=error;
        errorLabel.setText(errorMessage);
        errorLabel.setIcon(new javax.swing.ImageIcon(
            getClass().getResource("/org/netbeans/modules/xml/multiview/resources/error-glyph.gif"))); //NOI18N
    }
    
    public void clearError() {
        error=null;
        errorLabel.setIcon(null);
        errorLabel.setText("");
        errorMessage="";
    }
    
    private class ErrorLabel extends javax.swing.JLabel {
        ErrorLabel() {
            super();
            //setForeground(SectionVisualTheme.hyperlinkColor);
            setForeground(UIManager.getDefaults().getColor("ToolBar.dockingForeground")); //NOI18N
            setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            setText(""); //NOI18N
        }

        public void setText(String text) {
            if (text.length()==0) super.setText(" "); //NOI18N
            else super.setText("<html><u>"+text+"</u></html>"); //NOI18N
        }
    }
    

}