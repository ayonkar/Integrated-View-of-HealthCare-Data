/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ClinicalTrialResearchRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ResearchAndDevelopment.ClinicalTrialsOrganisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ClinicalTrailResearchWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private ClinicalTrialsOrganisation clinicalTrialOrganization;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public ClinicalTrailResearchWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
       
        this.clinicalTrialOrganization = (ClinicalTrialsOrganisation)organization;
        
        populateTable(clinicalTrialOrganization);
    }

    public void populateTable(ClinicalTrialsOrganisation clinicalTrialOrganization){
         DefaultTableModel model = (DefaultTableModel) testjTable.getModel();
        
      model.setRowCount(0);

      for (WorkRequest request : clinicalTrialOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[8];
            row[0] =  (LabTestWorkRequest) request;
            row[1] = ((LabTestWorkRequest) request).getTestdrug().getDrugID();
            row[2] = ((LabTestWorkRequest) request).getScore();
            row[3] = ((LabTestWorkRequest) request).getDge();
            row[4] = ((LabTestWorkRequest) request).getSender();
            row[5] = request.getReceiver() ==null ? "Not Assigned" : request.getReceiver() ;
            
            String status = ((LabTestWorkRequest) request).getStatus();
            row[6] = status == null ? "Waiting" : status; 
            
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[7] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        
      }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        testjTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 180, -1));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 250, 180, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 180, -1));

        testjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TestID", "DrugID", "Score", "DGE", "Sender", "Receiver", "Status", "Test Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(testjTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 640, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = testjTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)testjTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable(clinicalTrialOrganization);
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = testjTable.getSelectedRow();
        
        if (selectedRow < 0){               
            return;
        }
        
        LabTestWorkRequest request = (LabTestWorkRequest)testjTable.getValueAt(selectedRow, 0);
     
        request.setStatus("Processing");
        
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request,clinicalTrialOrganization);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable(clinicalTrialOrganization);
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable testjTable;
    // End of variables declaration//GEN-END:variables
}
