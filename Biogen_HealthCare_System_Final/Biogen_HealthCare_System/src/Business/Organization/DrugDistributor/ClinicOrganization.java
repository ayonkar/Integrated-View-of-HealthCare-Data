/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.DrugDistributor;

import Business.Organization.Organization;
import Business.Role.Role;
import Clinic.ClinicDirectory;
import java.util.ArrayList;
import Business.Role.ClinicAdminRole;

/**
 *
 * @author ayonk
 */
public class ClinicOrganization extends Organization {
    
        private ClinicDirectory cd;
    
        public ClinicOrganization(int maxID){
        super(Organization.Type.Clinic.getValue(),maxID);
    }
    
        @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new ClinicAdminRole());
        return role;
    }

    public ClinicDirectory getCd() {
        return cd;
    }

    public void setCd(ClinicDirectory cd) {
        this.cd = cd;
    }
    
    
}
