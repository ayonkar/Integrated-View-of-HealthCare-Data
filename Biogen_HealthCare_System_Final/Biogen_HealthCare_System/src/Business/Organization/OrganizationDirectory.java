/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.DrugDistributor.ClinicOrganization;
import Business.Organization.DrugDistributor.HospitalOrganization;
import Business.Organization.DrugDistributor.PharmacyOrganization;
import Business.Organization.Organization.Type;
import Business.Organization.ResearchAndDevelopment.ClinicalTrialsOrganisation;
import Business.Organization.ResearchAndDevelopment.DrugDiscoveryOrganisation;
import Business.Organization.ResearchAndDevelopment.NewDrugApprovalOrganisation;
import Business.Organization.ResearchAndDevelopment.ClinicalRegulatoryOrganisation;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type,int maxID){
        Organization organization = null;
        if (type.getValue().equals(Type.DrugDiscovery.getValue())){
            organization = new DrugDiscoveryOrganisation(maxID);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ClinicalTrials.getValue())){
            organization = new ClinicalTrialsOrganisation(maxID);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.NewDrugApproval.getValue())){
            organization = new NewDrugApprovalOrganisation(maxID);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.PostMarket.getValue())){
            organization = new ClinicalRegulatoryOrganisation(maxID);
            organizationList.add(organization);
        }
            else if (type.getValue().equals(Type.Hospital.getValue())){
            organization = new HospitalOrganization(maxID);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Clinic.getValue())){
            organization = new ClinicOrganization(maxID);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization(maxID);
            organizationList.add(organization);
        }
        
        return organization;
    }
}