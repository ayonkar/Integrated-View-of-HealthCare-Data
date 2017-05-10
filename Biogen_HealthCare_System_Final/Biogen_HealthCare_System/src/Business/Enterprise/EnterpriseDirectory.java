/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> el;

    public ArrayList<Enterprise> getEl() {
        return el;
    }

    public void setEl(ArrayList<Enterprise> el) {
        this.el = el;
    }

public EnterpriseDirectory(){
    el = new ArrayList<>();
    
}

public  Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type)
{
    Enterprise enterprise = null;
    if(type == Enterprise.EnterpriseType.RD)
    {
        enterprise = new ResearchAndDevelopment(name);
        el.add(enterprise);
    }
    
       if(type == Enterprise.EnterpriseType.DD)
    {
        enterprise = new DrugDistributor(name);
        el.add(enterprise);
    }
    
    return enterprise;
}


    
}
