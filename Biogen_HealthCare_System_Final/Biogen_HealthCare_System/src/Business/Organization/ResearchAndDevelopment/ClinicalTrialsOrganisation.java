/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.ResearchAndDevelopment;

import Business.Organization.Organization;
import Business.Role.ClinicalTrialResearchAssociateCT;
import Business.Role.Role;
import Business.WorkQueue.PriclinicalWorkRequest;
import Business.WorkQueue.WorkQueue;
import TestingTechnique.IntregatedNetworkTest;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ClinicalTrialsOrganisation extends Organization {
    
    
    private IntregatedNetworkTest networkTest;
    private WorkQueue priclinicalWorkQueue;
    
    
        public ClinicalTrialsOrganisation(int maxID) {
        super(Organization.Type.ClinicalTrials.getValue(),maxID);
        priclinicalWorkQueue = new WorkQueue();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClinicalTrialResearchAssociateCT());
        return roles;
    }

    public IntregatedNetworkTest getNetworkTest() {
        return networkTest;
    }

    public void setNetworkTest(IntregatedNetworkTest networkTest) {
        this.networkTest = networkTest;
    }

    public WorkQueue getPriclinicalWorkQueue() {
        return priclinicalWorkQueue;
    }

    public void setPriclinicalWorkQueue(WorkQueue priclinicalWorkQueue) {
        this.priclinicalWorkQueue = priclinicalWorkQueue;
    }
    
}
