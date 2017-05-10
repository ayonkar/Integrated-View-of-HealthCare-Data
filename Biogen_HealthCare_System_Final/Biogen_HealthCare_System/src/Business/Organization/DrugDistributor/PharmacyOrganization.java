/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.DrugDistributor;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import Pharmacy.PharmacyDirectory;
import Business.Role.PharmacyAdminRole;
import Pharmacy.PharmacyDirectory;

/**
 *
 * @author ayonk
 */
public class PharmacyOrganization extends Organization {
    
        private PharmacyDirectory pd;
    
        public PharmacyOrganization(int maxID){
        super(Organization.Type.Pharmacy.getValue(),maxID);
    }
    
        @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new PharmacyAdminRole());
        return role;
    }

    public PharmacyDirectory getPd() {
        return pd;
    }

    public void setPd(PharmacyDirectory pd) {
        this.pd = pd;
    }
    
}
