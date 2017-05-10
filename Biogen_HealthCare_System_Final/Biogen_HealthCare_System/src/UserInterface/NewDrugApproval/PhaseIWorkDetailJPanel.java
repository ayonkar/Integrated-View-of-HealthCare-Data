/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NewDrugApproval;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ResearchAndDevelopment.ClinicalRegulatoryOrganisation;
import Business.Organization.ResearchAndDevelopment.DrugDiscoveryOrganisation;
import Business.Organization.ResearchAndDevelopment.NewDrugApprovalOrganisation;
import Business.Role.RegulatorySpecialistNDA;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClinicalDrugPhaseOneTestWorkRequest;
import Business.WorkQueue.ClinicalDrugPhaseTwoTestWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import Disease.Disease;
import Drug.AvailableDrug;
import Drug.ClinicalPhaseTwoDrug;
import UserInterface.DrugDiscoveryScientistDDRole.DrugDetailJPanel;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class PhaseIWorkDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PhaseIWorkDetailJPanel
     */
    private JPanel userprocesscontainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private NewDrugApprovalOrganisation organization;

    public PhaseIWorkDetailJPanel(JPanel regulatorySpecialistRightjPanel, NewDrugApprovalOrganisation organization, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userprocesscontainer = regulatorySpecialistRightjPanel;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        populateComboBox();
        

    }

    private void populateComboBox() {
        diseasejComboBox.removeAllItems();
        for (Disease disease : organization.getDiseasediretory().getDisease()) {
            diseasejComboBox.addItem(disease);
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

        jPanel1 = new javax.swing.JPanel();
        diseasejComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        testjTable = new javax.swing.JTable();
        retestjButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        testjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        diseaseDescriptionjTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoryjTextField = new javax.swing.JTextField();
        approvejButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        availaiblejComboBox = new javax.swing.JComboBox();
        viewDrugjButton = new javax.swing.JButton();
        rejectjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        commentjTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        diseasejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseasejComboBoxActionPerformed(evt);
            }
        });

        testjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TestID", "DrugID", "DrugName", "Phase ", "Receiver", "Test Result", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(testjTable);

        retestjButton.setText("Re-Test");
        retestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retestjButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Disease");

        testjButton.setText("Test");
        testjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testjButtonActionPerformed(evt);
            }
        });

        diseaseDescriptionjTextArea.setEditable(false);
        diseaseDescriptionjTextArea.setColumns(20);
        diseaseDescriptionjTextArea.setLineWrap(true);
        diseaseDescriptionjTextArea.setRows(5);
        jScrollPane2.setViewportView(diseaseDescriptionjTextArea);

        jLabel1.setText("Description");

        jLabel3.setText("Category");

        categoryjTextField.setEditable(false);

        approvejButton.setText("Approve Drug");
        approvejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvejButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Avalaible Drugs");

        availaiblejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availaiblejComboBoxActionPerformed(evt);
            }
        });

        viewDrugjButton.setText("View Details");
        viewDrugjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDrugjButtonActionPerformed(evt);
            }
        });

        rejectjButton.setText("Reject Drug");
        rejectjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectjButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Phase  I  Test Lab  Work Area ");

        jLabel6.setText("Comments");

        commentjTextArea.setColumns(20);
        commentjTextArea.setRows(5);
        jScrollPane3.setViewportView(commentjTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(diseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(categoryjTextField)
                                .addGap(150, 150, 150))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(availaiblejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(viewDrugjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(164, 164, 164)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(testjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(retestjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(approvejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(rejectjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(423, 423, 423))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(626, 626, 626)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(categoryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(availaiblejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewDrugjButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testjButton)
                            .addComponent(retestjButton))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(approvejButton)
                            .addComponent(rejectjButton))))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1756, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 67, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 68, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 61, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 62, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void diseasejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseasejComboBoxActionPerformed
        // TODO add your handling code here:
        availaiblejComboBox.removeAllItems();

        Disease disease = (Disease) diseasejComboBox.getSelectedItem();
        diseaseDescriptionjTextArea.setText(disease.getDiseaseDescription());
        categoryjTextField.setText(disease.getDiseaseCategory());
        for (AvailableDrug availdrug : disease.getAvalaibleDrug()) {
            availaiblejComboBox.addItem(availdrug);
        }

        populateTable();
    }//GEN-LAST:event_diseasejComboBoxActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) testjTable.getModel();

        model.setRowCount(0);

        Disease disease = (Disease) diseasejComboBox.getSelectedItem();

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if( request  instanceof ClinicalDrugPhaseOneTestWorkRequest ){
            ClinicalDrugPhaseOneTestWorkRequest clinicalDrugwr = (ClinicalDrugPhaseOneTestWorkRequest) request;
            if (disease.getDiseaseName().equals(clinicalDrugwr.getCpd().getDiseaseName())) {

                String phaseI = "I";
                if ((phaseI).equals(clinicalDrugwr.getCpd().getPhaseNumber())) {
                    //    if(diseasejComboBox.getSelectedItem().toString().equals(ABORT))
                    {
                        Object[] row = new Object[7];
                        row[0] = clinicalDrugwr;
                        row[1] = clinicalDrugwr.getCpd().getDrugID();
                        row[2] = clinicalDrugwr.getCpd().getDrugName();
                        row[3] = clinicalDrugwr.getCpd().getPhaseNumber();

                        row[4] = clinicalDrugwr.getReceiver() == null ? "Not Assigned" : clinicalDrugwr.getReceiver();

                        row[5] = clinicalDrugwr.getTestResult() == null ? "NA" : clinicalDrugwr.getTestResult();
                        String statusInfo = clinicalDrugwr.getStatus();
                        row[6] = statusInfo == null ? "Waiting" : statusInfo;

                        model.addRow(row);
                    }
                }

            }}
        }
        if (model.getRowCount() <= 0) {
            JOptionPane.showConfirmDialog(null, "No tests avlaible");
        }

    }
    private void retestjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retestjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = testjTable.getSelectedRow();

        if (selectedRow >= 0) {
            ClinicalDrugPhaseOneTestWorkRequest request = (ClinicalDrugPhaseOneTestWorkRequest) testjTable.getValueAt(selectedRow, 0);
            //add code for srequest a the sae test
            NewDrugApprovalOrganisation newDrugOrg = (NewDrugApprovalOrganisation) organization;

            // LabTestWorkRequest.count++;
            ClinicalDrugPhaseOneTestWorkRequest drugtest = new ClinicalDrugPhaseOneTestWorkRequest();
            drugtest.setCpd(request.getCpd());

            drugtest.setSender(userAccount);
            drugtest.setStatus("Sent");
            newDrugOrg.getWorkQueue().getWorkRequestList().add(drugtest);

            //drugdd.getWorkQueue().getWorkRequestList().size();
           // userAccount.getWorkQueue().getWorkRequestList().add(drugtest);

            JOptionPane.showConfirmDialog(null, "Re-testing the same setup Processed ");

            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a WorkRequest to Re-Test");
        }
    }//GEN-LAST:event_retestjButtonActionPerformed

    private void testjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testjButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = testjTable.getSelectedRow();

        if (selectedRow >= 0) {
            ClinicalDrugPhaseOneTestWorkRequest cdtwr = (ClinicalDrugPhaseOneTestWorkRequest) testjTable.getValueAt(selectedRow, 0);
            CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
            userprocesscontainer.add("PhaseTestDetailJPanel", new UserInterface.NewDrugApproval.PhaseTestDetailJPanel(userprocesscontainer, organization, cdtwr,enterprise));
            layout.next(userprocesscontainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Drug to Re-Test");
        }

    }//GEN-LAST:event_testjButtonActionPerformed

    private void approvejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvejButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = testjTable.getSelectedRow();
        
        
        

        if (selectedRow >= 0) {
            
            
            
            
            if(commentjTextArea.getText().equals(null)||commentjTextArea.getText().equals("")){JOptionPane.showMessageDialog(null,"Please Add Comments ");}
            else{ ClinicalDrugPhaseOneTestWorkRequest drugtest = (ClinicalDrugPhaseOneTestWorkRequest) testjTable.getValueAt(selectedRow, 0);
                  drugtest.getCpd().setActiveDate(new Date());
                  drugtest.setStatus("Phase I cleared");
                  drugtest.setComments(commentjTextArea.getText());
                  JOptionPane.showMessageDialog(null, "Selected Drug Approved ");
//                    Organization org = null;
//                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//                    if (organization instanceof ClinicalRegulatoryOrganisation){
//                org = organization;
//                break;
//            }
//        }
           ClinicalPhaseTwoDrug phaseTwoDrug = new ClinicalPhaseTwoDrug();  //copying selected drug to phase 2 drug 
            phaseTwoDrug.setDrugID(drugtest.getCpd().getDrugID());
            phaseTwoDrug.setDrugName(drugtest.getCpd().getDrugName());
            phaseTwoDrug.setDoseLevel(Double.valueOf(drugtest.getCpd().getDoseLevel()));
            phaseTwoDrug.setPhaseNumber("II");
            phaseTwoDrug.setDiseaseName(drugtest.getCpd().getDiseaseName());
            phaseTwoDrug.setPhaseApprovedStatus("I");
            phaseTwoDrug.setPharmacokinetics(drugtest.getCpd().getPharmacokinetics());
            phaseTwoDrug.setActiveDate(drugtest.getCpd().getActiveDate());
             
            
       // for(pwr.getDiseaseName()
        
        for(Disease d :organization.getDiseasediretory().getDisease()){
            
            if(d.equals(drugtest.getCpd().getDiseaseName()))
            {
                d.addClinicalDrug(phaseTwoDrug);               
            }
        }
            ClinicalDrugPhaseTwoTestWorkRequest phaseTwoWorkRequest = new ClinicalDrugPhaseTwoTestWorkRequest();         
             phaseTwoWorkRequest.setPhaseTwoDrug(phaseTwoDrug);
            
           organization.getPhaseTwoWorkQueue().getWorkRequestList().add(phaseTwoWorkRequest);
 
                 }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please Select the Phase I result from table ");
        }

    }//GEN-LAST:event_approvejButtonActionPerformed

    private void availaiblejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availaiblejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availaiblejComboBoxActionPerformed

    private void viewDrugjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrugjButtonActionPerformed
        // TODO add your handling code here:

        AvailableDrug availdrug = (AvailableDrug) availaiblejComboBox.getSelectedItem();
        CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
        userprocesscontainer.add("DrugDetailJPanel", new DrugDetailJPanel(userprocesscontainer, availdrug));
        layout.next(userprocesscontainer);

    }//GEN-LAST:event_viewDrugjButtonActionPerformed

    private void rejectjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectjButtonActionPerformed
        // TODO add your handling code here:
        
        
           int selectedRow = testjTable.getSelectedRow();

        if (selectedRow >= 0) {
            ClinicalDrugPhaseOneTestWorkRequest drugtest = (ClinicalDrugPhaseOneTestWorkRequest) testjTable.getValueAt(selectedRow, 0);
            drugtest.getCpd().setActiveDate(new Date());
            drugtest.setStatus("Phase I failed");
            JOptionPane.showMessageDialog(null, "Selected Drug rejected  ");
        } else {
            JOptionPane.showMessageDialog(null, "Please Select the Phase I result from table ");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        


    }//GEN-LAST:event_rejectjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approvejButton;
    private javax.swing.JComboBox availaiblejComboBox;
    private javax.swing.JTextField categoryjTextField;
    private javax.swing.JTextArea commentjTextArea;
    private javax.swing.JTextArea diseaseDescriptionjTextArea;
    private javax.swing.JComboBox diseasejComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton rejectjButton;
    private javax.swing.JButton retestjButton;
    private javax.swing.JButton testjButton;
    private javax.swing.JTable testjTable;
    private javax.swing.JButton viewDrugjButton;
    // End of variables declaration//GEN-END:variables
}
