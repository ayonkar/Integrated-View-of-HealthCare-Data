/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DrugDiscoveryScientistDDRole;

import Business.Enterprise.Enterprise;
import Business.Organization.ResearchAndDevelopment.DrugDiscoveryOrganisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.PriclinicalWorkRequest;
import Business.WorkQueue.WorkRequest;
import Disease.Disease;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class InVitoResearchResultDDJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InViroResearchJPanel
     */
    private  JPanel userprocesscontainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private DrugDiscoveryOrganisation organization;
    
    public InVitoResearchResultDDJPanel(JPanel drugScientistRightjPanel, DrugDiscoveryOrganisation organization, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userprocesscontainer = drugScientistRightjPanel;
        this.organization = organization;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
       
         populateComboBox();
          
    }
    
     private void populateComboBox() {
        diseasejComboBox.removeAllItems();     
        DrugDiscoveryOrganisation drugdd = (DrugDiscoveryOrganisation) organization;
        for (Disease disease : drugdd.getDd().getDisease()) {
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

        getTextjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        drugjTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        diseasejComboBox = new javax.swing.JComboBox();
        backjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        getTextjButton.setText("Get Details ");
        getTextjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getTextjButtonActionPerformed(evt);
            }
        });

        drugjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test ID", "DrugID", "Drug Name", "Receiver", "Status", "Result", "Priority"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(drugjTable);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Disease");

        diseasejComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                diseasejComboBoxMousePressed(evt);
            }
        });
        diseasejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseasejComboBoxActionPerformed(evt);
            }
        });

        backjButton.setText("Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 325, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getTextjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(336, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addComponent(diseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(getTextjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(backjButton)
                .addGap(121, 121, 121))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getTextjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getTextjButtonActionPerformed
            // TODO add your handling code here:
        
              int selectedRow = drugjTable.getSelectedRow();      

        if(selectedRow >= 0)
        {  
            PriclinicalWorkRequest pwr = (PriclinicalWorkRequest) drugjTable.getValueAt(selectedRow, 0);
            CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
            userprocesscontainer.add("InVitroTestResultDetailJPanel", new InVitroTestResultDetailDDJPanel(userprocesscontainer,organization,pwr,enterprise,userAccount));
            layout.next(userprocesscontainer); 
		}
		else
		{
                   JOptionPane.showMessageDialog(null,"Please Select a Drug to Test");   
		}       
        
        
            
        
        
        
        
        
        
    }//GEN-LAST:event_getTextjButtonActionPerformed

    private void diseasejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseasejComboBoxActionPerformed
        // TODO add your handling code here:
   

        populateTable();
    }//GEN-LAST:event_diseasejComboBoxActionPerformed

    private void diseasejComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diseasejComboBoxMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_diseasejComboBoxMousePressed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        userprocesscontainer.remove(this);
        Component[] componentArray = userprocesscontainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
//        DiscoveryDevelopmentJPanel dwjp = (DiscoveryDevelopmentJPanel) component;
//        dwjp.populateTable(organization);
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.previous(userprocesscontainer);
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JComboBox diseasejComboBox;
    private javax.swing.JTable drugjTable;
    private javax.swing.JButton getTextjButton;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
            DefaultTableModel model = (DefaultTableModel) drugjTable.getModel();

            model.setRowCount(0);

      //  System.out.println("TEsing getiing size of priclinic work List "+ organization.getPriclinicalWorkQueue().getWorkRequestList());
        for (WorkRequest request : organization.getPriclinicalWorkQueue().getWorkRequestList()) {
            PriclinicalWorkRequest pwr = (PriclinicalWorkRequest) request;
           
               if(String.valueOf(diseasejComboBox.getSelectedItem()).equals(pwr.getDiseaseName()))
               {
            Object[] row = new Object[7];
            row[0] = pwr;
            row[1] = pwr.getDrugID();
            row[2] = pwr.getDrugName();
            row[3] = request.getReceiver() == null ? "Not Assigned" : request.getReceiver();
            String result = pwr.getPreClinicalTestResult();
            row[5] = result == null ? "Waiting" : result;
            String statusInfo = pwr.getStatus();            
            row[4] = statusInfo == null ? "Waiting" : statusInfo;
            row[6] = pwr.getPriority();

            model.addRow(row);
               }
               
               

        }
        if(model.getRowCount() <= 0){JOptionPane.showConfirmDialog(null,"No tests avlaible");}

    }
    
        
        
 
        
        
    
}