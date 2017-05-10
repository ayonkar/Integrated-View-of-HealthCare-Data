/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType   EnterpriseType ;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    
    public enum EnterpriseType {
        //Hospital("Hospital"),
        RD("Research and Development"),
        DD("Drug Distributor");
        
        private String value;

        public String getValue() {
            return value;
        }

        private EnterpriseType(String value){
            this.value = value;
        }
        public void setValue(String value) {
            this.value = value;
        }
          public String toString(){
            return value;
        }
        
        
    }

    public EnterpriseType getEnterpriseType() {
        return EnterpriseType;
    }

    public void setEnterpriseType(EnterpriseType EnterpriseType) {
        this.EnterpriseType = EnterpriseType;
    }
    
    

    public Enterprise(String name,EnterpriseType   EnterpriseType) {
        super(name,1);
        this.EnterpriseType =   EnterpriseType ;
        organizationDirectory = new OrganizationDirectory();   
    }
    
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        
//    
//    }
//    
}
