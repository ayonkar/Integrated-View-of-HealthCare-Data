/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.DrugDistributor;

import Business.Organization.Organization;
import Business.Role.HospitalAdminRole;
import Business.Role.Role;
import Hospital.HospitalDirectory;
import java.util.ArrayList;

/**
 *
 * @author ayonk
 */
public class HospitalOrganization extends Organization{
    
    private HospitalDirectory hd;
    
    public HospitalOrganization(int maxID){
        super(Organization.Type.Hospital.getValue(),maxID);
    }
    
        @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new HospitalAdminRole());
        return role;
    }

    public HospitalDirectory getHd() {
        return hd;
    }

    public void setHd(HospitalDirectory hd) {
        this.hd = hd;
    }
    
    
}
