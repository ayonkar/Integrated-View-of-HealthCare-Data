/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NewDrugApproval;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DrugDistributor.ClinicOrganization;
import Business.Organization.DrugDistributor.HospitalOrganization;
import Business.Organization.DrugDistributor.PharmacyOrganization;
import Business.Organization.Organization;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import static Business.Organization.Organization.Type.Hospital;
import Business.Organization.ResearchAndDevelopment.DrugDiscoveryOrganisation;
import Business.Organization.ResearchAndDevelopment.NewDrugApprovalOrganisation;
import Business.Role.RegulatorySpecialistNDA;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClinicalDrugPhaseOneTestWorkRequest;
import Business.WorkQueue.ClinicalDrugPhaseThreeTestWorkRequest;
 
import Business.WorkQueue.WorkRequest;
import Chemical.ChemicalDirectory;
import Disease.Disease;
import Drug.AvailableDrug;
import Drug.MarketDrug;
import UserInterface.DrugDiscoveryScientistDDRole.DrugDetailJPanel;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Clinic.Clinic;
import Drug.NewDiscoveredDrug;
import Pharmacy.Pharmacy;
import Hospital.Hospital;
import java.text.SimpleDateFormat;

/**
 *
 * @author Lenovo
 */
public class PhaseIIIWorkDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PhaseIIIWorkDetailJPanel
     */
    private  JPanel userprocesscontainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private NewDrugApprovalOrganisation organization;
    private EcoSystem business;
    public PhaseIIIWorkDetailJPanel(JPanel regulatorySpecialistRightjPanel, NewDrugApprovalOrganisation organization, UserAccount userAccount, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userprocesscontainer = regulatorySpecialistRightjPanel;
        this.userAccount = userAccount;
        this.organization =  organization;
        this.enterprise = enterprise;
        populateComboBox();
        this.business = business;
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

        jPanel2 = new javax.swing.JPanel();
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

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

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
        jLabel2.setText("Phase  III  Test Lab  Work Area ");

        jLabel6.setText("Comments");

        commentjTextArea.setColumns(20);
        commentjTextArea.setRows(5);
        jScrollPane3.setViewportView(commentjTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(diseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(categoryjTextField)
                                .addGap(150, 150, 150))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(availaiblejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(viewDrugjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(testjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(retestjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(approvejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(rejectjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(423, 423, 423))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(629, 629, 629)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(categoryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(availaiblejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewDrugjButton)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testjButton)
                            .addComponent(retestjButton))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(approvejButton)
                            .addComponent(rejectjButton))))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        for (WorkRequest request : organization.getPhaseThreeWorkQueue().getWorkRequestList()) {
             if( request  instanceof ClinicalDrugPhaseThreeTestWorkRequest ){
            ClinicalDrugPhaseThreeTestWorkRequest clinicalDrugwr = (ClinicalDrugPhaseThreeTestWorkRequest) request;
            if (disease.getDiseaseName().equals(clinicalDrugwr.getPhaseThreeDrug().getDiseaseName())) {

                String phaseIII = "III";
                if ((phaseIII).equals(clinicalDrugwr.getPhaseThreeDrug().getPhaseNumber())) {
                    //    if(diseasejComboBox.getSelectedItem().toString().equals(ABORT))
                    {
                        Object[] row = new Object[7];
                        row[0] = clinicalDrugwr;
                        row[1] = clinicalDrugwr.getPhaseThreeDrug().getDrugID();
                        row[2] = clinicalDrugwr.getPhaseThreeDrug().getDrugName();
                        row[3] = clinicalDrugwr.getPhaseThreeDrug().getPhaseNumber();

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
            ClinicalDrugPhaseThreeTestWorkRequest request = (ClinicalDrugPhaseThreeTestWorkRequest) testjTable.getValueAt(selectedRow, 0);
          
            NewDrugApprovalOrganisation newDrugOrg = (NewDrugApprovalOrganisation) organization;

            // LabTestWorkRequest.count++;
            ClinicalDrugPhaseThreeTestWorkRequest drugtest = new ClinicalDrugPhaseThreeTestWorkRequest();
            drugtest.setPhaseThreeDrug(request.getPhaseThreeDrug());

            drugtest.setSender(userAccount);
            drugtest.setStatus("Sent");
            newDrugOrg.getPhaseThreeWorkQueue().getWorkRequestList().add(drugtest);

            //drugdd.getWorkQueue().getWorkRequestList().size();
            //userAccount.getWorkQueue().getWorkRequestList().add(drugtest);

            JOptionPane.showConfirmDialog(null, "Please confirm on re-testing the same setup ");

            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a WorkRequest to Re-Test");
        }
    }//GEN-LAST:event_retestjButtonActionPerformed

    private void testjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testjButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = testjTable.getSelectedRow();

        if (selectedRow >= 0) {
            ClinicalDrugPhaseThreeTestWorkRequest cdtwr = (ClinicalDrugPhaseThreeTestWorkRequest) testjTable.getValueAt(selectedRow, 0);
            CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
            userprocesscontainer.add("PhaseThreeTestDetailJPanel", new UserInterface.NewDrugApproval.PhaseThreeTestDetailJPanel(userprocesscontainer, organization, cdtwr,enterprise));
            layout.next(userprocesscontainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Drug to Re-Test");
        }
    }//GEN-LAST:event_testjButtonActionPerformed

    private void approvejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvejButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = testjTable.getSelectedRow();

        if (selectedRow >= 0) {
            ClinicalDrugPhaseThreeTestWorkRequest drugtest = (ClinicalDrugPhaseThreeTestWorkRequest) testjTable.getValueAt(selectedRow, 0);
            drugtest.getPhaseThreeDrug().setActiveDate(new Date());
            drugtest.setStatus("Phase III cleared");
            JOptionPane.showMessageDialog(null, "Selected Drug Approved  for Market !!");
            
  
            
            
            
            
            MarketDrug marketDrug = new MarketDrug();  //copying selected drug to marketDrug
            marketDrug.setDrugID(drugtest.getPhaseThreeDrug().getDrugID());
                      
             Organization org1 = null;
             for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
             if (organization instanceof DrugDiscoveryOrganisation){
                org1 = organization;
                break;
               }
             }
             if (org1!=null){
                 DrugDiscoveryOrganisation ddo =(DrugDiscoveryOrganisation) org1;
                 
                 for(Disease disease : ddo.getDd().getDisease()){
                     for(NewDiscoveredDrug newdrug: disease.getNewDrugList()){
                         if((marketDrug.getDrugID())==(newdrug.getDrugID())){
                             marketDrug.setChemicalList(newdrug.getTcd());
                             marketDrug.setAbsorbility(newdrug.getAbsorbility());
                             marketDrug.setAcitivity(newdrug.getAcitivity());
                             
                            
                             
                         }  
                     }      
                 }          
        }
            
             SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
            marketDrug.setDrugName(drugtest.getPhaseThreeDrug().getDrugName());
            marketDrug.setActiveDate((drugtest.getPhaseThreeDrug().getActiveDate()));
            marketDrug.setExipryDate("2020/12/31 ");
            marketDrug.setDrugStatus("Active");
            marketDrug.setUnitPrice("20");
            marketDrug.setQuantity(100);
            ChemicalDirectory cd = new ChemicalDirectory();
            cd.addChemical("Methylprednisolone",374.4706,"374.4706", "Methylprednisolone");
            cd.addChemical("Prednisolone", 454.5, "C21H28O5", "Prednisolone");
            marketDrug.setChemicalList(cd);

        for(Disease d :organization.getDiseasediretory().getDisease()){ //adding Market Drug to specific disease
            
            if(d.equals(drugtest.getPhaseThreeDrug().getDiseaseName()))
            {
                d.getMarketDrug().add(marketDrug);               
            }
        }
        
        
        //Adding to all Network !
        Enterprise  ent= null;
        for(Network network : business.getNetworkList()){
            
           
            
            for(Enterprise enter :  network.getEnterpriseDirectory().getEl()){
                
                if( enter.getEnterpriseType().getValue().equals("Drug Distributor")){
                    
                    for( Organization  transferorg: enter.getOrganizationDirectory().getOrganizationList())
                    {
                        if (transferorg instanceof HospitalOrganization){
                                HospitalOrganization ho = (HospitalOrganization)transferorg ;
                                for( Hospital h : ho.getHd().getHospitalList()){           
                                      h.getDrugDetails().add(marketDrug);        
                                }              
                        }
                         if (transferorg instanceof ClinicOrganization){
                                ClinicOrganization ho = (ClinicOrganization)transferorg ;
                                for( Clinic h : ho.getCd().getClinicList()){
                                    h.getDrugDetails().add(marketDrug);
                                }              
                        }
                          if (transferorg instanceof PharmacyOrganization){
                                PharmacyOrganization ho = (PharmacyOrganization)transferorg ;
                                for( Pharmacy h : ho.getPd().getPharmacyList()){
                                    h.getDrugDetails().add(marketDrug);
                                }             
                        }
                        
                        
                        
                    }                   
                }  
            }
            
            
            
        }
   
  
   
        }    
         else {
            JOptionPane.showMessageDialog(null, "Please Select the Phase III result from table ");
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
            ClinicalDrugPhaseThreeTestWorkRequest drugtest = (ClinicalDrugPhaseThreeTestWorkRequest) testjTable.getValueAt(selectedRow, 0);
            drugtest.getPhaseThreeDrug().setActiveDate(new Date());
            drugtest.setStatus("Phase III failed");
            JOptionPane.showMessageDialog(null, "Selected Drug rejected  ");
        } else {
            JOptionPane.showMessageDialog(null, "Please Select the Phase III result from table ");
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
    private javax.swing.JPanel jPanel2;
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
