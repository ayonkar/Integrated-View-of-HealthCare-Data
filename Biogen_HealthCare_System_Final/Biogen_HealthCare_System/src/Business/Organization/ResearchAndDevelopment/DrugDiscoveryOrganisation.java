/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.ResearchAndDevelopment;

import Business.Organization.Organization;
import Business.Role.DrugDiscoveryScientistDD;
import Business.Role.Role;
import Business.WorkQueue.PriclinicalWorkRequest;
import Business.WorkQueue.WorkQueue;
import Disease.DiseaseDirectory;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class DrugDiscoveryOrganisation extends Organization {

    private DiseaseDirectory dd;
    private WorkQueue priclinicalWorkQueue;

    public DrugDiscoveryOrganisation(int maxID) {
        super(Organization.Type.DrugDiscovery.getValue(), maxID);
        priclinicalWorkQueue = new WorkQueue();
        System.out.print("Pricliniwork Q created" );
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DrugDiscoveryScientistDD());
        return roles;
    }

    public DiseaseDirectory getDd() {
        return dd;
    }

    public void setDd(DiseaseDirectory dd) {
        this.dd = dd;
    }

    public WorkQueue getPriclinicalWorkQueue() {
        return priclinicalWorkQueue;
    }

    public void setPriclinicalWorkQueue(WorkQueue priclinicalWorkQueue) {
        this.priclinicalWorkQueue = priclinicalWorkQueue;
    }

}
