/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Lenovo
 */
public class TiterTest {
    
    
    private int titterPlateNumber;
    private int totalNumberofAssay;
    private double mediumQuantity;
    private static int count;
    private String result;
    private double ros; 
    private double cellViability;
    private String titerTest;
    

    public int getTitterPlateNumber() {
        return titterPlateNumber;
    }

    public void setTitterPlateNumber(int titterPlateNumber) {
        this.titterPlateNumber = titterPlateNumber;
    }

    public int getTotalNumberofAssay() {
        return totalNumberofAssay;
    }

    public void setTotalNumberofAssay(int totalNumberofAssay) {
        this.totalNumberofAssay = totalNumberofAssay;
    }

    public double getMediumQuantity() {
        return mediumQuantity;
    }

    public void setMediumQuantity(double mediumQuantity) {
        this.mediumQuantity = mediumQuantity;
    }
    
    public String toString(){  
        return String.valueOf(titterPlateNumber);      
    }
    
    public TiterTest(){
        count++;
        titterPlateNumber= count;
        
    }

    public double getRos() {
        return ros;
    }

    public void setRos(double ros) {
        this.ros = ros;
    }

    public double getCellViability() {
        return cellViability;
    }

    public void setCellViability(double cellViability) {
        this.cellViability = cellViability;
    }

    public String getTiterTest() {
        return titerTest;
    }

    public void setTiterTest(String titerTest) {
        this.titerTest = titerTest;
    }
    
   
    
    
}
