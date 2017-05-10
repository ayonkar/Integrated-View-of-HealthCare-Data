/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chemical;

/**
 *
 * @author Lenovo
 */
public class Chemical {
    
    private int ChemicalID;
    
    private String ChemicalName;
    
    private double molecularWeight;
    
    private String formula;
    
    private String Comment;
    
    private static int count=300;
    
    
    public int getChemicalID() {
        return ChemicalID;
    }

    public void setChemicalID(int ChemicalID) {
        this.ChemicalID = ChemicalID;
    }

    public String getChemicalName() {
        return ChemicalName;
    }

    public void setChemicalName(String ChemicalName) {
        this.ChemicalName = ChemicalName;
    }

    public double getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(double molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }
    
    public  Chemical(){
        count = count +2;
        this.ChemicalID = count;
    }
    
    @Override
    public String toString (){
        return ChemicalName;
    }
    
    
}
