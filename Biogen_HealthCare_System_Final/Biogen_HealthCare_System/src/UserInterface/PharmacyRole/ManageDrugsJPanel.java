/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmacyRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.DrugDistributor.ClinicOrganization;
import Business.Organization.DrugDistributor.HospitalOrganization;
import Business.Organization.DrugDistributor.PharmacyOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Hospital;
import static Business.Organization.Organization.Type.Pharmacy;
import Business.Organization.ResearchAndDevelopment.DrugDiscoveryOrganisation;
import Business.UserAccount.UserAccount;
import Disease.Disease;
import Drug.AvailableDrug;
import Drug.MarketDrug;
import Drug.MasterOrderDrugCatalog;
import Drug.OrderDrug;
import Drug.OrderDrugItem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Hospital.Hospital;
import Pharmacy.Pharmacy;
import UserInterface.DrugDiscoveryScientistDDRole.DrugDetailJPanel;
import UserInterface.HospitalRole.ViewDrugDetailJPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

/**
 *
 * @author ayonk
 */
public class ManageDrugsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDrugsJPanel
     */
    private JPanel userProcessContainer;
    private PharmacyOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private AvailableDrug availdrug;
    private OrderDrug orderdrug;
    private MasterOrderDrugCatalog masterOrderDrugCatalog;
    
    public ManageDrugsJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.organization = (PharmacyOrganization)organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        initComponents();
        
        orderdrug = new OrderDrug();
        masterOrderDrugCatalog = new MasterOrderDrugCatalog();
        
        populateComboBox();
    }

        private void populateComboBox(){
        pharmacyJComBox.removeAllItems();
        //HospitalOrganization hospitalOrganization = (HospitalOrganization)organization;
        for (Pharmacy pharmacy : organization.getPd().getPharmacyList()){
             //System.out.println("Hospital name "+hospital );
            pharmacyJComBox.addItem(pharmacy); 
           
        }
        
    }
        
        private void populateTable(){
        
          DefaultTableModel model = (DefaultTableModel) pharmacyJTable.getModel();
          model.setRowCount(0);
          //System.out.println("chceking"+String.valueOf(hospitalJComboBox.getSelectedItem()));
          
          Pharmacy pharmacy = (Pharmacy)pharmacyJComBox.getSelectedItem();
          
          //HospitalOrganization hospitalOrganization = (HospitalOrganization)organization;
          
          
          for (MarketDrug md : pharmacy.getDrugDetails()){
              
          if(md.getDrugStatus().equalsIgnoreCase("Active")){
              
            Object[] row = new Object[7];
            row[0] = md.getDrugID();
            row[1] = md;
            row[2] = md.getQuantity();
            row[3] = md.getUnitPrice();
            row[4] = md.getExipryDate();
            row[5] = pharmacy.getPharmacyId();
            row[6] = pharmacy.getPharmacyName();
            
            model.addRow(row);
        
        }
      }
    }
        
        public void refreshDrugTable(String keyword){
       boolean flag= false;
       DefaultTableModel model = (DefaultTableModel) pharmacyJTable.getModel();
       model.setRowCount(0); 

       for(Pharmacy pharmacy : organization.getPd().getPharmacyList())
       {
           for(MarketDrug md : pharmacy.getDrugDetails()){
               
           if(md.getDrugName().equalsIgnoreCase(keyword))    
           {
               
               flag = true;
            Object[] row = new Object[7];
            row[0] = md.getDrugID();
            row[1] = md;
            row[2] = md.getQuantity();
            row[3] = md.getUnitPrice();
            row[4] = md.getExipryDate();
            row[5] = pharmacy.getPharmacyId();
            row[6] = pharmacy.getPharmacyName();
            
            model.addRow(row);
           }
          
           }    
       }
       if(flag == false)
        JOptionPane.showMessageDialog(null, "Please enter the correct drug name!", "Warning", JOptionPane.WARNING_MESSAGE);
        
}
  
  public void refreshTable(){
        
       DefaultTableModel model = (DefaultTableModel) pharmacyCartJTable.getModel();
       model.setRowCount(0); 

       //for(Hospital hospital : o)
       {
           for(OrderDrugItem oi : orderdrug.getOrderdrugList()){
               
            Object[] row = new Object[6];
            row[0] = oi.getMd().getDrugID();
            row[1] = oi;
            row[2] = oi.getQuantity();
            row[3] = oi.getMd().getUnitPrice();
            row[4] = oi.getMd().getExipryDate();
            row[5] = oi.getPharmacyName();
             
            
            model.addRow(row);
           }
      
  }
}
  
    public void emptyTable(){
        
       DefaultTableModel model = (DefaultTableModel) pharmacyCartJTable.getModel();
       //model.setRowCount(0); 
       int rowCount = model.getRowCount();
       for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pharmacyJComBox = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        pharmacyJTable = new javax.swing.JTable();
        searchTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pharmacyCartJTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        txtValue = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        requestQuantityBtn = new javax.swing.JButton();
        requestQuantityTxtField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText(" Drug Request Catalog");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Pharmacy");

        pharmacyJComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyJComBoxActionPerformed(evt);
            }
        });

        pharmacyJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DrugId", "DrugName", "Quantity", "UnitPrice", "ExpiryDate", "HospitalId", "HospitalName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(pharmacyJTable);

        jButton4.setText("Search DrugId");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Add to cart");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("View Drug Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Drugs in cart");

        pharmacyCartJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DrugId", "DrugName", "Quantity", "UnitPrice", "ExpiryDate", "HospitalId", "HospitalName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(pharmacyCartJTable);

        jButton3.setText("Remove Drug");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setText("Modify Quantity");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Check Out");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setText(">> Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        requestQuantityBtn.setText("Request Quantity");
        requestQuantityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestQuantityBtnActionPerformed(evt);
            }
        });

        requestQuantityTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestQuantityTxtFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(pharmacyJComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(92, 92, 92)
                                    .addComponent(requestQuantityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(requestQuantityBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pharmacyJComBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(requestQuantityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(requestQuantityBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(searchTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton7)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(9, 9, 9)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                int row = pharmacyCartJTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        OrderDrugItem oi = (OrderDrugItem)pharmacyCartJTable.getValueAt(row, 1);
        int oldAvail = oi.getMd().getQuantity();
        int oldQty = oi.getQuantity();
        int newQty = oldAvail + oldQty;
        oi.getMd().setQuantity(newQty);
        orderdrug.removeOrderItem(oi);
        JOptionPane.showMessageDialog(null, "Order item removed from the cart");
        refreshTable();
        populateTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void requestQuantityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestQuantityBtnActionPerformed
        // TODO add your handling code here:
        Random generator = new Random();
        int num = generator.nextInt(20) + 1;

        requestQuantityBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int num = generator.nextInt(20) + 1;
                requestQuantityTxtField.setText(String.valueOf(num));
            }
        });

    }//GEN-LAST:event_requestQuantityBtnActionPerformed

    private void requestQuantityTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestQuantityTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestQuantityTxtFieldActionPerformed

    private void pharmacyJComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyJComBoxActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_pharmacyJComBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = pharmacyJTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
         MarketDrug md = (MarketDrug)pharmacyJTable.getValueAt(row, 1);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        ViewDrugDetailJPanel vddjp = new ViewDrugDetailJPanel(userProcessContainer, md);
        userProcessContainer.add("ViewDrugDetailJPanel", vddjp);
        
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int selectedRow = pharmacyJTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }
        MarketDrug selectedDrug = (MarketDrug)pharmacyJTable.getValueAt(selectedRow,1);
        int fetchQuantity = (Integer)quantitySpinner.getValue();
        if(fetchQuantity < 0)
        {
            JOptionPane.showMessageDialog(null,"Quantity cannnot be less than equal to 0");
            return;
        }
         if(fetchQuantity > selectedDrug.getQuantity())
        {
           JOptionPane.showMessageDialog(null,"Quantity is more than availability");
            return; 
        }
        if(fetchQuantity <= selectedDrug.getQuantity())
            {
                boolean alreadyPresent = false;
                for(OrderDrugItem oi : orderdrug.getOrderdrugList()){        
                            if(oi.getMd().equals(selectedDrug))
                                {
                                    int oldAvail = selectedDrug.getQuantity();
                                    int newAvail = oldAvail - fetchQuantity;
                                    selectedDrug.setQuantity(newAvail);
                                    oi.setQuantity(fetchQuantity + oi.getQuantity());
                                    alreadyPresent = true;
                                    populateTable();
                                    refreshTable();
                                    break;
                                 }
                }
                            if(!alreadyPresent)
                            {
                                int oldAvail = selectedDrug.getQuantity();
                                int newAvail = oldAvail - fetchQuantity;
                                selectedDrug.setQuantity(newAvail);
                                Pharmacy pharmacy = (Pharmacy)pharmacyJComBox.getSelectedItem();
                                orderdrug.addOrderItemPharmacy(selectedDrug, fetchQuantity,pharmacy);
                                populateTable();
                                refreshTable();
                            }
                            
                        
                    
                }
            
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String drugName = searchTextField1.getText();
        refreshDrugTable(drugName);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
                int selectedRow = pharmacyCartJTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }
        OrderDrugItem oi = (OrderDrugItem)pharmacyCartJTable.getValueAt(selectedRow, 1);
        int currentAvail = oi.getMd().getQuantity();
        int oldQty = oi.getQuantity();
        int newQty = Integer.parseInt(txtValue.getText());
        if(newQty > (currentAvail + oldQty))
        {
            JOptionPane.showMessageDialog(null,"Quantity is more than availability");
            return;
        }
        else
        {
            if(newQty <= 0)
            {
                JOptionPane.showMessageDialog(null,"Quantity should be greater than 0");
                return;
            }
            oi.setQuantity(newQty);
            oi.getMd().setQuantity(currentAvail + (oldQty - newQty));
            refreshTable();
            populateTable();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(orderdrug.getOrderdrugList().size() > 0)
        {
           masterOrderDrugCatalog.addOrder(orderdrug);
           JOptionPane.showMessageDialog(null, "Order placed successfully");
           emptyTable();

        }
        else
        {
           JOptionPane.showMessageDialog(null,"No order placed"); 
        }
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable pharmacyCartJTable;
    private javax.swing.JComboBox pharmacyJComBox;
    private javax.swing.JTable pharmacyJTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JButton requestQuantityBtn;
    private javax.swing.JTextField requestQuantityTxtField;
    private javax.swing.JTextField searchTextField1;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
}
