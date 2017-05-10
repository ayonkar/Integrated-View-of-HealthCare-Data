/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

 
import Drug.ClinicalPhaseTwoDrug;

/**
 *
 * @author Lenovo
 */
public class ClinicalDrugPhaseTwoTestWorkRequest extends WorkRequest{

     private ClinicalPhaseTwoDrug   phaseTwoDrug;   
    private String testResult;
    private String comments;
    private int testID; 
    private static int count=0;
     
    public ClinicalDrugPhaseTwoTestWorkRequest (){
        testID = count++;
        
    }

    public ClinicalPhaseTwoDrug getPhaseTwoDrug() {
        return phaseTwoDrug;
    }

    public void setPhaseTwoDrug(ClinicalPhaseTwoDrug phaseTwoDrug) {
        this.phaseTwoDrug = phaseTwoDrug;
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
