/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Lenovo
 */
public class Network {
    private String  name;
    private EnterpriseDirectory  ed;   
    
    public Network(){
        ed = new EnterpriseDirectory();
    }
    
    public EnterpriseDirectory getEnterpriseDirectory(){
        return ed;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String toString(){
        return name;
    }
    
    
}
