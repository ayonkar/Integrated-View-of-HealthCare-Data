/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Drug.ClinicalPhaseOneDrug;
import Drug.ClinicalPhaseTwoDrug;
import Drug.ClinicalPhaseThreeDrug;

/**
 *
 * @author Lenovo
 */
public class ClinicalDrugPhaseOneTestWorkRequest extends WorkRequest{
    
    
    private ClinicalPhaseOneDrug   cpd;   
    private String testResult;
    private String comments;
    private int testID; 
    private static int count=520;
    

    public int getTestID() {
        return testID;
    }
    
    public  ClinicalDrugPhaseOneTestWorkRequest(){
         count++;
        testID = count;
    }

    public void setTestID(int testID) {
        this.testID = testID;
       
    }
    public ClinicalPhaseOneDrug getCpd() {
        return cpd;
    }

    public void setCpd(ClinicalPhaseOneDrug cpd) {
        this.cpd = cpd;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    public String toString(){
        
        return String.valueOf(testID);
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
 

  
    

    
}
