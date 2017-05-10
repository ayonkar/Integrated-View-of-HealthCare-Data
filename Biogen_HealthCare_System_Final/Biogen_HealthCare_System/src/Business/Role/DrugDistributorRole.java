/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ResearchAndDevelopment.DrugDiscoveryOrganisation;
import Business.UserAccount.UserAccount;
import UserInterface.DrugDiscoveryScientistDDRole.DrugDiscoveryScientistWorkAreaJPanel;
import javax.swing.JPanel;
//import UserInterface.DrugDistributor.DrugDistributorJPanel;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;

/**
 *
 * @author ayonk
 */
public class DrugDistributorRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer,enterprise);
    }
    
}
