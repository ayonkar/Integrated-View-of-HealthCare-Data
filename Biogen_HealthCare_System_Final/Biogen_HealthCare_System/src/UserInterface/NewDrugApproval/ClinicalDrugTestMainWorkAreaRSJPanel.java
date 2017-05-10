/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NewDrugApproval;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ResearchAndDevelopment.NewDrugApprovalOrganisation;
import Business.Role.RegulatorySpecialistNDA;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class ClinicalDrugTestMainWorkAreaRSJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaJPanel
     */
   private  JPanel userprocesscontainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private NewDrugApprovalOrganisation organization;
    private EcoSystem business;
    public ClinicalDrugTestMainWorkAreaRSJPanel(JPanel userProcessContainer, UserAccount userAccount,Organization organization,Enterprise enterprise,EcoSystem business) {
        initComponents();
          this.userprocesscontainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization =  (NewDrugApprovalOrganisation)organization;
        this.enterprise = enterprise;
         valueLabel.setText(enterprise.getName());
        organisationjLabel.setText(organization.getName());
        this.business = business;
        
        
      
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        organisationjLabel = new javax.swing.JLabel();
        logoutjButton = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        regulatorySpecialistLeftjPanel = new javax.swing.JPanel();
        phaseIIjButton = new javax.swing.JButton();
        phaseIjButton = new javax.swing.JButton();
        phaseIIIjButton = new javax.swing.JButton();
        regulatorySpecialistRightjPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        enterpriseLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        enterpriseLabel.setText("Enterprise ");

        valueLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        valueLabel.setText("<value>");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Organisation");

        organisationjLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        organisationjLabel.setText("Org Name");

        logoutjButton.setText("Logout");
        logoutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutjButtonActionPerformed(evt);
            }
        });

        jSplitPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 255)));
        jSplitPane1.setDividerLocation(300);
        jSplitPane1.setDividerSize(1);

        regulatorySpecialistLeftjPanel.setBackground(new java.awt.Color(153, 153, 153));

        phaseIIjButton.setText("Phase II");
        phaseIIjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phaseIIjButtonActionPerformed(evt);
            }
        });

        phaseIjButton.setText("Phase I ");
        phaseIjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phaseIjButtonActionPerformed(evt);
            }
        });

        phaseIIIjButton.setText("Phase III");
        phaseIIIjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phaseIIIjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout regulatorySpecialistLeftjPanelLayout = new javax.swing.GroupLayout(regulatorySpecialistLeftjPanel);
        regulatorySpecialistLeftjPanel.setLayout(regulatorySpecialistLeftjPanelLayout);
        regulatorySpecialistLeftjPanelLayout.setHorizontalGroup(
            regulatorySpecialistLeftjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regulatorySpecialistLeftjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(regulatorySpecialistLeftjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phaseIjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phaseIIjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phaseIIIjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        regulatorySpecialistLeftjPanelLayout.setVerticalGroup(
            regulatorySpecialistLeftjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regulatorySpecialistLeftjPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(phaseIjButton)
                .addGap(42, 42, 42)
                .addComponent(phaseIIjButton)
                .addGap(34, 34, 34)
                .addComponent(phaseIIIjButton)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(regulatorySpecialistLeftjPanel);

        regulatorySpecialistRightjPanel.setBackground(new java.awt.Color(153, 153, 153));
        regulatorySpecialistRightjPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(regulatorySpecialistRightjPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(organisationjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1616, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutjButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(organisationjLabel))
                .addGap(45, 45, 45)
                .addComponent(jSplitPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1616, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 826, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutjButtonActionPerformed
        // TODO add your handling code here:
        userprocesscontainer.remove(this);
        Component[] componentArray = userprocesscontainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        //        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
        layout.previous(userprocesscontainer);
    }//GEN-LAST:event_logoutjButtonActionPerformed

    private void phaseIIjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phaseIIjButtonActionPerformed
        // TODO add your handling code here:

       CardLayout layout = (CardLayout) regulatorySpecialistRightjPanel.getLayout();
        regulatorySpecialistRightjPanel.add("PhaseIIWorkDetailJPanel", new PhaseIIWorkDetailJPanel(regulatorySpecialistRightjPanel,organization,userAccount,enterprise));
        layout.next(regulatorySpecialistRightjPanel);

    }//GEN-LAST:event_phaseIIjButtonActionPerformed

    private void phaseIjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phaseIjButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) regulatorySpecialistRightjPanel.getLayout();
        regulatorySpecialistRightjPanel.add("PhaseIWorkDetailJPanel", new PhaseIWorkDetailJPanel(regulatorySpecialistRightjPanel,organization,userAccount,enterprise));
        layout.next(regulatorySpecialistRightjPanel);
    }//GEN-LAST:event_phaseIjButtonActionPerformed

    private void phaseIIIjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phaseIIIjButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) regulatorySpecialistRightjPanel.getLayout();
        regulatorySpecialistRightjPanel.add("PhaseIIIWorkDetailJPanel", new PhaseIIIWorkDetailJPanel(regulatorySpecialistRightjPanel,organization,userAccount,enterprise,business));
        layout.next(regulatorySpecialistRightjPanel);

    }//GEN-LAST:event_phaseIIIjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutjButton;
    private javax.swing.JLabel organisationjLabel;
    private javax.swing.JButton phaseIIIjButton;
    private javax.swing.JButton phaseIIjButton;
    private javax.swing.JButton phaseIjButton;
    private javax.swing.JPanel regulatorySpecialistLeftjPanel;
    private javax.swing.JPanel regulatorySpecialistRightjPanel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}