/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ClinicalTrialResearchRole;

import Business.Organization.ResearchAndDevelopment.ClinicalTrialsOrganisation;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class PreClinicalTestWorkAreaCTJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PriClinicalTestJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private ClinicalTrialsOrganisation clinicalTrialOrganization;

    public PreClinicalTestWorkAreaCTJPanel(JPanel clinicalTestRightjPanel, UserAccount userAccount, ClinicalTrialsOrganisation clinicalTrialOrganization) {
             initComponents();
             this.userProcessContainer = clinicalTestRightjPanel;
        this.userAccount = userAccount;
       
        this.clinicalTrialOrganization = clinicalTrialOrganization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inVitrojButton = new javax.swing.JButton();
        inVivojButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        inVitrojButton.setText("In- Vitro Test ");
        inVitrojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inVitrojButtonActionPerformed(evt);
            }
        });

        inVivojButton.setText("In - Vivo Test ");
        inVivojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inVivojButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(529, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inVitrojButton, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(inVivojButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(530, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(inVitrojButton)
                .addGap(67, 67, 67)
                .addComponent(inVivojButton)
                .addContainerGap(378, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inVitrojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inVitrojButtonActionPerformed
        // TODO add your handling code here:
       
                
        InVitroTestProcessWorkAreaJPanelCT inVitroworkArea = new InVitroTestProcessWorkAreaJPanelCT(userProcessContainer,clinicalTrialOrganization,userAccount);
        userProcessContainer.add("inVitroworkArea", inVitroworkArea);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);      

    }//GEN-LAST:event_inVitrojButtonActionPerformed

    private void inVivojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inVivojButtonActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Coming Soon .. Work On Progress ");
        
        
        
        
        
    }//GEN-LAST:event_inVivojButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inVitrojButton;
    private javax.swing.JButton inVivojButton;
    // End of variables declaration//GEN-END:variables
}
