/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Drug.NewDiscoveredDrug;
import Drug.TestDrug;

/**
 *
 * @author raunak
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;                                      
    private int testID;
    
    public static int count;
    private double score;
    private String dge;
    private int reTestID; 
    
    private TestDrug testdrug;
    private NewDiscoveredDrug newDiscoveredDrug;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        LabTestWorkRequest.count = count;
    }
    
    
    
    public LabTestWorkRequest(){
         testID = count++;
       
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    public TestDrug getTestdrug() {
        return testdrug;
    }

    public void setTestdrug(TestDrug testdrug) {
        this.testdrug = testdrug;
    }
    
     public int getTestID() {
        return testID;
    }

    public void setTestID(int testID) {
        this.testID = testID;
    }


    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDge() {
        return dge;
    }

    public void setDge(String dge) {
        this.dge = dge;
    }

    public NewDiscoveredDrug getNewDiscoveredDrug() {
        return newDiscoveredDrug;
    }

    public void setNewDiscoveredDrug(NewDiscoveredDrug newDiscoveredDrug) {
        this.newDiscoveredDrug = newDiscoveredDrug;
    }


 
    
    public String toString(){
        return String.valueOf(testID);
    }

    public int getReTestID() {
        return reTestID;
    }

    public void setReTestID(int reTestID) {
        this.reTestID = reTestID;
    }
        
    
    
    
}
