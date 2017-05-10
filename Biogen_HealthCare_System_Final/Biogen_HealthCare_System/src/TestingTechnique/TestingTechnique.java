/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestingTechnique;

import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class TestingTechnique {

    private double absorbility;
    private double auc;
    private double score;

    public double getAbsorbility() {
        return absorbility;
    }

    public void setAbsorbility(double absorbility) {
        this.absorbility = absorbility;
    }

    public double getAuc() {
        return auc;
    }

    public void setAuc(double auc) {
        this.auc = auc;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void calculateTestresult() {
        Random r = new Random();
        this.absorbility = r.nextDouble() * 100;
        this.auc = r.nextDouble() * 100;
        this.score = r.nextInt((int) this.auc) + (100 - this.auc);

    }

    @Override
    public String toString() {
        return String.valueOf(this.score);

    }

}
