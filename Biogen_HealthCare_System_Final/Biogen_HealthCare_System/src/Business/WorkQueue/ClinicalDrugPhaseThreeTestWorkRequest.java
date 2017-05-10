/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Drug.ClinicalPhaseThreeDrug;

/**
 *
 * @author Lenovo
 */
public class ClinicalDrugPhaseThreeTestWorkRequest extends WorkRequest{
     private ClinicalPhaseThreeDrug  phaseThreeDrug;   
    private String testResult;
    private String comments;
     
    
    private int testID; 
    private static int count=0;
    
    
    public ClinicalDrugPhaseThreeTestWorkRequest(){
        testID = count++;
    }

    public ClinicalPhaseThreeDrug getPhaseThreeDrug() {
        return phaseThreeDrug;
    }

    public void setPhaseThreeDrug(ClinicalPhaseThreeDrug phaseThreeDrug) {
        this.phaseThreeDrug = phaseThreeDrug;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getTestID() {
        return testID;
    }

    public void setTestID(int testID) {
        this.testID = testID;
    }

 
 
    
    
    
    
    
    
    
}
