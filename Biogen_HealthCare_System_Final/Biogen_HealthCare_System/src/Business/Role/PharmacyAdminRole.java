/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.PharmacyRole.PharmacyWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ayonk
 */
public class PharmacyAdminRole extends Role {
    
        @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PharmacyWorkAreaJPanel(userProcessContainer, userAccount,organization, enterprise);
    }
}
