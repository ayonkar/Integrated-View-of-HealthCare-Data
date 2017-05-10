/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.ResearchAndDevelopment;

import Business.Organization.Organization;
import Business.Role.ClinicalResearchProtocolMonitorPM;
import Business.Role.RegulatorySpecialistNDA;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import Disease.DiseaseDirectory;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ClinicalRegulatoryOrganisation extends Organization {

    private DiseaseDirectory diseasediretory;
    private WorkQueue phaseTwoWorkQueue;
    private WorkQueue phaseThreeWorkQueue;

    public ClinicalRegulatoryOrganisation(int maxID) {
        super(Organization.Type.PostMarket.getValue(), maxID);
        phaseTwoWorkQueue = new WorkQueue();
        phaseThreeWorkQueue = new WorkQueue();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClinicalResearchProtocolMonitorPM());
        return roles;
    }

    public DiseaseDirectory getDiseasediretory() {
        return diseasediretory;
    }

    public void setDiseasediretory(DiseaseDirectory diseasediretory) {
        this.diseasediretory = diseasediretory;
    }

    public WorkQueue getPhaseTwoWorkQueue() {
        return phaseTwoWorkQueue;
    }

    public void setPhaseTwoWorkQueue(WorkQueue phaseTwoWorkQueue) {
        this.phaseTwoWorkQueue = phaseTwoWorkQueue;
    }

    public WorkQueue getPhaseThreeWorkQueue() {
        return phaseThreeWorkQueue;
    }

    public void setPhaseThreeWorkQueue(WorkQueue phaseThreeWorkQueue) {
        this.phaseThreeWorkQueue = phaseThreeWorkQueue;
    }

}
